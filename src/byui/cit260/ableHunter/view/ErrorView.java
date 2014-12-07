/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import byui.cit260.ableHunter.control.AbleHunterControl;
import java.io.PrintWriter;

/**
 *
 * @author Jason
 */
public class ErrorView {
    private static final PrintWriter errorFile = AbleHunterControl.getOutFile();
    private static final PrintWriter logFile = AbleHunterControl.getLogFile();
    public static void display(String className, String errorMessage){
        errorFile.println(
                    "----------------------------------------------------------"
                   +"\n- ERROR -" + errorMessage
                   +"----------------------------------------------------------"
                            );
        logFile.println(className + " - " + errorMessage);
    } 
}
