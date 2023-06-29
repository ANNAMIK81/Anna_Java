public class EmplMain{

    public static void main(String[] agrs){
        Empl empl1=new Empl();
        empl1.setSalary(150000);
        Empl empl2=new Empl();
        empl2.setSalary(500000);

        Company com= new Company();
        com.setBalance(50000000);
        com.setEmpl(new Empl[]{empl1,empl2});

if (com.calculateEmplBal()==true){
     System.out.println("karanc eli ashxatox yndunenq");

}else 
{
    System.out.println("stop");
}

}

    
  
}