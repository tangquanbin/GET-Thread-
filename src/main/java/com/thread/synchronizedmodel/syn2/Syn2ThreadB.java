package com.thread.synchronizedmodel.syn2;

/**
 * @author monkjavaer
 * @date 2018/11/26 21:16
 */
public class Syn2ThreadB extends Thread{
    private Service2 service;
    public Syn2ThreadB(Service2 service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printServiceNotSynchronized();
    }
}
