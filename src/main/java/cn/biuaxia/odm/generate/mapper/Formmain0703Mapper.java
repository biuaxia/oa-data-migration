package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0703;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0703Mapper extends BaseMapper<Formmain0703> {
    int updateBatch(List<Formmain0703> list);

    int updateBatchSelective(List<Formmain0703> list);

    int batchInsert(@Param("list") List<Formmain0703> list);

    int insertOrUpdate(Formmain0703 record);

    int insertOrUpdateSelective(Formmain0703 record);
}