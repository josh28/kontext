package org.kontext.common.repositories;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import static org.kontext.common.repositories.PropertiesRepositoryConstants.*;

import org.kontext.common.repositories.exception.PropertiesRepositoryException;

public class PropertiesRepositoryImplTest {
	PropertiesRepository propRepo;

	public PropertiesRepositoryImplTest() throws PropertiesRepositoryException {
		propRepo = PropertiesRepositoryImpl.getPropsRepo();
		Assert.assertNotNull(propRepo.getAllProperties());
	}
	
	@Test
	public void testLoad() {
		String value = propRepo.read(cassandra_document_table);
		Assert.assertNotNull(value);
	}
	
	@BeforeClass
	public void beforeClass() {

	}

	@AfterClass
	public void afterClass() {
		propRepo.clear();
	}

}
