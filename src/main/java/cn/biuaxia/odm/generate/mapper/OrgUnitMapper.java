package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.OrgUnit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrgUnitMapper extends BaseMapper<OrgUnit> {
    int updateBatch(List<OrgUnit> list);

    int updateBatchSelective(List<OrgUnit> list);

    int batchInsert(@Param("list") List<OrgUnit> list);

    int insertOrUpdate(OrgUnit record);

    int insertOrUpdateSelective(OrgUnit record);
}