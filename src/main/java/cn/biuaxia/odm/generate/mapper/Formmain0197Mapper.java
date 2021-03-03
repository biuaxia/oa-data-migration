package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0197;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0197Mapper extends BaseMapper<Formmain0197> {
    int updateBatch(List<Formmain0197> list);

    int updateBatchSelective(List<Formmain0197> list);

    int batchInsert(@Param("list") List<Formmain0197> list);

    int insertOrUpdate(Formmain0197 record);

    int insertOrUpdateSelective(Formmain0197 record);
}