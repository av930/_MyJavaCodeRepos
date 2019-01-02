class Jv_10_6_Buffer {
    private int data;
    private boolean data_avail = false;
    public int get() {	
	if (data_avail == true) {
	   data_avail = false;	
        }
        return data;  
    }
    public void put(int d) {
	data = d;
    }
} 

class Jv_10_6_Producer extends Thread {
    private Jv_10_6_Buffer buf;
    private int data;	
    public Jv_10_6_Producer(Jv_10_6_Buffer b) {	
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
class Jv_10_6_Consumer extends Thread {
    private Jv_10_6_Buffer bf;
    private int data;	
    public Jv_10_6_Consumer(Jv_10_6_Buffer b) {	
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

public class Jv_10_6 {
    public static void main(String[] args) {	
	Jv_10_6_Buffer bbb = new Jv_10_6_Buffer();
        Jv_10_6_Producer td1 = new Jv_10_6_Producer(bbb); 
        Jv_10_6_Consumer td2 = new Jv_10_6_Consumer(bbb);
        td1.start();
        td2.start();  
    }
}