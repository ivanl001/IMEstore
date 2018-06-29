package im.estore.mapper;

import im.estore.dbmodel.ImOrderShipping;
import im.estore.dbmodel.ImOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImOrderShippingMapper {
    int countByExample(ImOrderShippingExample example);

    int deleteByExample(ImOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(ImOrderShipping record);

    int insertSelective(ImOrderShipping record);

    List<ImOrderShipping> selectByExample(ImOrderShippingExample example);

    ImOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ImOrderShipping record, @Param("example") ImOrderShippingExample example);

    int updateByExample(@Param("record") ImOrderShipping record, @Param("example") ImOrderShippingExample example);

    int updateByPrimaryKeySelective(ImOrderShipping record);

    int updateByPrimaryKey(ImOrderShipping record);
}