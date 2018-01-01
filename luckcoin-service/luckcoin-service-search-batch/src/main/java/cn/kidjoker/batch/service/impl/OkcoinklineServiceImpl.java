package cn.kidjoker.batch.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.kidjoker.batch.service.isApiServiceUsable;
import cn.kidjoker.batch.service.DTO.ApiDataContext;
import cn.kidjoker.common.annotations.HostName;
import cn.kidjoker.common.annotations.ServiceName;

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
public class OkcoinklineServiceImpl extends AbstractApiSearchService implements isApiServiceUsable {

	@Override
	protected Map<String, List<String>> organizeRequestParam() {
		
		return param;
	}
	
	@Override
	protected ApiDataContext doSearchData(String requestUrl, Map<String, List<String>> param) {
		return null;
	}

	@Override
	protected void save2DB(ApiDataContext Ddata) {
	}

	@Override
	protected void save2CSV(ApiDataContext Ddata) throws IOException {
	}

}
