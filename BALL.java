

//  Bouncing ball class

class Ball {

     float r;   // radius
     float x, y; // location
     float xspeed;
     float width;
     float height;


     // Constructor
     Ball(float tempR) {
         r = tempR;

         x = random(width);
         y = random(height);
         xspeed = random( - 5, 5);

     }

     void move() {
         x += xspeed; // Increment x


         // Check horizontal edges
         if (x > width || x < 0) {
             xspeed *= -1;
         }

     }

     // Draw the ball
     void display() {
         stroke(0);
         fill(0, 50);
         ellipse(x, y, r*2, r*2);
     }
 }
