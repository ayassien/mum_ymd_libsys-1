package com.ymd.libsys;

import java.util.Date;
import java.util.List;

public class CheckoutRecord {
	
	Date checkoutDate;
	Date dueDate;
	
	List<Fine> fines;
	List<CheckoutEntry> checkoutEntry;
	
	
}
