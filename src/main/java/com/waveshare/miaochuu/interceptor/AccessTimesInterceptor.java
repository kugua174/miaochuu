package com.waveshare.miaochuu.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AccessTimesInterceptor implements HandlerInterceptor {
//    private StringRedisTemplate stringRedisTemplate;
//    private ValueOperations<String, String> ops;
//
//    @Autowired
//    public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
//        this.stringRedisTemplate = stringRedisTemplate;
//        ops=stringRedisTemplate.opsForValue();
//    }
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        ops.setIfAbsent(request.getRequestURI(), "1");
//        ops.increment(request.getRequestURI());
//        return true;
//    }
}
