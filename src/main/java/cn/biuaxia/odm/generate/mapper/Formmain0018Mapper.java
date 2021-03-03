package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0018;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0018Mapper extends BaseMapper<Formmain0018> {
    int batchInsert(@Param("list") List<Formmain0018> list);

    int insertOrUpdate(Formmain0018 record);

    int insertOrUpdateSelective(Formmain0018 record);
}