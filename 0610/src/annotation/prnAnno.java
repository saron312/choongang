package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface prnAnno {
	String vvv() default"-";
	int nnn() default 15;
	long ttt =System.currentTimeMillis();
	
}
