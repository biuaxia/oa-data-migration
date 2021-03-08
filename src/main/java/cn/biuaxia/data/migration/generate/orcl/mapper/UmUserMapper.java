package cn.biuaxia.data.migration.generate.orcl.mapper;

import cn.biuaxia.data.migration.generate.orcl.domain.UmUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmUserMapper extends BaseMapper<UmUser> {
    int updateBatch(List<UmUser> list);

    int updateBatchSelective(List<UmUser> list);

    int batchInsert(@Param("list") List<UmUser> list);

    int insertOrUpdate(UmUser record);

    int insertOrUpdateSelective(UmUser record);
}