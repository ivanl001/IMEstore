package im.estore.mapper;

import im.estore.dbmodel.ImOrder;
import im.estore.dbmodel.ImOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImOrderMapper {
    int countByExample(ImOrderExample example);

    int deleteByExample(ImOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(ImOrder record);

    int insertSelective(ImOrder record);

    List<ImOrder> selectByExample(ImOrderExample example);

    ImOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ImOrder record, @Param("example") ImOrderExample example);

    int updateByExample(@Param("record") ImOrder record, @Param("example") ImOrderExample example);

    int updateByPrimaryKeySelective(ImOrder record);

    int updateByPrimaryKey(ImOrder record);
}