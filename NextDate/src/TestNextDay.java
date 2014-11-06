import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;
public class TestNextDay extends TestCase {
	public void test(){
		NextDay n = new NextDay();
		DateFormat kq=new DateFormat(29,2,1988);
		DateFormat rs=n.nextday(kq);
		assertEquals(1,rs.getday());
		assertEquals(3,rs.getmonth());
		assertEquals(1988,rs.getyear());
	}
}
