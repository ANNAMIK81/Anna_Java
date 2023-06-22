
public class Lesson5_exc {



      public static void main(String[] args) {
        System.out.println("_____________________________"); 
        String a = "Good          morning        Vietnam";
        String b = removeSp(a);
        System.out.println(b); 
        int nub = 10;
        if (nub<=0) {
        System.out.println("Not valid FIBONACHI argument"); 
        } else {
        int[] r = FIB(nub);
         System.out.println("_____________________________"); 
        System.out.println("FIBONACHI _"); 
     
        for (int i = 0; i < r.length-1; i++) {
       System.out.print(r[i]);
        }
        }
    }

    public static String removeSp(String a) {
        
        String result = a.replaceAll("\\s", "");

        return result;
    }


    public static int[] FIB(int n) {
       int[] fint = new int[n];
        fint[0] = 1;
            fint[1] = 1;

            for (int i = 2; i < n; i++) {
                fint[i] = fint[i - 1] + fint[i - 2];
            }
         

        return fint;
    }



  
}