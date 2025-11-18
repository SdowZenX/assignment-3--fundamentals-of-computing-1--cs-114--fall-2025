import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
  Scanner Scanner = new Scanner(System.in);
System.out.print("Enter a number\n");
int n = Scanner.nextInt();
if (n % 2 ==1)
{int middle = n/2;}

 for (int row = 0; row <= middle; row++)
 { for (int space = 0; space < middle - row; space++)
  System.out.print(" "); }

  for (int star = 0; star < 2 * row + 1; star++)
  {System.out.print("*");
if(star < 2 * row)
{System.out.print(" ");}
 }
}
System.out.println();
}

for (int row = middle - 1; row >= 0; row--)
  for (int space = 0; space < middle- row; space++)
    {System.out.print(" ");
}

for (int star = 0; star < 2 * row + 1; star++)
{System.out.print("*");
if (star < 2 * row)
{System.out.print(" ");
}
}
{System.out.println();
}
else {int middle= n / 2;} {
for (int row = 0; row < middle; row++)
{for (int space = 0; space < middle - row - 1; space++)}
{System.out.print(" ");
}
for (int star = 0; star < 2 * row + 1; star++)
{System.out.print("*");
}
if (star < 2 * row)
{System.out.print(" ");
}
}
System.out.println();

for (int row = middle - 1; row >= 0; row--)
{for (int space = 0; space < middle- row - 1; space++)
  {System.out.print(" ");
}
for (int star = 0; star < 2 * row + 1; star++)
   {System.out.print("*");

if (star < 2 * row) {System.out.print(" ");
}
}
System.out.println();
}
scanner.close();
