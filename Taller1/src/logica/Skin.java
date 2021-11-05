package logica;

public class Skin {

	private String nomSkin;
	private String tipo;
	private int precio;
	private Personaje personaje;
	
	public Skin(String nomSkin,String tipo) 
	{
		this.nomSkin = nomSkin;
		this.tipo = tipo;
		if(tipo.equalsIgnoreCase("M")) 
		{
			this.precio = 3250;
		}
		if(tipo.equalsIgnoreCase("D")) 
		{
			this.precio = 2750;
		}
		if(tipo.equalsIgnoreCase("L")) 
		{
			this.precio = 1820;
		}
		if(tipo.equalsIgnoreCase("E")) 
		{
			this.precio = 1350;
		}
		if(tipo.equalsIgnoreCase("N")) 
		{
			this.precio = 975;
		}
		
	}

	public String getNomSkin() {
		return nomSkin;
	}

	public void setNomSkin(String nomSkin) {
		this.nomSkin = nomSkin;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	

}
