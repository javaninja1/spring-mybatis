package mybatis.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Config {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/config")
    public ModelAndView hello() {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        
        List<String> beans =  Arrays.asList(beanNames);
//                        .stream()
//        .map(e -> e + " : " + applicationContext.getBean(e).getClass().toString())
//        .collect(Collectors.toList());
        
        ModelAndView mav = new ModelAndView("config");
        mav.addObject("beans", beans);
        return mav;
    }
}