package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0285;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0285Mapper extends BaseMapper<Formmain0285> {
    int updateBatch(List<Formmain0285> list);

    int updateBatchSelective(List<Formmain0285> list);

    int batchInsert(@Param("list") List<Formmain0285> list);

    int insertOrUpdate(Formmain0285 record);

    int insertOrUpdateSelective(Formmain0285 record);
}