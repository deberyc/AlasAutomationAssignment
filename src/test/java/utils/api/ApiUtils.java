package utils.api;

import net.datafaker.Faker;
import pojo.UserRequest;

public class ApiUtils {
    static Faker faker = new Faker();

    // Helper method for creating user payload with random data
    public static UserRequest createUserPayload() {
        UserRequest requestBody = new UserRequest();
        requestBody.setName(faker.name().fullName());
        requestBody.setEmail(faker.internet().emailAddress());
        requestBody.setGender("male");
        requestBody.setStatus("active");
        return requestBody;
    }
}