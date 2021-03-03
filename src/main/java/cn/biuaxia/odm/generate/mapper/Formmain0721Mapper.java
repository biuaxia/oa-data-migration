package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0721;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0721Mapper extends BaseMapper<Formmain0721> {
    int updateBatch(List<Formmain0721> list);

    int updateBatchSelective(List<Formmain0721> list);

    int batchInsert(@Param("list") List<Formmain0721> list);

    int insertOrUpdate(Formmain0721 record);

    int insertOrUpdateSelective(Formmain0721 record);
}