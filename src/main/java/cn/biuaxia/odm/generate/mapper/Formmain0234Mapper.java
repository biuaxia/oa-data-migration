package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0234;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0234Mapper extends BaseMapper<Formmain0234> {
    int updateBatch(List<Formmain0234> list);

    int updateBatchSelective(List<Formmain0234> list);

    int batchInsert(@Param("list") List<Formmain0234> list);

    int insertOrUpdate(Formmain0234 record);

    int insertOrUpdateSelective(Formmain0234 record);
}