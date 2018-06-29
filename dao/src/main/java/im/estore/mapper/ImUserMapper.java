package im.estore.mapper;

import im.estore.dbmodel.ImUser;
import im.estore.dbmodel.ImUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImUserMapper {
    int countByExample(ImUserExample example);

    int deleteByExample(ImUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImUser record);

    int insertSelective(ImUser record);

    List<ImUser> selectByExample(ImUserExample example);

    ImUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImUser record, @Param("example") ImUserExample example);

    int updateByExample(@Param("record") ImUser record, @Param("example") ImUserExample example);

    int updateByPrimaryKeySelective(ImUser record);

    int updateByPrimaryKey(ImUser record);
}