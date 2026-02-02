package ExceptionHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{
          String name="java";
          String username="javauser";
          transient String password = "worldjava";
	public static void main(String[] args) throws IOException {
		Serialization s = new Serialization();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\PUJAPRADEEP\\OneDrive\\Desktop\\prathyushaa\\prathyusha7.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
	}

}
