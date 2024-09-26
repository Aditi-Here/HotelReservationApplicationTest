package Customer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class CustomerTest {

    @Test
    void getCustomer(){
        int customerId = 1;
            Response res = given()
                .when()
                .get("http://localhost:8080/api/customers/1");
//                .then()
//                .statusCode(200)
//                .log().all();
        Assert.assertEquals(res.getStatusCode(), "200");
    }

    @Test
    void getAllCustomers(){
        given()
                .when()
                .get("http://localhost:8080/api/customers")
                .then()
                .statusCode(200)
                .log().all();
    }

}
