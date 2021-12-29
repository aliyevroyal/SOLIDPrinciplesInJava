package com.thealiyev;

public class DependencyInversionPrinciple {
    public interface IClass {
        void doesTask();
    }

    public static class FirstSubClass implements IClass {
        @Override
        public void doesTask() {
            System.out.println("This method does the first task.");
        }
    }

    public static class SecondSubClass implements IClass {
        @Override
        public void doesTask() {
            System.out.println("This method does the second task.");
        }
    }

    public static class SuperClass {
        private FirstSubClass firstSubClass;
        private SecondSubClass secondSubClass;

        public SuperClass(FirstSubClass firstSubClass, SecondSubClass secondSubClass) {
            this.firstSubClass = firstSubClass;
            this.secondSubClass = secondSubClass;
        }

        public FirstSubClass getFirstSubClass() {
            return firstSubClass;
        }

        public SecondSubClass getSecondSubClass() {
            return secondSubClass;
        }
    }

    public static class Main {
        public static void main(String args[]) {
            FirstSubClass firstSubClass = new FirstSubClass();
            SecondSubClass secondSubClass = new SecondSubClass();

            SuperClass superClass = new SuperClass(firstSubClass, secondSubClass);

            superClass.getFirstSubClass().doesTask();
            superClass.getSecondSubClass().doesTask();
        }
    }
}
