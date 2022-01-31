/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pawel.domagala.com.mycompany.menemoniki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author paweldomagala
 */
public class ReadFromFile {
    public String readFromFile(){
        String text = "";
        try{
            File f = new File("file.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
		text += sc.nextLine() + "\n";	
			}
		}catch(FileNotFoundException ex){
			System.out.println("UPS! "+ex.toString());
		}
        return text;
    }
}
