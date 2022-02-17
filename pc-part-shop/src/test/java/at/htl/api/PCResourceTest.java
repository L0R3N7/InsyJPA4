package at.htl.api;

import at.htl.model.NewPCDTO;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PCResourceTest {

    final static String url = "pc";
    final static NewPCDTO newPCDTO = new NewPCDTO();

    @BeforeAll
    static void init(){
        List<String> serialNumbers = new ArrayList<>();
        serialNumbers.addAll(Arrays.asList("Z76Q-1234", "UOI8-999A", "80IU-91Z2", "ZZ18-9812", "TZ51-U8Q7", "10V8-953A", "IZTE-8513"));
        newPCDTO.setPartSerialnumbers(serialNumbers);
        newPCDTO.setShouldBeBuilt(true);
    }

    @Test
    @Order(3)
    void getAllPrebuilt() {
        when()
                .get(url+"/prebuilt")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200);
    }

    @Test
    @Order(2)
    void getAllConfigured() {
        funcConfigurePc();

        when()
                .get(url+"/configured")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .body("[0].shouldBeBuilt", Matchers.is(newPCDTO.isShouldBeBuilt()));
    }

    @Test
    @Order(1)
    void configurePC() {
        funcConfigurePc();
    }

    private void funcConfigurePc(){
        given().
                header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .body(newPCDTO)
                .when()
                .post(url)
                .then()
                .statusCode(200);
    }
}