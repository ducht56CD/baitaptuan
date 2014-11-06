
public class Triangle {
	public String kiemtra(int a,int b,int c){
		String s1="Equilateral";//tam giac deu
		String s2="Isosceles";//tam giac can
		String s3="Scalene";//tam giac thuong
		String s4="notTriAngle";//khong phai tam giac
		String kq;
		if(a==b && b==c && a==c)
			kq = s1;
		else if(a==b || b==c)
			kq =s2;
		else if(a+b>c && a+c>b && b+c>a && a!=b && a!=c && b!=c)
			kq = s3;
		else
			kq = s4;
		return kq;
	}
	
	
}
