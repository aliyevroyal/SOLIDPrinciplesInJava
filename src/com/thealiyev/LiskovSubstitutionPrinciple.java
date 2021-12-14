package com.thealiyev;

public class LiskovSubstitutionPrinciple {
    public static class SuperClass {
        public void does() {
            System.out.println("This method does the task.");
        }
    }

    public static class FirstSubClass extends SuperClass {
        @Override
        public void does() {
            System.out.println("This method does the first task.");
            super.does();
        }
    }

    public static class SecondSubClass extends SuperClass {
        @Override
        public void does() {
            System.out.println("This method does the second task.");
            super.does();
        }
    }

    public static class Main {
        public static void giveTask(SuperClass superClass) {
            System.out.println("The task is given to: " + superClass.getClass().getSimpleName());
        }

        public static void main(String args[]) {
            FirstSubClass firstSubClass = new FirstSubClass();
            SecondSubClass secondSubClass = new SecondSubClass();

            giveTask(firstSubClass);
            giveTask(secondSubClass);
        }
    }
}
