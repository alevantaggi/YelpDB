package it.polito.tdp.yelp.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.yelp.db.YelpDAO;

public class Model {
	
	List<Business> businesses;
	Map<String, Business> businessIdMap; // con static viene condivisa da tutte le classi DAO

	public Model() {
		YelpDAO dao= new YelpDAO();
		this.businessIdMap= new HashMap<>();
		this.businesses= dao.readBusinesses(businessIdMap);
		
		/*
		 * Costruzione identity Map fatta a posteriori
		 */
//		for( Business b: businesses) 
//			businessIdMap.put(b.getBusinessId(), b);
//	
	}
}
