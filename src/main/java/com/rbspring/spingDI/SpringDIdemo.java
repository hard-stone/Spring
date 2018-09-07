package com.rbspring.spingDI;

import com.rbspring.spingDI.personImp.TeacherImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用一个帮助类注入对象
 * Created by renbin on 2018/8/6.
 */
public class SpringDIdemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springDIcontext.xml");
        OutputHelper outputHelper = context.getBean(OutputHelper.class);
        outputHelper.printpersonifo();
        TeacherImp teacher = (TeacherImp) context.getBean("TeacherImp");
        TeacherImp teacher2 = (TeacherImp) context.getBean("teacher2");
        teacher.outpersonage();
        teacher.outpersonname();
        teacher2.outpersonage();
        teacher2.outpersonname();
    }
}
