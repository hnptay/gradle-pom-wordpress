package testdata.nopcomerce_testdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class EndUserJson {
    public static EndUserJson getEndUserData(String fileName){
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(new File(fileName), EndUserJson.class);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    @JsonProperty("firstname")
    String firstname;
    @JsonProperty("lastname")
    String lastname;
    @JsonProperty("dob")
    String dob;
    @JsonProperty("company")
    String company;
    @JsonProperty("user")
    String user;
    @JsonProperty("password")
    String password;
    @JsonProperty("email")
    String email;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDob() {
        return dob;
    }

    public String getCompany() {
        return company;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
}
