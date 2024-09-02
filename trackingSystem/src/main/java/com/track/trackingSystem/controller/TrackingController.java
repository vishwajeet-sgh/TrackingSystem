package com.track.trackingSystem.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.track.trackingSystem.entity.Trackdetail;
import com.track.trackingSystem.service.Trackservice;
import com.track.trackingSystem.utils.ResponseModel;
import com.track.trackingSystem.utils.TrackingNumberGenerator;

@RestController
@RequestMapping("/parsel")
public class TrackingController {

	@Autowired
	private Trackservice trackService;
	
	@Autowired
	private TrackingNumberGenerator trackingNumberGenerator;
	
	@GetMapping("/")
	public ResponseModel getInfo() {
		ResponseModel res=new ResponseModel();
		res.setCode(200);
		res.setStatus("Ok");
		res.setMessage("Successfully");
		return res;
	}
	
	@PostMapping("/save")
	public ResponseModel save(@RequestBody Trackdetail trackdetail){
		ResponseModel res=new ResponseModel();
		try {
			String trackingNumber=trackingNumberGenerator.generateTrackingNumber(12);
			trackdetail.setTrackNumber(trackingNumber);
			Date date=new Date();
			trackdetail.setCreatedAt(new Timestamp(date.getTime()));
			Trackdetail trackdetails=trackService.saveTrackingDetail(trackdetail);
			
			res.setCode(200);
			res.setStatus("Ok");
			res.setMessage("Save Successfully");
			res.setData(trackdetails);
			
		}catch (Exception e) {
			e.printStackTrace();
			res.setCode(500);
			res.setMessage(e.getMessage());
			res.setStatus("Error");
		}
		return res;
	}

}
