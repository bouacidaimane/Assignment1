import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Baby {
	
	private Date birthday;
	private String name;
	private char gender;
	static ArrayList<Gift> gifts= new ArrayList<Gift>() ;
	private SimpleDateFormat Format= new SimpleDateFormat("ddMMyyyyHHmm");
	
	public Baby(){
		this.birthday=null;
		this.name=null;
		this.gender=(Character) null;	
	}
	public Baby(String birthday, String name, char gender){
		try {
			this.birthday= Format.parse(birthday);
			this.name=name;
			this.gender=gender;
		} catch (Exception e) {
			System.out.println("error somewhere");}

	}
	public Baby(Date birthday, String name, char gender){
		this.birthday=birthday;
		this.name=name;
		this.gender=gender;
	}
	
	

	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

	public Date getBirthday(){
		return this.birthday;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	boolean isOlder(Baby baby){
		return birthday.after(baby.birthday);
	}
	int howOld(){
		   Calendar dob = Calendar.getInstance();
		   dob.setTime(birthday);
		   Calendar today = Calendar.getInstance();
		   int curYear = today.get(Calendar.DAY_OF_YEAR);
		   int dobYear = dob.get(Calendar.DAY_OF_YEAR);
           return curYear - dobYear;


	}
	
	public String toString(){
		return birthday.toString()+","+name+","+gender+","+howOld();
	}
	
	public static void printAllg(){
		for(Gift g: gifts){
			System.out.println(g.toString());
		}
	}
}
