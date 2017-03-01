package me.tony.tonyirl.account.orm.mapper;

import java.util.List;
import me.tony.tonyirl.account.orm.domain.PasswordHistoryRelation;
import me.tony.tonyirl.account.orm.domain.PasswordHistoryRelationExample;
import org.apache.ibatis.annotations.Param;

public interface PasswordHistoryRelationMapper {
    long countByExample(PasswordHistoryRelationExample example);

    int deleteByExample(PasswordHistoryRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PasswordHistoryRelation record);

    int insertSelective(PasswordHistoryRelation record);

    List<PasswordHistoryRelation> selectByExample(PasswordHistoryRelationExample example);

    PasswordHistoryRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PasswordHistoryRelation record, @Param("example") PasswordHistoryRelationExample example);

    int updateByExample(@Param("record") PasswordHistoryRelation record, @Param("example") PasswordHistoryRelationExample example);

    int updateByPrimaryKeySelective(PasswordHistoryRelation record);

    int updateByPrimaryKey(PasswordHistoryRelation record);
}