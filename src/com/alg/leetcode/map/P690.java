package com.alg.leetcode.map;

import java.util.List;

public class P690 {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    class Solution {
        public int getImportance(List<Employee> employees, int id) {
            int importance = 0;
            for(Employee emp : employees) {
                if(emp.id==id)  {
                    importance+=emp.importance;
                    for(int subempid:emp.subordinates) {
                        importance+=getImportance(employees,subempid);
                    }
                }
            }
            return importance;
        }
    }
}
