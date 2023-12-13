package com.sh.cookie;

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

    @RequestMapping("data")
    public String cookieData(@CookieValue(value = "cookieName") String value) {
        System.out.println("value = " + value);
        return value;
    }

    @GetMapping("save")
    public String save() {
        return null;
    }
}
