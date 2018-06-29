package im.estore.mapper;

import im.estore.dbmodel.ImItem;
import im.estore.dbmodel.ImItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImItemMapper {
    int countByExample(ImItemExample example);

    int deleteByExample(ImItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImItem record);

    int insertSelective(ImItem record);

    List<ImItem> selectByExample(ImItemExample example);

    ImItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImItem record, @Param("example") ImItemExample example);

    int updateByExample(@Param("record") ImItem record, @Param("example") ImItemExample example);

    int updateByPrimaryKeySelective(ImItem record);

    int updateByPrimaryKey(ImItem record);
}