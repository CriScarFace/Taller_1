package logica;

public class SistemaIMPL implements Sistema{
	private ListaCuentas generalCuentas;
	private ListaPersonajes generalPersonajes;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarRecaudacion(String nomPersonaje, int montoRecaudacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void asociarCuentaPersonaje(String nomCuenta, String nomPersonaje) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asociarPersonajeSkin(String nomPersonaje, String nomSkin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asociarRecaudacionPersonaje(String nomPersonaje) {
		// TODO Auto-generated method stub
		
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

	@Override
	public boolean registro(String nomCuenta, String contrasena, String nickName, String region) {
		// TODO Auto-generated method stub
		return false;
	}

}
