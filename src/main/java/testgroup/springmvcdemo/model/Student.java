package testgroup.springmvcdemo.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author smallad
 */
@Getter @Setter @ToString
public class Student {
    
    private String firstName;
    @NotNull(message = "is required")
    @NotEmpty()
    private String lastName;
    
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;
}
