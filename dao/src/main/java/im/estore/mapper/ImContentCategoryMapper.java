package im.estore.mapper;

import im.estore.dbmodel.ImContentCategory;
import im.estore.dbmodel.ImContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImContentCategoryMapper {

    int countByExample(ImContentCategoryExample example);

    int deleteByExample(ImContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImContentCategory record);

    int insertSelective(ImContentCategory record);

    List<ImContentCategory> selectByExample(ImContentCategoryExample example);

    ImContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImContentCategory record, @Param("example") ImContentCategoryExample example);

    int updateByExample(@Param("record") ImContentCategory record, @Param("example") ImContentCategoryExample example);

    int updateByPrimaryKeySelective(ImContentCategory record);

    int updateByPrimaryKey(ImContentCategory record);

}