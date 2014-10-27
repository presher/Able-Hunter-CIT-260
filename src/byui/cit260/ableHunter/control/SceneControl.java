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

public class SceneControl {
    public String sceneControl;
    public static void main(String[] args)throws java.io.IOException{  
        Desert desert = new Desert();
        Mountain mountain = new Mountain();
        Lodge lodge = new Lodge();
        Island island = new Island();
        Forest forest = new Forest();
    //char scene = 0;
        String Scene[] = {"mountain", "lodge", "desert", "island", "forest"};
    
        char input, ignore;
        
            for(;;){
                do{
                    System.out.println("\n Please Choose Your Scene: " +
                    "\n\t 1 For Mountain Scene "+
                    "\n\t 2 For Lodge Scene "  +
                    "\n\t 3 For Desert Scene "  +
                    "\n\t 4 For Island Scene "  +
                    "\n\t 5 For Forest Scene " +
                    "\n\t q to quit"        );
                //while (go != null);
                input = (char) System.in.read();
                
                   do {
                ignore = (char) System.in.read();
                   // Do Loop 2
                   }while(ignore != '\n');
                   //for(input = 0; input < 5; input++)
                   switch (input){
                           case '1':
                            //(input == '1');
                            System.out.print("\n" + Scene[0]);
                               return;
                                case '2':
                                    //(input == '2');
                                    System.out.print("\n" + Scene[1]);
                                    break;
                                    case '3':
                                    //(input == '3');
                                        System.out.print("\n" + Scene[2]);
                                        break;
                                            case '4':                                                        
                                                //(input == '4');
                                                System.out.println("\n" + Scene[3]);
                                                break;
                                                    case '5':
                                                        //(input == '5');
                                                             System.out.print("\n" + Scene[4]);
                                                             break;
                                                   
                                                        }
                           
                        
                } while( input < '0' | input > '6' & input != 'q');      
           
                    
      if (input == 'q') break;

        
        
            
            }

    }  
           
   

}