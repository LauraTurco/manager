
public class Manager {
    protected String name;
    protected int age;

    }
    publicc void addemployee(String [employees]args)  {
    }


}

public class Employee {

    public String firstname;
    private String lastname;
    private int department;
    private int employeeID;
    private int age;

    public Employee(String emptname, String emptlasname, int dept, int id, int age) {
        firstname = emptname;
        lastname = emptlasname;
        department = dept;
        employeeID = id;
        age = age;
    }
    public  void incAge() {
        if(age < 65) {
            age ++;
        }
    }
       public void maximunAge(){
            System.out.println("age" + age);
    }
    public Employee(){}

    public String getname() {
        String fullname;
        fullname = firstname + lastname;
        return fullname;
    }
        public void introduction(){
        System.out.println("Name" + firstname + " " + lastname);
            System.out.println("department" + department);
            System.out.println("employeeID" + employeeID);
            System.out.println("age" + age);
    }




}





