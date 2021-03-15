package Lab7;

public class EmployeeApp {
    public static void main(String[] args) {

        //use de fau lt contructor
        Employee emp1 = new Employee();
        //assign contructor
        Employee emp2 = new Employee("intira sulak",18,"Techer",20000);

        //call displayDate ()
        emp1.displayData();
        emp2.displayData();
        //System.out.println(emp2.name);
        //assign data to emp1
        emp1.setName("intira sulak");
        emp1.getAge();
        emp1.setPosition("Dean");
        emp1.setSalary(20000);





    }//main
}//class
