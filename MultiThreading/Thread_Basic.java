public class Thread_Basic{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        // t1.start();

        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);//Overloaded constructor which takes a Runnable task
        // t2.start();

        //Thread-Id and Thread-Name

        Thread t3 = new Thread(
           ()->{
            System.out.println("Name of My thread is:-"+Thread.currentThread().getName());
            System.out.println("ID of My thread is:-"+Thread.currentThread().getId());
            //getId() is a Depricated API because JAVA thinks its unimportant,because it doesnt have any valid 
            //ordering system for assigining an ID to a particular thread.
           }
        );

        // t3.start();

        //Non-Deterministic Nature of a Thread:-

        Thread t4 = new Thread(
          ()->{
            for(int i = 1 ; i <= 100 ; i++){
                if((i&1)==0){
                   System.out.println("T4 : "+i);
                }
            }
          }  
        );
        
        Thread t5 = new Thread(
            ()->{
            for(int i = 1 ; i <= 100 ; i++){
                if((i&1)==1){
                   System.out.println("T5 : "+i);
                }
            }
          } 
        );

        t4.start();
        t5.start();

    }
}

//Threads Class Extend
class MyThread extends Thread{
    @Override 
    public  void run(){
       System.out.println("Thread is Running by Thread Class Extend...");
    }
}

//Using Runnable Interface
class MyRunnable implements  Runnable{
    @Override 
    public  void run(){
       System.out.println("Thread is Running using Runnable Interface...");
    }
}