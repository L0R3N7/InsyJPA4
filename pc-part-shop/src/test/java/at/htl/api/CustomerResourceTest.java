package at.htl.api;

import at.htl.model.CustomerDTO;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;



@QuarkusTest
class CustomerResourceTest {

    final String path = "customer";

    static CustomerDTO customerDTO;

    @BeforeAll
    static void init(){
        customerDTO = new CustomerDTO();
        customerDTO.setFirstName("Johnn");
        customerDTO.setLastName("Doee");
    }

    @Test
    void addCustomer() {
        given()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .body(customerDTO)
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("lastName", is(customerDTO.getLastName()))
                .body("firstName", is(customerDTO.getFirstName()))
                .body("id", notNullValue());
    }

    @Test
    void addPcToCustomer() {
        
    }
}