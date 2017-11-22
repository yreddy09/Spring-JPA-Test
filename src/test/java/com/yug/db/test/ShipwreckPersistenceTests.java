package com.yug.db.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yug.db.model.Shipwreck;
import com.yug.db.repository.ShipwreckJpaRepository;

//@RunWith(SpringRunner.class)
//@SpringBootTest


@ContextConfiguration(locations = { "classpath:com/yug/db/test/applicationTests-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ShipwreckPersistenceTests {

	@Autowired
	private ShipwreckJpaRepository shipwreckJpaRepository;

	@Test
	public void createAndTestRecord() throws Exception {
		Shipwreck ship = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
		shipwreckJpaRepository.saveAndFlush(ship);
		
		ship = shipwreckJpaRepository.findOne(1L);

		assertEquals("U869", ship.getName());
	}

	@Test
	public void createAndTestRecord1() throws Exception {
		Shipwreck ship = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12,
				138.44, 1994);
		shipwreckJpaRepository.saveAndFlush(ship);

		ship = shipwreckJpaRepository.findOne(2L);

		assertEquals("Thistlegorm", ship.getName());
	}

	@Test
	public void createAndTestRecord2() throws Exception {
		Shipwreck ship = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef",
				"FAIR", 50, 44.12, 138.44, 1994);
		shipwreckJpaRepository.saveAndFlush(ship);

		ship = shipwreckJpaRepository.findOne(3L);

		assertEquals("S.S. Yongala", ship.getName());
	}

	@Test
	public void testFind() throws Exception {
		Shipwreck shipwreck = shipwreckJpaRepository.findOne(1L);

		assertEquals("U869", shipwreck.getName());
	}

	@Test
	public void testFindAll() throws Exception {
		
		List<Shipwreck> shipList = shipwreckJpaRepository.findAll();

		System.out.println("Shipwreck list: " + shipwreckJpaRepository.count());
		for (Shipwreck ship : shipList) {
			System.out.println(ship.toString());
		}

		assertEquals(3, shipList.size());
		 
	}
}
