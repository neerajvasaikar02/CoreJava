package com.edubridge.assignment;

import java.util.Comparator;

public class RatingCompare implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getRating()<o2.getRating()) {
			return -1;
		}
		else if(o1.getRating()>o2.getRating()) {
			return 1;
		}
		else
			return 0;
	}

}
