import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
Scanner. scanner = new Scanner(System.in);}

System.out.print("Enter the size of the Matrix:");

int size = scanner.nextInt();

Matrix m = new Matrix(size);

m.populateMatrix();

System.out.println("\nOrigninal Matrix:");
m.printMatrix();

m.flipMatrix();

System.out.println("\nFlipped Matrix:");
m.printMatrix();

scanner.close();
}
