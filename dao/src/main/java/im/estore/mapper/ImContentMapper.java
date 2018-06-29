package im.estore.mapper;

import im.estore.dbmodel.ImContent;
import im.estore.dbmodel.ImContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImContentMapper {
    int countByExample(ImContentExample example);

    int deleteByExample(ImContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImContent record);

    int insertSelective(ImContent record);

    List<ImContent> selectByExampleWithBLOBs(ImContentExample example);

    List<ImContent> selectByExample(ImContentExample example);

    ImContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImContent record, @Param("example") ImContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ImContent record, @Param("example") ImContentExample example);

    int updateByExample(@Param("record") ImContent record, @Param("example") ImContentExample example);

    int updateByPrimaryKeySelective(ImContent record);

    int updateByPrimaryKeyWithBLOBs(ImContent record);

    int updateByPrimaryKey(ImContent record);
}