import java.util.*;
class Student_N
  {
    //declear and intializing varaibles
    String name;
    int rollno;
    String branch;
    void reading()
    {
      //print reading
      System.out.println("reading");
      
    }
    void writing()
    {
      //print writing
      System.out.println("writing");
      
    }
  }
//main method
class MStudent
  {
    public static void main(String args[])
    {
      //initializing objects
      Student St=new Student();
      St.name="dhana";
      St.rollno =12;
      St.branch="ECE"; 
      //st.reading();
      //st.writing();
      //print result
        System.out.println(St.name +" "+ St.rollno +" "+ St.branch);
      
    }
  }