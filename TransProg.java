import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransProg implements Serializable {
	
	transient String name="suresh";
	String name1="pranav";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	    TransProg tp=new TransProg();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Suresh\\Desktop\\Trans\\text3.txt");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		out.writeObject(tp);;
		out.close();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Suresh\\Desktop\\Trans\\text3.txt");
		ObjectInputStream input=new ObjectInputStream(fis);
		//TransProg read=(TransProg)input.readObject();//Converting 0's and 1's to Java Object
		Object readObject = input.readObject();
		TransProg read=(TransProg)readObject;// syntax   ClassName myObj = (ClassName) obj;

		System.out.println(read.name+" "+read.name1);
		
	}

}
