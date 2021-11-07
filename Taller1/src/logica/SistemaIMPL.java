package logica;

import dominio.Cuenta;
import dominio.Personaje;
import dominio.Skin;

public class SistemaIMPL implements Sistema{
	private ListaCuentas generalCuentas;
	private ListaPersonajes generalPersonajes;
	private ListaSkins generalSkins;
	@Override
	public boolean agregarCuenta(String nomCuenta, String contrasena, String nickName, String nivel, int RP,
			String region, int cantPersonajes) {
		
		Cuenta c = new Cuenta(nomCuenta,contrasena,nickName,nivel,RP,region,cantPersonajes);
		boolean retorno = generalCuentas.ingresarCuenta(c);
		return retorno;
	}

	@Override
	public boolean agregarPersonaje(String nombre, String rol) {
		Personaje p = new Personaje(nombre,rol);
		boolean  retorno = generalPersonajes.agregarPersonaje(p);
		return retorno;
	}

	@Override
	public boolean agregarSkin(String nombre, String tipo) {
		Skin skin = new Skin(nombre,tipo);
		boolean retorno = generalSkins.ingresarSkin(skin);
		return false;
	}

	@Override
	public boolean agregarRecaudacion(String nomPersonaje, int montoRecaudacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void asociarCuentaPersonaje(String nomCuenta, String nomPersonaje) {
		Cuenta c = generalCuentas.getCuentaNombre(nomCuenta);
		Personaje p = generalPersonajes.buscarPersonajeNombre(nomPersonaje);
		c.agregarPersonaje(p);
		p.setCuenta(c);
		
	}

	@Override
	public void asociarPersonajeSkin(String nomPersonaje, String nomSkin) {
		Personaje p = generalPersonajes.buscarPersonajeNombre(nomPersonaje);
		Skin s = generalSkins.buscarSkinNombre(nomSkin);
	
		p.agregarSkin(s);
		s.setPersonaje(p);
		
		
	}

	@Override
	public void asociarRecaudacionPersonaje(String nomPersonaje) {
		
		
	}

	@Override
	public boolean comprarSkin(String nomPersonaje, String nomSkin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprarPersonaje(String nomPersonaje, String nomCuenta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String obtenerSkinDisponibles(String nomCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerInventarioCuenta(String nomCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarRP(String nomCuenta, int monto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String obtenerDatosCuenta(String nomCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPass(String newPass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String obtenerRecaudacionRol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerRecaudacionTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerRecaudacionPersonaje() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerPersonajesPorRol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarPersonajeJuego(String nomPersonaje, String rol, int cantSkins) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarSkinJuego(String nomPersonaje, String nomSkin, String tipoSkin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bloquearJugador(String nomCuenta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String obtenerCuentasMayoraMenor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String escribirPersonajes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String escribirCuentas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String escribirEstadisticas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(String nomCuenta, String contrasena) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean  buscarCuenta (String nomCuenta) {
		Cuenta c = generalCuentas.getCuentaNombre(nomCuenta);
		int e = 0;
		if(c == null) { //No registrado
			return false;
		}
		else { //Cuenta registrada
			return true;
		}
		
	}

	@Override
	public boolean registro(String nomCuenta, String contrasena, String nickName, String region) {
		// TODO Auto-generated method stub
		return false;
	}

}
