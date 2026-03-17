package com.example1;

public class RealApiService implements ApiService{

	@Override
	public String request(String endPoint) {
		return "Response from " + endPoint;
	}

}
