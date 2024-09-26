package Customer;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidateCustomerCredientials {
    @Test
    void validateCustomer(){
        CreateCustomer_POJO cus = new CreateCustomer_POJO();
        cus.setEmail("tomblake@gmail.com");
        cus.setPassword("tom");
        given().contentType("application/json")
                .body(cus)
                .when().post("http://localhost:8080/api/customers/saveCustomer")
                .then().statusCode(200).log().all();
    }
}
