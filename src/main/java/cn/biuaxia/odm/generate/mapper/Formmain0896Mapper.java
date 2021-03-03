package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0896;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0896Mapper extends BaseMapper<Formmain0896> {
    int updateBatch(List<Formmain0896> list);

    int updateBatchSelective(List<Formmain0896> list);

    int batchInsert(@Param("list") List<Formmain0896> list);

    int insertOrUpdate(Formmain0896 record);

    int insertOrUpdateSelective(Formmain0896 record);
}