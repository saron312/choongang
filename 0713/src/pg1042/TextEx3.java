package pg1042;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TextEx3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:/backup/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA)ois.readObject();
		System.out.println("field1: "+v.field1);
		System.out.println("field2.field1: "+v.field2.field1);
	}

}
