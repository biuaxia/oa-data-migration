package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0868;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0868Mapper extends BaseMapper<Formmain0868> {
    int updateBatch(List<Formmain0868> list);

    int updateBatchSelective(List<Formmain0868> list);

    int batchInsert(@Param("list") List<Formmain0868> list);

    int insertOrUpdate(Formmain0868 record);

    int insertOrUpdateSelective(Formmain0868 record);
}