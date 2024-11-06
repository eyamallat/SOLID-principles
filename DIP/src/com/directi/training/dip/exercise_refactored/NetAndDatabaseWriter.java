package com.directi.training.dip.exercise_refactored;

import java.util.HashMap;
import java.util.Map;


public class NetAndDatabaseWriter implements Writer{
    private static final Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;
    @Override
    public void write (String data){
        _data.put(++_count, data);
       
    
        
    }
    
}
