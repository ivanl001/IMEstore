package im.estore.mapper;

import im.estore.dbmodel.ImItemParamItem;
import im.estore.dbmodel.ImItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImItemParamItemMapper {
    int countByExample(ImItemParamItemExample example);

    int deleteByExample(ImItemParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImItemParamItem record);

    int insertSelective(ImItemParamItem record);

    List<ImItemParamItem> selectByExampleWithBLOBs(ImItemParamItemExample example);

    List<ImItemParamItem> selectByExample(ImItemParamItemExample example);

    ImItemParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImItemParamItem record, @Param("example") ImItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ImItemParamItem record, @Param("example") ImItemParamItemExample example);

    int updateByExample(@Param("record") ImItemParamItem record, @Param("example") ImItemParamItemExample example);

    int updateByPrimaryKeySelective(ImItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(ImItemParamItem record);

    int updateByPrimaryKey(ImItemParamItem record);
}