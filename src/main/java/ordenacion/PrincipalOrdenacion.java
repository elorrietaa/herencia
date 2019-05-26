package ordenacion;

public class PrincipalOrdenacion {
	public static void main(String[] args) {
		System.out.println("BURBUJA");
		new Burbuja();
		int[] desOrdenado = {7,3,9,5,8,2};
		Burbuja.bubble(desOrdenado);
	
		int [] A= {3,7};
		int [] B= {4,6};
		
		MergeSortFinal merge = new MergeSortFinal();
		System.out.println("MERGE SORT");
		int vec[]={45,17,23,67,21};
        System.out.println("Vector original");
        merge.imprimirVector(vec);
        System.out.println("\nVector ordenado");
        merge.ordenacionMergeSort(vec);
        merge.imprimirVector(vec);
		
	}
}
