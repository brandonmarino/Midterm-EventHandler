/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.Date;

public class Student implements CourseListener{
	private String name;
	private Date midterm;
    private InformationWrapper info;
	public Student(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

    public void study(){
        midterm = info.getMidtermDate();
        System.out.println("Update! "+ info.getName()+ " made a midterm! \nHe said: "+info.getStatus());
        System.out.println(name + " : Doh! I have to study hard for my midterm on " + this.midterm +"\n");
    }

    public void party(){
        midterm = info.getMidtermDate();
        System.out.println("Update! "+ info.getName()+ " postponed a midterm! \nHe said: "+info.getStatus());
        System.out.println(name + " : Alright! I get to party since my midterm isn't until " + this.midterm +"\n");
    }

    public void midtermAnnounced(CourseEvent e, Object arg){
        info = (InformationWrapper)arg;
        study();
    }

    public void midtermPostponed(CourseEvent e, Object arg){
        info = (InformationWrapper)arg;
        party();
    }

    public void assignmentPosted(CourseEvent e, Object arg){
        System.out.println("Oh, a new assignment was posted... \nOnly worth 10%? Not worth it.");
    }
}
