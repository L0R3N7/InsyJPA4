package at.htl.api;

import at.htl.model.CustomerDTO;
import io.quarkus.test.junit.QuarkusTest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;



@QuarkusTest
class CustomerResourceTest {

    final String url = "customer";

    static CustomerDTO customerDTO;

    @BeforeAll
    static void init(){
        customerDTO = new CustomerDTO();
        customerDTO.setFirstName("Johnn");
        customerDTO.setLastName("Doee");
        customerDTO.setId(null);
    }

    @Test
    void addCustomer() {
        given()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .body(customerDTO)
                .when()
                .post(url)
                .then()
                .statusCode(200)
                .body("lastName", is(customerDTO.getLastName()))
                .body("firstName", is(customerDTO.getFirstName()))
                .body("id", notNullValue());
    }

    @Test
    void addPcToCustomer() {
        given()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when()
                .patch(String.format("%s/1/1", url))
                .then()
                .statusCode(200);
    }

    @Test
    void testGetALlCustomers() {
        given()
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when()
                .get(String.format("%s/all", url))
                .then()
                .statusCode(200)
                .body("[0].firstName", Matchers.is("John"))
                .body("[0].lastName", Matchers.is("Doe"));
    }

    @Test
    void testGetCustomerById() {
        given()
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when()
                .get(String.format("%s/1", url))
                .then()
                .statusCode(200)
                .body("firstName", Matchers.is("John"))
                .body("lastName", Matchers.is("Doe"));
    }
}