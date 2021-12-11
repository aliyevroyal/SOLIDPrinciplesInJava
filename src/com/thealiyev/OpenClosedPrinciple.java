package com.thealiyev;

public class OpenClosedPrinciple {
    public interface IClass {
        void does();
    }

    public static class FirstClass implements IClass {
        @Override
        public void does() {
            System.out.println("This method does the first task.");
        }
    }

    public static class SecondClass implements IClass {
        @Override
        public void does() {
            System.out.println("This method does the second task.");
        }
    }

    public static class ThirdClass implements IClass {
        @Override
        public void does() {
            System.out.println("This method does the third task.");
        }
    }

    public static class Main {
        private static IClass iClass;

        public static void main(String args[]) {
            iClass = new FirstClass();
            iClass.does();

            iClass = new SecondClass();
            iClass.does();

            iClass = new ThirdClass();
            iClass.does();
        }
    }
}
