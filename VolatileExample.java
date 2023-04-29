public class VolatileExample {
	volatile boolean isRunning = true;

	public void stp() {
		isRunning = false;
		System.out.println("Stopper");
	}

	public void print() {
		while (isRunning) {

			System.out.println("Thread is Running...");

		}
	}

	public static void main(String[] args) throws InterruptedException {
		VolatileExample example = new VolatileExample();
		new Thread(example::print).start();
		Thread.sleep(1000);
		new Thread(() -> {

			example.stp();
		}).start();

	}

}
