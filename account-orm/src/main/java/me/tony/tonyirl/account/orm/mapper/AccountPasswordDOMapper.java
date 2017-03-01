package me.tony.tonyirl.account.orm.mapper;

import java.util.List;
import me.tony.tonyirl.account.orm.domain.AccountPasswordDO;
import me.tony.tonyirl.account.orm.domain.AccountPasswordDOExample;
import org.apache.ibatis.annotations.Param;

public interface AccountPasswordDOMapper {
    long countByExample(AccountPasswordDOExample example);

    int deleteByExample(AccountPasswordDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountPasswordDO record);

    int insertSelective(AccountPasswordDO record);

    List<AccountPasswordDO> selectByExample(AccountPasswordDOExample example);

    AccountPasswordDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountPasswordDO record, @Param("example") AccountPasswordDOExample example);

    int updateByExample(@Param("record") AccountPasswordDO record, @Param("example") AccountPasswordDOExample example);

    int updateByPrimaryKeySelective(AccountPasswordDO record);

    int updateByPrimaryKey(AccountPasswordDO record);
}