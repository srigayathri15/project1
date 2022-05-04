public class EmployDetails {
	String name;
	int number;
	int salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				EmployDetails Emp1=new 
				EmployDetails();
		    Emp1.init("raki",1001,5000);
		    Emp1.display();
			}
			 void init(String name_temp,int number_temp,int salary_temp)
			 {
				 name=name_temp;
				 number=number_temp;
				 salary=salary_temp;
			 }
			 void display()
			 {
				 System.out.println("name = "+name);
				 System.out.println("number = "+number);
				 System.out.println("salary = "+salary);
				
			 }
		

	}


