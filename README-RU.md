# [Binogic](https://github.com/Drayff/Binogic)
Этот модуль можно использовать для работы с матрицами, он предоставляет несколько методов для работы с матрицей, представленной двумерным массивом целых чисел. 
## В классе BinMatrix находятся несколько методов, вот краткий анализ:

1. `binaryReverse(int x, int y)`:
   - Метод координаты элемента (`x` и `y`).
   - Если элемент в указанных координатах равен 0, то он становится равным 1, и наоборот.
   - Метод изменяет матрицу и возвращает ее.

2. `binaryTurnOn(int x, int y)`:
   - Метод принимает координаты элемента (`x` и `y`).
   - Если элемент в указанных координатах равен 0, то он устанавливается в 1.
   - Метод изменяет матрицу и возвращает ее.

3. `binaryTurnOff(int x, int y)`:
   - Этот метод аналогичен `binaryTurnOn`, но если элемент в указанных координатах равен 1, то он устанавливается в 0.

4. `rectangle(int x0, int x1, int y0, int y1)`:
   - Метод принимает координаты элемента (`x0`, `x1`, `y0`, и `y1`).
   - Рисует заполненый прямоугольник по заданой области.
   - Метод изменяет матрицу и возвращает ее.

## Также есть класс DrawMatrix, вот его методы:

1. `consoleDraw(SimpleMatrix matrix, String pixel)`:
   - Метод принимает матрицу и строку `pixel`, которую нужно использовать для отображения ненулевых элементов матрицы.
   - Он создает строковое представление матрицы, где `pixel` используется для ненулевых элементов, а пробелы для нулевых элементов.
   - Результат возвращается в виде строки.

2. `guiDraw(SimpleMatrix matrix, String name, int height, int width)`:
   - Метод принимает матрицу `matrix`, имя окна `name` а также высоту `height` и ширину `width`, которую нужно использовать для отображения элементов матрицы.
   - Он создает графическое представление матрицы.
   - Результат метода: Создание графического представления матрицы.

## Проект открыт к сотрудничеству и готов внимательно выслушать ваши идеи по улучшению. Если у вас есть какие-либо предложения, не стесняйтесь предлагать изменения с помощью запросов на включение или создавать новые задачи.
