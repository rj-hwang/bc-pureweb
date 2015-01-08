package cn.pureweb;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dragon on 2015/1/8.
 */
public class Test01 {
    static Logger logger = LoggerFactory.getLogger(Test01.class);
    @Test
    public void test1(){
        Assert.assertEquals("/", WebUtils.getContextPath());
        System.out.println("dragon");
        logger.debug("name={}", "dragon");
    }
}
