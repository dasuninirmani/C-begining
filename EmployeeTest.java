
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Amal",25,"Lecturer",25000.00,15000.00);
		emp1.SayYourSelf();
		System.out.println("After Two Years! \n");
		emp1.set_designation("Senior Lecturer ");
		emp1.set_b_sal(35000);
		emp1.set_allowance(23000);
		System.out.println(emp1.get_name()+" is now "+emp1.get_designation());
		System.out.println(emp1.get_name()+" 's new net salary is "+emp1.get_net_sal());

	}

}
