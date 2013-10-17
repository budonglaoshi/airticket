package test;

import com.airticket.biz.OrderIdBiz;
import com.airticket.biz.impl.OrderIdBizImpl;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OrderIdBiz orderIdBiz=new OrderIdBizImpl();
    	String orderid=orderIdBiz.getMajorKey();
    	System.out.println(orderid);
	}

}
