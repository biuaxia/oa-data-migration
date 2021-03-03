package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0205;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0205Mapper extends BaseMapper<Formmain0205> {
    int updateBatch(List<Formmain0205> list);

    int updateBatchSelective(List<Formmain0205> list);

    int batchInsert(@Param("list") List<Formmain0205> list);

    int insertOrUpdate(Formmain0205 record);

    int insertOrUpdateSelective(Formmain0205 record);
}