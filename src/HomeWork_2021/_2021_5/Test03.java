package HomeWork_2021._2021_5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 08
 * Time:17:15
 */
public class Test03 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },"c");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.join();
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"b");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t2.join();
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"a");
        t1.start();
        t2.start();
        t3.start();
    }

    public static void main2(String[] args) {
        for (int i = 0; i <= 20; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            },i+"");
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ok");
    }

    public static void main1(String[] args) throws InterruptedException {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                        System.out.print("A");
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                            System.out.print("B");
                }
            });
            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                            System.out.print("C");
                }
            });
            t1.start();
            Thread.sleep(100);
            t2.start();
            Thread.sleep(100);
            t3.start();
    }

    public static void func(){
        for(int i=0;i<10;i++) {

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print("A");
                }
            });
            t1.run();
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print("B");
                }
            });
            t2.run();
            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("C");
                }
            });
            t3.run();
        }
    }
}
