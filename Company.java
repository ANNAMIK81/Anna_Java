public class Company{

    private String  name;
    private  Empl[] empls;
    private double balance;


public void setName(String name){
    this.name=name;
}

public String getName(){
    return name;
}


public void setEmpl(Empl[] empls){
    this.empls=empls;
}



public void setBalance(double balance){
    this.balance=balance;
}


 public  boolean calculateEmplBal(){
    double salaryAll=0;
    for (Empl empl:empls){
        salaryAll+=empl.getSalary();
    }
    return salaryAll<balance;
 }




}
