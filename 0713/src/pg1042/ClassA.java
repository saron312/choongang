package pg1042;

import java.io.Serializable;

public class ClassA implements Serializable {
	static final long serialVersionUID = 1L;
	int field1;
	int field3;
	ClassB field2 = new ClassB();
//	static int field3;
//	transient int field4;
}
