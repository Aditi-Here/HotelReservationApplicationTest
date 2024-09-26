package tests;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScans;
import org.testng.Assert;
import org.testng.annotations.Test;
import verifier.CustomerVerifier;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

//@SpringBootTest(classes = HotelReservationApplication.class)
@SpringBootTest
public class TestCustomer {


    private CustomerVerifier customerVerifier;

    @Autowired
    public void setCustomerVerifier(CustomerVerifier customerVerifier){
        this.customerVerifier = customerVerifier;
    }

    private final String CUSTOMER_URL = "http://localhost:8080/api/customers/";

//    public TestCustomer(CustomerVerifier customerVerifier) {
//        this.customerVerifier = customerVerifier;
//    }

    @Test
    void getCustomerById() {
        int customerId = 1;
        Response res = given()
                .when()
                .get(CUSTOMER_URL+ "1");
        customerVerifier.verifyStatusCode(res);
    }

}
