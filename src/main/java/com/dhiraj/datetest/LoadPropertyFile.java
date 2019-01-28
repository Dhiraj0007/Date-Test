package com.dhiraj.datetest;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

@Component
public class LoadPropertyFile {

	public static Properties getAppProperties() {
		Resource appconstants = new ClassPathResource("appconstants.properties");
		try {
			final Properties appconstants_info = PropertiesLoaderUtils.loadProperties(appconstants);
			return appconstants_info;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Properties getProjectInfoProperties() {
		try {
			Resource project_infoResource = new ClassPathResource("dbconfiguration.properties");
			Properties project_info = PropertiesLoaderUtils.loadProperties(project_infoResource);
			return project_info;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
