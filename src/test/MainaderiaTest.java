package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ex_02.MainaderiaList;
import p0_material.Criatura;
import p0_material.Mainaderia;

public class MainaderiaTest {
	private Mainaderia aparcaNens;
	
	@Before
	public void setUp() throws Exception {
        Criatura [] poblacio = {
                new Criatura("NIL",0,Criatura.NEN),
                new Criatura("PERE",1, Criatura.NEN),
                new Criatura("NEUS",0, Criatura.NENA),
                new Criatura("ONA",1, Criatura.NENA),
                new Criatura("DÍDAC",0, Criatura.NEN),
                new Criatura("MARIONA",1, Criatura.NENA),
                new Criatura("EVA",3, Criatura.NENA),
                new Criatura("FIONA",2, Criatura.NENA),
                new Criatura("ENIA",3, Criatura.NENA)
            };
            
            aparcaNens = new MainaderiaList();
            
            //matriculem tota la poblacio infantil
            for (int i=0; i<poblacio.length; i++) {
                aparcaNens.matricular(poblacio[i]);
            }

	}

	@Test
	public void testNumCriatures() {
		assertTrue(aparcaNens.numCriatures()==9);
	}

	@Test 
	public void testQuantsSexe() {
		assertTrue(aparcaNens.quantsSexe(Criatura.NEN)==3);
		assertTrue(aparcaNens.quantsSexe(Criatura.NENA)==6);
	}
}
