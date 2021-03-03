package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0227;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0227Mapper extends BaseMapper<Formmain0227> {
    int updateBatch(List<Formmain0227> list);

    int updateBatchSelective(List<Formmain0227> list);

    int batchInsert(@Param("list") List<Formmain0227> list);

    int insertOrUpdate(Formmain0227 record);

    int insertOrUpdateSelective(Formmain0227 record);
}