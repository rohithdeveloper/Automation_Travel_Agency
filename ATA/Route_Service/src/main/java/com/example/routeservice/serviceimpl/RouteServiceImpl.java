package com.example.routeservice.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.routeservice.dto.RouteDto;
import com.example.routeservice.exception.RouteNotFoundException;
import com.example.routeservice.model.Route;
import com.example.routeservice.repository.RouteRepository;
import com.example.routeservice.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	private RouteRepository routeRepo;
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public RouteDto addRoute(RouteDto routeDto) {
		// TODO Auto-generated method stub
		Route route = modelMapper.map(routeDto, Route.class);
		Route savedroute = routeRepo.save(route);
		RouteDto routedto = modelMapper.map(savedroute, RouteDto.class);
		return routedto;
	}

	@Override
	public String modifyRoute(int routeId, RouteDto routeDto) {
		// TODO Auto-generated method stub
		Optional<Route> optionalroute = routeRepo.findById(routeId);
		if(optionalroute.isPresent()) {
			Route existingroute = optionalroute.get();
			existingroute.setDestination(routeDto.getDestination());
			existingroute.setDistance(routeDto.getDistance());
			existingroute.setDuration(routeDto.getDuration());
			existingroute.setSource(routeDto.getSource());
			routeRepo.save(existingroute);
			
			   return "route with ID " + routeId + " updated successfully";
        } else {
            throw new RouteNotFoundException("Cylinder with ID " + routeId + " not found");
        }
	}

	@Override
	public String deleteRoute(int routeId) {
		// TODO Auto-generated method stub
		Optional<Route> deleteroute = routeRepo.findById(routeId);
		if (deleteroute.isPresent()) {
			routeRepo.delete(deleteroute.get());
			return "route deleted successfully";
		} else {
			throw new RouteNotFoundException("driver with" + routeId + "not found");
		}
		
	}

	

	@Override
	public RouteDto viewRouteById(int routeId) {
		// TODO Auto-generated method stub
		Optional<Route> optionalRoute = routeRepo.findById(routeId);
		if(optionalRoute.isPresent()) {
			Route route = optionalRoute.get();
			 RouteDto routeDto= modelMapper.map(route, RouteDto.class);
			return routeDto;
		}
		else {
			throw new RouteNotFoundException("driver with" + routeId + "not found");

		}
	}

	
}
