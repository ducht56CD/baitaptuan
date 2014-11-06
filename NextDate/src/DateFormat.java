
public class DateFormat {
	int day;
	int month;
	int year;
	public DateFormat(){}
	public DateFormat(int d,int m,int y){
		if(y>=1812 && y <=2012){
			if(m>=1 && m<=12){
				if(m==2){
					if(y%4==0){
						if(d>=1 && d<=29){
							this.day=d;
							this.month=m;
							this.year=y;
						}
					}
					else{ 
						if(d>=1 && d<=28){
							this.day=d;
							this.month=m;
							this.year=y;
						}
					}
				}
				else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
					if(d>=1 && d<=31){
						this.day=d;
						this.month=m;
						this.year=y;
					}
				}
				else{
					if(d>=1 && d<=30){
						this.day=d;
						this.month=m;
						this.year=y;
					}
				}
			}
		}
		else return;
	}
	public int getday(){
		return this.day;
	}
	public int getmonth(){
		return this.month;
	}
	public int getyear(){
		return this.year;
	}
	public void setdate(int d,int m,int y){
		this.day = d;
		this.month = m;
		this.year = y;
	}				
}


