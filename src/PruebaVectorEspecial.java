import java.util.Arrays;
import java.util.Scanner;

/*1)Crear.......................Completo
2)Llenar........................Completo
3) Obtener pocicion de inicio...Completo
4)Obtener pocicion final........Completo
5)Obtener catidad de elementos..Completo
6)Mostrar todos los elemntos....Completo
7)Mostrar el primer elemnto.....Completo
8)Mostrar el ultimo elemento....Completo
9)Aumentar el tamaño del arreglo ..Completo
10)Disminuir el tamaño del arreglo
11)Insertar elemto en pocicion especifica
12)eleminar el elemrnto de pocicion especifica
13)Invertir vector
 *
 */
class VectorEspecial{
	Scanner entrada=new Scanner(System.in);
		//declaracion
	private int edades[];
	
	public VectorEspecial(int tamaño) {
		//	Creacion
		this.edades=new int[tamaño];
	}
	
	
	public int[] getEdades() {
		return edades;
	}


	public void setEdades(int[] edades) {
		this.edades = edades;
	}


	public void llenarVector() {
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Ingresa edad: "+(i+1)+" :");
			edades[i]=entrada.nextInt();
		}
		
	}
	public void mostrarVector() {
		System.out.println(Arrays.toString(edades));
	}
	public int obtenerPocicionInicio() {
		return edades[0];
	}
	public int obtenerPocicionFinal() {
		return edades[edades.length-1];
	}
	public int obtenerCnatidadElemtos() {
		return edades.length;
	}
	public void mostrarPrimerElemento() {
		System.out.println("El primer elemento es: "+edades[0]);
	}
	public void mostrarUltimoElemento() {
		System.out.println("El ultimo elemento es: "+edades[edades.length-1]);
	}
	public void aumentarTamañoArreglo(int tamañoNuevo) {
		boolean bandera=false;
		do {
		if(tamañoNuevo>edades.length) {
			bandera=true;
			edades=new int [tamañoNuevo];
		}else {
			System.out.println("Error el dato que ingresaste no es mayor el numero debe de ser mayor a: "+edades.length);
			System.out.println("Ingresa el tamaño que deseas para aumentar el tamaño");
			tamañoNuevo=entrada.nextInt();
		}
		}while(bandera==false);
		
	}
}
public class PruebaVectorEspecial {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("-------------1---------------");
		VectorEspecial ve3=new VectorEspecial(3);
		System.out.println("-------------2---------------");
		ve3.llenarVector();
		System.out.println("-------------3---------------");
		int pocicion=ve3.obtenerPocicionInicio();
		System.out.println("Se obtuvo el dato inicial");
		System.out.println("-------------4---------------");
		int pociFinal=ve3.obtenerPocicionFinal();
		System.out.println("Se obtuvo el dato Final");
		System.out.println("--------------5--------------");
		System.out.println("La cantidad de elementos es: "+ve3.obtenerCnatidadElemtos());
		System.out.println("----------------6----------");
		ve3.mostrarVector();
		System.out.println("----------------7----------");
		ve3.mostrarPrimerElemento();
		System.out.println("----------------8----------");
		ve3.mostrarUltimoElemento();
		System.out.println("----------------9----------");
		System.out.println("Ingresa el tamaño que deseas para aumentar el tamaño");
		int tamaño=entrada.nextInt();
		ve3.aumentarTamañoArreglo(tamaño);
		System.out.println("El tmaño a sido cambiado correctamente a: "+ve3.getEdades().length);
		
	}

}
