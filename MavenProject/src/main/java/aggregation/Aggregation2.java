package aggregation;

public class Aggregation2 {
	Aggregation1 agr;
	 String name;
	 public Aggregation2(Aggregation1 agr,String name) {
		 this.agr =agr;
		 this.name=name;
		 
	 }
	 public void display() {
		 System.out.println(agr.a);
		 System.out.println(name);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 agr=new Aggregation1(10);
		Aggregation2 ag=new Aggregation2(agr,"jaisy");
				ag.display();

	}

}
