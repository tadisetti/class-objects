import java.util.*;
class Student
    {
      String  name;
      int   rollno;
      String branch;
    public static void main(String args[])
      {
      Student st1=new Student();
      st1.name="Dhana";
      st1.rollno=23;
      st1.branch="ECE";
      Student st2=new Student();
      st2.name="Naga";
      st2.rollno=225;
      st2.branch="ECE";
      Student st3=new Student();
      st3.name="Kusuma";
      st3.rollno=2;
      st3.branch="ECE";
        System.out.println(st1.name +" "+ st1.rollno +" "+ st1.branch);
        System.out.println(st2.name +" "+ st2.rollno +" "+ st2.branch);
        System.out.println(st3.name +" "+ st3.rollno +" "+ st3.branch);
        }
    }
        
        
      
      