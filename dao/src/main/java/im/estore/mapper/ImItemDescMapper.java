package im.estore.mapper;

import im.estore.dbmodel.ImItemDesc;
import im.estore.dbmodel.ImItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImItemDescMapper {
    int countByExample(ImItemDescExample example);

    int deleteByExample(ImItemDescExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(ImItemDesc record);

    int insertSelective(ImItemDesc record);

    List<ImItemDesc> selectByExampleWithBLOBs(ImItemDescExample example);

    List<ImItemDesc> selectByExample(ImItemDescExample example);

    ImItemDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") ImItemDesc record, @Param("example") ImItemDescExample example);

    int updateByExampleWithBLOBs(@Param("record") ImItemDesc record, @Param("example") ImItemDescExample example);

    int updateByExample(@Param("record") ImItemDesc record, @Param("example") ImItemDescExample example);

    int updateByPrimaryKeySelective(ImItemDesc record);

    int updateByPrimaryKeyWithBLOBs(ImItemDesc record);

    int updateByPrimaryKey(ImItemDesc record);
}