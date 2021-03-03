package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0836;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0836Mapper extends BaseMapper<Formmain0836> {
    int updateBatch(List<Formmain0836> list);

    int updateBatchSelective(List<Formmain0836> list);

    int batchInsert(@Param("list") List<Formmain0836> list);

    int insertOrUpdate(Formmain0836 record);

    int insertOrUpdateSelective(Formmain0836 record);
}