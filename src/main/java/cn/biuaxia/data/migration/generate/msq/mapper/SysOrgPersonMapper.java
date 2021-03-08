package cn.biuaxia.data.migration.generate.msq.mapper;

import cn.biuaxia.data.migration.generate.msq.domain.SysOrgPerson;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrgPersonMapper extends BaseMapper<SysOrgPerson> {
    int updateBatch(List<SysOrgPerson> list);

    int updateBatchSelective(List<SysOrgPerson> list);

    int batchInsert(@Param("list") List<SysOrgPerson> list);

    int insertOrUpdate(SysOrgPerson record);

    int insertOrUpdateSelective(SysOrgPerson record);
}