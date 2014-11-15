/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

/**
 *
 * @author Jason
 */
public interface ViewInterface {
     public void display();  
        public void displayHelp();
            public String getInput();
                public String getInputHelp();
                    public void doAction();
                        public void doActionHelp();
}
