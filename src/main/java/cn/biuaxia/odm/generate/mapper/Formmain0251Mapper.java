package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0251;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0251Mapper extends BaseMapper<Formmain0251> {
    int updateBatch(List<Formmain0251> list);

    int updateBatchSelective(List<Formmain0251> list);

    int batchInsert(@Param("list") List<Formmain0251> list);

    int insertOrUpdate(Formmain0251 record);

    int insertOrUpdateSelective(Formmain0251 record);
}