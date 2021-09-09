int input = -20;

boolean positive = true;
if (input < 0) {
  positive = false;
}

for (int i = input; positive? (0 <= i) : (0 >= i); i += positive? -1 : 1) {
  if (i == 6) {
    print("six");
  } else {
    print(i);
  } 
  if (i == input / 2) {
    println(" - HALF!");
  } else {
    println();
  }
}
