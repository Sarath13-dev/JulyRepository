package org.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class JavaDataBaseConnectivity {

	public static void main(String[] args) {
		String s ="Java Application";
		Map<Character, Integer> m = new LinkedHashMap();
		for(int i=0; i< s.length(); i++) {
			if(m.containsKey(s.charAt(i))) {
				Integer d = m.get(s.charAt(i));
				m.put(s.charAt(i), d+1);
			}
			else {
				m.put(s.charAt(i), 1);
			}
		

		}
		System.out.println(m);
		
		
		String s1 ="Application";
		String o1 ="";
		for(int i=s1.length()-1; i>=0; i--) {
			o1= o1+s1.charAt(i);
		}
		System.out.println(o1);
		
	}

}
