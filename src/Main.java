import java.util.*;
public class Main {
    public static void main(String[] args){
        StudentManagement sm=new StudentManagement();
        System.out.println("*******Student Management System*******");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Search Student");
            System.out.println("4.Update details");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter id:");
                    int id=sc.nextInt();
                    System.out.println("Enter Name:");
                    String name=sc.next();
                    System.out.println("Enter age:");
                    int age=sc.nextInt();
                    System.out.println("Enter dept:");
                    String dept=sc.next();
                    System.out.println("Enter cgpa:");
                    double cgpa=sc.nextDouble();

                    Student student =new Student(id,name,age,dept,cgpa);
                    sm.addStudent(student);
                    break;
                case 2:
                    System.out.println("\n------All Students------");
                    sm.viewStudent();
                    break;
                case 3:
                    System.out.println("Enter student id:");
                    int searchid=sc.nextInt();
                    sm.searchStudent(searchid);
                    break;
                case 4:
                    System.out.println("Update student id:");
                    int updateid=sc.nextInt();
                    System.out.println("Enter new name:");
                    //id=sc.nextInt();
                    String newname=sc.next();
                    System.out.println("Enetr new age:");
                    int newage=sc.nextInt();
                    System.out.println("Enter new dept:");
                    String newdept=sc.next();
                    System.out.println("Enter new cgpa:");
                    double newcgpa=sc.nextDouble();
                    sm.updateStudent(updateid,newname,newage,newdept,newcgpa);
                    break;
                case 5:
                    System.out.println("Detete Student id:");
                    int deleteid=sc.nextInt();
                    sm.deleteStudent(deleteid);
                    break;
                case 6:
                    System.out.println("Thank you!!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invaild id ");

            }
        }
        //System.out.println("How many students:");
        //int n=sc.nextInt();
        //for(int i=1;i<=n;i++){
        /*System.out.println("Enter id:");
        int id=sc.nextInt();
        System.out.println("Enter Name:");
        String name=sc.next();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter dept:");
        String dept=sc.next();
        System.out.println("Enter cgpa:");
        double cgpa=sc.nextDouble();
        
        Student student =new Student(id,name,age,dept,cgpa);*/
        //Student s2=new Student(73,"Priyanka",22,"CSE",8.3);
        //Student s3=new Student(74,"Priyalathe",23,"CSE",8.8);
        /*s1.id=74;
        s1.name="Priya";
        s1.age=276;
        s1.dept="CSE";
        s1.cgpa=8.6;
        System.out.println("Student is:"+s1.id);
        System.out.println("Student Name:"+s1.name);
        System.out.println("Student age:"+s1.age);
        System.out.println("Student dept:"+s1.dept);
        System.out.println("Student cgpa:"+s1.cgpa);*/
        //System.out.println("--------using method--------");
        //s1.displayStudent();
        //s2.displayStudent();
        //s3.displayStudent();
        //sm.addStudent(student);// move to sm class
        //sm.addStudent(s2);
        //sm.addStudent(s3);
        //System.out.println("\n------All Students------");
        //sm.viewStudent();
        //sc.close();
    }
}
