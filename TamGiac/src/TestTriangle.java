import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestTriangle extends TestCase {
	String s1="Equilateral";//tam giac deu
	String s2="Isosceles";//tam giac can
	String s3="Scalene";//tam giac thuong
	String s4="notTriAngle";//khong phai tam giac
	public void test(){
		Triangle tg1=new Triangle();
		String s5=tg1.kiemtra(1,1,1);
		assertEquals(s1,s5);
		assertEquals(s3,tg1.kiemtra(5, 7, 9));
	}
		
}
