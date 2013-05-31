package clasesHTTP;

import java.net.HttpURLConnection;
import java.net.URL;

public class CodigoRetorno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "http://www.marca.com";
		try{
			URL url = new URL(dir);
			int codigoRespuesta = ((HttpURLConnection)url.openConnection()).getResponseCode();
			System.out.println(codigoRespuesta);
			switch (codigoRespuesta){
			case 200:
				System.out.println("OK");
				break;
			case 301:
				System.out.println("Permanent redirect to another webpage");
				break;
			case 400:
				System.out.println("Bad Request");
				break;
			case 404:
				System.out.println("Not Found");
			}
				
		}
		catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
	}

}
