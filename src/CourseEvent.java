import java.util.EventObject;
import java.util.Date;

public class CourseEvent extends EventObject{
	Object pack; //will contain info from prof
	
	public CourseEvent(Object source) {
		
		super(source);
		//pack = source;
	}
	void midtermAnnounced(CourseEvent e, Object arg){
		pack = arg;
	}
	void midtermPostponed(CourseEvent e, Object arg){
		pack = arg;
	}
	void assignmentPosted(CourseEvent e, Object arg){
		pack = arg;
	}


}
