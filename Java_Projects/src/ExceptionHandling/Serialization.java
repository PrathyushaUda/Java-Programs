package ExceptionHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialaization implements Serializable{
          String name="java";
          String username="javauser";
          transient String password = "worldjava";
	public static void main(String[] args) throws IOException {
		Serialaization s = new Serialaization();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\PUJAPRADEEP\\OneDrive\\Desktop\\prathyushaa\\prathyusha7.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
	}

}
