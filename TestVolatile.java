
public class TestVolatile {
	  int counter = 0;

	public static void main(String[] args) {
		TestVolatile tv=new TestVolatile();
		Thread t1 = new Thread(() -> {
			int localcounter = 0;
			while (tv.counter == localcounter) {

				System.out.println("T1 : " + localcounter);
				localcounter++;
				try {
					Thread.sleep(3500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		Thread t2 = new Thread(() -> {
			int b = 0;
			while (b <= 5) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("T2 :" + b);
				tv.counter++;
				b++;
			}

		});
		t1.start();
		t2.start();
	}

}
