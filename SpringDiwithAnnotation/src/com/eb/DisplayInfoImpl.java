package com.eb;

import org.springframework.stereotype.Service;

@Service
 public class DisplayInfoImpl  implements DisplayInfo{

		@Override
		public String disp(String name) {
			// TODO Auto-generated method stub
			return "Hello Good AFternoon,"+name;
		}

	}
	
