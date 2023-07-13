package com.example.services;

import java.util.List;
import com.example.demo.*; 


public interface BatchManager 
{
	List<BatchDTO> getBatches(String cname);
}
