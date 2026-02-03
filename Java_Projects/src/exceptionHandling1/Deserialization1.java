package exceptionHandling1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import ExceptionHandling.Serialization;

public class Deserialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\PUJAPRADEEP\\OneDrive\\Desktop\\prathyushaa\\prathyusha7.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serialization1 s1 = (Serialization1) ois.readObject();
		System.out.println(s1.name);
		System.out.println(s1.username);
		System.out.println(s1.password);

	}

}
