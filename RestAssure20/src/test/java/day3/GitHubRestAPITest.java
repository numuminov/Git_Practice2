package day3;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

public class GitHubRestAPITest {
    //create a test for testing git hub restapi  users/user endpoint

    @DisplayName("test git hub get users/{username}")
    @Test
    public void testGitHub(){

        given()
                .pathParam("username","numuminov").

        when()
                .get("https://api.github.com/users/{username}").
        then()
                .assertThat()
                .statusCode(200).contentType(ContentType.JSON).header("server", "GitHub.com").body("login", is("numuminov"));



    }




}
