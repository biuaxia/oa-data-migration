package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0517;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0517Mapper extends BaseMapper<Formmain0517> {
    int updateBatch(List<Formmain0517> list);

    int updateBatchSelective(List<Formmain0517> list);

    int batchInsert(@Param("list") List<Formmain0517> list);

    int insertOrUpdate(Formmain0517 record);

    int insertOrUpdateSelective(Formmain0517 record);
}