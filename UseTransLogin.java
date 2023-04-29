import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UseTransLogin implements Serializable {

	String user;
	transient String pass;
	String role;

	public UseTransLogin(String user, String pass, String role) {

		this.user = user;
		this.pass = pass;
		this.role = role;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		UseTransLogin use = new UseTransLogin("suresh", "suresh@123", "Admin");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Suresh\\Desktop\\Trans\\text1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);

		out.writeObject(use);
		out.close();
		fos.close();

		FileInputStream fis = new FileInputStream("C:\\Users\\Suresh\\Desktop\\Trans\\text1.txt");
		ObjectInputStream input = new ObjectInputStream(fis);
		UseTransLogin read = (UseTransLogin) input.readObject();
		System.out.println(read.user + "\n" + read.pass);

	}

}
