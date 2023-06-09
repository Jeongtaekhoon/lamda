package lamdaProject;

import java.util.function.Supplier;

public class LamdaSupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s1 = () -> {
			return "홍길동";
		};
		System.out.println(s1.get());
	}

}
