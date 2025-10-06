
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ThirdQuestion {

    @Test
    public void CustomerCreditNote() {
        RestAssured.baseURI = "https://betaapi.beatroute.io";
        String body = "{\n" +
                "  \"customerId\": \"985456\",\n" +
                "  \"invoiceId\": \"1245365\",\n" +
                "  \"creditAmount\": 55400,\n" +
                "  \"reason\": \"SKU return by customer\"\n" +
                "}";
        System.out.println("Request Body:\n" + body);

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/int/v2/credit-note/create");

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Response Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);

    }
}