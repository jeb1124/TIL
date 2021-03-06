package broker.twotier.test;

import java.sql.SQLException;
import java.util.Vector;

import broker.twotier.dao.Database;
import broker.twotier.exception.DuplicateSSNException;
import broker.twotier.exception.RecordNotFoundException;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.SharesRec;

public class DatabaseTest {

	public static void main(String[] args) throws Exception {
		Database db = new Database("127.0.0.1");
		//db.addCustomer(new CustomerRec("888-888","하바리", "다산동"));
		//db.deleteCustomer("888-888");
		//db.addCustomer(new CustomerRec("777-777","하바리", "약수동"));
		Vector<SharesRec> v = db.getPortfolio("777-777");
		for(SharesRec sr : v) System.out.println(v);
	}

}
