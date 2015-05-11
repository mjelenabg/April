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
				Glumac g= new Glumac();
				
				  g.setBrojNagrada(o.getJSONArray("results").getJSONObject(0).getJSONObject("glumac/glumica").getInt("broj nagrada"));
				  g.setGodine(o.getJSONArray("results").getJSONObject(0).getJSONObject("glumac/glumica").getInt("godine"));
				  g.setPol(o.getJSONArray("results").getJSONObject(0).getJSONObject("glumac/glumica").getString("pol"));
				  g.setVisina(o.getJSONArray("results").getJSONObject(0).getJSONObject("glumac/glumica").getString("visina"));
				  System.out.println(g.toString());
				System.out.println(o.toString(5));
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}