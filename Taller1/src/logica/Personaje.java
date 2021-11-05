package logica;

public class Personaje {

	private String nomPersonaje;
	private String rol;
	private Cuenta cuenta;
	private ListaSkins listaSkins;
	private int recaudacionCLP;
	
	public Personaje(String nomPersonaje,String rol) 
	{
		this.nomPersonaje = nomPersonaje;
		this.rol = rol;
		listaSkins = new ListaSkins(999);
	}
	public boolean agregarSkin(Skin skin) 
	{
		boolean b = listaSkins.ingresarSkin(skin);
		return b;
	}

	public String getNomPersonaje() {
		return nomPersonaje;
	}

	public void setNomPersonaje(String nomPersonaje) {
		this.nomPersonaje = nomPersonaje;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public ListaSkins getListaSkins() {
		return listaSkins;
	}

	public void setListaSkins(ListaSkins listaSkins) {
		this.listaSkins = listaSkins;
	}
	public int getRecaudacionCLP() {
		return recaudacionCLP;
	}
	public void setRecaudacionCLP(int recaudacionCLP) {
		this.recaudacionCLP = recaudacionCLP;
	}
	

}
