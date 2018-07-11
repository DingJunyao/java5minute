package com.qingguatang.java5minute.course9;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * ClassName: com.qingguatang.java5minute.course9.GlobalExceptionHandler
 * Description: TODO
 *
 * @author DingJunyao
 * @version V1.0
 * @date 2018-07-11 14:36
 **/
@Controller
public class GlobalExceptionHandler implements ErrorViewResolver {

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("url", request.getRequestURL());
        mav.addAllObjects(model);
        mav.setViewName("error");
        return mav;
    }
}
