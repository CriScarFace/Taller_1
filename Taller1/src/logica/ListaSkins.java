package logica;

import dominio.Skin;

public class ListaSkins {

	private int cant;
	private int max;
	private Skin[] lista;
	
	public ListaSkins(int max) 
	{
		this.max = max;
		cant = 0;
		lista = new Skin[max];
	}
	
	public boolean ingresarSkin(Skin skin) 
	{
		if(cant > max) 
		{
			lista[cant] = skin;
			cant++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean eliminarSkinNombre(String nomSkin) 
	{
		for (int i = 0; i <cant; i++) {
			if(lista[i].getNomSkin().equalsIgnoreCase(nomSkin)) 
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
	
	public Skin buscarSkinNombre(String nomSkin) 
	{
		for (int i = 0; i < cant; i++) {
			if(lista[i].getNomSkin().equalsIgnoreCase(nomSkin)) 
			{
				return lista[i];
			}
		}
		return null;
	}
	
	public Skin buscarSkinI(int i) 
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

	public Skin[] getLista() {
		return lista;
	}

	public void setLista(Skin[] lista) {
		this.lista = lista;
	}
	
}
