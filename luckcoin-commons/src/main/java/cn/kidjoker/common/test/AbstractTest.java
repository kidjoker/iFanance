/** work for life!
 * 
 */
package cn.kidjoker.common.test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @author kidjoker
 *
 * @date 2017年12月17日 
 */
@RunWith(JUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@ContextConfiguration(locations = { "classpath*:META-INF/spring/*.xml" }) 
public class AbstractTest implements ApplicationContextAware {
	
	protected ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
	
	@Before
	public final void beforeTest() {

		this.beforeInner();

	}

	protected void beforeInner() {

	}

	@After
	public final void afterTest() {

		this.afterInner();
	}

	protected void afterInner() {

	}
	
}
