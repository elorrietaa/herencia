package arrayList;

import java.util.ArrayList;

public class PrincipalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Declaración de arrayList
	ArrayList lista;
	
	//Declaración e inicializaicón de arrayList //el tipo puede ser un objeto
	ArrayList <String> listaPaises= new ArrayList();
	//Para añadir:
	listaPaises.add("Italia"); //ocupa la posición 0
	listaPaises.add("Francia"); //ocupa la posición 1
	listaPaises.add("Alemania"); //ocupa la posición 2
	listaPaises.add(1,"China"); //ocupa la posición 1
	//el orden ahora es: Italia, China, Francia, Alemania
	
	//para eliminar:
	listaPaises.remove(1); //elimina por la posición
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
		System.out.print(paisBuscado + "se ha encontrado en la posición "+ pos);
	else
		System.out.print(paisBuscado + "no se ha encontrado");
	
	//recorrer
	for(int i=0;i<listaPaises.size();i++)
		System.out.println(listaPaises.get(i));

	//for(String pais:listaPaises)
	//	System.out.println(listaPaises.get(0));
	}
	
	

}
