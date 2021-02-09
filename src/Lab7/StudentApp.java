package Lab7;

public class StudentApp {
    public static void main(String[] args) {
        //create object of student class
        LAB7.Student std1 = new LAB7.Student();

        std1.introduce();
        //assign data to object
        std1.name = "intira sulak";
        std1.age = 22;
        std1.major = "MIT";

        std1.introduce();

        LAB7.Student std2 = new LAB7.Student();
        std2.name = "intira sulak";
        std2.age = 23;
        std2.major = "AC";
        std2.introduce();

        std2.major = "MIT";
        std2.introduce();

        std1.changeFaculty("Engineer RUTS");

        std1.introduce();
        std2.introduce();



    }
}