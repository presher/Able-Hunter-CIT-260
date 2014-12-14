/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.AbleHunterControl;
import byui.cit260.ableHunter.exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 *
 * @author Jason
 */
public class ReportView {
     public static void reportView(String filepath, String file) throws GameControlException {
        //To change body of generated methods, choose Tools | Templates.
    
        PrintReportView report = new PrintReportView( "C:\\Users\\Jason\\Desktop\\test.txt");
                
        try(FileInputStream fips = new FileInputStream("C:\\Users\\Jason\\Desktop\\test.txt")){
            ObjectInputStream output = new ObjectInputStream(fips);
            report = (PrintReportView) output.readObject();
           //String filepath = "C:\\Users\\Jason\\Desktop\\test.txt";
        }catch(FileNotFoundException fnfe){
            throw new GameControlException(fnfe.getMessage());
        }catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        //AbleHunterControl.setCurrentReport(report);
    }
}
