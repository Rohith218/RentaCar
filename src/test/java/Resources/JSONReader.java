package Resources;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public JSONObject jread(String path) throws Exception{
		JSONParser jparse = new JSONParser();
		FileReader fr = new FileReader(path);
		Object obj = jparse.parse(fr);
		JSONObject jobj = (JSONObject) obj;
		return jobj;
	}

}
