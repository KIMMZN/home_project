package company.company_project.Controller;

import company.company_project.service.IF_board_service;
import company.company_project.vo.boardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class Home_Controller {

    private final IF_board_service ifboardservice;


    @GetMapping(value = "/home")
    public String home()throws Exception {

        System.out.println("Home_Controller");
        return "home";
    }

    @GetMapping(value = "/board")
    public String board(Model model)throws Exception {

        List<boardVO> boardvolist = ifboardservice.viewAll();

        model.addAttribute("boardvolist", boardvolist);
        System.out.println(boardvolist.size()+ boardvolist.toString());
        System.out.println(boardvolist);
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
        return "redirect:/board";
    }


    @GetMapping(value = "/gj_preview/{board_num}")
    public String gj_preview(@PathVariable("board_num") int num, Model model)throws Exception {

        System.out.println(num + "  게시글넘버");
        //조회수
        ifboardservice.readBoard(num);
        //내용 옮기기
        boardVO boardvo = ifboardservice.viewOne(num);
        model.addAttribute("boardvo", boardvo);
        System.out.println(boardvo.toString() + "boardvo");
        return "announce_pre";
    }

    //자유게시판
    @GetMapping(value = "/board/free_board")
    public String board_free_board(Model model)throws Exception {


        return "free_board";
    }
}
