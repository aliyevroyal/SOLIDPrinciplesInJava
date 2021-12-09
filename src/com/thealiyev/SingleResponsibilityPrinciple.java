package com.thealiyev;

public class SingleResponsibilityPrinciple {
    //Bad practice one class does multiple things:
    public static class ClassDoesMultipleThings {
        public void doesFirstTask() {
            System.out.println("This method does the first task.");
        }

        public void doesSecondTask() {
            System.out.println("This method does the second task.");
        }

        public void doesThirdTask() {
            System.out.println("This method does the third task.");
        }
    }

    //Better solution is to create multiple classes that does only one task:
    public static class ClassThatDoesFirstTask {
        public void doesFirstTask() {
            System.out.println("This method does the first task.");
        }
    }

    public static class ClassThatDoesSecondTask {
        public void doesSecondTask() {
            System.out.println("This method does the second task.");
        }
    }

    public static class ClassThatDoesThirdTask {
        public void doesThirdTask() {
            System.out.println("This method does the third task.");
        }
    }

    public static class Main {
        public static void main(String args[]) {
            //Bad practise:
            ClassDoesMultipleThings classDoesMultipleThings = new ClassDoesMultipleThings();
            classDoesMultipleThings.doesFirstTask();
            classDoesMultipleThings.doesSecondTask();
            classDoesMultipleThings.doesThirdTask();

            //Good practise:
            ClassThatDoesFirstTask classThatDoesFirstTask = new ClassThatDoesFirstTask();
            classThatDoesFirstTask.doesFirstTask();

            ClassThatDoesSecondTask classThatDoesSecondTask = new ClassThatDoesSecondTask();
            classThatDoesSecondTask.doesSecondTask();

            ClassThatDoesThirdTask classThatDoesThirdTask = new ClassThatDoesThirdTask();
            classThatDoesThirdTask.doesThirdTask();
        }
    }
}
