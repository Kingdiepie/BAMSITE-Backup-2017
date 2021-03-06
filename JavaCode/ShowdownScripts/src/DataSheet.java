import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataSheet {
	private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
	private BufferedReader br = null;
	private String line = "";
	private String cvsSplitBy = ",";

	DataSheet(String URL) {
		try {
			br = new BufferedReader(new FileReader(URL));
			while ((line = br.readLine()) != null) {
				ArrayList<String> lineData = new ArrayList<String>();
				String iData[] = line.split(cvsSplitBy);
				for (String s : iData) {
					lineData.add(s);
				}
				data.add(lineData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public ArrayList<ArrayList<String>> getD() {
		return data;
	}
}