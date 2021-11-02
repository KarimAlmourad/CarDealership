package com.sky.cardealership;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class CardealershipApplicationTests {
//	private String numberPlate;
//	private String brand;
//	private String model;
//	private String colour;
//	private int milage;
//	private double price;
//	private boolean booked;

	@MockBean
	private CarService carService;

//	private List<Car> cars = Arrays.asList(
//			new Car("asakldj","Tesla","Model S", "White", 21000,2600, false),
//			new Car("asakldj","Tesla","Model S", "White", 21000,2600, false),
//			new Car("asakldj","VW","Model S", "White", 21000,2600, false),
//			new Car("asakldj","Tesla","Model S", "White", 21000,2600, true)
//
//	);


	private
	@Test
	void contextLoads() {
	}

	@Test
	public void testFetchingCarsByBrand(){
		when(carService.findByBrand("Tesla")).thenReturn(List.of(new Car ("Tesla")));
		Car actual = carService.findByBrand("Tesla").get(0);
		assertThat(actual.getBrand()).isEqualTo("Tesla");
	}
	@Test
	public void testFetchingCarsThatAreNotBooked(){
		when(carService.findByBookedFalse()).thenReturn(Arrays.asList(
				new Car("asakldj","Tesla","Model S", "White", 21000,2600, false),
				new Car("asakldj","Tesla","Model S", "White", 21000,2600, false),
				new Car("asakldj","VW","Model S", "White", 21000,2600, false)
		));
		int actual = carService.findByBookedFalse().size();
		assertThat(actual).isEqualTo(3);
	}

}
