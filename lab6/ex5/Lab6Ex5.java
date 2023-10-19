package lab6.ex5;

public class Lab6Ex5 {
	public static void main(String[] args) {
        int[] num = {56,32,1,89,43,30,100,45};
        int getSecondSmall= getSecondSmall(num,num.length);
        
        System.out.println("Second smallest is "+getSecondSmall);
        
    }

    public static int getSecondSmall(int[] num,int len) {
    	int temp;  
    	for (int i = 0; i < len; i++)   
    	        {  
    	            for (int j = i + 1; j < len; j++)   
    	            {  
    	                if (num[i] > num[j])   
    	                {  
    	                    temp = num[i];  
    	                    num[i] = num[j];  
    	                    num[j] = temp;  
    	                }  
    	            }  
    	        }  
    	       return num[1]; 
    }
}
