package lesson2.homework;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        super("Требуется размер 4х4");
    }
}
