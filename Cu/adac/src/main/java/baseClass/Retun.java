package baseClass;

public class Retun {

	public int add() {
		int a=1+2;
		System.out.println(a);
		return a;
	}
	public static void main(String[] args) {
		Retun s=new Retun();
		int c=1+ s.add();
		System.out.println(c);
	}
}
