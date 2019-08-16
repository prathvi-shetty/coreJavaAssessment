package java_assessment;

public class prime {
	
	public static void main(String args[]) {
		
		int[] a = {23,19,20,5,3,9,11,21};
		for(int i = 0; i< a.length; i++ )
		{
			boolean nprime = false; 
			for(int j=2; j < (a[i]/2); j++) {
				
				 if(a[i] %j == 0) {
					 nprime = true;
					 break;
					 
				 }
				 
			 }
			if(nprime==false) {
				//System.out.println(a[i]);
				int sum = 0, flag = 1;
				int j=1,l;
				l = a[i];
				
				while(j != 0) {
					
					 j = l % 10;
					 l = l / 10;
					 
					sum = sum + j;
				
					
					
				}
				
				for(int k=2 ; k<sum/2; k++) {
					if(sum % k == 0) {
						flag = 0;
						break;
					}
					
				}
				if(flag == 1)
				{
					System.out.println(a[i]);
				}
			}
			
			
		}
	}

}
