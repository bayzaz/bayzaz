/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author macbook
 */
//write graphic on window game
public class Game extends JPanel implements ActionListener {
    Timer loop;
    Player player;
    ControlEnemy c;
    //Enemy enemy;
    public Game(){
        loop = new Timer(10,this);
        loop.start();
        player = new Player(100,100);
        //enemy = new Enemy(200,200);
        c = new ControlEnemy();
        addKeyListener(new KeyInput(player));
        setFocusable(true);
    }
    //การจัดการการวาดกราฟิคบนจอ
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(0,0,Bomberman.WIDTH,Bomberman.HIGHT);
        player.draw(g2d);
        c.draw(g2d);
        //enemy.draw(g2d);
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Tahoma",Font.BOLD,20));
        g2d.drawString("Score: "+Player.score, 500, 20);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        //enemy.update();
        c.update();
        repaint();
    }
}
