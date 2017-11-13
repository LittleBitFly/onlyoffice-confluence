package onlyoffice;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager
{
	
	public Properties GetProperties() throws IOException
	{
		Properties properties = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("onlyoffice-config.properties");
		if (inputStream != null)
		{
			properties.load(inputStream);
		}
		return properties;
	}
}
