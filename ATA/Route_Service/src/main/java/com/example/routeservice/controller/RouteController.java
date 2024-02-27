package com.example.routeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.routeservice.dto.RouteDto;
import com.example.routeservice.service.RouteService;

@RestController
@RequestMapping("/api/route")
//@PreAuthorize("hasRole('ROLE_ADMIN')")
public class RouteController {

	@Autowired
	private RouteService routeService;
	
	@PostMapping("/addroute")
	public RouteDto addRoute(@RequestBody RouteDto routeDto) {
		return routeService.addRoute(routeDto);
		
	}
	
	@PutMapping("/modifyroute/{routeId}")
	public String modifyRoute(@PathVariable int routeId,@RequestBody RouteDto routeDto) {
		return routeService.modifyRoute(routeId, routeDto);
		
	}
	
	@DeleteMapping("/deleteroute/{routeId}")
	public String deleteRoute(@PathVariable int routeId) {
		return routeService.deleteRoute(routeId);
		
	}

	@GetMapping("/routeid/{routeId}")
	public RouteDto viewRoutesById(@PathVariable("routeId") int routeId){
		return routeService.viewRouteById(routeId);
		 
		
	}

}