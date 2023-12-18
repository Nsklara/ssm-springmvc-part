package com.sh.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: SH
 * @Date: 2023/12/13 19:51
 */
@Controller
@RequestMapping("cookie")
@ResponseBody
public class CookieController {

    //@CookieValue(value = "cookieName")注解: 表明该参数用于接收key/name为 cookieName 的参数
    @RequestMapping("data")
    public String cookieData(@CookieValue(value = "cookie1") String value) {
        System.out.println("value = " + value);
        return value;
    }

    @GetMapping("save")
    public String save(HttpServletResponse response) {
        Cookie cookie = new Cookie("cookie1", "value1=root");
        response.addCookie(cookie);
        return "Ok";
    }
}
