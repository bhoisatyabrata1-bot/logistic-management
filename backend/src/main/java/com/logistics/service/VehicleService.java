package com.logistics.service;

import com.logistics.dto.VehicleDTO;
import com.logistics.model.Vehicle;
import com.logistics.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    private final ModelMapper modelMapper;

    public VehicleDTO createVehicle(VehicleDTO vehicleDTO) {
        Vehicle vehicle = modelMapper.map(vehicleDTO, Vehicle.class);
        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        return modelMapper.map(savedVehicle, VehicleDTO.class);
    }

    public VehicleDTO getVehicleById(Long id) {
        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
        return modelMapper.map(vehicle, VehicleDTO.class);
    }

    public List<VehicleDTO> getAllVehicles() {
        return vehicleRepository.findAll().stream()
                .map(vehicle -> modelMapper.map(vehicle, VehicleDTO.class))
                .collect(Collectors.toList());
    }

    public VehicleDTO updateVehicle(Long id, VehicleDTO vehicleDTO) {
        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
        vehicle.setMake(vehicleDTO.getMake());
        vehicle.setModel(vehicleDTO.getModel());
        vehicle.setYear(vehicleDTO.getYear());
        vehicle.setVehicleType(Vehicle.VehicleType.valueOf(vehicleDTO.getVehicleType()));
        vehicle.setCapacityKg(vehicleDTO.getCapacityKg());
        vehicle.setStatus(Vehicle.VehicleStatus.valueOf(vehicleDTO.getStatus()));
        
        Vehicle updatedVehicle = vehicleRepository.save(vehicle);
        return modelMapper.map(updatedVehicle, VehicleDTO.class);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    public VehicleDTO getVehicleByLicensePlate(String licensePlate) {
        Vehicle vehicle = vehicleRepository.findByLicensePlate(licensePlate)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
        return modelMapper.map(vehicle, VehicleDTO.class);
    }
}
