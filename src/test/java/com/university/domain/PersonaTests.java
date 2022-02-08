package com.university.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PersonaTests {

	@Test
	@DisplayName("Deberia crear correctamente la persona")
	void creacionCorrectaTest() {
		Persona persona = Persona.of("juan","107877192","kjskaa", LocalDate.now() , "direccion");
		persona.setNombre("juan");
		persona.setApellido("castaño");
		//persona.setFechaDeNacimiento(LocalDate.now());
		persona.setTelefonoFijo(2949438);

		//testdatabuilder
		//triple a
	}

}
