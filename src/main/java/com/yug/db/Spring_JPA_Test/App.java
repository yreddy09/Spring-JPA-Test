package com.yug.db.Spring_JPA_Test;

import org.springframework.beans.factory.annotation.Autowired;

import com.yug.db.model.Shipwreck;
import com.yug.db.repository.ShipwreckJpaRepository;

/**
 * Hello world!
 *
 */
public class App 
{
	@Autowired
	public static ShipwreckJpaRepository shipwreckJpaRepository;

	public Shipwreck getShipwreckDetails(Long id) {
		Shipwreck ship = shipwreckJpaRepository.findOne(id);
		System.out.println(ship);

		return ship;
	}

    public static void main( String[] args )
    {
		System.out.println("Hello World!");
		// SpringApplication.run(App.class, args);
		// App myApp = new App();
		// Shipwreck ship = myApp.getShipwreckDetails(2L);

		// Shipwreck ship = shipwreckJpaRepository.findOne(2L);
		// System.out.println(ship);
    }
}
