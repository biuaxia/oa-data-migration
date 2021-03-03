package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0770;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0770Mapper extends BaseMapper<Formmain0770> {
    int updateBatch(List<Formmain0770> list);

    int updateBatchSelective(List<Formmain0770> list);

    int batchInsert(@Param("list") List<Formmain0770> list);

    int insertOrUpdate(Formmain0770 record);

    int insertOrUpdateSelective(Formmain0770 record);
}