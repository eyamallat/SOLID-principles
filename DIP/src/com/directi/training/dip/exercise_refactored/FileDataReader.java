package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

public class FileDataReader implements Reader{
    private  final String filePath;

    public FileDataReader(String filePath){
        this.filePath=filePath;
    }

    @Override
    public String  read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content=new StringBuilder();
        String aLine;
        while ((aLine = reader.readLine()) != null) {
            String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
            content.append(encodedLine);
            }
        reader.close();
        return content.toString();

    }

}
