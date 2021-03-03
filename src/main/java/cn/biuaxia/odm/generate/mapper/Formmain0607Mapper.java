package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0607;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0607Mapper extends BaseMapper<Formmain0607> {
    int updateBatch(List<Formmain0607> list);

    int updateBatchSelective(List<Formmain0607> list);

    int batchInsert(@Param("list") List<Formmain0607> list);

    int insertOrUpdate(Formmain0607 record);

    int insertOrUpdateSelective(Formmain0607 record);
}