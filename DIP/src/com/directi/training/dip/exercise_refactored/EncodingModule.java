package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private  final Reader dataReader;
    private final Writer dataWriter;

    public EncodingModule(Reader dataReader,Writer dataWriter){
        this.dataReader=dataReader;
        this.dataWriter=dataWriter;
    }
    
    public void encode() throws IOException{ 
        String data=dataReader.read();
        String encodedString = Base64.getEncoder().encodeToString(data.getBytes());
        dataWriter.write(encodedString);
        
}

    
}
