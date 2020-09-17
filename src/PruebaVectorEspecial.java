import java.util.Arrays;
import java.util.InputMismatchException;
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
10)Disminuir el tamaño del arreglo..Completo
11)Insertar elemto en pocicion especifica.....Completo
12)eleminar el elemrnto de pocicion especifica....Completo
13)Invertir vector................................Completo
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
	public void aumentarTamañoArreglo(int tamaño) {
		//clone crea otro vector
		int array[]=edades.clone();
		
		if(tamaño>edades.length) {
			edades=new int[tamaño];
			for(int i=0;i<array.length;i++) {
				edades[i]=array[i];
			}
			System.out.println("Tamaño edades"+edades.length+Arrays.toString(edades));
		}else {
			System.out.println("Error el dato que ingresaste no es mayor el numero debe de ser mayor a: "+edades.length);
		}
		
		
	}
	public void disminurTamañoArreglo(int tamaño) {
		int array[]=new int[tamaño];
		if(tamaño<edades.length) {
			for (int i = 0; i < array.length; i++) {
				array[i]=edades[i];
			}
			edades=new int [tamaño];
			for (int i = 0; i < edades.length; i++) {
				edades[i]=array[i];
			}
			System.out.println(Arrays.toString(edades));
		}else {
			System.out.println("Error el dato que ingresaste no es menor el numero debe de ser menor a: "+edades.length);
		}
		
	}
	public void insertarElementoPocicionEspecifica(byte poci,byte dato) {
		try {
			edades[poci]=dato;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La pocicion ingresada no existe");
		}
		
	}
	public void eliminarElementoPocicionEspecifica(int poci) {
		try {
			edades[poci]=0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La pocicion ingresada no existe");
		}
	}
	public void invertirVector() {
		byte x=0;
		int vectorInertido[]=new int[edades.length];
		for(int i=edades.length-1;i>=0;i--) {
			//System.out.println(edades[i]);
			vectorInertido[x]=edades[i];
			x++;
		}
		edades=vectorInertido;
	}
	
}
public class PruebaVectorEspecial {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String op=null;
		int tamaño=0;
		VectorEspecial ve3=new VectorEspecial(3);
		do {
		System.out.println("El vetor de forma predeterminada se crea con un tamaño de 3 pociciones");
		System.out.println("Seleciona la opcion que necesites:");
		System.out.println("1-Llenar vector");
		System.out.println("2-Obtener pocicion de inicio.");
		System.out.println("3-Obtener pocicion final.");
		System.out.println("4-Obtener catidad de elementos");
		System.out.println("5-Mostrar todos los elementos.");
		System.out.println("6-Mostrar el primer elemnto.");
		System.out.println("7-Mostrar el ultimo elemento");
		System.out.println("8-Aumentar el tamaño del arreglo");
		System.out.println("9-Disminuir el tamaño del arreglo");
		System.out.println("10-Insertar elemto en pocicion especifica.");
		System.out.println("11-Eleminar el elemento de pocicion especifica");
		System.out.println("12-Invertir vector");
		System.out.println("13- Salir");
		op=entrada.next();
		switch (op) {
		case "1":
			ve3.llenarVector();
			break;
		case "2":
			System.out.println("--------Pocicion inicio ---------------");
			int pocicion=ve3.obtenerPocicionInicio();
			System.out.println("Se obtuvo de forma correcta");
			break;
		case "3":
			int pociFinal=ve3.obtenerPocicionFinal();
			System.out.println("Se ontuvo la pocicion final");
			break;
		case "4":
			System.out.println("La cantidad de elementos es: "+ve3.obtenerCnatidadElemtos());
			break;
		case "5":
			ve3.mostrarVector();
			break;
		case "6":
			ve3.mostrarPrimerElemento();
			break;
		case "7":
			ve3.mostrarUltimoElemento();
			break;
		case "8":
			System.out.println("Ingresa el tamaño que deseas para aumentar el tamaño");
			tamaño=entrada.nextInt();
			ve3.aumentarTamañoArreglo(tamaño);
			System.out.println("El tamaño a sido cambiado correctamente a: "+ve3.getEdades().length);
			break;
		case "9":
			System.out.println("Ingresa el tamaño que deseas para disminuir el tamaño");
			tamaño=entrada.nextInt();
			ve3.disminurTamañoArreglo(tamaño);
			System.out.println("El tamaño a sido reducido correctamente a: "+ve3.getEdades().length);
			break;
		case "10":
			int poci=0,dato=0;
			try {
				System.out.println("Ingresa la pocicion que desas ingresar tu dato");
				poci=entrada.nextInt();
				System.out.println("Ingresa el dato que deseas ingresar");
				dato=entrada.nextInt();
				ve3.insertarElementoPocicionEspecifica((byte)poci,(byte) dato);
			} catch (InputMismatchException e) {
				System.out.println("Error no ingresate un dato numerico entero");
			}
			break;
		case "11":
			try {
				System.out.println("Ingresa la pocicion que desas eliminar su dato");
				poci=entrada.nextInt();
				ve3.eliminarElementoPocicionEspecifica(poci);
			} catch (InputMismatchException e) {
				System.out.println("Error no ingresate un dato numerico entero");
			}
			break;
		case "12":
			ve3.invertirVector();
			System.out.println("El vector invertido es: "+Arrays.toString(ve3.getEdades()));
			break;
			case "13":
				System.out.println("Gracias por usar este programa :D");
				break;
		default:
			System.out.println("La opcion elegida no existe");
			break;
		}// switch
		
		}while(!op.equalsIgnoreCase("13"));
	}

}
