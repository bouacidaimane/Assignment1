import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class BabyRegister {

	 static ArrayList<Baby> babies=new ArrayList<Baby>();
     static ArrayList<Gift> gifts= new ArrayList<Gift>() ;

     
     public static void sortByName(){	
			for(int i=0; i<babies.size()-1; i++){
				for(int j=i+1; j<babies.size(); j++){
					Baby s1 = babies.get(i);
					Baby s2 = babies.get(j);
					if(s1.getName().compareTo(s2.getName())>0){
						Baby aux = s1;
						babies.set(j,aux);
						babies.set(i, s2);
					}
					
				}
			}
		}
     
     public static void sortByAge(){	
 			for(int i=0; i<babies.size()-1; i++){
 				for(int j=i+1; j<babies.size(); j++){
 					Baby s1 = babies.get(i);
 					Baby s2 = babies.get(j);
 					//if(Integer.valueOf(s1.howOld()).compareTo(Integer.valueOf(s2.howOld()))>0)
 					if(s1.isOlder(s2))
 					//if(s1.getBirthday().compareTo(s2.getBirthday())>0)
 						{Baby aux = s1;
 						babies.set(j,aux);
 						babies.set(i, s2);
 					}
 					
 				}
 			}
 		}
		
		public static void printAllb(){
			for(Baby b: babies){
				System.out.println(b.toString());
			}
		}		
		public static void printAllg(){
			for(Gift g: gifts){
				System.out.println(g.toString());
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Baby B1= new Baby("040720170930","Imane",'f');
	     Gift G1 = new Gift("Amar","Bear","201020171212");
	     gifts.add(G1);
		 babies.add(B1);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat myFormat= new SimpleDateFormat("ddMMyyyyHHmm");
		String userCommand;
		
		

		do{
			System.out.println("1-Add new baby");
			System.out.println("2-List Babies by age");
			System.out.println("3-List Babies by name");
			System.out.println("4-Add gift");
			System.out.println("5-List gifts");
			System.out.println("6-exit");
			userCommand = scanner.next();
			
			switch(userCommand){
				case "1":

					System.out.println("Say the birthday of the Baby(YYYYMMDDHHMM)");
					Date day = new Date();

					boolean validDate = false;
					while(!validDate){
						try{
							day = myFormat.parse(scanner.next());
							validDate = true;
						}catch(ParseException e){
							System.out.println("Invalid date, type it again");
							validDate = false;
						}
					}

					System.out.println("Say the name of the Baby");
					String name = scanner.next();				
					System.out.println("Say the gender of the Baby");
 
					String str = scanner.next();
					char gender = str.charAt(0);

					Baby B = new Baby(day,name,gender);
					babies.add(B);		
					printAllb();
					break;
				case "2":
					sortByName();
					printAllb();
					break;
				case "3":
				    sortByAge();
					printAllb();
					break;
				case "4":
					System.out.println("Say the Name of the person who gave the gift");
					String nameg = scanner.next();				
					System.out.println("Say the Description of the gift");
					String desc = scanner.next();
					System.out.println("Say the Date from when the gift was given(YYYYMMDDHHMM)");
					Date dayg = new Date();

					boolean validDate1 = false;
					while(!validDate1){
						try{
							day = myFormat.parse(scanner.next());
							validDate1 = true;
						}catch(ParseException e){
							System.out.println("Invalid date, type it again");
							validDate1 = false;
						}
					}
					Gift G = new Gift(nameg,desc,dayg);
					gifts.add(G);		
					printAllg();
					break;
				case "5":
					printAllg();
					break;

			}
			
		}while(!userCommand.equals("exit"));

	}
		
		
		
	}
















