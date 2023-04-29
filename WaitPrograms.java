public class WaitPrograms {

	public static void main(String[] args) {
		Object lock = new Object();

		Thread t1 = new Thread(() -> {
		synchronized (lock) 
			{

				for (int i = 0; i <= 10; i++) {
					if (i != 5) {
						System.out.println("Thread One Running" +i);
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}
		});
		Thread t2 = new Thread(() -> {
			synchronized (lock) 
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i <= 10; i++) {
					if (i == 9) {
						lock.notify();
						System.out.println("Waiting Thread Notified");
						
					} else {
						System.out.println("Thread Two Running"+i);
					}

				}

			}
		});

		t1.start();
		t2.start();
	}

}
