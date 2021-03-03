package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0910;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0910Mapper extends BaseMapper<Formmain0910> {
    int updateBatch(List<Formmain0910> list);

    int updateBatchSelective(List<Formmain0910> list);

    int batchInsert(@Param("list") List<Formmain0910> list);

    int insertOrUpdate(Formmain0910 record);

    int insertOrUpdateSelective(Formmain0910 record);
}