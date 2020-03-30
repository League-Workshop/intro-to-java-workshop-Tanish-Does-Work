PImage mustache;
PImage friend;
PImage hat;
void setup() {
friend = loadImage("friend.jpg");
size(800, 600);
friend.resize(width,height);
mustache = loadImage("mustache.png");
mustache.resize(400,400);
hat = loadImage("hat.png");
hat.resize(250,250);


}

void draw() {
  background(friend);
  if(mousePressed){
image(mustache, mouseX-200,mouseY-150);
image(hat, mouseX-125,mouseY-220);
}
}
