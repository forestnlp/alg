package com.alg.leetcode.greedy;

import java.util.HashSet;
import java.util.Set;

public class P874 {
    class Solution {
        public int robotSim(int[] commands, int[][] obstacles) {
            //0-up 1-left 2-down 3-right
            int direction = 0;
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            Set<String> listObstacles = new HashSet<>();
            for (int[] obstacle : obstacles) {
                listObstacles.add(obstacle[0]+" "+obstacle[1]);
            }

            int maxDistance = 0;
            int curX = 0, curY = 0;

            for(int command:commands) {
                if(command==-1) {
                    direction = (direction+1)%4;
                }
                else if(command==-2) {
                    direction = (direction+3)%4;
                }
                else {
                    int step = command;
                    while (step>0) {
                        step--;
                        int nx = curX+dx[direction];
                        int ny = curY+dy[direction];
                        if(!listObstacles.contains(nx+" "+ny)) {
                            curX = nx;
                            curY = ny;
                            maxDistance = Math.max(maxDistance,curX*curX+curY*curY);
                        }
                        else {
                            break;
                        }
                    }
                }
            }
            return maxDistance;
        }
    }
}
