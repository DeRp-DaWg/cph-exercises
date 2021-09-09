void setup() {
  int bg = 0;
  size(200, 600);
  background(bg);
  frameRate(1);
}

int red = color(255, 0, 0);
int yellow = color(255, 255, 0);
int green = color(0, 255, 0);
int gray = 127;
int light;
void draw() {
  light = (frameCount-1)%4;
  ellipseMode(CENTER);
  if (light==0 || light==1) {
    fill(red);
  } else {
    fill(gray);
  }
  ellipse(100, 100, 200, 200);
  if (light==1 || light==3) {
    fill(yellow);
  } else {
    fill(gray);
  }
  ellipse(100, 300, 200, 200);
  if (light==2) {
    fill(green);
  } else {
    fill(gray);
  }
  ellipse(100, 500, 200, 200);
}
