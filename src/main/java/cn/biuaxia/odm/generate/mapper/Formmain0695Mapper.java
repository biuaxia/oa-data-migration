package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0695;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0695Mapper extends BaseMapper<Formmain0695> {
    int updateBatch(List<Formmain0695> list);

    int updateBatchSelective(List<Formmain0695> list);

    int batchInsert(@Param("list") List<Formmain0695> list);

    int insertOrUpdate(Formmain0695 record);

    int insertOrUpdateSelective(Formmain0695 record);
}