package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0659;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0659Mapper extends BaseMapper<Formmain0659> {
    int updateBatch(List<Formmain0659> list);

    int updateBatchSelective(List<Formmain0659> list);

    int batchInsert(@Param("list") List<Formmain0659> list);

    int insertOrUpdate(Formmain0659 record);

    int insertOrUpdateSelective(Formmain0659 record);
}