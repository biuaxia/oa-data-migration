package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0756;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0756Mapper extends BaseMapper<Formmain0756> {
    int updateBatch(List<Formmain0756> list);

    int updateBatchSelective(List<Formmain0756> list);

    int batchInsert(@Param("list") List<Formmain0756> list);

    int insertOrUpdate(Formmain0756 record);

    int insertOrUpdateSelective(Formmain0756 record);
}