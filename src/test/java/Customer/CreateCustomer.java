package Customer;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class CreateCustomer {
    @Test
    void createCustomerTest(){
        CreateCustomer_POJO cus = new CreateCustomer_POJO();
        cus.setCustomerId(4);
        cus.setFirstName("Tom");
        cus.setLastName("Blake");
        cus.setEmail("tomblake@gmail.com");
        cus.setLocation("framingham");
        cus.setPassword("tom");
        cus.setRole("customer");

        given()
                .contentType("application/json")
                .body(cus)
                .when()
                .post("http://localhost:8080/api/customers")
                .then()
                .statusCode(200)
                .log().all();
    }
}
