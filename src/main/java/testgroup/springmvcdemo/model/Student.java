package testgroup.springmvcdemo.model;

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
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;
}
