import java.util.Arrays;
import java.util.Scanner;

/*1)Crear.......................Completo
2)Llenar........................Completo
3) Obtener pocicion de inicio...Completo
4)Obtener pocicion final........Completo
5)Obtener catidad de elementos
6)Mostrar todos los elemntos....Completo
7)Mostrar el primer elemnto
8)Mostrar el ultimo elemento
9)Aumentar el tamaño del arreglo
10)Disminuir el tamaño del arreglo
11)Insertar elemto en pocicion especifica
12)eleminar el elemrnto de pocicion especifica
13)Invertir vector
 *
 */
class VectorEspecial{
	Scanner entrada=new Scanner(System.in);
		//declaracion
	int edades[];
	
	public VectorEspecial(int tamaño) {
		//	Creacion
		this.edades=new int[tamaño];
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
	
}
public class PruebaVectorEspecial {

	public static void main(String[] args) {
		
		
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
		System.out.println("----------------6----------");
		ve3.mostrarVector();

	}

}
