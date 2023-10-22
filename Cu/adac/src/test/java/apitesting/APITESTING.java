package apitesting;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;;



public class APITESTING {
	
	
	public static void getMethod() throws MalformedURLException {
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSender requestSpecification = RestAssured.when();
		Response response = requestSpecification.request(Method.GET);
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(	response.getBody());
		System.out.println(response.asPrettyString());;
		
	}
	public static void post() {
		RestAssured.baseURI="https://reqres.in/api/users";
		 RequestSpecification body = RestAssured.given().body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}");
		 Response response = body.request(Method.POST);
		 System.out.println(response.asPrettyString());
		 System.out.println(response.getStatusCode());
		 
		
	}
	public static void main(String[] args) throws MalformedURLException {
		
		APITESTING b=new APITESTING();
		b.post();
	}

}
