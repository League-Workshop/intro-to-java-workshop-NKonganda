PImage mustache;
PImage friend;
void setup() {
  size(800, 800);
  friend = loadImage("face.jpg");
  friend.resize(height, width);
  mustache = loadImage("tash.png");
  mustache.resize(200, 200);
  background(friend);
}
void draw() {
  if (mousePressed){
    background(friend);
  image(mustache,mouseX,mouseY);
  }
}
