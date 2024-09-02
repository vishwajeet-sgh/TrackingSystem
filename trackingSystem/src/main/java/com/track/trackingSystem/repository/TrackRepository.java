package com.track.trackingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.track.trackingSystem.entity.Trackdetail;


@Repository
public interface TrackRepository extends JpaRepository<Trackdetail, Long>{

}
