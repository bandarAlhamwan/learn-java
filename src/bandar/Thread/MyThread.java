package bandar.Thread;


public class MyThread extends Thread{

	@Override
	public void run(){

		System.out.println(Thread.currentThread().getPriority());
		
		for(int i =1 ; i<= 5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}
