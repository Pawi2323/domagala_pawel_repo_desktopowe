/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.waluciarz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author domag
 */
public class saveToFile {
    public static void saveToFile(String action, String currency, float amount,  float recieved, float price){
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date();  
            File f = new File("dane.csv");  
            FileWriter fw = new FileWriter(f, true);   
            fw.write("\nACT: "+action+"; CUR: "+currency+"; AMO: "+amount+"; REC: "+recieved+"; PRI: "+price+"; DAT: "+formatter.format(date));
            fw.close();
        }catch(IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
