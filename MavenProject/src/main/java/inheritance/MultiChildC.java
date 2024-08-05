package inheritance;

public class MultiChildC extends MultiChildB {
	public void sub() {
		System.out.println("hee");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiChildC obj=new MultiChildC();
		obj.sub();
		obj.display();
		obj.display1();
		

	}

}
