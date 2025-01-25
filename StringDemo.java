
public class StringDemo {

	public static void main(String[] args) {
		String name1="hari";
		String name2="hara";
		System.out.println("before swappimg");
		System.out.println("name1---->"+name1);
		System.out.println("name2---->"+name2);
		name1=name1+name2;
		name2=name1.substring(0,name1.length()-name2.length());
		name1=name1.substring(name2.length());
		System.out.println("after swappimg");
		System.out.println("name1---->"+name1);
		System.out.println("name2---->"+name2);
		
		

	}

}
