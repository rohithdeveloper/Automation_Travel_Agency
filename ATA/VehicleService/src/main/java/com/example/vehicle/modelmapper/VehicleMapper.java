//package com.example.vehicle.modelmapper;
//
//import com.example.vehicle.dto.VehicleDto;
//import com.example.vehicle.model.Vehicle;
//
//public class VehicleMapper {
//
//	public static VehicleDto mapToVehicleDto(Vehicle vehicle) {
//		VehicleDto vehicleDto=new VehicleDto();
//		vehicleDto.setId(vehicle.getId());
//		vehicleDto.setVehicleName(vehicle.getVehicleName());
//		vehicleDto.setDriverId(vehicle.getDriverId());
//		vehicleDto.setSeatingCapacity(vehicle.getSeatingCapacity());
//		vehicleDto.setVehicleType(vehicle.getVehicleType());
//		vehicleDto.setFarePerKm(vehicle.getFarePerKm());
//		return vehicleDto;
//		
//	}
//	
//	public static Vehicle mapToVehicle(VehicleDto vehicleDto) {
//		Vehicle vehicle=new Vehicle();
//		vehicle.setId(vehicleDto.getId());
//		vehicle.setVehicleName(vehicleDto.getVehicleName());
//		vehicle.setDriverId(vehicleDto.getDriverId());
//		vehicle.setSeatingCapacity(vehicleDto.getSeatingCapacity());
//		vehicle.setVehicleType(vehicleDto.getVehicleType());
//		vehicle.setFarePerKm(vehicleDto.getFarePerKm());
//		return vehicle;
//		
//	}
////	public static List<VehicleDto> mapToVehicleDto(List<Vehicle> vehicles) {
////		List<VehicleDto> vehicleDtoList = vehicles.stream()
////	            .map(VehicleMapper::mapToVehicleDto) // Assuming you have a method to map a single Vehicle to VehicleDto
////	            .collect(Collectors.toList());
////
////	    return vehicleDtoList;
////       
////	}
//}
