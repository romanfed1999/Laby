import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.*;

public class StringManager {
	public String inputScaner() throws IOException {
		BufferedReader blah = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("String to proceed:");
		return blah.readLine();
	}

	public String textProceed(String TextToProceed) {
		String result = new String();
		TextToProceed = " " + TextToProceed;
		List<String> stringList = new LinkedList<>();
		String patternString = "\\/shuttle/missions/\\w*?\\_\\d+";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(TextToProceed);
		while (matcher.find()) {
			stringList.add(TextToProceed.substring(matcher.start(), matcher.end()));
		}
		stringList.sort((String o1, String o2) -> o1.compareTo(o2));
		for (String string : stringList) {
			result += string;
			result = result + ", ";
		}
		result = result.replaceAll("/shuttle/missions/", "").replaceAll("_", "");
		result = result.substring(0, result.length() - 2);
		return result;

	}

	public void printResult(String resultString) {
		System.out.println(resultString);
	}
}