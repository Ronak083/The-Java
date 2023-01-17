package Multithread;

public class WaitNNotify {
    static public int balance =0;
    public void withdraw(int amount){
        synchronized (this){
            if (balance<=0){
                try {
                    System.out.println("Waiting for Balance updation");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
            balance = balance - amount;
        System.out.println("Withdraw Successful");
    }
    public void Deposit(int amount){
        System.out.println("Depositing Amount");
        balance = balance + amount;
        synchronized (this){
            notify();
        }
    }
    public static void main(String[] args) {
        WaitNNotify app = new WaitNNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                app.withdraw(1000);
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                app.Deposit(2000);

            }
        });
        thread2.start();
    }
}
