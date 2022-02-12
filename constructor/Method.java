package constructor;
//study the concept of Method Overloading in a class.
public class Method {
	public Method() {
		System.out.println("Constructor");
	}

	void MethodOverloading() {
		System.out.println("first");
	}
	void MethodOverloading(int i, String s) {
		System.out.println("Second :" + i);
		
	}
	void MethodOverloading(int i, int j, int k) {
		System.out.println("Third :" + i + j + k);
	}
}
