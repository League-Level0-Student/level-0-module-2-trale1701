
 PImage pepperoni;
 void setup() {
    size(500, 500);
    pepperoni = loadImage("pizza.gif");
    pepperoni.resize(50, 50);
    fill(#BC6F1C);
    ellipse(250, 250,200, 200);
    fill(#F00F29);
    ellipse(250, 250,180, 180);
    fill(#F0D644);
    ellipse(250, 250,170, 170);
}
void draw() {
    if(mousePressed){
    image(pepperoni, mouseX-25, mouseY-25);
    }
}