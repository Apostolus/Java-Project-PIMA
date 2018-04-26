import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{
	
	protected static final SimpleDateFormat FORMAT_DATE = new SimpleDateFormat("dd/MM/yyyy");
	protected static final SimpleDateFormat HEURE_DATE = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	private Date date;
	
	
	public Time() {
		this.date = new Date();
	}


	public static String getStringDateFormat(Date date) {
		return FORMAT_DATE.format(date);
	}

	public static String getStringDateEtHeureFormat(Date date) {
		return HEURE_DATE.format(date);
	}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public Date extraiteDateFromString(String stringDate) {
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    	Date date = null;
    	
    	try {
    		date = dateFormat.parse(stringDate);
    	}catch (ParseException exceptionDate) {
    		exceptionDate.printStackTrace();
    	}
    	
    	return date;
    }
}
