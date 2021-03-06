/*
 * This file is part of JSTUN. 
 * 
 * Copyright (c) 2005 Thomas King <king@t-king.de> - All rights
 * reserved.
 * 
 * This software is licensed under either the GNU Public License (GPL),
 * or the Apache 2.0 license. Copies of both license agreements are
 * included in this distribution.
 */

package de.javawi.jstun;

import de.javawi.jstun.attribute.MappedAddressTest;
import de.javawi.jstun.util.AddressTest;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for de.javawi.jstun");
        suite.addTestSuite(AddressTest.class);
        suite.addTestSuite(MappedAddressTest.class);
        return suite;
    }

}
