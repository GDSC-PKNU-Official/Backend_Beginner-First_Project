package gdsc_b_fp.bfp.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @GetMapping("introduce")
    @ResponseBody // return 값에 직접 넣어 출력
    public String duceApi(@RequestParam("name") String name) {
        return "안녕하세요 저는 " + name + "입니다!!";
    }

    @GetMapping("hello")
    public String hello(Model model, @RequestParam("name") String name) {
        model.addAttribute("data", name);
        return "hello"; // hello.html과 연결
    }

    // json 정보를 반환
    @GetMapping("user")
    @ResponseBody
    public User getUser(@RequestParam("name") String name, @RequestParam("id") String id) {
        return new User(name, Integer.parseInt(id));
    }
    static class User {
        private String name;
        private  int id;

        public User(String name, int id) {
            this.name = name;
            this.id = id;
        }

        // alt + insert 단축키 사용
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }
}