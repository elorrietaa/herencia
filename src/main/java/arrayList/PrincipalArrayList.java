package arrayList;

import java.util.ArrayList;

public class PrincipalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaraci�n de arrayList
	ArrayList lista;
	
	//Declaraci�n e inicializaic�n de arrayList //el tipo puede ser un objeto
	ArrayList <String> listaPaises= new ArrayList();
	//Para a�adir:
	listaPaises.add("Italia"); //ocupa la posici�n 0
	listaPaises.add("Francia"); //ocupa la posici�n 1
	listaPaises.add("Alemania"); //ocupa la posici�n 2
	listaPaises.add(1,"China"); //ocupa la posici�n 1
	//el orden ahora es: Italia, China, Francia, Alemania
	
	//para eliminar:
	listaPaises.remove(1); //elimina por la posici�n
	listaPaises.remove("Alemania"); //elimina por el nombre
	//ArrayList <Integer> edad=new ArrayList() ;
	
	
	//seleccionar
	listaPaises.get(1);
	
	//buscar
	listaPaises.indexOf(1);

//	int indexOf(Object elementoBuscado);
	
	String paisBuscado ="Francia";
	int pos = listaPaises.indexOf(paisBuscado);
	if(pos!=-1)
		System.out.print(paisBuscado + "se ha encontrado en la posici�n "+ pos);
	else
		System.out.print(paisBuscado + "no se ha encontrado");
	
	//recorrer
	for(int i=0;i<listaPaises.size();i++)
		System.out.println(listaPaises.get(i));

	//for(String pais:listaPaises)
	//	System.out.println(listaPaises.get(0));
	}
	
	

}
