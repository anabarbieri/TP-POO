package ejecucion;
import java.util.*;
public class InterfazAutopartes {
	public static ListadoAutopartes autoparte;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		autoparte = new ListadoAutopartes();
		cargarAutopartes(scanner);
		darDeBajaAutoparte(scanner);
		modificarAutoparte(scanner);
        scanner.close(); // Cierra el Scanner al final de la ejecución
	}
	public static void cargarAutopartes(Scanner scanner) {
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
		
		System.out.print("Ingrese el codigo(mayor a 0) de la autoparte: (-1 para finalizar)");
		codigo = Integer.parseInt(scanner.nextLine());
		while (codigo != -1) {
			System.out.print("Ingrese la denominacion de la autoparte: ");
			denominacion = scanner.nextLine();
			while (contieneNumeros(denominacion)) {
                System.out.println("Error: La denominación no puede contener números.");
                System.out.print("Ingrese nuevamente la denominación de la autoparte: ");
                denominacion = scanner.nextLine();
            }
		
			System.out.print("Ingrese la descripcion de la autoparte: ");
			descripcion = scanner.nextLine();
			while (contieneNumeros(descripcion)) {
				System.out.println("Error: La descripcion no puede contener números.");
                System.out.print("Ingrese nuevamente la descripcion de la autoparte: ");
                descripcion = scanner.nextLine();
			}
			System.out.print("Ingrese la categoria de la autoparte: ");
			categoria = scanner.nextLine();
			while (contieneNumeros(categoria)) {
				System.out.println("Error: La categoria no puede contener números.");
                System.out.print("Ingrese nuevamente la categoria de la autoparte: ");
                categoria = scanner.nextLine();
			}
			System.out.print("Ingrese la marca de la autoparte: ");
			marca = scanner.nextLine();
			while (contieneNumeros(marca)) {
				System.out.println("Error: La marca no puede contener números.");
                System.out.print("Ingrese nuevamente la marca de la autoparte: ");
                marca = scanner.nextLine();
			}
			System.out.print("Ingrese el vehiculo de la autoparte: ");
			vehiculo = scanner.nextLine();
			while (contieneNumeros(vehiculo)) {
				System.out.println("Error: el vehiculo no puede contener números.");
                System.out.print("Ingrese nuevamente el vehiculo de la autoparte: ");
                vehiculo = scanner.nextLine();
			}
			System.out.print("Ingrese el modelo de la autoparte: ");
			modelo = scanner.nextLine();
			while (contieneNumeros(modelo)) {
				System.out.println("Error: el modelo no puede contener números.");
                System.out.print("Ingrese nuevamente el modelo de la autoparte: ");
                modelo = scanner.nextLine();
			}
			System.out.print("Ingrese el precio unitario de la autoparte: ");
			precioUni = Double.parseDouble(scanner.nextLine());
						
			System.out.print("Ingrese el enlace de la autoparte: ");
			enlace = scanner.nextLine();
			while (contieneNumeros(enlace)) {
				System.out.println("Error: el enlace no puede contener números.");
                System.out.print("Ingrese nuevamente el enlace de la autoparte: ");
                enlace = scanner.nextLine();
			}
			
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
	//scanner.close();
	}
	
	// Método para verificar si una cadena contiene números
    private static boolean contieneNumeros(String cadena) {
        for (char c : cadena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
	public static void darDeBajaAutoparte(Scanner scanner) {
	    System.out.println("Ingrese el código de la autoparte que desea dar de baja: ");
	    int codigo = Integer.parseInt(scanner.nextLine());
	    if (autoparte.darDeBajaAutoparte(codigo)) {
	        System.out.println("La autoparte con código " + codigo + " ha sido dada de baja exitosamente.");
	    } else {
	        System.out.println("No se encontró ninguna autoparte con el código " + codigo + ".");
	    }
	}
	
	public static void modificarAutoparte(Scanner scanner) {
		System.out.println("Ingrese el codigo de la autoparte que quiere modificar: ");
		int codigo = Integer.parseInt(scanner.nextLine());
		while (codigo != -1) {
			Autoparte autoparteAModificar = autoparte.buscarAutoparte(codigo);

			if (autoparteAModificar != null) {
				System.out.println("Autoparte encontrada: ");
				System.out.println(autoparteAModificar);
				
				try {
	                System.out.println("Ingrese la nueva denominación de la autoparte:");
	                String nuevaDenominacion = scanner.nextLine();
	                while (contieneNumeros(nuevaDenominacion)) {
	                    System.out.println("Error: La denominación no puede contener números.");
	                    System.out.print("Ingrese nuevamente la denominación de la autoparte: ");
	                    nuevaDenominacion = scanner.nextLine();
	                
	                }
	                 autoparteAModificar.setDenominacion(nuevaDenominacion);
	           
	            	System.out.println("Ingrese la nueva descripción de la autoparte:");
		            String nuevaDescripcion = scanner.nextLine();
		            while (contieneNumeros(nuevaDescripcion)) {
	                    System.out.println("Error: La descripcion no puede contener números.");
	                    System.out.print("Ingrese nuevamente la descripcion de la autoparte: ");
	                    nuevaDescripcion = scanner.nextLine();
		            }
	         
		            autoparteAModificar.setDescripcion(nuevaDescripcion);
	            
	            
		            System.out.println("Ingrese la nueva categoría de la autoparte:");
		            String nuevaCategoria = scanner.nextLine();
		            while (contieneNumeros(nuevaCategoria)) {
	                    System.out.println("Error: La categoria no puede contener números.");
	                    System.out.print("Ingrese nuevamente la categoria de la autoparte: ");
	                    nuevaCategoria = scanner.nextLine();
		            }
		            autoparteAModificar.setCategoria(nuevaCategoria);
	            
	            
		            System.out.println("Ingrese la nueva marca de la autoparte:");
		            String nuevaMarca = scanner.nextLine();
		            while (contieneNumeros(nuevaMarca)) {
	                    System.out.println("Error: La marca no puede contener números.");
	                    System.out.print("Ingrese nuevamente la marca de la autoparte: ");
	                    nuevaMarca = scanner.nextLine();
		            }
		            autoparteAModificar.setMarca(nuevaMarca);
	            
	            
		            System.out.println("Ingrese el nuevo vehículo de la autoparte:");
		            String nuevoVehiculo = scanner.nextLine();
		            while (contieneNumeros(nuevoVehiculo)) {
	                    System.out.println("Error: El vehiculo no puede contener números.");
	                    System.out.print("Ingrese nuevamente el vehiculo de la autoparte: ");
	                    nuevoVehiculo = scanner.nextLine();
		            }
		            autoparteAModificar.setVehiculo(nuevoVehiculo);
	            
	            
		            System.out.println("Ingrese el nuevo modelo de la autoparte:");
		            String nuevoModelo = scanner.nextLine();
		            while (contieneNumeros(nuevoModelo)) {
	                    System.out.println("Error: El modelo no puede contener números.");
	                    System.out.print("Ingrese nuevamente el modelo de la autoparte: ");
	                    nuevoModelo = scanner.nextLine();
		            }
		            autoparteAModificar.setModelo(nuevoModelo);
	            
		            System.out.println("Ingrese el nuevo precio unitario de la autoparte:");
		            double nuevoPrecioUnitario = Double.parseDouble(scanner.nextLine());
		            autoparteAModificar.setPrecioUni(nuevoPrecioUnitario);
	            
	           
		            System.out.println("Ingrese el nuevo enlace de la autoparte:");
		            String nuevoEnlace = scanner.nextLine();
		            while (contieneNumeros(nuevoEnlace)) {
	                    System.out.println("Error: El enlace no puede contener números.");
	                    System.out.print("Ingrese nuevamente el enlace de la autoparte: ");
	                    nuevoEnlace = scanner.nextLine();
		            }
		            autoparteAModificar.setEnlace(nuevoEnlace);
	            
		            System.out.println("Ingrese la nueva cantidad de stock de la autoparte:");
		            int nuevaCantidadStock = Integer.parseInt(scanner.nextLine());
		            autoparteAModificar.setCantStock(nuevaCantidadStock);
	            
		            System.out.println("Ingrese el nuevo stock mínimo de la autoparte:");
		            int nuevoStockMinimo = Integer.parseInt(scanner.nextLine());
		            autoparteAModificar.setStockMin(nuevoStockMinimo);
	            
		            System.out.println("Autoparte modificada con éxito");

				} catch (NumberFormatException e) {
	                System.out.println("Error: Debe ingresar un valor numérico válido.");
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            }
	            
	            
	        } else {
	            System.out.println("No se encontró ninguna autoparte con el código " + codigo + ".");
			}
	         
			
			System.out.print(" Ingrese otro codigo o -1 para salir: ");
			codigo = Integer.parseInt(scanner.nextLine());
			
			if (codigo != -1) {
				autoparteAModificar = autoparte.buscarAutoparte(codigo);
			}
		}
	}
}

        