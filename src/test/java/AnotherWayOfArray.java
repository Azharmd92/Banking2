
public class AnotherWayOfArray {
	public static void main(String[] args) {
		int[] ar1 = {7,0,1,0,0,5,0,9,0,3};
		int len = ar1.length;
		pushZeros(ar1,len);
		for(int i=0;i<len;i++) {
			System.out.print(ar1[i]+" ");
			
		}
	}
	public static void pushZeros(int[] ar1, int n) {
		
		int cnt=0;
		for(int i=0;i<n;i++) {
			if(ar1[i]!=0)
				ar1[cnt++]=ar1[i];
			while(cnt<n)
				ar1[cnt++]=0;
			
		}
	}

	
	
}
