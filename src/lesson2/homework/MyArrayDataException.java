package lesson2.homework;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String cellValue, int rowIndex, int colIndex) {
        super(String.format("Некорректное значение '%s' в элементах мссива[%d][%d], требуется целое число",
                cellValue,rowIndex, colIndex));
    }
}
