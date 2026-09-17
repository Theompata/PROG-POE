/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author Student
 */

import com.mycompany.progpart1.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testCheckUserNameValid() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "+27821234567"
        );

        assertTrue(user.checkUserName());
    }

    @Test
    public void testCheckUserNameInvalid() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theompata",
                "Password1!",
                "+27821234567"
        );

        assertFalse(user.checkUserName());
    }

    @Test
    public void testCheckPasswordComplexityValid() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "+27821234567"
        );

        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordComplexityInvalid() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "password",
                "+27821234567"
        );

        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testCheckCellPhoneNumberValid() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "+27821234567"
        );

        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testCheckCellPhoneNumberInvalid() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "0821234567"
        );

        assertFalse(user.checkCellPhoneNumber());
    }

    @Test
    public void testRegisterUserSuccess() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "+27821234567"
        );

        assertEquals(
                "User successfully registered.",
                user.registerUser()
        );
    }

    @Test
    public void testLoginUserSuccess() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "+27821234567"
        );

        assertTrue(
                user.loginUser("theo_", "Password1!")
        );
    }

    @Test
    public void testLoginUserFailure() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "+27821234567"
        );

        assertFalse(
                user.loginUser("wrong_", "wrongPassword")
        );
    }

    @Test
    public void testReturnLoginStatusSuccess() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "+27821234567"
        );

        assertEquals(
                "Welcome Theo Mpata, it is great to see you again.",
                user.returnLoginStatus(
                        "theo_",
                        "Password1!"
                )
        );
    }

    @Test
    public void testReturnLoginStatusFailure() {
        Login user = new Login(
                "Theo",
                "Mpata",
                "theo_",
                "Password1!",
                "+27821234567"
        );

        assertEquals(
                "Username or password incorrect, please try again.",
                user.returnLoginStatus(
                        "wrong_",
                        "wrongPassword"
                )
        );
    }
}