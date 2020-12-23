package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

  @GetMapping("hello") // GET /hello 요청이 들어오면 이 메서드를 수행한다.
  public String hello(Model model) {
    model.addAttribute("data", "spring!!");
    return "hello";
  }

  @GetMapping("hello-mvc")
  public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("name", name);
    return "hello-template";
  }
}