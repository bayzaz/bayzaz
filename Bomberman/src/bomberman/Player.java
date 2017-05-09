/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman;

//create Player

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player {
    private int x;
    private int y;
    private int speedx=0; //define speed movement
    private int speedy=0;
    private LinkedList<Enemy> e = ControlEnemy.getEnemyBounds();
    public static int score;
    public Player(int x,int y){
        this.x = x;
        this.y = y;
    }
    //method movement of player working for all time
    public void update(){
        x+=speedx;
        y+=speedy;
        //check area
        if(x<0){
            x=0;
        }
        if(y<0){
            y=0;
        }
        if(x>607){
            x=607;
        }
        if(y>426){
            y=426;
        }
    }
    //draw player
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.CYAN);
        g2d.fillRect(x,y,32,32);
        
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            speedx = 5;
        }
        if(key == KeyEvent.VK_LEFT){
            speedx = -5;
        }
        if(key == KeyEvent.VK_DOWN){
            speedy = 5;
        }
        if(key == KeyEvent.VK_UP){
            speedy = -5;
        }
        colision();
    }
    //empty button
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            speedx = 0;
        }
        if(key == KeyEvent.VK_LEFT){
            speedx = 0;
        }
        if(key == KeyEvent.VK_DOWN){
            speedy = 0;
        }
        if(key == KeyEvent.VK_UP){
            speedy = 0;
        }
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    //เช็คการชนกัน
    public void colision(){
        for(int i = 0; i< e.size(); i++){
            if(getBounds().intersects(e.get(i).getBounds())){
                e.remove(i);
                score++;
            }
        }
    }
}
