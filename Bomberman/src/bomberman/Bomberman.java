/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman;
import javax.swing.*;
/**
 *
 * @author macbook
 */
public class Bomberman {

    /**
     * @param args the command line arguments
     */
    //create window
    public static final int WIDTH=640;
    public static final int HIGHT=480;
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame window = new JFrame("Bomber Man");
        window.setSize(WIDTH,HIGHT);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(new Game());
        window.setVisible(true);
    }
    
}
