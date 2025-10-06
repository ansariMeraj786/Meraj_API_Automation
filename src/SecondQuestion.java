
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SecondQuestion {

    @Test
    public void GetUrl() {
        RestAssured.baseURL = "https://betaapi.beatroute.io";
        System.out.println("Start API");
        System.out.println("Base URL: " + RestAssured.baseURI);

        Response response = RestAssured
                .when()
                .get("/int/v2/distributor/index");
        System.out.println("Send GET request to /int/v2/distributor/index endpoint.");
        int statusCode = response.getStatusCode();
        System.out.println("Response Status Code is: " + statusCode);

        String responseBody = response.getBody().asString();
        System.out.println("Response");
        System.out.println(responseBody);
    }
}