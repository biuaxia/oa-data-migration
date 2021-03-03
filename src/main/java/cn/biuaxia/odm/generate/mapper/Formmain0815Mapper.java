package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0815;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0815Mapper extends BaseMapper<Formmain0815> {
    int updateBatch(List<Formmain0815> list);

    int updateBatchSelective(List<Formmain0815> list);

    int batchInsert(@Param("list") List<Formmain0815> list);

    int insertOrUpdate(Formmain0815 record);

    int insertOrUpdateSelective(Formmain0815 record);
}