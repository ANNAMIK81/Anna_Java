import java.util.*;
public class ListUtils{
//1.կտպի զույգ թվերի քանակությունը
    public final int getCountEven(final List<Integer> list){
        int count =0;
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) % 2==0){
               count++;
            }
        }
        return count; 
    }

//2.Անունների լիստ տալու ժամանակ կդասավորի Map-ի մեջ ամեն մի key-ն հերթական թիվ։ "Joe", "Jane", "Bill" -> 1:"Joe", 2: "Jane", 3: "Bill"

public final Map getMap(final List<String> list)
{
   final Map<Integer,String>mapName=new HashMap<> ();
    for (int i=0;i<list.size();i++){

        mapName.put(i,list.get(i));
       
    }
    return mapName;
}

//4.Անունները կդասավորի աճման կարգով ըստ այբբենականի

public final Set orderString(final List<String> list)
{
    final Set<String> order = new TreeSet<> ();

           for (int i=0;i<list.size();i++){

           order.add(list.get(i));
       
             }
return order;
}


//3.tvery achman kargov
public final boolean orderChekInt(final List<Integer> list){

int num=list.get(0);
for (int i=1; i<list.size();i++){
    if(num<=list.get(i)){
        return false;
    }
num=list.get(i);
}
return true;

}




//4.Toxeri list taluc chek ani 

public final boolean orderChek(final List<String> list)
{
     String a=orderString(list).toString();
     String b=list.toString();
 
      if( a.equals(b) )

         {
        return true;
       
            }

            return false;
       
}

//5.Թվերի լիստ փոխանցելուց հետ կվերադարձնի List մենակ unique արժեքներով
//deleteDublicate

public final Set deleteDublicate(final List<Integer> list)
{
    final Set<Integer> order = new HashSet<> ();

           for (int i=0;i<list.size();i++){

           order.add(list.get(i));
       
             }
return order;
}


}
