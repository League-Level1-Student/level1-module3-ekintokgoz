package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 1000;
    static final int HEIGHT = 800;
    int x=500;
    int y=675;
    Car c1;
    Car c2;
    Car c3;
    Car c4;
    boolean intersects(Car car) {
    	 if ((y > car.getY() && y < car.getY()+50) &&
    	                (x > car.getX() && x < car.getX()+car.getSize())) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
    }
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	c1 = new Car((int)random (0,WIDTH), (int)random (0, HEIGHT-150), 85, (int)random (2,12));
    	c2 = new Car((int)random (0,WIDTH), (int)random (0, HEIGHT-150), 140, (int)random (2,12));
    	c3 = new Car((int)random (0,WIDTH), (int)random (0, HEIGHT-150), 120, (int)random (2,12));
    	c4 = new Car((int)random (0,WIDTH), (int)random (0, HEIGHT-150), 100, (int)random (2,12));
    }

    @Override
    public void draw() {
    	background(0,0,255);
    	fill(0, 255, 0);
    	ellipse(x, y, 60, 45);
    	fill(255,0,0);
    	c1.display();
    	c2.display();
    	c3.display();
    	c4.display();
    	c1.moveLeft();
    	c2.moveLeft();
    	c3.moveRight();
    	c4.moveRight();
    	if(intersects(c1)||intersects(c2)||intersects(c3)||intersects(c4)) {
    		x = 500;
    		y = 675;
    	}
    	
    
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
    	} return false;
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
        
    }
    
    class Car {
    	int xCar;
    	int yCar;
    	int size;
    	int speed;
    	Car(int x, int y, int size, int speed) {			
    		this.xCar = x;
    		this.yCar = y;
    		this.size = size;
    		this.speed = speed;
    	}
    	void moveLeft() {
    		xCar -= speed;
    		if(xCar<0-size) {
    			xCar = WIDTH; 
    			yCar = (int)random (0, HEIGHT-150);
    			speed = (int)random (2,12);
    		}
    	}
    	void moveRight() {
    		xCar += speed;
    		if(xCar>WIDTH+size) {
    			xCar = 0-size;
    			yCar = (int)random (0, HEIGHT-150);
    			speed = (int)random (2,12);
    		}
    	}
    	
    	int getX() {
    		return xCar;
    	}
    	
    	int getY() {
    		return yCar;
    	}
    	
    	int getSize() {
    		return size;
    	}
    	
    	void display() {
    		fill(255,0,0);
    		rect(xCar , yCar,  size, 50);
    	}
    }
}
