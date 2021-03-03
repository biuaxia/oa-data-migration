package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0846;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0846Mapper extends BaseMapper<Formmain0846> {
    int updateBatch(List<Formmain0846> list);

    int updateBatchSelective(List<Formmain0846> list);

    int batchInsert(@Param("list") List<Formmain0846> list);

    int insertOrUpdate(Formmain0846 record);

    int insertOrUpdateSelective(Formmain0846 record);
}