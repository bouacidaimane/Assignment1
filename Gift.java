import java.text.SimpleDateFormat;
import java.util.Date;


public class Gift {

	private String nameP;
	private String desc;
	private Date date;
	private SimpleDateFormat Format= new SimpleDateFormat("ddMMyyyyHHmm");
	
	public Gift(){
		this.nameP=null;
		this.desc=null;
		this.date=null;	
	}
	
	public Gift(String nameP, String desc, String date){
		try {
			this.date= Format.parse(date);
			this.nameP= nameP;
			this.desc=desc;
		} catch (Exception e) {
			System.out.println("error somewhere");}

	}
	public Gift(String nameP, String desc, Date date){

			this.nameP= nameP;
			this.desc=desc;
			this.date=date;

	}
	
	
	

	public void setNameP(String nameP){
		this.nameP = nameP;
	}

	public String getNameP(){
		return this.nameP;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String toString(){
		return nameP+","+desc+","+date.toString();
	}
	

}
