/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

/**
 *
 * @author adm-achina
 */
public class AbleHunterError { //coded by Felix

        public Object displayError(Object object) {
            String message = (String) object;
            System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("\tERROR: " + message);
            System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return null;
    }

    void display(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
