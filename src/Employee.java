public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(String id,String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary (){
        return salary*12;
    }
    public int raisedSalry (int percent){
        salary=salary+(int)(salary*(percent/100.0));
        return salary;
    }

    public String toString (){
        return "Employee[id= " + id + ", name= " + name + ", salary= " + salary + "]";
    }
}
