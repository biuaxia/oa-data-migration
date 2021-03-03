package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0800;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0800Mapper extends BaseMapper<Formmain0800> {
    int updateBatch(List<Formmain0800> list);

    int updateBatchSelective(List<Formmain0800> list);

    int batchInsert(@Param("list") List<Formmain0800> list);

    int insertOrUpdate(Formmain0800 record);

    int insertOrUpdateSelective(Formmain0800 record);
}