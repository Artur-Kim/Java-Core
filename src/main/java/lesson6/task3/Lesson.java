package lesson6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATH("Математика"),
    PHYSICS("Физика"),
    PROGRAMMING("Программирование"),
    HISTORY("История"),
    BIOLOGY("Биология"),
    GEOGRAPHY("География");

    private final String lessonName;

    Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public static List<Lesson> generateLessons() {
        List<Lesson> lessons = new ArrayList<>();
        int count = 4 + new Random().nextInt(3);
        for (int i = 0; i < count; i++) {
            lessons.add(values()[new Random().nextInt(6)]);
        }
        return lessons;
    }
}
