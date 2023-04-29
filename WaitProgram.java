
public class WaitProgram {

	int temp = 0;

	synchronized void method1() throws InterruptedException {
		while (temp < 1) {
			wait();
		}
		temp--;
		System.out.println("In WaitProgram method1");
		notify();
	}

	synchronized void method2() throws InterruptedException {
		while (temp >= 6) {
			wait();
		}
		temp++;
		System.out.println("In WaitProgram method2");
		notify();
	}

}
