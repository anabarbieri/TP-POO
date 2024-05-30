package ejecucion;


public class Autoparte {
	private int codigo;
	private String denominacion;
	private String descripcion;
	private String categoria;
	private String marca;
	private String vehiculo;
	private String modelo;
	private double precioUni;
	private String enlace;
	private int cantStock;
	private int stockMin;
	
	
	public Autoparte(int codigo, String denominacion, String descripcion, String categoria, String marca, String vehiculo, String modelo, double precioUni, String enlace, int cantStock, int stockMin){
		this.setCodigo(codigo);
		this.setDenominacion(denominacion);
		this.setDescripcion(descripcion);
		this.setCategoria(categoria);
		this.setMarca(marca);
		this.setVehiculo(vehiculo);
		this.setModelo(modelo);
		this.setPrecioUni(precioUni);
		this.setEnlace(enlace);
		this.setCantStock(cantStock);
		this.setStockMin(stockMin);
		
	}
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int codigo) {
			if(codigo >= 0) {
				this.codigo = codigo;
			}else {
				throw new IllegalArgumentException("Error ingrese un valor numerico en el codigo");
			}
		}
	public String getDenominacion(){
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		if (denominacion != null && !denominacion.isEmpty()){
			this.denominacion = denominacion;
		}else {
			throw new IllegalArgumentException("Error ingrese un valor alfabetico");
		}		
	}
	public String getDescripcion(){
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		if(descripcion != null && !descripcion.isEmpty()) {
			this.descripcion = descripcion;
		}else {
			throw new IllegalArgumentException("Error ingrese un valor alfabetico");
		}	
	}
	
	public String getCategoria(){
		return categoria;
	}
	public void setCategoria(String categoria) {
		if(categoria != null && !categoria.isEmpty()) {
			this.categoria = categoria;
		}else {
			throw new IllegalArgumentException("Error ingrese un valor alfabetico");
		}	
	}
	
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca) {
		if(marca != null && !marca.isEmpty()) {
			this.marca = marca;
		}else {
			throw new IllegalArgumentException("Error ingrese un valor alfabetico");
		}
	}
	
	
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		if(vehiculo != null && !vehiculo.isEmpty()) {
			this.vehiculo = vehiculo;
		}else {
			throw new IllegalArgumentException("Error ingrese un valor alfabetico");
		}	
	}
	
	
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo != null && !modelo.isEmpty()) {
			this.modelo = modelo;
		}else {
			throw new IllegalArgumentException("Error ingrese un valor alfabetico");
		}
	}
	
	public double getPrecioUni(){
		return precioUni;
	}
	public void setPrecioUni(double precioUni){
		if(precioUni > 0){
			this.precioUni = precioUni;
		}else {
			throw new NumberFormatException("Error, ingrese un valor numerico mayor a 0");
		}	
	}
	public String getEnlace(){
		return enlace;
	}
	public void setEnlace(String enlace) {
		if(enlace != null && !enlace.isEmpty()) {
			this.enlace = enlace;
		}else {
			throw new IllegalArgumentException("Error ingrese un valor alfabetico");
		}
	}
	
	
	public int getCantStock(){
		return cantStock;
	}
	public void setCantStock(int cantStock) {
		if(cantStock > 0){
			this.cantStock = cantStock;
		}else {
			throw new NumberFormatException("Error, ingrese un valor numerico mayor a 0");
		}	
	}
	public int getStockMin(){
		return stockMin;
	}
	public void setStockMin(int stockMin) {
		if(cantStock > 0){
			this.stockMin = stockMin;
		}else {
			throw new NumberFormatException("Error, ingrese un valor numerico mayor a 0");
		}	
	}
	
}
