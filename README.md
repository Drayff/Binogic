# Binogic
Этот модуль можно использовать для работы с матрицами, он предоставляет несколько методов для работы с матрицей, представленной двумерным массивом целых чисел. 
## В классе SimpleMatrix находятся несколько методов, вот краткий анализ:

1. `createMatrix(int sizeOfMatrix)`:
   - Метод создает квадратную матрицу заданного размера `sizeOfMatrix`.
   - Инициализирует все элементы матрицы нулями, используя `Arrays.fill`.

2. `binaryReverse(int [][] matrix, int x, int y)`:
   - Метод принимает матрицу и координаты элемента (`x` и `y`).
   - Если элемент в указанных координатах равен 0, то он становится равным 1, и наоборот.
   - Метод изменяет матрицу и возвращает ее.

3. `binaryTurnOn(int [][] matrix, int x, int y)`:
   - Метод также принимает матрицу и координаты элемента (`x` и `y`).
   - Если элемент в указанных координатах равен 0, то он устанавливается в 1.
   - Метод изменяет матрицу и возвращает ее.

4. `binaryTurnOff(int [][] matrix, int x, int y)`:
   - Этот метод аналогичен `binaryTurnOn`, но если элемент в указанных координатах равен 1, то он устанавливается в 0.

## Также есть класс DrawMatrix, вот его методы

1. `consoleDraw(int [][] matrix, String pixel)`:
   - Метод принимает матрицу и строку `pixel`, которую нужно использовать для отображения ненулевых элементов матрицы.
   - Он создает строковое представление матрицы, где `pixel` используется для ненулевых элементов, а пробелы для нулевых элементов.
   - Результат возвращается в виде строки.

2. `guiDraw(int [][] matrix, String name, int height, int width)`:
   - Метод принимает матрицу `matrix`, имя окна `name` а также высоту `height` и ширину `width`, которую нужно использовать для отображения элементов матрицы.
   - Он создает графическое представление матрицы.
   - Результат метода: Создание графического представления матрицы.
