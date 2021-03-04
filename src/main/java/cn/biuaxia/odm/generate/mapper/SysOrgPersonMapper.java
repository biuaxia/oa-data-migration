package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.SysOrgPerson;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysOrgPersonMapper extends BaseMapper<SysOrgPerson> {
    int updateBatch(List<SysOrgPerson> list);

    int updateBatchSelective(List<SysOrgPerson> list);

    int batchInsert(@Param("list") List<SysOrgPerson> list);

    int insertOrUpdate(SysOrgPerson record);

    int insertOrUpdateSelective(SysOrgPerson record);
}