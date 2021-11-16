package com.company;

public class Main {

    public static void main(String[] args){

        Evolution egg = (new Evolution("яйцо"));
        Evolution chicken = (new Evolution("курица"));

        try {
            egg.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Во вселенной первым появилось");
        if (chicken.thread.isAlive()){
            System.out.print("Курицо");
        }else{
            System.out.print(" Яйцо");
        }
    }

}

