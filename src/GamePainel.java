import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePainel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGTH = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGTH)/ UNIT_SIZE;

    static final int DELAY= 75;

    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEat ;
    int appleX;
    int appleY;

    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;


   GamePainel(){
       random = new Random();
       this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGTH));
       this.setBackground(Color.black);
       this.setFocusable(true);
       this.addKeyListener(new MyKeyAdapter());
       startGame();

   }
   public void startGame(){
        newApple();
        running=true;
        timer= new Timer(DELAY,this);
        timer.start();
   }
   public void paintComponent(Graphics g){
       super.paintComponent(g);
       draw(g);

   }
   public void draw(Graphics g){

   }
   public void newApple(){

   }

   public void move(){

   }
   public void checkApple(){

   }
   public void checkCollisions(){

   }
   public void gameOver(Graphics g){

   }


    public void actionPerformed(ActionEvent e){

    }

    public class MyKeyAdapter extends KeyAdapter{
       public void keyPressed(KeyEvent e){

       }
    }




}






