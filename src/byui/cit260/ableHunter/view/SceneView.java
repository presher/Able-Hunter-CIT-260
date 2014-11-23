/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.view;

import ablehunter.java.displayInfo;
import byui.cit260.ableHunter.model.Desert;
import byui.cit260.ableHunter.model.Forest;
import byui.cit260.ableHunter.model.Island;
import byui.cit260.ableHunter.model.Lodge;
import byui.cit260.ableHunter.model.Mountain;
import java.io.IOException;

/**
 *
 * @author Jason
 */
public abstract class SceneView extends View implements displayInfo{
    public String sceneView;
    public SceneView(){
    super("\n"
                + "\n-------------------------------------------"
                + "\n| Scene Menu"
                + "\n-------------------------------------------"
                + "\nU-Mountain"
                + "\nL-Lodge"
                + "\nR-Desert"
                + "\nI-Island"
                + "\nF-Forest"
                + "\nQ-Quit Game"
                + "\n_____________________________________________");
    }
    /*public SceneView(String promptMessage) {
        super("\n Please Choose Your Scene: " +
                    "\n\t M For Mountain Scene "+
                    "\n\t L For Lodge Scene "  +
                    "\n\t D For Desert Scene "  +
                    "\n\t I For Island Scene "  +
                    "\n\t F For Forest Scene " +
                    "\n\t q to quit"        );
    }*/

   
    // scenes[] = {'Mountain', 'Lodge', 'Desert', 'Island', 'Forest'};

    

    public String getScenViewe() {
        return sceneView;
    }

    public void setSceneView(String scene) {
        this.sceneView = scene;
    }
    //public static void main(String[] args){}
   /* public void sceneView() throws IOException{
     String Scene[] = {"mountain" + "lodge" + "desert" + "forest" + "island"};
            /*{"M, mountain"}, 
            {"L, lodge"}, 
            {"D, desert"},
            {"I, island"}, 
            {"F, forest"}
    };
       
        char input, ignore;
     //private void doAction(char selection) throws IOException {   
            for(;;){
                do{
                    
                    System.out.println("\n Please Choose Your Scene: " +
                    "\n\t M For Mountain Scene "+
                    "\n\t L For Lodge Scene "  +
                    "\n\t D For Desert Scene "  +
                    "\n\t I For Island Scene "  +
                    "\n\t F For Forest Scene " +
                    "\n\t q to quit"        );
                //while (go != null);
                input = (char) System.in.read();
                
                   do {
                ignore = (char) System.in.read();
                   // Do Loop 2
                   }while(ignore != '\n');
                   //for(input = 0; input < 5; input++)
                   switch (input){
                           case 'M':
                            //(input == '1');
                               this.getMountainScene();
                            //System.out.print("\n" + (Scene[0]));
                               break;
                                case 'L':
                                    this.getLodgeScene();
                                    //(input == '2');
                                    //System.out.print("\n" + (Scene[1]));
                                    break;
                                    case 'D':
                                        this.getDesertScene();
                                    //(input == '3');
                                        //System.out.print("\n" + (Scene[2]));
                                        break;
                                            case 'I':         
                                                this.getIslandScene();
                                                //(input == '4');
                                                //System.out.println("\n" + (Scene[3]));
                                                break;
                                                    case 'F':
                                                        this.getForestScene();
                                                        //(input == '5');
                                                            // System.out.print("\n" + (Scene[4]));
                                                             break;
                                                   
                                                        }
                           
                        
                } while( input < '0' | input > '6' & input != 'q');      
           
                    
      if (input == 'q') return;

        
        
            
            }
    }

    private void getMountainScene() {
         //To change body of generated methods, choose Tools | Templates.
        Mountain mountainScene = new Mountain();
       mountainScene.displayMountainScene();
    }

    private void getLodgeScene() {
         //To change body of generated methods, choose Tools | Templates.
        Lodge lodgeScene = new Lodge();
        lodgeScene.displayLodgeScene();
    }

    private void getDesertScene() {
         //To change body of generated methods, choose Tools | Templates.
        Desert desertScene = new Desert();
        desertScene.displayDesertScene();
    }

    private void getIslandScene() {
         //To change body of generated methods, choose Tools | Templates.
        Island islandScene = new Island();
        islandScene.displayIslandScene();
    }

    private void getForestScene() throws IOException {
         //To change body of generated methods, choose Tools | Templates.
        int getInfo;
        int getToo;
        Forest forestScene = new Forest();
        forestScene.displayForestScene();
        System.out.println("Please enter a number from 1 - 10");
        getInfo = System.in.read();
        getToo = getInfo + 0;
        for(int i = 5; i <= getToo; i++){
            System.out.println("You have entered the forest scene");
        }
       
    }*/

    @Override
    public void displayHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInputHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doActionHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object display(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void doInput(String value) {
         //To change body of generated methods, choose Tools | Templates.
        
    }
    public void
         SceneView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

