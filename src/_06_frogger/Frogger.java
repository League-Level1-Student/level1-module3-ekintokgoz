package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x=400;
    int y=550;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0,0,255);
    	fill(0, 255, 0);
    	ellipse(x, y, 75, 65);
    }    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                y-=25;
            }
            else if(keyCode == DOWN)
            {
                y+=25;
            }
            else if(keyCode == RIGHT)
            {
                x+=25;
            }
            else if(keyCode == LEFT)
            {
               x-=25;
            }
        } 	  
      }
    public boolean outsideCanvas() {
    	if(x<0 || x>WIDTH) {
    		return true;
    	}else if(y<0 || y>HEIGHT) {
    		return true;
    	}
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
        
    }
}
