import java.io.Serializable;

public class TransLogin implements Serializable {
	
	String userName;
	transient String password;
	
	public TransLogin(String userName,String password) {
		this.userName=userName;
		this.password=password;
	}

}
