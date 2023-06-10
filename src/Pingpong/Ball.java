package Pingpong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    int initialspeed =2;
     Ball(int x , int y ,int width , int height){
         super(x,y,width,height);
         random = new Random();
         int randoomXDirecrion = random.nextInt(2);
         if (randoomXDirecrion == 0)
             randoomXDirecrion--;
         setXDirection(randoomXDirecrion * initialspeed);

         int randoomYDirecrion = random.nextInt(2);
         if (randoomYDirecrion == 0)
             randoomYDirecrion--;
         setYDirection(randoomYDirecrion * initialspeed);

    }
    public void setXDirection(int randomCDirection){
         xVelocity = randomCDirection;
    }
    public void setYDirection(int randomYDirection){
         yVelocity = randomYDirection;

    }
    public void move(){
         x += xVelocity;
         y += yVelocity;

    }
    public void draw(Graphics g) {
         g.setColor(Color.yellow);
         g.fillOval(x,y,width,height);

    }


}
