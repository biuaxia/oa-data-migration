package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0017;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0017Mapper extends BaseMapper<Formmain0017> {
    int updateBatch(List<Formmain0017> list);

    int updateBatchSelective(List<Formmain0017> list);

    int batchInsert(@Param("list") List<Formmain0017> list);

    int insertOrUpdate(Formmain0017 record);

    int insertOrUpdateSelective(Formmain0017 record);
}