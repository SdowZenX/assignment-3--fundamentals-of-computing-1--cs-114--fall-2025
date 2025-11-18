public class Matrix {

  private int[][] Matrix;
public Matrix(int size) {
this.Matrix = new int[size][size];
System.out.println("Matrix created with dimensions " + size + " x " + size);
}

private void swap(int x1, int y1, int x2, int y2)
{int temp = Matrix[x1][y1];}
matrix[x1][y1] = matrix[x2][y2];
matrix[x2][y2] = temp;
}

public void printMatrix() {
int size = Matrix.length;

final String YELLOW_BG = "\u001B[43m";
final String RESET = "\u001B[0m";
for (int i = 0; i < size; i++) {
for (int j = 0; j < size; j++) {
  if (i == j) {System.out.print(YELLOW_BG + Matrix[i][j] + RESET);

  } else {System.out.print(Matrix[i][j]);

  }
  if (j < size - 1) {System.out.print(" ");

  }
}
System.out.println();
}
}

public void populateMatrix() {
int size = Matrix.length;
int value = 1;

for (int i = 0; i < size; i++) {
for (int j = 0; j < size; j++) {
Matrix[i][j] = value;
value++;
}
}
}

public void flipMatrix() {
int size = Matrix.length;

for (int i = 0; i < size; i++) {
for (int j = i + 1; j < size; j++) {
  swap(i, j, j, i);
}
}
}
