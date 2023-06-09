package lamdaProject;

public class MyFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction2<String> f1 = (x) -> System.out.println(x);
		f1.print("abc");
		
		MyFunction2<String> f2 = (x) -> System.out.println(x);
		f2.print(String.valueOf(100));
	}

}
