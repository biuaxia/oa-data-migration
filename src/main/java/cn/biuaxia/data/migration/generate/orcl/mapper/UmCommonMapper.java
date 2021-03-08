package cn.biuaxia.data.migration.generate.orcl.mapper;

import cn.biuaxia.data.migration.generate.orcl.domain.UmCommon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmCommonMapper extends BaseMapper<UmCommon> {
    int updateBatch(List<UmCommon> list);

    int updateBatchSelective(List<UmCommon> list);

    int batchInsert(@Param("list") List<UmCommon> list);

    int insertOrUpdate(UmCommon record);

    int insertOrUpdateSelective(UmCommon record);
}