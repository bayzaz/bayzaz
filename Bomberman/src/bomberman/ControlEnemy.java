/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman;

//input object

import java.awt.Graphics2D;
import java.util.LinkedList;

public class ControlEnemy {
    static LinkedList<Enemy> e = new LinkedList<>();
    Enemy temp;
    public ControlEnemy(){
        addEnemy(new Enemy(150,150));
        addEnemy(new Enemy(200,200));
        addEnemy(new Enemy(300,300));
        addEnemy(new Enemy(380,360));
        addEnemy(new Enemy(100,370));
        addEnemy(new Enemy(110,110));
    }
    //draw many charecter 
    public void draw(Graphics2D g2d){
        for (int i = 0; i < e.size();i++){
            temp = e.get(i);
            temp.draw(g2d);
        }
    }
    //movement of charecter
    public void update(){
        for(int i = 0; i < e.size(); i++){
            temp = e.get(i);
            temp.update();
        }
    }
    //add Object
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    //remove Object
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
    //พื้นผิวของ enemy แต่ละตัว
    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
}
