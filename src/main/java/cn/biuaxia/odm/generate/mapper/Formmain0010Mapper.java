package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0010;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0010Mapper extends BaseMapper<Formmain0010> {
    int batchInsert(@Param("list") List<Formmain0010> list);

    int insertOrUpdate(Formmain0010 record);

    int insertOrUpdateSelective(Formmain0010 record);
}