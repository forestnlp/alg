package com.alg.leetcode.design;

import java.util.ArrayList;
import java.util.List;

public class PM0306 {

    class Animal {
        int id;
        int catlog;

        public Animal(int id, int catlog) {
            this.id = id;
            this.catlog = catlog;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "id=" + id +
                    ", catlog=" + catlog +
                    '}';
        }
    }

    class AnimalShelf {

        List<Animal> animals;

        public AnimalShelf() {
            animals = new ArrayList<>();
        }

        public void enqueue(int[] animal) {
            animals.add(new Animal(animal[0],animal[1]));
        }

        public int[] dequeueAny() {
            if(animals.isEmpty()) return new int[]{-1,-1};
            Animal animal = animals.get(0);
            animals.remove(0);
            return new int[]{animal.id,animal.catlog};
        }

        public int[] dequeueDog() {
            for(Animal a:animals) {
                if(a.catlog==1) {
                    animals.remove(a);
                    return new int[]{a.id,a.catlog};
                }
            }
            return new int[]{-1,-1};
        }

        public int[] dequeueCat() {
            for(Animal a:animals) {
                if(a.catlog==0) {
                    animals.remove(a);
                    return new int[]{a.id,a.catlog};
                }
            }
            return new int[]{-1,-1};
        }
    }

}
