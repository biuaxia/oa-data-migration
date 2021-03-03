package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0805;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0805Mapper extends BaseMapper<Formmain0805> {
    int updateBatch(List<Formmain0805> list);

    int updateBatchSelective(List<Formmain0805> list);

    int batchInsert(@Param("list") List<Formmain0805> list);

    int insertOrUpdate(Formmain0805 record);

    int insertOrUpdateSelective(Formmain0805 record);
}