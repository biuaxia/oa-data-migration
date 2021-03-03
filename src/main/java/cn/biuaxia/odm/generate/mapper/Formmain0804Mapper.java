package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0804;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0804Mapper extends BaseMapper<Formmain0804> {
    int updateBatch(List<Formmain0804> list);

    int updateBatchSelective(List<Formmain0804> list);

    int batchInsert(@Param("list") List<Formmain0804> list);

    int insertOrUpdate(Formmain0804 record);

    int insertOrUpdateSelective(Formmain0804 record);
}