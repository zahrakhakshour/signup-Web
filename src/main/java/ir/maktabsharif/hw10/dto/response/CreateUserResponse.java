package ir.maktabsharif.hw10.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserResponse {
    private Long id;
    private String userName;
    private String password;
}
