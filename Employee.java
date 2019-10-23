import java.text.DecimalFormat;
public class Employee {
	//attributes
	private String name;
	private int age;
	private String designation;
	private double b_sal;
	private double allowance;
	private double epf;
	private double net_sal;
	//constructor
	public Employee(String name,int age,String designation,double b_sal,double allowance) {
		this.name=name;
		this.age=age;
		this.designation=designation;
		this.allowance=allowance;
		this.b_sal=b_sal;
		this.find_epf();
		this.find_net_sal();
	}
	//setteres
	public void set_designation(String newDesignation) {
		this.designation=newDesignation;
	}
	public void set_b_sal(double new_b_sal) {
		this.b_sal=new_b_sal;
		this.find_epf();
		this.find_net_sal();
		
		
	}
	
	public void set_allowance(double allowance) {
		this.allowance=allowance;
		this.find_net_sal();
	}
	
	//getters
	
	public String get_name() {
		return this.name;
	}
	public int get_age() {
		return this.age;
	}
	public String get_designation() {
		return this.designation;
	}
	public double get_b_sal() {
		return this.b_sal;
	}
	public double get_net_sal() {
		return this.net_sal;
	}
	
	
	//behaviors
	private void find_epf() {
		this.epf=this.b_sal*0.08;
		
	}
	private void find_net_sal() {
		
		this.net_sal=(this.b_sal-this.epf)+this.allowance;
	}
	
	public void SayYourSelf() {
		System.out.println("Emp Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Designation: "+this.designation);
		System.out.println("-------Salary information------");
		System.out.println("Basic Salary "+FORMAT.format(this.b_sal));
		System.out.println("Allowances "+FORMAT.format(this.allowance));
		System.out.println("Net Salary "+FORMAT.format(this.net_sal));
		
	
	}
	public static final DecimalFormat FORMAT=new DecimalFormat("LKR#.00");

}
