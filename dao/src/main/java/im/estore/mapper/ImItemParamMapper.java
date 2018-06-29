package im.estore.mapper;

import im.estore.dbmodel.ImItemParam;
import im.estore.dbmodel.ImItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImItemParamMapper {
    int countByExample(ImItemParamExample example);

    int deleteByExample(ImItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImItemParam record);

    int insertSelective(ImItemParam record);

    List<ImItemParam> selectByExampleWithBLOBs(ImItemParamExample example);

    List<ImItemParam> selectByExample(ImItemParamExample example);

    ImItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImItemParam record, @Param("example") ImItemParamExample example);

    int updateByExampleWithBLOBs(@Param("record") ImItemParam record, @Param("example") ImItemParamExample example);

    int updateByExample(@Param("record") ImItemParam record, @Param("example") ImItemParamExample example);

    int updateByPrimaryKeySelective(ImItemParam record);

    int updateByPrimaryKeyWithBLOBs(ImItemParam record);

    int updateByPrimaryKey(ImItemParam record);
}