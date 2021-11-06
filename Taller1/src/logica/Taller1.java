package logica;
import java.io.IOException;
import java.util.Iterator;

import ucn.*;
public abstract class Taller1 {

	public static void main(String[] args) throws IOException {
		Sistema s = new SistemaIMPL();
		leerPersonajes(s);
		leerCuentas(s);
		inicioSesion(s);
		

	}

	private static void inicioSesion(Sistema s) {
		
		
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
				s.asociarPersonajeSkin(nomPersonaje, nomSkin);
				
				
			if(!ingreso) 
			{
				System.out.println("no se pudo ingresar el personaje no hay espacio");
			}	
			if(!ingreso2) 
			{
				System.out.println("no se pudo ingresar la skin no hay espacio");
			}
				
			}
			
			
		}
	}
	

	private static void leerCuentas(Sistema s) throws IOException {
		boolean ingreso = true;
		//ingreso de cuentas.txt
		ArchivoEntrada arch = new ArchivoEntrada("cuentas.txt");
		while(!arch.isEndFile()&&ingreso) 
		{
			Registro reg = arch.getRegistro();
			String nomCuenta = reg.getString();
			String pass = reg.getString();
			String nickName = reg.getString();
			int nivel = reg.getInt();
			int RP = reg.getInt();
			int totalPersonajes = reg.getInt();
			s.agregarCuenta(nomCuenta, pass, nickName, nivel, RP, totalPersonajes);
			for (int i = 0; i < totalPersonajes; i++) {
				//por cada personaje
				String nomPersonaje = reg.getString();
				boolean b = s.agregarPersonajePoseido(nomPersonaje,nomCuenta);
				if(b) 
				{
					System.out.println("se pudo agregar el personaje poseido");
				}else {
					System.out.println("no se pudo agregar el personaje poseido");
				}
				
				
				int cantSkinsPersonajePoseido = reg.getInt();
				for (int j = 0; j < cantSkinsPersonajePoseido; j++) {
					String nomSkinPersonajePoseido = reg.getString();
					boolean b2 = s.agregarSkinPoseida(nomCuenta,nomPersonaje,nomSkinPersonajePoseido);
					if(b2) 
					{
						System.out.println("se pudo agregar la skin correctamente");
					}else {
						System.out.println("no se pudo agregar la skin");
					}
					
				}
				
				
			}
			String region = reg.getString();
			s.setRegion(nomCuenta,region);
		}
		
		
		
	}

}
