package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\PUJAPRADEEP\\OneDrive\\Desktop\\prathyushaa\\prathyusha7.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serialization s = (Serialization) ois.readObject();
		System.out.println(s.name);
		System.out.println(s.username);
		System.out.println(s.password);
	}

}
