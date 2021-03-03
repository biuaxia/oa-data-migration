package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0469;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0469Mapper extends BaseMapper<Formmain0469> {
    int updateBatch(List<Formmain0469> list);

    int updateBatchSelective(List<Formmain0469> list);

    int batchInsert(@Param("list") List<Formmain0469> list);

    int insertOrUpdate(Formmain0469 record);

    int insertOrUpdateSelective(Formmain0469 record);
}