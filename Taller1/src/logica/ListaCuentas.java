package logica;

import java.util.Iterator;

public class ListaCuentas {

	private int contador;
	private int max;
	private Cuenta[] lista;
	
	public ListaCuentas(int max) 
	{
		this.max = max;
		contador = 0;
		lista = new Cuenta[max];
	}
	
	public boolean ingresarCuenta(Cuenta c) 
	{
		if(contador < max) 
		{
			lista[contador] = c;
			contador++;
			return true;
		}else {
			return false;
		}
	}
	public boolean eliminarCuenta(String nomCuenta) 
	{
		for (int i = 0; i < contador; i++) {
			if(lista[i].getNomCuenta().equalsIgnoreCase(nomCuenta))
			{
				for(int j=i;j<contador-1;j++) {
	                lista[j] = lista[j+1];
	            }
	            contador--;
	            return true;
			}
			
		}return false;
	}
	public Cuenta getCuentaI(int i)
	{
		if(i<=contador) {
			return lista[i];
		}else 
		{
			return null;
		}
	}
	public Cuenta getCuentaNombre(String nomCuenta) 
	{
		for (int i = 0; i < contador; i++) {
			if(lista[i].getNomCuenta().equalsIgnoreCase(nomCuenta)) 
			{
				return lista[i];
			}
			
		}
		return null;
	}
	

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Cuenta[] getLista() {
		return lista;
	}

	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}
	
}
