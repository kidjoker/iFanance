package cn.kidjoker.common.util;

import java.util.Map;

/**
 * 请求服务接口
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 上午12:36:50
 * @version 1.0.0
 */
public interface IClientService {
	
	public  Map<String,String> sendAndReceive(String requestUrl, Map<String,String> params);
}
