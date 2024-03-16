package com.comrade.threads.fork_join;

import java.util.concurrent.RecursiveAction;

public class RecursiveActionGenerator extends RecursiveAction {
    private int simulatedWork;
    public RecursiveActionGenerator(int simulatedWork) {
        this.simulatedWork = simulatedWork;
    }

    @Override
    protected void compute() {

        if(simulatedWork>100){

            RecursiveActionGenerator recursiveActionGeneratorOne=new RecursiveActionGenerator(simulatedWork/2);
            RecursiveActionGenerator recursiveActionGeneratorTwo=new RecursiveActionGenerator(simulatedWork/2);

            /*recursiveActionGeneratorOne.fork();
            recursiveActionGeneratorTwo.fork();
            recursiveActionGeneratorOne.join();
            recursiveActionGeneratorOne.join();*/
            //equalent
            invokeAll(recursiveActionGeneratorOne,recursiveActionGeneratorTwo);
        }else {
            System.out.println("Action is small "+simulatedWork);
        }
    }
}
