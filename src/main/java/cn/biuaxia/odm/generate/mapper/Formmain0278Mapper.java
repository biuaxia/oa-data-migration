package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0278;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0278Mapper extends BaseMapper<Formmain0278> {
    int updateBatch(List<Formmain0278> list);

    int updateBatchSelective(List<Formmain0278> list);

    int batchInsert(@Param("list") List<Formmain0278> list);

    int insertOrUpdate(Formmain0278 record);

    int insertOrUpdateSelective(Formmain0278 record);
}