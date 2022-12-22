package hashtable;

public class Arrays {

	public static int search(int [] arr2,int x)
	{
		int N=arr2.length;
		for (int i=0;i<N;i++)
		{
			if (arr2[i]==x)
				return i;
 		}
		return -1;
      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {11,12,13,14,10};
       int x=10;
       
       int result=search(arr,x);
       if (result==-1)
    	   System.out.println("Element not present in array");
       else 
    	   System.out.println("Element found at index: "+result);
	}


}