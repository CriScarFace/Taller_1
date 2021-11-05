package logica;

public class ListaPersonajes {

	private int cant;
	private int max;
	private Personaje[] lista;

	public ListaPersonajes(int max) 
	{
		this.max = max;
		cant = 0;
		lista = new Personaje[max];
	}
	public boolean agregarPersonaje(Personaje p) 
	{
		if(cant<max) 
		{
			lista[cant] = p;
			return true;
		}else 
		{
			return false;
		}
		
	}
	public boolean eliminarPersonajeNombre(String nomPersonaje) 
	{
		for (int i = 0; i <cant; i++) {
			if(lista[i].getNomPersonaje().equalsIgnoreCase(nomPersonaje)) 
			{
				for(int j=i;j<cant-1;j++) {
	                lista[j] = lista[j+1];
	            }
	            cant--;
	            return true;
			}
		}
		return false;
	}
	public Personaje buscarPersonajeI(int i) 
	{
		if(i <= cant) 
		{
			return lista[i];
		}
		else 
		{
			return null;
		}
	}
	public Personaje buscarPersonajeNombre(String nomPersonaje) 
	{
		for (int i = 0; i < cant; i++) {
			if(lista[i].getNomPersonaje().equalsIgnoreCase(nomPersonaje)) 
			{
				return lista[i];
			}
		}
		return null;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Personaje[] getLista() {
		return lista;
	}

	public void setLista(Personaje[] lista) {
		this.lista = lista;
	}
	
}
