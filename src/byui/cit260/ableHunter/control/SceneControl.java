/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;
import byui.cit260.ableHunter.model.Desert;
import byui.cit260.ableHunter.model.Forest;
import byui.cit260.ableHunter.model.Island;
import byui.cit260.ableHunter.model.Lodge;
import byui.cit260.ableHunter.model.Mountain;
import java.io.IOException;
import java.util.Arrays;

public class SceneControl {//Created and coded by Jason
    public void getScene() throws IOException{
    //public String sceneControl;
   // public static void main(String[] args)throws java.io.IOException{  //Coded By Jason
        Desert desert = new Desert();
        Mountain mountain = new Mountain();
        Lodge lodge = new Lodge();
        Island island = new Island();
        Forest forest = new Forest();
    //char scene = 0;
       String Scene[] = {"mountain" + "lodge" + "desert" + "forest" + "island"};
            /*{"M, mountain"}, 
            {"L, lodge"}, 
            {"D, desert"},
            {"I, island"}, 
            {"F, forest"}
    };*/
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

    private void getForestScene() {
         //To change body of generated methods, choose Tools | Templates.
        Forest forestScene = new Forest();
        forestScene.displayForestScene();
    }
    }  
      
   

//}