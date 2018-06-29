package im.estore.mapper;

import im.estore.dbmodel.ImOrderItem;
import im.estore.dbmodel.ImOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImOrderItemMapper {
    int countByExample(ImOrderItemExample example);

    int deleteByExample(ImOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(ImOrderItem record);

    int insertSelective(ImOrderItem record);

    List<ImOrderItem> selectByExample(ImOrderItemExample example);

    ImOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ImOrderItem record, @Param("example") ImOrderItemExample example);

    int updateByExample(@Param("record") ImOrderItem record, @Param("example") ImOrderItemExample example);

    int updateByPrimaryKeySelective(ImOrderItem record);

    int updateByPrimaryKey(ImOrderItem record);
}