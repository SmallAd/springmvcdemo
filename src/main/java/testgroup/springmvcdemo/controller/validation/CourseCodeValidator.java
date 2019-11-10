package testgroup.springmvcdemo.controller.validation;

import java.util.Arrays;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author smallad
 */
class CourseCodeValidator
        implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefixes = Arrays.stream(courseCode.value())
                .map(String::toUpperCase)
                .toArray(String[]::new);
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext context) {
        if (code == null) {
            return true;
        } else {
            return Arrays.stream(coursePrefixes)
                    .filter(s -> s.startsWith(code.toUpperCase()))
                    .findAny()
                    .isPresent();
        }
    }

}
