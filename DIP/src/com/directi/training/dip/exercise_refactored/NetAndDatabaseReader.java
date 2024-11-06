package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;



public class NetAndDatabaseReader implements Reader {
    private final String url;
    public NetAndDatabaseReader(String url){
        this.url=url;
    }
    @Override
    public String read() throws IOException{
        URL urlObject= new URL(url);
        InputStream in = urlObject.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content= new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            content.append((char) c);
          
    }
        reader.close();
        return content.toString();
}
}
