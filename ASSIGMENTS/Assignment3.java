package ASSIGMENTS;

public class Assignment3
{
    public static void main(String args[])
    {
        Student s=new Student();
        Teacher t=new Teacher();
        Batch b=new Batch();
        s.setName("sam");
        s.setAge(21);
        s.setEmail("sam@gmail.com");
        s.setAddress("hyd");
        System.out.println("student name is:"+s.getName());
        System.out.println("student age is:"+s.getAge());
        System.out.println("student email is:"+s.getEmail());
        System.out.println("student address is:"+s.getAddress());

        t.setTeacherName("radha");
        t.setTeacherAge(28);
        t.setTeacherEmail("radha@gmail.com");
        t.setTeacherAddress("nanded");
        System.out.println("teacher name is:"+t.getTeacherName());
        System.out.println("teacher age is:"+t.getTeacherAge());
        System.out.println("teacher email is:"+t.getTeacherEmail());
        System.out.println("teacher address is:"+t.getTeacherAddress());

        





    }
    
}
class Student
{
    private String name;
    private int age;
    private String email;
    private String address;
    public Student()
    {
        System.out.println("student default constructor");
    }
     
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getEmail()
    {
        return email;
    }
    public String getAddress()
    {
        return address;
    }

}


class Teacher
{
    private String name;
    private int age;
    private String email;
    private String address;
    public Teacher()
    {
        System.out.println("teacher default constructor");
    }
     
    public void setTeacherName(String name)
    {
        this.name=name;
    }
    public void setTeacherAge(int age)
    {
        this.age=age;
    }
    public void setTeacherEmail(String email)
    {
        this.email=email;
    }
    public void setTeacherAddress(String address)
    {
        this.address=address;
    }

    public String getTeacherName()
    {
        return name;
    }
    public int getTeacherAge()
    {
        return age;
    }
    public String getTeacherEmail()
    {
        return email;
    }
    public String getTeacherAddress()
    {
        return address;
    }

}
class Batch
{
    private String name;
    private int size;
    private Student[] student;
    private Teacher teacher;
public Batch()
{
    System.out.println("batch class default constructor");
}
    public void setBatchName(String name)
    {
        this.name=name;

    }
    public void setBatchSize(int size)
    {
        this.size=size;
    }
    public String getBatchName(String name)
    {
        return name;

    }
    public int getBatchSize(int size)
    {
        return size;
    }


}

