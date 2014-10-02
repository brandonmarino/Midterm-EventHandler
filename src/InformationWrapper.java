import java.util.Date;

public class InformationWrapper {
	//data	
	private String name; //name of prof, used to differentiate classes
	private String status; //a String the student will receive
	private char upType; //the Type of update ie:// 0 = midterm date set, 1 = postponed date
	private Date midtermDate; //Pass new midterm date
	/* other information could also be sent in this wrapper
	such as; classroom change, seating arrangement, etc.
	*/
	public InformationWrapper(String name, String status, char upType, Date midtermDate){
		this.name = name;
		this.status = status;
		this.midtermDate = midtermDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getUpType() {
		return upType;
	}
	public void setUpType(char upType) {
		this.upType = upType;
	}
	public Date getMidtermDate() {
		return midtermDate;
	}
	public void setMidtermDate(Date midtermDate) {
		this.midtermDate = midtermDate;
	}
}
