package pg1042;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TextEx2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/backup/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassA classA = new ClassA();
		classA.field1=1;
		classA.field2.field1=2;
		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
	}

}
