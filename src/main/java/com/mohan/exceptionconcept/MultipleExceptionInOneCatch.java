/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.exceptionconcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class MultipleExceptionInOneCatch {
//    Note that we can group only un-related exceptions together in one catch block
    public static void main(String[] args) {
        try {
            File file = new File("");
            file.getCanonicalFile();
            Connection connection = null;
            connection.createStatement();
            int i = 10;
            int result = i / 0;
        }
        catch (IOException | SQLException e) {
            System.out.println("Exception block executed");
        }
    }
}
