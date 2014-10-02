/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.Date;

public class TeachingAssistant implements CourseListener{
	private String name;
	private Date midterm;
    private InformationWrapper info;

	public TeachingAssistant(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void proctor(){
        midterm = info.getMidtermDate();
        System.out.println("Update! "+ info.getName()+ " made a midterm! \nHe said: "+info.getStatus());
        System.out.println(name + " : I have to proctor a midterm on " + this.midterm+"\n");
    }
	
	public void postpone(){
        midterm = info.getMidtermDate();
        System.out.println("Update! "+ info.getName()+ " postponed a midterm! \nHe said: "+info.getStatus());
        System.out.println(name + " : Now the midterm is on " + this.midterm+"\n");
    }

    public void midtermAnnounced(CourseEvent e, Object arg){
        info = (InformationWrapper)arg;
        proctor();
    }

    public void midtermPostponed(CourseEvent e, Object arg){
        info = (InformationWrapper)arg;
        postpone();
    }

    public void assignmentPosted(CourseEvent e, Object arg){
        info = (InformationWrapper)arg;
        System.out.println("I quit.");
    }
}
