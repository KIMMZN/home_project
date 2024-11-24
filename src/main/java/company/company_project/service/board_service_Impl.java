package company.company_project.service;

import company.company_project.Repository.IF_Reopository;
import company.company_project.vo.boardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class board_service_Impl implements IF_board_service {


     private final IF_Reopository ifrepository;


    @Override
    public void writeOne(boardVO boardvo) throws Exception {

                ifrepository.insertOne(boardvo);

    }

    @Override
    public List<boardVO> viewAll() throws Exception {
        List<boardVO> lista = ifrepository.listAll();
        System.out.println(lista + "서비스단 리스트 확인");
        return lista;
    }
    
    //하나보기
    @Override
    public void readBoard(int num) throws Exception {

        ifrepository.updateHits(num);

    }
    //선택 게시글 보기
    @Override
    public boardVO viewOne(int num) throws Exception {

        return ifrepository.selectOne(num);
    }


}
