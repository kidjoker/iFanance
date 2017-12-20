package cn.kidjoker.common.util;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 请求服务类
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 上午12:38:01
 * @version 1.0.0
 */
@Service
public class ClientService implements IClientService {
	
	private final Logger logger = LoggerFactory.getLogger(ClientService.class);

	@Override
	public Map<String, String> sendAndReceive(Map<String, String> params, String requestUrl) {
		
		String jsonStr = this.send(params, requestUrl);
		
		@SuppressWarnings("unchecked")
		Map<String, String> retMap = JacksonUtils.getObjectFromJsonStr(jsonStr, Map.class);
		if(retMap == null){
			logger.error("系统调用错误");
		}
		return retMap;
	}
	
	@SuppressWarnings("unused")
	private String send(Map<String,String> params,String requestUrl) {
		
		logger.info("请求参数为:->{};请求接口->[{}]", new Object[] { params, requestUrl });
		String jsonStr = HttpUtils.httpsGet(requestUrl, params);
		if (null == jsonStr) {
			logger.error("系统调用错误");
		}
		logger.info("内部系统请求结束,响应参数为:->{};请求接口->[{}]", new Object[] { jsonStr, requestUrl });
		return jsonStr;
	}

}
