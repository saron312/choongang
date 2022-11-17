package common;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestEx1 {
	static int aa = 0;
	public static void main(String[] args) throws IOException {
		MyBatisService ms = new MyBatisService();
		
		Path pa = Paths.get("src/common/test.txt");
		Stream<String> st = Files.lines(pa, Charset.defaultCharset());
		st.forEach(n->{
			String[] ss = n.split(" ");
			int nn = ms.insertEx(new Student(ss[0],Integer.parseInt(ss[1])));
			aa += nn;
		});
		System.out.println(aa+"건 입력되었습니다.");
	}
}
