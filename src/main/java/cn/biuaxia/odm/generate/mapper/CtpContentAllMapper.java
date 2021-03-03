package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.CtpContentAll;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CtpContentAllMapper extends BaseMapper<CtpContentAll> {
    int updateBatch(List<CtpContentAll> list);

    int updateBatchSelective(List<CtpContentAll> list);

    int batchInsert(@Param("list") List<CtpContentAll> list);

    int insertOrUpdate(CtpContentAll record);

    int insertOrUpdateSelective(CtpContentAll record);
}