Задание 13 Алгебра матриц (лабораторный практикум)

Реализовать алгоритмы матричных операций:

Дано:

double[][] matrix = {

{1, 2, 3},

{4, 5, 6}

};

RealMatrix matrixMat = MatrixUtils.createRealMatrix(matrix);

1.Подпрограмму транспонирования матрицы 

Входные данные: два целых числа n и m (n – количество строк, m – количество столбцов), матрица размерности n x m

Выходные данные: транспонированная матрица размерности m x n


System.out.println(matrixFormat.format(matrixMat.transpose()));


Результат:

1   4 

2   5 

3   6

---

2.Подпрограмму умножения матрицы на число 

Входные данные: число-множитель, два целых числа n и m (n – количество строк, m – количество столбцов), матрица размерности n x m

Выходные данные: матрица – результат умножения числа-множителя на исходную матрицу

System.out.print("Введите число ");

double multiplier = numberOperation.nextDouble();

System.out.println(matrixFormat.format(matrixMat.scalarMultiply(multiplier)));

Результат:

Введите число 2

2   4   6

8   10   12

---

3.Подпрограмму сложения матриц 

Входные данные: два целых числа n и m (n – количество строк, m – количество столбцов), матрица_1 размерности n ´ m, матрица_2 размерности n ´ m

Выходные данные: матрица – результат сложения матриц

double[][] matrix2 = {

{1, 1, 1},

{1, 1, 1}

};

RealMatrix matrixMat2 = MatrixUtils.createRealMatrix(matrix2);

System.out.println(matrixFormat.format(matrixMat.add(matrixMat2)));

Результат:

2   3   4

5   6   7

---

4.Подпрограмму вычитания матриц 

Входные данные: два целых числа n и m (n – количество строк, m – количество столбцов), матрица_1 размерности n x m, матрица_2 размерности n x m

Выходные данные: матрица – результат вычитания матриц

double[][] matrix3 = {

{1, 1, 1},

{1, 1, 1}

};

RealMatrix matrixMat3 = MatrixUtils.createRealMatrix(matrix3);

System.out.println(matrixFormat.format(matrixMat.subtract(matrixMat3)));

Результат:

0   1   2

3   4   5


---

5.Подпрограмму умножения матриц 

Входные данные: три целых числа n, m и (n – количество строк матрицы_1, m – количество столбцов матрицы_1 и количество строк матрицы_2, k – количество столбцов матрицы_2), матрица_1 размерности n x m, матрица_2 размерности m x k

Выходные данные: матрица  размерности n ´ k – результат умножения матриц

double[][] matrix4 = {

{2, 2},

{2, 2},

{2, 2}

};

RealMatrix matrixMat4 = MatrixUtils.createRealMatrix(matrix4);

System.out.println(matrixFormat.format(matrixMat.multiply(matrixMat4)));

Результат:

12   12

30   30

---

6.Подпрограммы вычисления норм (||·||1, ||·||e, ||·||∞) матрицы 

Входные данные: два целых числа n и m (n – количество строк, m – количество столбцов), матрица размерности n x m

Выходные данные: соответствующая норма матрицы

Результат:
System.out.println(matrixMat.getNorm());

||·||1 = 9.0

---
System.out.println(matrixMat.getFrobeniusNorm());

Результат:

||·||e = 9.539392014169456

---

RealMatrix matrixMat5 = matrixMat.transpose();
System.out.println(matrixMat5.getNorm());

Результат:

||·||∞ = 15.0