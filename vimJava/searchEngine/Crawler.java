import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Crawler {
	public static void main(String str[]) {
		String url = "https://www.google.com/";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		}
		catch(Exception e) {}
		
		System.out.println(doc.toString());				
	}

}
