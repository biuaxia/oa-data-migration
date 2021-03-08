package cn.biuaxia.data.migration.generate.orcl.mapper;

import cn.biuaxia.data.migration.generate.orcl.domain.UmOrganization;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmOrganizationMapper extends BaseMapper<UmOrganization> {
    int updateBatch(List<UmOrganization> list);

    int updateBatchSelective(List<UmOrganization> list);

    int batchInsert(@Param("list") List<UmOrganization> list);

    int insertOrUpdate(UmOrganization record);

    int insertOrUpdateSelective(UmOrganization record);
}