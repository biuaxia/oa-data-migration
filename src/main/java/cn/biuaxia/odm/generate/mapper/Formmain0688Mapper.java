package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0688;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0688Mapper extends BaseMapper<Formmain0688> {
    int updateBatch(List<Formmain0688> list);

    int updateBatchSelective(List<Formmain0688> list);

    int batchInsert(@Param("list") List<Formmain0688> list);

    int insertOrUpdate(Formmain0688 record);

    int insertOrUpdateSelective(Formmain0688 record);
}