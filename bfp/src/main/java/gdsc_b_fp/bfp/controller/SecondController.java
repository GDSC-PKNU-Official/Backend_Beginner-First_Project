package gdsc_b_fp.bfp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class SecondController {
    private List<String> users = new ArrayList<>(); // 사용자 목록 저장 리스트
    // 사용자 추가
    @PostMapping("/add")
    public String addUser(@RequestParam("user") String user) {
        if (user == null || user.isEmpty()) {
            throw new IllegalArgumentException("Name parameter is required");
        }
        users.add(user);
        return "사용자 추가: " + user;
    }
    // 사용자 조회
    @GetMapping("/list")
    public List<String> listUsers() {
        return users;
    }

    // 사용자 삭제
    @DeleteMapping("/delete-all")
    public String deleteAll() {
        users.clear();
        return "Deleted all users.";
    }
}
