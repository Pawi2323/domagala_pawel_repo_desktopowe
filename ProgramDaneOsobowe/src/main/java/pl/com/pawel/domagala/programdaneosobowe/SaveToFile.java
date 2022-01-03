/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.pawel.domagala.programdaneosobowe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveToFile {
    private String file_name = "zapis.txt";

    public void saveToFile(String text){
        try {
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}