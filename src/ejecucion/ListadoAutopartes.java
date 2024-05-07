package ejecucion;
import java.util.*;
public class ListadoAutopartes {
	ArrayList <Autoparte> listaAutopartes;
	public ListadoAutopartes(){
		listaAutopartes = new ArrayList<Autoparte>();
	}
	private boolean ValidarAutoparte(Autoparte datos) {
		for (int i = 0; i< listaAutopartes.size(); i++) { //va a estar en el ciclo mientras que i sea menor que el tamaño de la lista
			Autoparte el = listaAutopartes.get(i);//voy guardando en el el valor de i que accedo de la lista
			if (el.getCodigo() == datos.getCodigo()){ //si son iguales 
				return false;
			}
		}
		return true;
	}
	public boolean cargarAutopartes(Autoparte datos) {
		if (ValidarAutoparte(datos)) {
			listaAutopartes.add(datos);
			return true;
		}else {
			return false;
		}
	}
	public boolean darDeBajaAutoparte(int codigo) {
        for (int i = 0; i < listaAutopartes.size(); i++) {
            Autoparte el = listaAutopartes.get(i);
            if (el.getCodigo() == codigo) {
                listaAutopartes.remove(i);
                return true;
            }
        }
        return false;
    }
	
	public Autoparte buscarAutoparte(int codigo) {
		for (Autoparte autoparte: listaAutopartes) {
			if (autoparte.getCodigo() == codigo) {
				return autoparte;
			}
		}
		return null; //Si no se encuentra ninguna autoparte con ese codigo
	}
}