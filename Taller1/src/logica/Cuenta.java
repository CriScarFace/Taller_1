package logica;

public class Cuenta {
	
		private String nomCuenta;
		private String contrasena;
		private String nickName;
		private int nivel;
		private int RP;
		private String region;
		private int cantPersonajes;
		private ListaPersonajes listaPersonajes;
		

		public Cuenta(String nomCuenta,String contrasena,String nickName,int nivel,int RP,int cantPersonajes) 
		{
			this.nomCuenta = nomCuenta;
			this.contrasena = contrasena;
			this.nickName = nickName;
			this.nivel = nivel;
			this.RP = RP;
			this.cantPersonajes = cantPersonajes;
			listaPersonajes = new ListaPersonajes(155); 
		}

		
		public boolean agregarPersonaje(Personaje p) 
		{
			boolean bool = listaPersonajes.agregarPersonaje(p);
			return bool;
		}
		public String getNomCuenta() {
			return nomCuenta;
		}


		public void setNomCuenta(String nomCuenta) {
			this.nomCuenta = nomCuenta;
		}


		public String getContrasena() {
			return contrasena;
		}


		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}


		public String getNickName() {
			return nickName;
		}


		public void setNickName(String nickName) {
			this.nickName = nickName;
		}


		public int getNivel() {
			return nivel;
		}


		public void setNivel(int nivel) {
			this.nivel = nivel;
		}


		public int getRP() {
			return RP;
		}


		public void setRP(int rP) {
			RP = rP;
		}


		public String getRegion() {
			return region;
		}


		public void setRegion(String region) {
			this.region = region;
		}


		public int getCantPersonajes() {
			return cantPersonajes;
		}


		public void setCantPersonajes(int cantPersonajes) {
			this.cantPersonajes = cantPersonajes;
		}


		public ListaPersonajes getListaPersonajes() {
			return listaPersonajes;
		}


		public void setListaPersonajes(ListaPersonajes listaPersonajes) {
			this.listaPersonajes = listaPersonajes;
		}
		
		

	

}
