package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.CtpEnumItemCn;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CtpEnumItemCnMapper extends BaseMapper<CtpEnumItemCn> {
    int updateBatch(List<CtpEnumItemCn> list);

    int updateBatchSelective(List<CtpEnumItemCn> list);

    int batchInsert(@Param("list") List<CtpEnumItemCn> list);

    int insertOrUpdate(CtpEnumItemCn record);

    int insertOrUpdateSelective(CtpEnumItemCn record);
}