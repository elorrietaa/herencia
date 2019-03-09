package ordenacion;

public class Burbuja {

	
	
	public static int[] bubble(int[] desOrdenado) {
        for(int i=0;i< desOrdenado.length-1; i++) {
            for(int j=0;j< desOrdenado.length-1;j++) {
                if (desOrdenado [j]> desOrdenado [j+1]) {
                    desOrdenado=swap(desOrdenado, j);
                }
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("El array ORDENADO ASC es:");
        for(int i=0;i<desOrdenado.length; i++) {
        	System.out.println(desOrdenado [i]);
        }
        System.out.println("--------------------------------------------");

return desOrdenado;	   
}
	
		public static int[] swap(int[] vector, int j){
		int aux;
		aux= vector [j+1];
		vector [j+1]= vector [j];
		vector [j]=aux;
		return vector;
		}

}
