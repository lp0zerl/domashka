public class Main {
    public static void main(String[] args) {
        var dog = 8.0;      // переменная dog будет иметь тип double
        var cat = 3.6;     // переменная cat будет иметь тип double
        var paper = 76378; // переменная paper будет иметь тип int

        // Увеличиваем значения переменных на 4
        dog += 4;
        cat += 4;
        paper += 4;

        // Выводим новые значения переменных в консоль
        System.out.println("Новое значение dog = " + dog);
        System.out.println("Новое значение cat = " + cat);
        System.out.println("Новое значение paper = " + paper);
    }
}