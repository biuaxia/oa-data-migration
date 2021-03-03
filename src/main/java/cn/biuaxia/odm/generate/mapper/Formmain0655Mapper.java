package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0655;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0655Mapper extends BaseMapper<Formmain0655> {
    int updateBatch(List<Formmain0655> list);

    int updateBatchSelective(List<Formmain0655> list);

    int batchInsert(@Param("list") List<Formmain0655> list);

    int insertOrUpdate(Formmain0655 record);

    int insertOrUpdateSelective(Formmain0655 record);
}