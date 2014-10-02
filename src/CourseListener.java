
public abstract interface CourseListener{
    abstract void midtermAnnounced(CourseEvent e, Object arg);
    abstract void midtermPostponed(CourseEvent e, Object arg);
    abstract void assignmentPosted(CourseEvent e, Object arg);

}
