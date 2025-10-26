public class Main {
    public static void main(String[] args) {
        Account ac1 =new Account("054466","Muath",5000);
        Account ac2=new Account("05555","ahmad",500);
        System.out.println(ac1.transferTo(ac2,1000));
        System.out.println(ac1.getBalance());
        System.out.println(ac1.getName());
        System.out.println(ac1.getId());
        ac1.credit(500);
        System.out.println(ac1.toString());
        //--------------------------------------------------------
        Employee em1=new Employee("0544","Muath",15000);
        System.out.println(em1.getAnnualSalary());
        System.out.println(em1.raisedSalry(20));
        System.out.println(em1.toString());
        }
    }
