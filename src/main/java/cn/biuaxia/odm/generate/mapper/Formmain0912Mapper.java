package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0912;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0912Mapper extends BaseMapper<Formmain0912> {
    int updateBatch(List<Formmain0912> list);

    int updateBatchSelective(List<Formmain0912> list);

    int batchInsert(@Param("list") List<Formmain0912> list);

    int insertOrUpdate(Formmain0912 record);

    int insertOrUpdateSelective(Formmain0912 record);
}