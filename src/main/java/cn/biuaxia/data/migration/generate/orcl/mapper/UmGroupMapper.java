package cn.biuaxia.data.migration.generate.orcl.mapper;

import cn.biuaxia.data.migration.generate.orcl.domain.UmGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmGroupMapper extends BaseMapper<UmGroup> {
    int updateBatch(List<UmGroup> list);

    int updateBatchSelective(List<UmGroup> list);

    int batchInsert(@Param("list") List<UmGroup> list);

    int insertOrUpdate(UmGroup record);

    int insertOrUpdateSelective(UmGroup record);
}