package com.thealiyev;

public class InterfaceSegregationPrinciple {
    public interface IClass {
        public void methodDoesFirstTask();

        public void methodDoesSecondTask();

        public void methodDoesThirdTask();
    }

    public interface IFirstClass {
        public void methodDoesFirstTask();
    }

    public interface ISecondClass {
        public void methodDoesSecondTask();
    }

    public interface IThirdClass {
        public void methodDoesThirdTask();
    }
}
