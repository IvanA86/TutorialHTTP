package getServicesHTTP;

public class TestServicesHTTP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String s = "http://www.marca.com";
			TinyURL t = new TinyURL();
			System.out.println(t.shorter(s));
			Trim tr = new Trim();
			System.out.println(tr.shorter(s));
		}
		catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
		

	}

}
