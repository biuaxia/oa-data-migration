package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0156;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0156Mapper extends BaseMapper<Formmain0156> {
    int updateBatch(List<Formmain0156> list);

    int updateBatchSelective(List<Formmain0156> list);

    int batchInsert(@Param("list") List<Formmain0156> list);

    int insertOrUpdate(Formmain0156 record);

    int insertOrUpdateSelective(Formmain0156 record);
}