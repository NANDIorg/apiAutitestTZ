package org.nandi;

import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiTest {
    private final static String URL = "https://petstore.swagger.io/v2";
    @Test
    public void postCreateUsers() {
        Specification.installSpecification(Specification.requestSpec(URL),Specification.responseSpec200());

        UserData user = new UserData(0, "user1","user1","user1","user1","user1","user1",0);

        ResponsCreateUser responsCreateUser = given()
                .body(user)
                .when()
                .post("/user")
                .then().log().all()
                .extract().as(ResponsCreateUser.class);
    }

    @Test
    public void getGetUserByUsername () {
        Specification.installSpecification(Specification.requestSpec(URL),Specification.responseSpec200());

        String username = "user1";

        UserData responsUserData= given()
                .when()
                .get("/user/"+username)
                .then().log().all()
                .extract().as(UserData.class);
    }

    @Test
    public void putUpdateUser () {
        Specification.installSpecification(Specification.requestSpec(URL),Specification.responseSpec200());

        String username = "user1";

        UserData user = new UserData(0, "user2","user1","user1","user1","user1","user1",0);

        ResponsCreateUser responsUserData= given()
                .body(user)
                .when()
                .put("/user/"+username)
                .then().log().all()
                .extract().as(ResponsCreateUser.class);
    }

    @Test
    public void deleteDeleteUser () {
        Specification.installSpecification(Specification.requestSpec(URL),Specification.responseSpec200());

        String username = "user1";

        ResponsCreateUser responsCreateUser = given()
                .when()
                .delete("/user/"+username)
                .then().log().all()
                .extract().as(ResponsCreateUser.class);
    }


}
