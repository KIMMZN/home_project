package company.company_project.Repository;

import company.company_project.vo.boardVO;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface IF_Reopository {

    public abstract void insertOne(boardVO boardvo) throws Exception;
    public List<boardVO> listAll() throws Exception;
    public void updateHits(int num)throws Exception;
    //게시글 보기
    public boardVO selectOne(int num)throws Exception;
    //삭제
    public void deleteOne(int number)throws Exception;

}
