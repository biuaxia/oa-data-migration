package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0763;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0763Mapper extends BaseMapper<Formmain0763> {
    int updateBatch(List<Formmain0763> list);

    int updateBatchSelective(List<Formmain0763> list);

    int batchInsert(@Param("list") List<Formmain0763> list);

    int insertOrUpdate(Formmain0763 record);

    int insertOrUpdateSelective(Formmain0763 record);
}