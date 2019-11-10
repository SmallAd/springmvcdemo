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
public class Customer {
    private String firstName;
    @NotNull(message = "is required")
    @NotEmpty()
    private String lastName;
}
