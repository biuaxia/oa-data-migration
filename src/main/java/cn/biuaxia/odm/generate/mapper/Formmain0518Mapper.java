package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0518;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0518Mapper extends BaseMapper<Formmain0518> {
    int updateBatch(List<Formmain0518> list);

    int updateBatchSelective(List<Formmain0518> list);

    int batchInsert(@Param("list") List<Formmain0518> list);

    int insertOrUpdate(Formmain0518 record);

    int insertOrUpdateSelective(Formmain0518 record);
}