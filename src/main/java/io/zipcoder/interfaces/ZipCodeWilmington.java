package io.zipcoder.interfaces;

import java.util.LinkedHashMap;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static Students students;
    private Instructors instructors;

    private ZipCodeWilmington() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static void hostLecture(Teacher teacher, double numberOfHours) {
        Student[] studentsArray = students.getArray();
        teacher.lecture(studentsArray, numberOfHours);
    }

    public static void hostLectureById(Long id, double numberOfHours) {
        Teacher teacher = Instructors.getInstance().findById(id);
        Student[] studentsArray = students.getArray();
        teacher.lecture(studentsArray, numberOfHours);
    }

    public static LinkedHashMap<Student, Double> getStudyMap() {

        Student[] s = students.toArray();
        LinkedHashMap<Student, Double> myMap = new LinkedHashMap<>();
        for (Student student : s) {
            myMap.put(student, student.getTotalStudyTime());
        }
        return myMap;
    }
}