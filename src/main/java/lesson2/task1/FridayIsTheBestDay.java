package lesson2.task1;

public class FridayIsTheBestDay {

    public static void main(String[] args) {

        String[] fridayText = {"Пятница", "это", "лучший", "день", "недели"};
        // Создаём объект класса FridayIsTheBestDay
        FridayIsTheBestDay fridayObject = new FridayIsTheBestDay();
        // Вызываем метод cycleFor у объекта fridayObject, передавая в параметрах массив fridayText
        fridayObject.printWordsByCycleFor(fridayText);
        fridayObject.cycleForEach(fridayText);
        fridayObject.cycleWhile(fridayText);

    }

    void printWordsByCycleFor(String[] words) {
        String friday1 = "";
        for (int i = 0; i < words.length; i++) {
            friday1 += words[i];
            if (i == words.length - 1) {
                friday1 += ".";
            } else {
                friday1 += " ";
            }
        }

        System.out.println(friday1);
    }

    void cycleForEach(String[] friday) {
        String friday2 = "";
        for (String current : friday)
            friday2 += current + " ";
        // .trim уничтожает пробелы в начале и конце строки и добавляет точку в конце.
        friday2 = friday2.trim() + ".";
        System.out.println(friday2);
    }

    void cycleWhile(String[] friday) {
        String friday3 = "";
        int index = 0;
        while (index < friday.length)
            friday3 += friday[index++] + " ";
        friday3 = friday3.trim() + ".";
        System.out.print(friday3);
    }
}
