import java.util.*;
import static java.util.ResourceBundle.Control.*;

public class ResourceTest {

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
		//System.out.println ("Loading bundle...");

		 ResourceBundle bundle =
	    ResourceBundle.getBundle("mess", new Locale("pt", ""),
			                            ResourceBundle.Control.getControl(FORMAT_PROPERTIES));

	    if (bundle != null) {
			// System.out.println ("Hello World!");    	
			Enumeration<String> en = bundle.getKeys();
			while(en.hasMoreElements())
    		{
    			String key=(String) en.nextElement();
				String value = bundle.getString(key);
				// System.out.println("### " + key + "=" + value);
		    }

    	}
    }
}

