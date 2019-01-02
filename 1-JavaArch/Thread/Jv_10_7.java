class Jv_10_7_Buffer {
    private int data;
    private boolean data_avail = false;

    public synchronized int get() {	
	while (data_avail == false) {
           try {
	        wait();	
           } catch (InterruptedException e) {} 
        }
        data_avail = false;
        notifyAll();
        return data;
    }

    public synchronized void put(int d) {
	while (data_avail == true) {
           try {
	        wait();	
           } catch (InterruptedException e) {} 
        }
        data = d;
        data_avail = true;
        notifyAll();
    }
} 

class Jv_10_7_Producer extends Thread {
    private Jv_10_7_Buffer buf;
    private int data;	
    public Jv_10_7_Producer(Jv_10_7_Buffer b) {	
	buf = b;
    }
    public void run() {    
	for (int i=0; i < 10; i++) {
	    data = (int)(Math.random()*1000);	
            buf.put(data);
            System.out.println("* PRODUCER " + data);
            try {
		sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
            }
        }
    }
}

class Jv_10_7_Consumer extends Thread {
    private Jv_10_7_Buffer bf;
    private int data;	
    public Jv_10_7_Consumer(Jv_10_7_Buffer b) {	
	bf = b;
    }
    public void run() {    
	for (int i=0; i < 10; i++) {
	    data = bf.get();	
            System.out.println("# consumer =>" + data);
            try {
		sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Jv_10_7 {
    public static void main(String[] args) {	
	Jv_10_7_Buffer bbb = new Jv_10_7_Buffer();
        Jv_10_7_Producer td1 = new Jv_10_7_Producer(bbb); 
        Jv_10_7_Consumer td2 = new Jv_10_7_Consumer(bbb);
        td1.start();
        td2.start();  
    }
}