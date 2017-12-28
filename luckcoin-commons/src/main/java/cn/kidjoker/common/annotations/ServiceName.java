package cn.kidjoker.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用注解识别具体服务名称
 *
 * @auther KidjokeR
 * @since 2017年12月28日 - 下午10:38:56
 * @version 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ServiceName {
	
	public String serviceName();
}
