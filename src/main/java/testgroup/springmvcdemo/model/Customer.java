package testgroup.springmvcdemo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author smallad
 */
@Getter @Setter @ToString
public class Customer {
    private String firstName;
    @NotEmpty(message = "is required")
    private String lastName;
    
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10)
    private int freePasses;
}
