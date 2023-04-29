import java.util.Optional;

public class OptionalProrgram {
	public static void main(String[] args) {
		
	//Empty()
	Optional<String> op=Optional.empty();
	System.out.println(op);
	System.out.println("-------------");
	
	Optional<String> op1=Optional.of("Suresh");
	System.out.println(op1.isEmpty());
	
	
	}
}
