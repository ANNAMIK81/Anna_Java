import java.util.Scanner;
public class lesson4{
public static void main(String ags[]){
Scanner sc= new Scanner(System.in);
Scanner in=new Scanner(System.in);
System.out.println("Enter Param1 ");
long p1=sc.nextLong();
System.out.println("Enter Param2 ");
long p2=sc.nextLong();
System.out.println("Enter gortsoxutyun ");
String  ss=sc.next();
long rez;
if(ss.equals("+") ){
  rez=p1+p2;
    System.out.println("rezult is "+rez);
}else if(ss.equals("-") ){
     rez=p1-p2;
     System.out.println("rezult is "+rez);
}else if (ss.equals("*")  ){
     rez=p1*p2;
     System.out.println("rezult is "+rez);

}else if ( ss.equals("/")) {

rez=p1/p2;
    System.out.println("rezult is "+rez);
 } else{
    System.out.println("chhaytararvats gortsoxutyun ");
 }


}
}