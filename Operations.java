import java.util.*;
class details
  {
    private int   EmplyId;
    private String EmplyName;
    private String EmplyDept;
    private double EmplySalary;
    void setemplyId(int emplyid)
    {
      this.EmplyId=emplyid;
    }
    int getEmplyid()
    {
      return this.EmplyId;
    }
    void setemplyName(String emplyname)
    {
      this.EmplyName=emplyname;
    }
    String getemplyname()
    {
      return this.EmplyName;
    }
    void setemplyDept( String emplydept)
    {
      this.EmplyDept=emplydept;
    }
    String getEmplydept()
    {
      return this.EmplyDept;
    }
    void setemplySalary(double emplysalary)
    {
      this.EmplySalary=emplysalary;
    }
    double getemplysalary()
    {
      return this.EmplySalary;
    }
  }
class Employee
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      details D=new details();
      System.out.println("Enter EmplyId");
      D.setEmplyid(sc.nextInt());
      System.out.println("Enter EmplyName");
      D.setEmplyname(sc.next());
      System.out.println("Enter EmplyDept");
      D.setEmplydept(sc.next());
      System.out.println("Enter EmplySalary");
      D.setEmplysalary(sc.nextDouble());
      System.out.println(D.getid()+D.getname()+D.getdept()+D.getsalary());
      
    }
  }