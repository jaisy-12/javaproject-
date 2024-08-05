package program;

public class Child extends Parent{
	public int add(){ 
		 		int sum=super.add(); 
		 		 
		 		if(sum % 10 == 0){ 
		 			System.out.println("The sum is divisible by 10"); 
		 			 
		 		} 
		 		else{ 
		 			System.out.println("The sum is not divisible by 10"); 
		 		} 
		 		return sum; 
		 	} 


	public static void main(String[] args) { 
			// TODO Auto-generated method stub 
		Child  obj=new Child (); 
 		obj.add();
	}
}

	