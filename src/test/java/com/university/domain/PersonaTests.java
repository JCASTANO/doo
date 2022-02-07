package com.university.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PersonaTests {

	@Test
	@DisplayName("Deberia crear correctamente la persona")
	void creacionCorrectaTest() {
		Persona persona = new Persona();
		persona.setNombre("juan");
		persona.setApellido("castaño");
		persona.setFechaDeNacimiento(LocalDate.now());
		persona.setTelefonoFijo(2949438);

		//testdatabuilder
		//triple a
	}

}
