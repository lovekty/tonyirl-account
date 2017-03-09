package me.tony.tonyirl.account.orm.mapper;

import java.util.List;
import me.tony.tonyirl.account.orm.domain.PasswordHistoryRelationDO;
import me.tony.tonyirl.account.orm.domain.PasswordHistoryRelationDOExample;
import org.apache.ibatis.annotations.Param;

public interface PasswordHistoryRelationDOMapper {
    long countByExample(PasswordHistoryRelationDOExample example);

    int deleteByExample(PasswordHistoryRelationDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PasswordHistoryRelationDO record);

    int insertSelective(PasswordHistoryRelationDO record);

    List<PasswordHistoryRelationDO> selectByExample(PasswordHistoryRelationDOExample example);

    PasswordHistoryRelationDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PasswordHistoryRelationDO record, @Param("example") PasswordHistoryRelationDOExample example);

    int updateByExample(@Param("record") PasswordHistoryRelationDO record, @Param("example") PasswordHistoryRelationDOExample example);

    int updateByPrimaryKeySelective(PasswordHistoryRelationDO record);

    int updateByPrimaryKey(PasswordHistoryRelationDO record);
}