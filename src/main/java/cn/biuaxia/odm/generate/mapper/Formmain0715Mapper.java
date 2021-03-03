package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0715;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0715Mapper extends BaseMapper<Formmain0715> {
    int updateBatch(List<Formmain0715> list);

    int updateBatchSelective(List<Formmain0715> list);

    int batchInsert(@Param("list") List<Formmain0715> list);

    int insertOrUpdate(Formmain0715 record);

    int insertOrUpdateSelective(Formmain0715 record);
}