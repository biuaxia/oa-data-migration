package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0743;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0743Mapper extends BaseMapper<Formmain0743> {
    int updateBatch(List<Formmain0743> list);

    int updateBatchSelective(List<Formmain0743> list);

    int batchInsert(@Param("list") List<Formmain0743> list);

    int insertOrUpdate(Formmain0743 record);

    int insertOrUpdateSelective(Formmain0743 record);
}