package BasicUtilities.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        JSONObject student1 = new JSONObject();
        student1.put("Student Name", "Abhay");
        student1.put("Grade", "8th");
        student1.put("Location", "Bangalore");

        JSONObject student2 = new JSONObject();
        student2.put("Student Name", "Shivani");
        student2.put("Grade", "10th");
        student2.put("Location", "Dehradun");

        System.out.println(student1.toJSONString());
        System.out.println(student2.toJSONString());

        JSONArray studentDetails = new JSONArray();
        studentDetails.add(student1);
        studentDetails.add(student2);

        System.out.println(studentDetails.toJSONString());

        JSONObject details = new JSONObject();
        details.put("studentDetails", studentDetails);
        System.out.println(details.toJSONString());

    }
    
}
