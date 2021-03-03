package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0314;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0314Mapper extends BaseMapper<Formmain0314> {
    int updateBatch(List<Formmain0314> list);

    int updateBatchSelective(List<Formmain0314> list);

    int batchInsert(@Param("list") List<Formmain0314> list);

    int insertOrUpdate(Formmain0314 record);

    int insertOrUpdateSelective(Formmain0314 record);
}