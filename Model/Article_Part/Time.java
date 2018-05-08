import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{
	
	protected static final SimpleDateFormat FORMAT_DATE = new SimpleDateFormat("dd/MM/yyyy");
	protected static final SimpleDateFormat HEURE_DATE = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	private  Date date;
	
	
	public Time() {
		this.date = new Date();
	}

	public String getStringDateFormat() {
		return FORMAT_DATE.format(this.date);
	}

	public String getStringDateEtHeureFormat() {
		return HEURE_DATE.format(this.date);
	}

    public Date getDate() {
        return this.date;
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
    
    public void actualiseDateToCurrent() {
    	this.date = new Date();
    }
}
