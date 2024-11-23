package company.company_project.Repository;

import company.company_project.vo.boardVO;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IF_Reopository {

    public abstract void insertOne(boardVO boardvo) throws Exception;

}
