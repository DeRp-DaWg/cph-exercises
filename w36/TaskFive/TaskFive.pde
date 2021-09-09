void setup() {
  MethodOne(); 
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it. 
 */

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 

  int max = 10;

  String output = "";

  if (i > max)
  {
    output = "i is greater than "+max+".";
  }

  println(output);
}

/* 
 Finish the following method so that we can change the number assigned 
 to the weekday and it prints the correct output.  
 */
void MethodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;

  if (weekDay < 5)
  {
    weekend = false;
  } else 
  {
    weekend = true;
  }

  // Print the name of the weekday here: 
  switch(weekDay) {
    case 0:
      println("It's monday");
      break;
    case 1:
      println("It's tuesday");
      break;
    case 2:
      println("It's wednesday");
      break;
    case 3:
      println("It's thursday");
      break;
    case 4:
      println("It's friday");
      break;
    case 5:
      println("It's saturday");
      break;
    case 6:
      println("It's sunday");
      break;
  }


  // Print if it is weekend here:
  if (weekend) {
    println("It's weekend!");
  }
}
