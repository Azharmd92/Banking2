
public class ArrayElementShift {

	public static void main(String[] args) {
		int[] ar1 = {7,0,1,0,0,5,0,9,0,3};
		int nzi = 0;
		for(int i=0;i<ar1.length;i++) {
			if(ar1[i]==0) {
				int tmp = ar1[i];
				ar1[i]=ar1[nzi];
				ar1[nzi]=tmp;
				nzi++;
				
			}
			
		}
		for(int itm:ar1) {
			System.out.print(itm+" ");
			
		}
	}

}
