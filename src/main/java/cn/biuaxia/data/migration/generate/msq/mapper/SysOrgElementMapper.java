package cn.biuaxia.data.migration.generate.msq.mapper;

import cn.biuaxia.data.migration.generate.msq.domain.SysOrgElement;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrgElementMapper extends BaseMapper<SysOrgElement> {
    int updateBatch(List<SysOrgElement> list);

    int updateBatchSelective(List<SysOrgElement> list);

    int batchInsert(@Param("list") List<SysOrgElement> list);

    int insertOrUpdate(SysOrgElement record);

    int insertOrUpdateSelective(SysOrgElement record);
}