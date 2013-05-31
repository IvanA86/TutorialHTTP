package clasesHTTP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * 
 * @author iagos
 * @version v1.0
 * Esta clase va a hacer la petición de una página web 
 * y la va a almacenar en un string
 */

public class ReadPage {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "http://www.hattrick.org/Help/Contact.aspx";
		BufferedReader br = null;
		try{
			URL url = new URL(dir);
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String linea;
			while ((linea=br.readLine())!=null){
				System.out.println(linea);
			}
		}
		catch (Exception e){
			System.out.println(e.getLocalizedMessage());
		}
		finally{
			if (br!=null){
				try{
					br.close();
				}
				catch(Exception e){
					e.getLocalizedMessage();
				}
			}
		}
	}

}
