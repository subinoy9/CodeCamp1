package ArrayCode; 

public class DevArrayProgram {
	public int SumofArray(int M) {
		int flag=0;
		int arr[]= {12,19,21,44,22};
		for (int j=0;j<arr.length;j++) {
			for (int i=j+1;i<arr.length;i++) {
				if(arr[j]+arr[i]==M)
					flag=1;
					
			}
			
		}
		if(flag==0)
			return -1;
		else
			return 1;
	}}