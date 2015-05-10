package paket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;





public class KlasaMain {


		public static void main(String[] args) {
			
		
		
			try {
				URLConnection konekcija = new URL("https://randomapi.com/api/?key=SNQI-UATS-A61Y-NB6N&id=aftr8u0").openConnection();
				
				
				InputStreamReader isr = new InputStreamReader(konekcija.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				String odgovor = br.readLine();
				
				JSONObject o = new JSONObject(odgovor);
				
				
				System.out.println(o.toString(5));
			//	System.out.println(odgovor);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
