
public class SleepProgram extends Thread{
	
	public static void main(String[] args) {
		
		Thread t= new Thread(()->{
			for(int i=0;i<=5;i++) {
			System.out.println("Thread Started");
			System.out.println("Wait for 2 seconds");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	     });
		t.start();
	}
}
