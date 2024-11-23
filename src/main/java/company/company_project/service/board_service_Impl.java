package company.company_project.service;

import company.company_project.Repository.IF_Reopository;
import company.company_project.vo.boardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class board_service_Impl implements IF_board_service {

     @Autowired
     IF_Reopository ifrepository;


    @Override
    public void writeOne(boardVO boardvo) throws Exception {

                ifrepository.insertOne(boardvo);

    }
}
