import java.util.Optional;

public class OptionalProgram {
	public static void main(String[] args) {
		
		String a=null;
		Optional<String> check=Optional.ofNullable(a);
		if(check.isPresent()) {
			System.out.println("String is Present");
		}
		else {
			System.out.println("String is Empty");
		}
		
	}

}
