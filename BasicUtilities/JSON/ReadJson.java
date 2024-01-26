package BasicUtilities.JSON;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
    public static void main(String[] args) throws IOException, ParseException {
        String filepath = System.getProperty("user.dir") + "/DataResource/testdata.json";
        FileReader file = new FileReader(filepath);

        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(file);

        System.out.println(json.toJSONString());

        JSONArray testData = (JSONArray) json.get("testdata");

        for (int i = 0; i < testData.size(); i++) {
            JSONObject testCase = (JSONObject) testData.get(i);
            System.out.println("Test Case Name is --  " + testCase.get("testName"));

            JSONArray testCaseData = (JSONArray) testCase.get("data");
            for (int j = 0; j < testCaseData.size(); j++) {
                JSONObject currentTestData = (JSONObject) testCaseData.get(j);
                System.out.println(currentTestData.get("browser"));
            }
        }
    }
}