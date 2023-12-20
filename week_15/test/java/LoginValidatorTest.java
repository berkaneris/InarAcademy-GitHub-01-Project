package test.java;

import main.java.LoginValidator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LoginValidatorTest {
    private static LoginValidator validator;
    @BeforeAll
    static void setup() {
         validator = new LoginValidator();
    }

    /**
    Test Cases for validateUsername Method
    */
    @Test
    public void TC001ValidUserNameForEmail(){
        String userName = "Berkan.eris@gmail.com";
        assertTrue(validator.validateUsername(userName));
    }
    @Test
    public void TC002WithoutAtSymbolForEmail(){
        String userName = "Berkan.erisgmail.com";
        assertFalse(validator.validateUsername(userName));
    }
    @Test
    public void TC003WithoutDomainForEmail(){
        String userName = "Berkan.eris@";
        assertFalse(validator.validateUsername(userName));
    }
    @Test
    public void TC004InvalidCharactersForEmail(){
        String userName = "Berkan>>eris.@gmail.com";
        assertFalse(validator.validateUsername(userName));
    }
    @Test
    public void TC005EmptyValueForEmail(){
        String userName = "";
        assertFalse(validator.validateUsername(userName));
    }
    @Test
    public void TC006NullStringForEmail(){
        String userName = null;
        assertFalse(validator.validateUsername(userName));
    }
    /**
       Test Cases for validatePassword Method
     */
    @Test
    public void TC001ValidValueForPassword(){
        String password = "Test1Check%";
        assertTrue(validator.validatePassword(password));
    }
    @Test
    public void TC002ValueWithoutSpecialCharacterForPassword(){
        String password = "Test1Check";
        assertFalse(validator.validatePassword(password));
    }
    @Test
    public void TC003ValueWithoutNumberForPassword(){
        String password = "Test%Check";
        assertFalse(validator.validatePassword(password));
    }
    @Test
    public void TC004ValueTooShortForPassword(){
        String password = "Te1st%";
        assertFalse(validator.validatePassword(password));
    }
    @Test
    public void TC005ValueTooLongForPassword(){
        String password = "Te1st%CheckPassword";
        assertFalse(validator.validatePassword(password));
    }
    @Test
    public void TC006EmptyStringForPassword(){
        String password = "";
        assertFalse(validator.validatePassword(password));
    }
    @Test
    public void TC007NullStringForPassword(){
        String password = null;
        assertFalse(validator.validatePassword(password));
    }
}