package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        FileDataReader fileDataReader=new FileDataReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        FileDataWriter fileDataWriter=new  FileDataWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule DataEncodingModule= new EncodingModule(fileDataReader,fileDataWriter);
        DataEncodingModule.encode();
        NetAndDatabaseReader fileNetReader=new NetAndDatabaseReader("http://myfirstappwith.appspot.com/index.html");
        NetAndDatabaseWriter fileNetWriter= new NetAndDatabaseWriter();
        EncodingModule NetEncodingModule = new EncodingModule(fileNetReader,fileNetWriter);
        NetEncodingModule.encode();
        
}
}
