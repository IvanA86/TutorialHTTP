package proxy;

public class Proxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se puede definir un proxy a la hora de lanzar el programa
		 * mediante "java -Dhttp.proxyHost = proxy -Dhttp.proxyPort=8080 JavaProgram
		 * donde proxy es el nombre del proxy y JavaProgram el nombre del programa
		 */
		
		System.setProperty("http.proxySet", "true");
		System.setProperty("http.proxyHost", "proxy");
		System.setProperty("http.proxyPort", "8080");
	}

}
