package cm.kidjoker.batch.processor.builder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import cn.kidjoker.batch.service.BatchSearchService;
import cn.kidjoker.batch.service.isApiServiceUsable;
import cn.kidjoker.batch.service.impl.AbstractApiSearchService;
import cn.kidjoker.common.annotations.ServiceName;

/**
 *
 *
 * @auther KidjokeR
 * @since 2017年12月29日 - 上午12:24:45
 * @version 1.0.0
 */
@Service
public class ApiServiceProcessorBuilder implements BeanPostProcessor,BatchSearchService {
	
	private Map<String, AbstractApiSearchService> apiServiceContainer = new HashMap<>();

	@Override
	public void execute() throws Exception {
		for(AbstractApiSearchService apiService : apiServiceContainer.values()) {
			//apiService.
		}
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof isApiServiceUsable) {
			AbstractApiSearchService apiSearchService = (AbstractApiSearchService) bean;
			this.apiServiceContainer.put(bean.getClass().getAnnotation(ServiceName.class).serviceName(), apiSearchService);
		}
		return bean;
	}

}
