package com.community.day0928.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Name;

/**
 * @author r_dong
 * @create 2019—09—29 17:28
 *
 * 输入：
 * http://localhost:8080/hello?name=dr
 * 输出：
 * Hello，dr！
 */
@Controller //允许一个类接受前端的一个请求
public class HelloController {

    @GetMapping("/hello")
    //@RequestParam 请求一个参数
    public String hello(@RequestParam(name ="name") String name, Model model){
        model.addAttribute("name", name);   //将请求的name放入Model里面
        return "hello";
    }
}
