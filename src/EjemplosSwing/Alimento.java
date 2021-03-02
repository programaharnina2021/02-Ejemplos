package EjemplosSwing;
public class Alimento {
	private String nombre;
	private int caloriasVacias;
	private float precio;
	
	
	public Alimento(String nombre, int caloriasVacias, float precio) {
		super();
		this.nombre = nombre;
		this.caloriasVacias = caloriasVacias;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCaloriasVacias() {
		return caloriasVacias;
	}
	public void setCaloriasVacias(int caloriasVacias) {
		this.caloriasVacias = caloriasVacias;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		
		return nombre;
	}
}
