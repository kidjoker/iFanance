package cn.kidjoker.common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年1月1日 - 下午12:08:05
 * @version 1.0.0
 */
public class KidPropertiesConfigurer extends PropertyPlaceholderConfigurer {
	
	private static Map<String, Object> ctxPropertiesMap;
	
	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
			throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		
		ctxPropertiesMap = new HashMap<>();
		for(Object key : props.keySet()) {
			String keyStr = key.toString();
			String value = props.getProperty(keyStr);
			ctxPropertiesMap.put(keyStr, value);
		}
	}
	
	public static Object getContextProperty(String name) {
		return ctxPropertiesMap.get(name);
	}
	
	public static void setContextProperty(String name, String value) {
		ctxPropertiesMap.put(name, value);
	}
	
	public static Map<String, Object> getContextPropertyMap() {
		return ctxPropertiesMap;
	}
}
