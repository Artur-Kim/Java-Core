package lesson6.task3;


import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scholar scholar = new Scholar();

        Map<DayOfWeek, List<Lesson>> diary = new TreeMap<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            diary.put(day, Lesson.generateLessons());
        }

        System.out.println("Расписание уроков на неделю");
        scholar.setDiary(diary);

        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()
        ) {
            System.out.println(entry.getKey().getDay() + ":" + entry.getValue());

        }
        System.out.println();
        Map<String, Integer> resultInCycle = new HashMap<>();

        List<Lesson> AllLessons = Arrays.asList(Lesson.MATH, Lesson.PROGRAMMING, Lesson.BIOLOGY, Lesson.HISTORY, Lesson.GEOGRAPHY, Lesson.PHYSICS);
        for (Lesson curLesson : AllLessons) {
            int currentLessonCounter = 0;
            for (Map.Entry<DayOfWeek, List<Lesson>> currentEntry : diary.entrySet()) {
                List<Lesson> currentEntryValues = currentEntry.getValue();
                for (Lesson currenLesson : currentEntryValues) {
                    if (currenLesson == curLesson) {
                        currentLessonCounter++;
                    }
                }
            }
            resultInCycle.put(curLesson.getLessonName(), currentLessonCounter);
        }
        System.out.println(resultInCycle);
    }
}