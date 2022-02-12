package enum_practice;

public class Application {
	public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(yourDecizion("m"));
    }
	
	public static Day yourDecizion(String x){
	      //scanner etc
	      if(x.equals("M") || x.equals("m")){
	         return Day.MONDAY;
	      }
	      else if (x.equals("T") || x.equals("t")){
	         return Day.TUESDAY;
	      }
	      else{
	         return Day.OTHERS;
	      }
	   }
}
