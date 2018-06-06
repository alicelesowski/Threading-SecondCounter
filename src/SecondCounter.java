public class SecondCounter {
	
public static void main (String[] args) throws InterruptedException {
		int time = 0;
		Thread t2 = new Thread();
		Thread t1 = new Thread();
		t1.start();
		t2.start();
		
		while(true) {
			try {
				System.out.println(String.valueOf(time));
				time = time+1;
				t1.sleep(1000);
				System.out.println(String.valueOf(time));
				time = time+1;
				t1.sleep(1000);
				System.out.println(String.valueOf(time));
				time = time+1;
				t1.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println(String.valueOf("\t" + time));
				t2.sleep(10);
				time = time;
			}

		}
	}