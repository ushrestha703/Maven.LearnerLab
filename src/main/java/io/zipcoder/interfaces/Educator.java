package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    JIMMY((long)1003, "Jimmy"),
    TODD((long) 1001, "Todd"),
    ALPHA((long) 1002, "Alpha");

    private final Instructor instructor;
    double timeWorked;

    Educator(Long id,String name) {
        this.instructor = new Instructor(id);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);
        this.timeWorked = 0;
    }
    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public double getTimeWorked() { return this.timeWorked; }
}