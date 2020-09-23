import java.util.Arrays;

public class Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int []intArray= {20,35,-15,7,55,1,-22};
    for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
       {
    	  for(int i=0;i<lastUnsortedIndex;i++)
    	  {
    		  if(intArray[i]>intArray[i+1])
    			  swap(intArray,i,i+1);
    	  }
       }
   for(int k=0;k<intArray.length;k++)
      {
	     System.out.print(intArray[k]+" "); 
      }
	}
	
	
	public static void swap(int []arr,int i,int j)
	{
		if(i==j)
			return;
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
