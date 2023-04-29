public class ThreadProgram extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadProgram t1=new ThreadProgram();
		t1.start();
		Thread.sleep(1000);
		System.out.println("OutSide Thread Started...");
		
	}
	@Override
	public void run() {
		
		System.out.println("Thread 1 Started...");
	}

}