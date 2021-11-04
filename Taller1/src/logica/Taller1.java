package logica;
import java.io.IOException;
import java.util.Iterator;

import ucn.*;
public abstract class Taller1 {

	public static void main(String[] args) throws IOException {
		Sistema s = new SistemaIMPL();
		leerPersonajes(s);
		leerCuentas(s);

	}

	private static void leerPersonajes(Sistema s) throws IOException 
	{
		boolean ingreso = true;
		boolean ingreso2 = true;
		ArchivoEntrada arch = new ArchivoEntrada("personajes.txt");
		while(!arch.isEndFile() && ingreso) {
			Registro reg = arch.getRegistro();
			String nomPersonaje = reg.getString();
			String rol = reg.getString();
			ingreso = s.agregarPersonaje(nomPersonaje, rol);
			int cantSkins = reg.getInt();
			for (int i = 0; i < cantSkins; i++) {
				String nomSkin = reg.getString();
				String calidad = reg.getString();
				ingreso2 = s.agregarSkin(nomSkin, calidad);
			if(!ingreso) 
			{
				System.out.println("no se pudo ingresar el personaje");
			}	
			if(!ingreso2) 
			{
				System.out.println("no se pudo ingresar la skin");
			}
				
			}
			
			
		}
	}
	

	private static void leerCuentas(Sistema s) throws IOException {
		boolean ingreso = true;
		//ingreso de cuentas.txt
		ArchivoEntrada arch = new ArchivoEntrada("cuentas.txt");
		
		
		
	}

}
