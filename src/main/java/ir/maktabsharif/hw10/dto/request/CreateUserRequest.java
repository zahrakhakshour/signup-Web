package ir.maktabsharif.hw10.dto.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class CreateUserRequest {

    @NotBlank(message = "UserName Is Required")
    String userName;
        @NotBlank(message = "Password Is Required")
     @Size(min = 8 , max = 16 , message= "Your Password Is less Than 8 Or More Than 16")
    String password;

}
