package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.EdocExchangeAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EdocExchangeAccountMapper extends BaseMapper<EdocExchangeAccount> {

    int updateBatch(List<EdocExchangeAccount> list);

    int updateBatchSelective(List<EdocExchangeAccount> list);

    int batchInsert(@Param("list") List<EdocExchangeAccount> list);

    int insertOrUpdate(EdocExchangeAccount record);

    int insertOrUpdateSelective(EdocExchangeAccount record);
}