package ir.maktabsharif.hw10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person")
public class User extends BaseModel<Long> {

//    @NotBlank(message = "UserName Is Required")
    String userName;
//    @NotBlank(message = "Password Is Required")
//     @Size(min = 8 , max = 16 , message= "Your Password Is less Than 8 Or More Than 16")
    String password;

}
