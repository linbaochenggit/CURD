package cn.lbc.error;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 时间
 *
 * @date 2020/9/23 21:30
 */
public class ExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String ex=null;
        if(e instanceof Exceptions){
            ex=((Exceptions)e).getEx();
        }else{
            ex="未知错误";
        }

        ModelAndView mv=new ModelAndView();
        mv.addObject("erro", ex);
        mv.setViewName("err.jsp");
        return mv;
    }
}
