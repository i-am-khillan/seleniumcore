package revision.qa;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import java.util.*;

	import org.apache.commons.lang3.StringEscapeUtils;
	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;

	import com.fasterxml.jackson.core.JsonGenerationException;
	import com.fasterxml.jackson.core.JsonGenerator;
	import com.fasterxml.jackson.databind.JsonMappingException;
	import com.fasterxml.jackson.databind.ObjectMapper;

	import com.google.gson.Gson;

	public class DataBaseInterviewQuestionSDETRole {

	    public static void main(String[] args) {

	        Connection connection = null;

	        try {

	            // ----------------------------------------------------------------
	            // 1. Load the MySQL JDBC Driver (necessary for Java to talk to DB)
	            // ----------------------------------------------------------------
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // ----------------------------------------------------------------
	            // 2. Declare JDBC URL for MySQL database connection
	            // ----------------------------------------------------------------
	            String url = "jdbc:mysql://localhost:3306/Business"
	                       + "?useSSL=false"
	                       + "&allowPublicKeyRetrieval=true"
	                       + "&serverTimezone=UTC";

	            // ----------------------------------------------------------------
	            // 3. Establish connection to MySQL database
	            // ----------------------------------------------------------------
	            connection = DriverManager.getConnection(url, "root", "Admin");
	            System.out.println("Connected Successfully!");

	            // ----------------------------------------------------------------
	            // 4. Create a SQL statement and execute a query
	            //    Query fetches today's purchases from Asia region
	            // ----------------------------------------------------------------
	            Statement st = connection.createStatement();

	            ResultSet rs = st.executeQuery(
	                "select * from CustomerInfo " +
	                "where purchasedDate = CURDATE() and Location = 'Asia';"
	            );

	            // ----------------------------------------------------------------
	            // 5. Create Java object list to store DB records
	            // ----------------------------------------------------------------
	            CustomerDetails customer = new CustomerDetails();
	            List<CustomerDetails> javaObjectList = new ArrayList<CustomerDetails>();

	            // ----------------------------------------------------------------
	            // 6. Loop over result set (each row from DB)
	            //    Map each column into Java object fields
	            // ----------------------------------------------------------------
	            while (rs.next()) {

	                customer.setCourseName(rs.getString(1));     // Column 1
	                customer.setPurchasedDate(rs.getString(2)); // Column 2
	                customer.setAmount(rs.getInt(3));           // Column 3
	                customer.setLocation(rs.getString(4));      // Column 4

	                // Add object to list
	                javaObjectList.add(customer);
	            }

	            // ----------------------------------------------------------------
	            // 7. Create JSON structure using JSON-Simple
	            //    final JSON = { "data" : [json1, json2, ... ] }
	            // ----------------------------------------------------------------
	            JSONObject jo = new JSONObject();
	            JSONArray jsonArray = new JSONArray();

	            for (int i = 0; i < javaObjectList.size(); i++) {

	                // ------------------------------------------------------------
	                // A. Write individual JSON file using Jackson ObjectMapper
	                // ------------------------------------------------------------
	                ObjectMapper obj = new ObjectMapper();
	                obj.writeValue(
	                    new File("C:\\Users\\kverma\\eclipse-workspace\\JsonJava\\JsonJava\\src\\database\\com\\qa\\customer" + i + ".json"),
	                    customer
	                );

	                // ------------------------------------------------------------
	                // B. Convert Java object -> JSON String using Gson
	                // ------------------------------------------------------------
	                Gson g = new Gson();
	                String json = g.toJson(javaObjectList.get(i));

	                // Add JSON string to JSON array
	                jsonArray.add(json);
	            }

	            // Attach array into main JSON object
	            jo.put("data", jsonArray);

	            // ----------------------------------------------------------------
	            // 8. Print JSON with escape characters (example: \" ) 
	            // ----------------------------------------------------------------
	            System.out.println(jo.toJSONString());

	            // ----------------------------------------------------------------
	            // 9. Remove escape characters from JSON (cleaning)
	            // ----------------------------------------------------------------
	            String unescapeString = org.apache.commons.text.StringEscapeUtils.unescapeJson(jo.toJSONString());
	            System.out.println(unescapeString);

	            // ----------------------------------------------------------------
	            // 10. Remove extra quotes around JSON object manually using replace
	            //     Replace "{ → {
	            //     Replace }" → }
	            // ----------------------------------------------------------------
	            String correctJson = unescapeString.replace("\"{", "{");
	            String correctJsonData = correctJson.replace("}\"", "}");
	            System.out.println(correctJsonData);

	            // ----------------------------------------------------------------
	            // 11. Convert final cleaned JSON string → JSON file
	            // ----------------------------------------------------------------
	            FileWriter fw = new FileWriter(
	                "C:\\Users\\kverma\\eclipse-workspace\\JsonJava\\JsonJava\\src\\database\\com\\qa\\customerLargeJsonAllData.json"
	            );

	            fw.write(correctJsonData);
	            fw.close();

	            System.out.println("File is successfully generated ....");

	            connection.close();

	        } 
	        // --------------------------------------------------------------------
	        // Exception Handling for all DB, JSON & IO operations
	        // --------------------------------------------------------------------
	        catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	        catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        catch (JsonGenerationException e) {
	            e.printStackTrace();
	        }
	        catch (JsonMappingException e) {
	            e.printStackTrace();
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Java object → JSON conversion handled using Jackson & Gson

	    }
}
