package clasesHTTP;

import java.net.HttpURLConnection;
import java.net.URL;

public class TipoMIME {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "http://www.marca.com";
		try{
			URL url = new URL(dir);
			String MIME = ((HttpURLConnection)url.openConnection()).getContentType();
			System.out.println(MIME);
		}
		catch(Exception e){
			
		}
	}

}
