package Customer;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class UpdateCustomer {
    @Test
    void updateCustomerDetails(){
        CreateCustomer_POJO cus = new CreateCustomer_POJO();
        cus.setLastName("Obema");
        cus.setEmail("tomblake@gmail.com");
        cus.setCustomerId(4);


        given()
                .contentType("application/json")
                .body(cus)
                .when()
                .put("http://localhost:8080/api/customers/4")
                .then().statusCode(200).log().all();
    }


}
