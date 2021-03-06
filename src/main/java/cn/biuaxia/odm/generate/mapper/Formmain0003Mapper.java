package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0003;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0003Mapper extends BaseMapper<Formmain0003> {
    int batchInsert(@Param("list") List<Formmain0003> list);

    int insertOrUpdate(Formmain0003 record);

    int insertOrUpdateSelective(Formmain0003 record);
}