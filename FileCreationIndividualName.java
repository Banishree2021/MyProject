package com.sunjray;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileCreationIndividualName {
    
    FileWriter fw = null;
    BufferedWriter bw = null;
    String filePath;
    String data;
    DateFormat df_date = new SimpleDateFormat("yyyy-MM-dd");
    
    
    public void createFile(String... sData){

        try{
            new File("MYFILES/"+sData[0]).mkdirs();
            filePath = "MYFILES/"+sData[0]+"/" + df_date.format(new Date()) + ".txt";
            fw = new FileWriter(filePath, true);
            bw = new BufferedWriter(fw);
            bw.write(sData[1] + "\n");
            bw.close();
        }catch(Exception e){}

    }

}