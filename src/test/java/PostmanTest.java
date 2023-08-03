
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class PostmanTest {

    @Test
    void shouldPostman() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки then//
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"));

    }

    @Test
    void shouldPostmanSample() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some value") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки then//
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"));

    }
}
