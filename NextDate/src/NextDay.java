
public class NextDay {
	public DateFormat nextday(DateFormat d){
		DateFormat dte = new DateFormat();
		int day=d.getday();
		int month=d.getmonth();
		int year=d.getyear();
		if(day == 28){
			if( month == 2) 
				if(year % 4 == 0)
					dte.setdate(day + 1,month , year);
				else 
					dte.setdate(1, month+1, year);
			else dte.setdate(day + 1, month, year);
			return dte;
		}
		else if(day==29) {
			if( month == 2) 
				if(year % 4 == 0)
					dte.setdate(1, month+1, year);
			else dte.setdate(day + 1, month, year);
			return dte;
		}
		else if(day == 30){
			if( month==4 || month==6 || month==9 || month==11) 
				dte.setdate(1, month + 1, year);
			else 
				dte.setdate(day + 1, month, year);
			return dte;
		}
		else if(day == 31){
			if( month==1 || month==3 || month==5 || month==7 || month==8 || month==10) 
				dte.setdate(1, month + 1, year);
			if( month == 12) 
				dte.setdate(1, 1, year + 1);
			return dte;
		}
		else 
			dte.setdate(day + 1, month, year);
		return dte;
		
	}
}
