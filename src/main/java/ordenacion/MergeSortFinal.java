package ordenacion;

import java.util.Arrays;

public class MergeSortFinal {
	public static void ordenacionMergeSort(int vec[]){
        if(vec.length<=1) return;
        int mitad= vec.length/2;
        int izq[]=Arrays.copyOfRange(vec, 0, mitad);
        int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);       
        combinarVector(vec, izq, der);
}
//Con la forma 2no funciona
public  void ordenacionMergeSortForma2(int vec[]){
		
        if(vec.length<=1) return;
        int mitad= vec.length/2;
        int izq[] = new int [mitad];
        int der[] = new int [mitad];
        for(int i=0;i<mitad;i++) {
        	 izq[i]= vec[i];
        }
        for(int i=mitad;i<vec.length-1;i++) {
       	 der[i]= vec[i];
       }
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);       
        combinarVector(vec, izq, der);
}

	
	
public static void combinarVector(int v[], int izq[],int der[]){
        int i=0;
        int j=0;
        for(int k=0;k<v.length;k++){
                if(i>=izq.length){
                        v[k]=der[j];
                        j++;
                        continue;
                }
                if(j>=der.length){
                        v[k]=izq[i];
                        i++;
                        continue;
                }
                if(izq[i]<der[j]){
                        v[k]=izq[i];
                        i++;
                }else{
                        v[k]=der[j];
                        j++;
                }
        }
}

public static void imprimirVector(int vec[]){
        for(int i=0;i<vec.length;i++){
                System.out.print(vec[i]+" ");
        }
}
}
