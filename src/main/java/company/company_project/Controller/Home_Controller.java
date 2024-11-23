package company.company_project.Controller;

import company.company_project.service.IF_board_service;
import company.company_project.vo.boardVO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class Home_Controller {

    private final IF_board_service ifboardservice;


    @GetMapping(value = "/home")
    public String home() {

        System.out.println("Home_Controller");
        return "home";
    }

    @GetMapping(value = "/board")
    public String board() {

        return "board";
    }

    @GetMapping(value = "/write_gj")
    public String write_gj() {

        return "write_gj";
    }

    @GetMapping(value = "/board_write_one")
    public String board_write_one(@ModelAttribute boardVO boardvo)throws Exception {
        ifboardservice.writeOne(boardvo);

        System.out.println(boardvo.toString());
        return "write_gj";
    }
}
