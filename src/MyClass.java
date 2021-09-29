public class MyClass {

	public static void printmethod(String s) {
		System.out.println(s);
		if(s.equalsIgnoreCase(s)) {
			System.out.println(s);
		}
	}
	public void methodAdded(){
		System.out.println("This method added after cloning to local repository by other developers");
	}
public static void main(String[] args) { 
printmethod("Vamshi");
}
}
