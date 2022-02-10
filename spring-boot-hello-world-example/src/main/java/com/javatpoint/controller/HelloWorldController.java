package com.javatpoint.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
	@RequestMapping("/")
	public String hello() 
	{
		int arr[][] = {
		{2,100},
		{5,50}
				};
		
		int prev = arr[0][0];
		int prevVal = arr[0][1];
		int cnt =arr[0][0];
		
		Map<Integer, Integer> map = new HashMap<>();
		int cnt1 =1;
		while(cnt!=12)
		{
			cnt++;
			if(cnt == arr[cnt1][0])
			{
				
			}
			else {
				arr[cnt1][0] = prev;
				
			}
			
		}
		return "Hello javaTpoint";
	
	
	}
}
