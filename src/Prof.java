/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prof{
	private String name;
	private Date midtermDate;
	private ArrayList<Student> students;
	private TeachingAssistant ta;
    private List<CourseListener> courseListeners;
	public Prof(String aName) {
		this.name = aName;
		this.students = new ArrayList<Student>();
        courseListeners = new ArrayList<CourseListener>();
	}

	public Date getMidterm() {
		return this.midtermDate;
	}

	public String getName() {
		return this.name;
	}

    public void setMidterm(Date date) {
        this.midtermDate = date;
        //for(Student s: this.students){
        //s.study(date);
        //}
        //ta.proctor(date);
        String status = "the midterm will cover chapter 3,section 5"; //prompt user
        char upType = 0; //set as set
        InformationWrapper wrap = new InformationWrapper(name, status, upType, midtermDate);
        CourseEvent e = new CourseEvent(this);
        for (CourseListener cl: courseListeners) {
            cl.midtermAnnounced(e, wrap);
        }



    }

    public void postponeMidterm(Date date){
		/*this.midtermDate = date;
		for(Student s: this.students){
			s.party(date);
		}
		ta.postpone(date);*/
        String status = "I'm sick and must postpone"; //prompt user
        char upType = 1; //set as postponed
        InformationWrapper wrap = new InformationWrapper(name, status, upType, midtermDate);
        CourseEvent e = new CourseEvent(this);

        for (CourseListener cl: courseListeners) {
            cl.midtermAnnounced(e, wrap);
        }


    }

    /*public void setMidterm(Date date) {
		this.midtermDate = date;
		for(Student s: this.students){
			s.study(date);
		}
		ta.proctor(date);
	}*/
	
	/*public void postponeMidterm(Date date){
		this.midtermDate = date;
		for(Student s: this.students){
			s.party(date);
		}
		ta.postpone(date);
	}*/
	
	public void setTA(TeachingAssistant theTA){
		this.ta = theTA;
	}

	public void addStudent(Student s){
		this.students.add(s);
	}

    public synchronized void addCourseListener (CourseListener cl){
        courseListeners.add(cl);
    }

    public synchronized void removeCourseListener (CourseListener cl) {
        courseListeners.remove(cl);
    }


    public static void main(String[] args) {

		Prof p = new Prof("Babak");
		Student s = new Student("Homer");
		Student s2 = new Student("Bart");
		TeachingAssistant ta = new TeachingAssistant("Michael");
	

		//p.addStudent(s);
		//p.addStudent(s2);
        p.addCourseListener(s);
        p.addCourseListener(s2);
        p.addCourseListener(ta);

		//p.setTA(ta);
	
		Date midterm = new Date();
		p.setMidterm(midterm);
	
		p.postponeMidterm(new Date(midterm.getTime() + 1000000000));
	}

}
