int a = 4;
int b = 6;

if (a == 10 || b == 10 || a + b == 10) {
  println("Success!");
} else {
  println("Failure!");
}

int x = 11;
int y = 14;
int z = 5;
int[] vars = {x, y, z};
boolean success = true;

if (x+y+z==30) {
  for (int var : vars) {
    if (var >= 10 && var <= 30 && var % 10 == 0) {
      success = false;
      break;
    }
  }
} else {
  success = false;
}

println(success? "Success!" : "Failure!");
