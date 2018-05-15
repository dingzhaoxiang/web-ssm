package com.dzx.基础.算法.生产者消费者模式;

/**
 * Created by Administrator on 2017/7/3.
 */
public class ProducerConsumer {
    public static void main(String [] args){
        SynStack synStack = new SynStack();
        Producer producer = new Producer(synStack);
        Consumer consumer = new Consumer(synStack);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Product{
    int id;
    Product(int id){
        this.id = id;
    }
}

class SynStack{
    Product [] arr = new Product[6];
    int index = 0;
    public synchronized void push(Product product){
        while(index==arr.length){
            try {
                this.wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notifyAll();
        arr[index++] = product;
    }

    public synchronized Product pop(){
        while(index==0){
            try{
                this.wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notifyAll();
        return arr[--index];
    }
}

class Producer implements Runnable{
    SynStack synStack = null;
    Producer (SynStack synStack){
        this.synStack = synStack;
    }
    public void run(){
        for(int i=0;i<10;i++){
            synStack.push(new Product(i));
        }
    }
}

class Consumer implements Runnable{
    SynStack synStack = null;
    Consumer (SynStack synStack){
        this.synStack = synStack;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(synStack.pop().id);
        }
    }
}
