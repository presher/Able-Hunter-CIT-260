/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ableHunter.control;

import java.io.IOException;

/**
 *
 * @author Jason
 */
public class StartNewGame {//Coded By Jason
    public void NewGame() throws IOException{
        SceneControl scene = new SceneControl();
        scene.getScene();
    System.out.println("You have begun a new game");
}
}
