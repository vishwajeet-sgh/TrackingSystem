package com.track.trackingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.track.trackingSystem.entity.Trackdetail;
import com.track.trackingSystem.repository.TrackRepository;

@Service
public class Trackservice {

	@Autowired
	private TrackRepository trackRepository;
	
	/**
	 * Save the TrackingDetail object based on the Tracking Number.
	 */
	public Trackdetail saveTrackingDetail(Trackdetail trackdetail) {
		return trackRepository.save(trackdetail);
	}
}
