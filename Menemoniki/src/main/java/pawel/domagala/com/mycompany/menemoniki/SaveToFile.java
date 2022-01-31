/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pawel.domagala.com.mycompany.menemoniki;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveToFile {
    private String file_name = "file.txt";
    
    public void saveToFile(String text){
        try {
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}