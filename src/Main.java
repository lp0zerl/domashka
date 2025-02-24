public class Main {
    public static void main(String[] args) {
        var dog = 8.0;      // переменная dog будет иметь тип double
        var cat = 3.6;     // переменная cat будет иметь тип double
        var paper = 76378; // переменная paper будет иметь тип int

        // Уменьшаем значения переменных
        dog -= 3.5;        // уменьшаем dog на 3.5
        cat -= 1.6;        // уменьшаем cat на 1.6
        paper -= 7639;     // уменьшаем paper на 7639

        // Выводим новые значения переменных в консоль
        System.out.println("Новое значение dog = " + dog);
        System.out.println("Новое значение cat = " + cat);
        System.out.println("Новое значение paper = " + paper);
    }
}