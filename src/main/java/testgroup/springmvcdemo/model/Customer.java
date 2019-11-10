package testgroup.springmvcdemo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import testgroup.springmvcdemo.controller.validation.CourseCode;

/**
 *
 * @author smallad
 */
@Getter
@Setter
@ToString
public class Customer {

    private String firstName;
    @NotEmpty(message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10)
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @CourseCode(value = {"TOPS", "LUV"}, message = "must start with TOPS or LUV")
    private String courseCode;
}
