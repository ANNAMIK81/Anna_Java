import java.util.*;

public class Main{
    public static void main(String[] args) {

        final List <Integer> list1 = new ArrayList<>();
        final List <String> list2 = new ArrayList<>();
        final List <Integer> list3 = new ArrayList<>();
       final Map<Integer,String>mapName=new HashMap<> ();
        mapName.put(1,"Gagik");
        mapName.put(2,"Anna");
        mapName.put(3,"Mkho");
        mapName.put(4,"Anahit");
        mapName.put(5,"Elen");
        mapName.put(6,"Tatevik");

        //for (int i=1,i<mapName.get)
        System.out.println(mapName);
        System.out.println("________________________");


        list3.add(5);
        list3.add(4);
        list3.add(2);
        list3.add(3);
      


        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(3);
        list1.add(1);
        list1.add(4);



        list2.add("A");
        list2.add("J");
        list2.add("C");
   

        final ListUtils listUtils = new ListUtils();
       System.out.println("Zuyg tveri qanaky: ");
        System.out.println(listUtils.getCountEven(list1));

      System.out.println("Anunnery Idinerov ");

        System.out.println(listUtils.getMap(list2));



 System.out.println(" order names");
System.out.println(listUtils.orderString(list2));


 System.out.println(" order true or false ");
System.out.println(listUtils.orderChek(list2));





 System.out.println("orderString(list).toString())     ");
     System.out.println(listUtils.orderString(list2).toString());


 System.out.println("Order Int List     ");
 System.out.println(listUtils.orderChekInt(list3));




     System.out.println("DELETE DUBLICATE  ");
     System.out.println(listUtils.deleteDublicate(list1));
 





    }
}