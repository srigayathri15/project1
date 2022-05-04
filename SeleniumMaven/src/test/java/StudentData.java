
public class StudentData {
			int rolno;
		    String name;
		    String group;
			
		     void init(int rolno_temp,String name_temp,String group_temp)
		     {
		    	 rolno=rolno_temp;
		    	 name=name_temp;
		    	 group=group_temp;
		     }
		     void display()
		     
		    	 
		    		{
		    			StudentData obj=new StudentData();
		    			System.out.println("Name= "+name);
		    			System.out.println("Rolno="+rolno);
		    			System.out.println("Group="+group);
		    		}
		     
		     
		     public static void main(String[] args)
		 	{
		 		StudentData std1=new StudentData();
		 		std1.init(1, "Gayathri", "Maths");
		 		std1.display();
		 		StudentData std2=new StudentData();
		 		std2.init(2, "Teja", "English");
		 		std2.display();
		 		StudentData std3=new StudentData();
		 		std3.init(3, "Harika", "chemistry");
		 		std3.display();
		 		
		 	}

		

	}

}
