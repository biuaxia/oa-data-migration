package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0906;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0906Mapper extends BaseMapper<Formmain0906> {
    int updateBatch(List<Formmain0906> list);

    int updateBatchSelective(List<Formmain0906> list);

    int batchInsert(@Param("list") List<Formmain0906> list);

    int insertOrUpdate(Formmain0906 record);

    int insertOrUpdateSelective(Formmain0906 record);
}