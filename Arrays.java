public class Arrays{
	public static void main (String[] args){
		int[] numbers= new int[] {24,18,20};
		String[] names={"ANNA", "POXOS", "Elen"};
		Boolean[] isWorker={true, false,true};					
		int count = numbers.length;
		int[] summSalary={1000,2000,5000000};
	   int[] summSalaryEkv={500,300,121};
		int[] summSalaryEkv1=new int[3];
		String[] isWork=new String[3];		
		int maxSalary=10000000; 
		float[] percent1=new float[3];
		int total = (int)numbers[numbers.length-1];
	    System.out.println("_________________________________________");

		for (int i = 0; i < count ; i++){
	      summSalaryEkv1[i]=(int)summSalary[i]*(int)summSalaryEkv[i];
	      percent1[i]=(100*(float)summSalaryEkv1[i])/(float)maxSalary;
          if (isWorker[i]==true) {
          	isWork[i]="IS WORKER";
          } else {
          	isWork[i]="NOW IS NOT WORKER";
          }
	      if ((int)summSalaryEkv1[i]< maxSalary) {


		  System.out.println("Names is "+names[i]+", age is "+numbers[i]+" "+isWork[i]+" Salary "+summSalary[i]+" SalaryEkv. "+summSalaryEkv1[i]+" percent "+percent1[i]);
		  System.out.println("_________________________________________");
              } 

              else {

              	 
              	 System.out.println("Names is "+names[i]+", age is "+numbers[i]+" "+isWork[i]+" Salary "+summSalary[i]+" SalaryEkv. "+summSalaryEkv1[i]+" percent "+percent1[i]+" this worker salary percent > maximal percent value");
		         System.out.println("_________________________________________");
              }
		}

			}
}