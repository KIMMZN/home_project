package company.company_project.service;

import company.company_project.vo.boardVO;

import java.util.List;

public interface IF_board_service {

    public void writeOne(boardVO boardvo)throws Exception;
    public List<boardVO> viewAll()throws Exception;
    //조회수
    public void readBoard(int num)throws Exception;
    //게시글보기
    public boardVO viewOne(int num)throws Exception;
    //선택 게시글 삭제
    public void delOne(int number)throws Exception;

}
