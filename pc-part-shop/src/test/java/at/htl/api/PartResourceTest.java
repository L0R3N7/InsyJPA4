package at.htl.api;

import at.htl.model.PartDTO;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

@QuarkusTest
class PartResourceTest {

    final String url = "part";
    private final List<String> types = List.of("Case", "CPU", "GraphicsCard", "Motherboard", "Storage", "PSU", "RAM");
    PartDTO partDTO;

    @Test
    void getAll() {
        var response = when()
                .get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON);

        types.forEach(type -> {
            response.body(String.format("%s.size()", type), greaterThan(0));
        });
    }

    @Test
    void getDetails() {
        PartDTO partDTO = new PartDTO();
        partDTO.setSerialNumber("IZTE-8513");
        partDTO.setType("RAM");

        when()
                .get(String.format("%s/%s", url, partDTO.getSerialNumber()))
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("serialNumber", is(partDTO.getSerialNumber()))
                .body("type", is(partDTO.getType()));
    }
}