package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.SysOrgElement;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysOrgElementMapper extends BaseMapper<SysOrgElement> {
    int updateBatch(List<SysOrgElement> list);

    int updateBatchSelective(List<SysOrgElement> list);

    int batchInsert(@Param("list") List<SysOrgElement> list);

    int insertOrUpdate(SysOrgElement record);

    int insertOrUpdateSelective(SysOrgElement record);
}