public class Student{

        int id;
        String name;
        int age;
        String dept;
        double cgpa;
    Student(int id,String name, int age, String dept, double cgpa){
        ///System.out.println("Parameterised constructor");
        this.id=id;
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.cgpa=cgpa;
    }
    void displayStudent(){
        //System.out.println(id+"\n"+name+"\n"+age+"\n"+dept+"\n"+cgpa+"\n");
        System.out.println("Student id  :"+id);
        System.out.println("Student Name:"+name);
        System.out.println("Student age :"+age);
        System.out.println("Student dept:"+dept);
        System.out.println("Student cgpa:"+cgpa);
        System.out.println("-----------------------------");
    }
}