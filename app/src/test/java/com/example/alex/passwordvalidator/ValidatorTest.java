package com.example.alex.passwordvalidator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {
    Validator v = new Validator();

    @Test
    public void isStrong(){
        v.setPassword("");
        assertEquals(v.validate(), 0);
        v.setPassword("password");
        assertEquals(v.validate(), 1);
        v.setPassword("abc");
        assertEquals(v.validate(), 1);
        v.setPassword("aLongAssPassword");
        assertEquals(v.validate(), 2);
    }
}
