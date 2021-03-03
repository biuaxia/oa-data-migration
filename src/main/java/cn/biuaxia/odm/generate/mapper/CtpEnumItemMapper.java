package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.CtpEnumItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CtpEnumItemMapper extends BaseMapper<CtpEnumItem> {
    int updateBatch(List<CtpEnumItem> list);

    int updateBatchSelective(List<CtpEnumItem> list);

    int batchInsert(@Param("list") List<CtpEnumItem> list);

    int insertOrUpdate(CtpEnumItem record);

    int insertOrUpdateSelective(CtpEnumItem record);
}