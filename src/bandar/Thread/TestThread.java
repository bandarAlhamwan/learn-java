package bandar.Thread;

public class TestThread {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(10);
		
		MyThread thread1 = new MyThread();
		thread1.setPriority(1);
		thread1.start();

		
		for(int i =1 ; i<= 2; i++) {
			System.out.println("bandar");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
}
