package im.estore.mapper;

import im.estore.dbmodel.ImItemCat;
import im.estore.dbmodel.ImItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImItemCatMapper {
    int countByExample(ImItemCatExample example);

    int deleteByExample(ImItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImItemCat record);

    int insertSelective(ImItemCat record);

    List<ImItemCat> selectByExample(ImItemCatExample example);

    ImItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImItemCat record, @Param("example") ImItemCatExample example);

    int updateByExample(@Param("record") ImItemCat record, @Param("example") ImItemCatExample example);

    int updateByPrimaryKeySelective(ImItemCat record);

    int updateByPrimaryKey(ImItemCat record);
}