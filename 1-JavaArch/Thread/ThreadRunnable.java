class ThreadRunnable implements Runnable {
    Thread t;

    public static void main(String[] args) {
        System.out.println("***** 다중 쓰레드(Runnable 이용) *****");
        ThreadRunnable r1 = new ThreadRunnable("ThreadA");
        ThreadRunnable r2 = new ThreadRunnable("ThreadB");
        ThreadRunnable r3 = new ThreadRunnable("ThreadC");
    }

    public ThreadRunnable(String str) {
        t = new Thread(this, str);
        t.start();
    }

    public void run() {
        System.out.println("run() start! => " + t.getName());
        for (int i = 0; i < 3; i++) {
            System.out.println("run() STEP" + i + " : " + t.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("run() end! => " + t.getName());
    }
}