package org.tyaa.demo.java.webmvc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String index() {
        return "about-page.html";
    }
}
