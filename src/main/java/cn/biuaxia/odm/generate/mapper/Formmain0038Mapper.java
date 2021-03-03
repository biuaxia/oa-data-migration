package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0038;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0038Mapper extends BaseMapper<Formmain0038> {
    int updateBatch(List<Formmain0038> list);

    int updateBatchSelective(List<Formmain0038> list);

    int batchInsert(@Param("list") List<Formmain0038> list);

    int insertOrUpdate(Formmain0038 record);

    int insertOrUpdateSelective(Formmain0038 record);
}