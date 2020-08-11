package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.UnrecoverableEntryException;

import static org.junit.jupiter.api.Assertions.*;

class mainappTest {

    maintee maintee = new maintee(1,'B');
    regular regular1 = new regular(3, 'D');
    regular regular2 = new regular(1, 'F');

    @Test
    void testConstructor() {
        Assertions.assertEquals(1,maintee.getInputRow(),"Test was successful");
        Assertions.assertEquals('B',maintee.getInputCol(),"Test was successful for column" );
    }

    @Test
    void regPrice() {

    }

}