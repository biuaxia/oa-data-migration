package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0779;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0779Mapper extends BaseMapper<Formmain0779> {
    int updateBatch(List<Formmain0779> list);

    int updateBatchSelective(List<Formmain0779> list);

    int batchInsert(@Param("list") List<Formmain0779> list);

    int insertOrUpdate(Formmain0779 record);

    int insertOrUpdateSelective(Formmain0779 record);
}