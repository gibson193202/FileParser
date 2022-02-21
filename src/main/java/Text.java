import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
	private ArrayList<PartText> partText;
	private StringBuffer sbuf;
	
	public Text(StringBuffer sbuf) {
		this.sbuf=sbuf;
		partText=new ArrayList<PartText>();
		splitting();
	}
	
	private void splitting() {
		Pattern p=Pattern.compile("([#]{1,}\\W.+)([[^#]]+)");
		Matcher m=p.matcher(sbuf);
		
		while(m.find()) {
			partText.add(new PartText(m.group(1), m.group(1), m.group(2)));
		}
		
	}
	
	public ArrayList<PartText> getPartText() { 
		return partText; 
	}
	
	
	 
	
	

	
	
	
	
	
	
	
	
}
