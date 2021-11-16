package com.company;

public class Evolution implements Runnable {

    Thread thread;

    /**
     * Конструктор потока
     *
     * @param name - имя потока
     */
    public Evolution(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    /**
     * Метод испольнитель потока
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName());

        }
    }


}
