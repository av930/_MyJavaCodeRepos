package myjava.annotation;

//Print1

//Print all the values of&nbsp; Annotation

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//A simple annotation type.

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
	//String stringValue() default "defaultString";

	int intValue() default 0;
}

@MyAnnotation(/*stringValue = "for class",*/ intValue = 1)
public class ClassTestAnnotation {
	// Annotate a method.

	@MyAnnotation(intValue = 2)
	public static void myMethod() {	}

	public static void main(String[] arg) {
		
		try {
			ClassTestAnnotation ob = new ClassTestAnnotation();
			final int choice =3;
			MyAnnotation myAnno;
			Method m;
			switch(choice){
			case 1:
				m = ob.getClass().getMethod("myMethod");
				myAnno= m.getAnnotation(MyAnnotation.class);
				System.out.println(""+ myAnno.intValue());
				break;
			case 2:
				myAnno=ob.getClass().getAnnotation(MyAnnotation.class);
				System.out.println(""+ myAnno.intValue());
				break;
			case 3:
				m = ob.getClass().getMethod("myMethod");
				Annotation[] myAnnoG = m.getAnnotations();
				for (Annotation a : myAnnoG)
					System.out.println(a);
				
				break;
			}

		} catch (Exception exc) {

		}
	}

}
