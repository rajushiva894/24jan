
public class StringSwapping {

	public static void main(String[] args) {
		String name1="hari";
		String name2="hara";
		System.out.println("before swappimg");
		System.out.println("name1---->"+name1);
		System.out.println("name2---->"+name2);
		name2 = name2+name1;
		name1 = name2.substring(0, name2.length()-name1.length());
		name2 = name2.substring(name1.length());
		System.out.println("after swappimg");
		System.out.println("name1---->"+name1);
		System.out.println("name2---->"+name2);
		
		

	}

}


