package com.miracle.effort.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.feature.response.FeatureResponse;
import com.miracle.scrum.bean.Story;

@RestController
public class EffortController {

	@GetMapping(value = "/effort")
	public ResponseEntity<FeatureResponse> buildFeatures(@RequestParam(value = "storyList") List<Story> storyList,
			@RequestParam(value = "projectName") String projectName,
			@RequestParam(value = "storyStates") List<Object> storyStates) {
		// Invoke Icescrum to retrieve story details based on id
		// Calculate total effort based on storyStates( contains integers as State values)
		FeatureResponse response = new FeatureResponse();
		// send total effort using FeatureResponse

		return new ResponseEntity<FeatureResponse>(response, HttpStatus.OK);
	}

}
