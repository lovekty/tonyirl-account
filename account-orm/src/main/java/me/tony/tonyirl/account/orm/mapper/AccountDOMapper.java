package me.tony.tonyirl.account.orm.mapper;

import java.util.List;
import me.tony.tonyirl.account.orm.domain.AccountDO;
import me.tony.tonyirl.account.orm.domain.AccountDOExample;
import org.apache.ibatis.annotations.Param;

public interface AccountDOMapper {
    long countByExample(AccountDOExample example);

    int deleteByExample(AccountDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountDO record);

    int insertSelective(AccountDO record);

    List<AccountDO> selectByExample(AccountDOExample example);

    AccountDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountDO record, @Param("example") AccountDOExample example);

    int updateByExample(@Param("record") AccountDO record, @Param("example") AccountDOExample example);

    int updateByPrimaryKeySelective(AccountDO record);

    int updateByPrimaryKey(AccountDO record);
}