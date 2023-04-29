
public class UseWaitClass {
	public static void main(String[] args) {
		
		WaitClassB objb=new WaitClassB();
	  WaitClassc objc=new WaitClassc();
	  new Thread(objb).start();
	  new Thread(objc).start();
	}

}
