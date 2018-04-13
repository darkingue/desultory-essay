package pers.qqs;

import java.util.concurrent.atomic.AtomicInteger;


public class MultiThreadRunnableDemo {

    final static AtomicInteger ato = new AtomicInteger();
    private static int n = 1;
    private static int m = 1;

    public static void runCase() {

    }

    public static void main(String[] args) {
        //        System.out.println("请输入并发数");
        //        Scanner cin = new Scanner(System.in);
        //        int n = 1;
        //        n = Integer.parseInt(cin.next());
        //        System.out.println("请输入每个并发循环数");
        //        Scanner cin2 = new Scanner(System.in);
        //        final int m = Integer.parseInt(cin2.next());

        if (args.length == 2) {
            n = Integer.parseInt(args[0]);
            m = Integer.parseInt(args[1]);
        } else {
            System.out.println("java -jar this.jar args0#并发数 args1#每个并发循环数");
            System.exit(0);
        }

        for (int i = 1; i <= n; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < m; j++) {

                        runCase();
                        System.out.println(ato.addAndGet(1));

                    }
                }
            }).start();
        }

    }
}
