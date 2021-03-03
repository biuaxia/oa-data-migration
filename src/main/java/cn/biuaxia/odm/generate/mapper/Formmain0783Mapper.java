package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0783;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0783Mapper extends BaseMapper<Formmain0783> {
    int updateBatch(List<Formmain0783> list);

    int updateBatchSelective(List<Formmain0783> list);

    int batchInsert(@Param("list") List<Formmain0783> list);

    int insertOrUpdate(Formmain0783 record);

    int insertOrUpdateSelective(Formmain0783 record);
}