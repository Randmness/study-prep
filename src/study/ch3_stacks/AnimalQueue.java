package study.ch3_stacks;

import java.util.LinkedList;

public class AnimalQueue {
    private LinkedList<Dog> dogs;
    private LinkedList<Cat> cats;
    private int order;

    public AnimalQueue() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.addLast((Dog)animal);
        } else {
            cats.addLast((Cat)animal);
        }
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && !cats.isEmpty()) {
            return dequeueCat();
        } else if (!dogs.isEmpty() && cats.isEmpty()) {
            return dequeueDog();
        } else {
            Dog oldestDog = dogs.peek();
            Cat oldestCat = cats.peek();

            return oldestDog.getOrder() < oldestCat.getOrder()
                    ? oldestDog : oldestCat;
        }
    }

    public class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }

    public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }

    abstract class Animal {
        protected String name;
        protected int order;

        public Animal(String name) {
            this.name = name;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getOrder() {
            return order;
        }
    }
}
