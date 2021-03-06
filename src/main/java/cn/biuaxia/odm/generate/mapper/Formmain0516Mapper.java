package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0516;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0516Mapper extends BaseMapper<Formmain0516> {
    int updateBatch(List<Formmain0516> list);

    int updateBatchSelective(List<Formmain0516> list);

    int batchInsert(@Param("list") List<Formmain0516> list);

    int insertOrUpdate(Formmain0516 record);

    int insertOrUpdateSelective(Formmain0516 record);
}