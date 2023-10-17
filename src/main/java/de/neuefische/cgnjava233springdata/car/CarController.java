package de.neuefische.cgnjava233springdata.car;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

	private final CarService carService;

	@GetMapping
	public List<Car> getAllCars(){
		return carService.getAllCars();
	}

	@GetMapping("{id}")
	public Car getCarById(@PathVariable String id){
		return carService.getCarById(id);
	}

	@PostMapping
	public Car addCar(@RequestBody NewCar car){
		return carService.addCar(car);
	}

}
