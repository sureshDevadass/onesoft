
public class SingleTonEagerLoading {
    
	private static final SingleTonEagerLoading instance=new SingleTonEagerLoading();
	public String name;
	private SingleTonEagerLoading() {
		
	}
	public static SingleTonEagerLoading getInstance() {
		return instance;
	}
	public static void main(String[] args) {
		
		System.out.println(instance);
	    instance.name="suresh";
	    System.out.println(instance.name);
	    System.out.println(getInstance());
		System.out.println(instance);
		
	}
}
