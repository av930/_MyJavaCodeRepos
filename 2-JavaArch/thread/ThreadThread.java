class ThreadThread extends Thread {
    Thread t;

    public static void main(String[] args) {
        System.out.println("***** 다중 쓰레드(Thread 이용) *****");
        ThreadThread r1 = new ThreadThread("ThreadA");
        ThreadThread r2 = new ThreadThread("ThreadB");
        ThreadThread r3 = new ThreadThread("ThreadC");
    }

    public ThreadThread(String str) {
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