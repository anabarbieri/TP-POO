package ejecucion;
import java.util.*;
public class InterfazAutopartes {
	public static ListadoAutopartes autoparte;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		autoparte = new ListadoAutopartes();
		cargarAutopartes();
	}
	public static void cargarAutopartes() {
		Scanner scanner = new Scanner(System.in);
		int codigo;
		String denominacion;
		String descripcion;
		String categoria;
		String marca;
		String vehiculo;
		String modelo;
		double precioUni;
		String enlace;
		int cantStock;
		int stockMin;
		Autoparte datos;
		
		System.out.print("Ingrese el codigo de la autoparte: (-1 para finalizar)");
		codigo = Integer.parseInt(scanner.nextLine());
		while (codigo != -1) {
			System.out.print("Ingrese la denominacion de la autoparte: ");
			denominacion = scanner.nextLine();
			System.out.print("Ingrese la descripcion de la autoparte: ");
			descripcion = scanner.nextLine();
			System.out.print("Ingrese la categoria de la autoparte: ");
			categoria = scanner.nextLine();
			System.out.print("Ingrese la marca de la autoparte: ");
			marca = scanner.nextLine();
			System.out.print("Ingrese el vehiculo de la autoparte: ");
			vehiculo = scanner.nextLine();
			System.out.print("Ingrese el modelo de la autoparte: ");
			modelo = scanner.nextLine();
			System.out.print("Ingrese el precio unitario de la autoparte: ");
			precioUni = Double.parseDouble(scanner.nextLine());
			System.out.print("Ingrese el enlace de la autoparte: ");
			enlace = scanner.nextLine();
			System.out.print("Ingrese la cantidad de stock de la autoparte: ");
			cantStock = Integer.parseInt(scanner.nextLine());
			System.out.print("Ingrese el stock minimo de la autoparte: ");
			stockMin = Integer.parseInt(scanner.nextLine());
			try {
		        datos = new Autoparte(codigo,denominacion,descripcion,categoria,marca,vehiculo,modelo,precioUni,enlace,cantStock,stockMin);
		        autoparte.cargarAutopartes(datos);
				System.out.print("Autoparte cargada con exito");
			}catch (IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			System.out.print(" Ingrese otro codigo o -1 para salir: ");
			codigo = Integer.parseInt(scanner.nextLine());
	        
			
		
		}
		scanner.close();
	}
	
}
