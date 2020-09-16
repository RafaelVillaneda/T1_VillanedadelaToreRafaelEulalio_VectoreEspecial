import java.util.Arrays;
import java.util.Scanner;

/*1)Crear
2)Llenar
3) Obtener pocicion de inicio
4)Obtener pocicion final
5)Obtener catidad de elementos
6)Mostrar todos los elemntos
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
	
	
}
public class PruebaVectorEspecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
