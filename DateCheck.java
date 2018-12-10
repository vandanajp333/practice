import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCheck {

    public static void main(String[] args) {


    	Date date = new Date();
    	System.out.println(date.toString());
    	Calendar cal = Calendar.getInstance();
    	System.out.println(cal.getTime());
    	
    	SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    	System.out.println(Calendar.DAY_OF_WEEK);
    	System.out.println(Calendar.AM_PM);
    	System.out.println(Calendar.DAY_OF_MONTH);
    	System.out.println(Calendar.DAY_OF_YEAR);

    	System.out.println(sdf.format(date));
    	System.out.println(date.getDate());
    	System.out.println(date.getMonth());
    	System.out.println(date.getYear());
    	System.out.println(date.getHours());
    	System.out.println(date.getMinutes());
    	System.out.println(date.getSeconds());
    	
    	System.out.println(Math.E);

    }
}