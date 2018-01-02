package cn.kidjoker.batch.service.impl;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.kidjoker.batch.service.DTO.ApiDataContext;
import cn.kidjoker.common.annotations.HostName;
import cn.kidjoker.common.annotations.ServiceName;
import cn.kidjoker.common.param.CommonParam;

/**
 *
 *
 * @auther KidjokeR
 * @since 2017年12月30日 - 下午1:09:42
 * @version 1.0.0
 */
@Service
@HostName(hostName="okcoin")
@ServiceName(serviceName="/kline.do")
public class OkcoinklineServiceImpl extends AbstractApiSearchService {

	@Override
	protected Map<String, String> organizeRequestParam() {
		Map<String, String> reqMap = super.organizeRequestParam();
		reqMap.put("type", "0.5min");
		
		return reqMap;
	}
	
	@SuppressWarnings("unused")
	@Override
	protected void doSearchData(String requestUrl, Map<String, String> reqMap) {
		
		String coinTypeStr = reqMap.get("symbol");
		String[] coinTypes = coinTypeStr.split(CommonParam.PATTERN);
		
		for(String coinType : coinTypes) {
			reqMap.put("symbol", coinType);
			reqMap.put("type", "1min");
			Map<String, String> retMap = httpClient.sendAndReceive(requestUrl, reqMap);
		}
	}

	@Override
	protected void save2DB(ApiDataContext Ddata) {
	}

	@Override
	protected void save2CSV(ApiDataContext Ddata) throws IOException {
	}

}
