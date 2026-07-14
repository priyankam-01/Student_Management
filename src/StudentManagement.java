import java.util.*;
public class StudentManagement{
    ArrayList<Student> students=new ArrayList<>();

    void addStudent(Student student){
        students.add(student);//from Main to here student = student(main calss);
        System.out.println(student.name +" Added Successfully");
    }
    void viewStudent(){
        for(Student s:students){
            s.displayStudent();//move to student class
        }
    }
    void searchStudent(int searchid){
        boolean found=false;
        for(Student s:students){
            if(s.id==searchid){
                found=true;
                s.displayStudent();
                break;
            }
        }
        if(!found){
            System.out.println("Student not found");
        }
    }
    void updateStudent(int updateid,String newname,int newage,String newdept,double newcgpa){
        boolean found=false;
        for(Student s:students){
            if(s.id==updateid){
                found=true;
                s.name=newname;
                s.age=newage;
                s.dept=newdept;
                s.cgpa=newcgpa;
                System.out.println("Updated successfully");
                s.displayStudent();
                break;
            }
        }
        if(!found){
            System.out.println("Student not found");
        }
    }
    void deleteStudent(int deleteid){
        boolean found=false;
        for(int i=0;i<students.size();i++){
            
            if(students.get(i).id==deleteid){//to get the studentt object
                found=true;
                students.remove(i);
                System.out.println("Deleted Successfully");
                break;
            }
        }
        if(!found){
            System.out.println("Student not found");
        }
    }
}