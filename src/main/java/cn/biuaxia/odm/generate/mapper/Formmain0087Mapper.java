package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0087;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0087Mapper extends BaseMapper<Formmain0087> {
    int batchInsert(@Param("list") List<Formmain0087> list);

    int insertOrUpdate(Formmain0087 record);

    int insertOrUpdateSelective(Formmain0087 record);
}