package com.example.shop.bean;

import org.apache.catalina.core.ApplicationContext;

public class BeanTest {

    ApplicationContext applicationContext = new ApplicationContext(TestConfig.class);
    @Test
    public void getAllBeanTest(); {
        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        Assertions.assertThat(applicationContext.getBeanDefinitionNames()).contains("myBean");
    }

    @Test
    public void getOneBeanTest(){
        myBean myBean1 = applicationContext.getBean(MyBean.class);
        MyBean myBean2 = applicationContext.getBean(MyBean.class);
        MyBean myBean3 = new MyBean();

        System.out.println(myBean1);
        System.out.println(myBean2);
        System.out.println(myBean3);

        Assertions.assertThat(myBean1).isSameAs(myBean2);
    }
}
