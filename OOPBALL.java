import processing.core.PApplet;

public class OPBALL extends PApplet {
    public static void main(String[] args) {
        PApplet.main("OPBALL",args);
    }


        Ball ball1;
        Ball ball2;
        Ball ball3;
        Ball ball4;

        void setup() {
            size(640,360);

            // Initialize balls
            ball1 = new Ball(32);
            ball2 = new Ball(32);
            ball3 = new Ball(32);
           ;ball4 = new Ball(32);
        }
        @Override
        void draw() {
            background(255);

            // Move and display balls
            ball1.move();
            ball2.move();
            ball3.move();
            ball4.move();
            ball1.display();
            ball2.display();
            ball3.display();
            ball4.display();
        }
    }
