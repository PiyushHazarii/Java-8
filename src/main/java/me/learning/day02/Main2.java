package me.learning.day02;

public class Main2 {
    public static void main(String[] args) {
        // this is the implementation of the runnable interface that is a
        // functional interface because it has only one method so we can use lambda expression.
        Runnable runnable = () -> {
            for(int i=0; i<100; i++){
                System.out.println("Hello "+i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.run();
    }
}
