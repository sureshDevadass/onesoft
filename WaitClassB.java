 
public class WaitClassB extends Thread{
	
	WaitProgram obj =new WaitProgram();
	
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				obj.method1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
