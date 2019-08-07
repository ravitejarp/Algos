package com.ravi.com.ravi.missilenous;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class MovingFiles {
    public static void main(String[] args) throws IOException {
        Files.move(Paths.get("/Users/ravra03/Documents/Ravi/Test/DB2TOOLS.json"), Paths.get("/Users/ravra03/Documents/Ravi/Test/bkp/DB2TOOLS.json"), REPLACE_EXISTING);
        Files.move(Paths.get("/Users/ravra03/Documents/Ravi/Test/newmodels/DB2TOOLS.json"), Paths.get("/Users/ravra03/Documents/Ravi/Test/DB2TOOLS.json"), REPLACE_EXISTING);
    }
}
