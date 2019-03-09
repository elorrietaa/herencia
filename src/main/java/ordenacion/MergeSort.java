package ordenacion;

public class MergeSort {

	public int[] Merger2a4(int[] A, int [] B) {
		int [] resultado =new int [4];
		
		if(A[0]<B[0]) {
			
			if(A[0]<B[1]) {
				resultado[0]=A[0];
			}
			else if (A[1]<B[0]) {
				if(A[1]<B[1]) {
					resultado[1]=A[1];
				}
			}
			else (A[2]<B[0]) {
				resultado[1]=A[1];
			}
		}
		
		else if (B[0]<A[0]){
				resultado[0]=B[0];
		}
		
		else {
			if(B[1]<A[0]){
				resultado[0]=B[1];
			}
		}
		
		if(A[1]<B[0]) {
			resultado[0]=A[0];
			if(A[1]<B[1]) {
				resultado[1]=A[1];
			}
		}
		
		else if (B[0]<A[1]){
				resultado[2]=B[0];
		}
		
		else {
			if(B[1]<A[1]){
				resultado[1]=B[1];
			}
		}
		
		
		
		return resultado;
		
	}
}
