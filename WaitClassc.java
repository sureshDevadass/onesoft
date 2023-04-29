
public class WaitClassc extends Thread {
	
	WaitProgram obj=new WaitProgram();
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				obj.method2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


