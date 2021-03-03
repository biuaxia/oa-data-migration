package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0209;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0209Mapper extends BaseMapper<Formmain0209> {
    int updateBatch(List<Formmain0209> list);

    int updateBatchSelective(List<Formmain0209> list);

    int batchInsert(@Param("list") List<Formmain0209> list);

    int insertOrUpdate(Formmain0209 record);

    int insertOrUpdateSelective(Formmain0209 record);
}