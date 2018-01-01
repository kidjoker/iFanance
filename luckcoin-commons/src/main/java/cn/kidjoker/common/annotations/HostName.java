package cn.kidjoker.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用注解识别主机名称
 *
 * @auther KidjokeR
 * @since 2017年12月30日 - 下午11:52:22
 * @version 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface HostName {
	
	public String hostName();
	
}

