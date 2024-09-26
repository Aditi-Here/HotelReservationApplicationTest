package verifier;

import db.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import db.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
public class CustomerVerifier {

    private CustomerRepository customerRepository;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
//
//    public CustomerVerifier(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

//    @Test

    public void verifyStatusCode(Response res){

        Assert.assertEquals(res.getStatusCode(), 200);
        String customerName = res.jsonPath().get("firstName").toString();
        System.out.println(customerName);


        String email = res.jsonPath().get("email").toString();
        System.out.println("email: " + email);

//        Customer c = customerRepository.findById(1).get();
//        System.out.println(c);

    }
}
