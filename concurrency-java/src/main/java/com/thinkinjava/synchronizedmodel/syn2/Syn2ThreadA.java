package com.thinkinjava.synchronizedmodel.syn2;

/**
 * @author monkjavaer
 * @date 2018/11/26 21:16
 */
public class Syn2ThreadA extends Thread{
    private Service2 service;
    public Syn2ThreadA(Service2 service) {
        this.service = service;
        setName("thread-A");
        start();
    }

    @Override
    public void run() {
        super.run();
        service.printService();
    }
}
