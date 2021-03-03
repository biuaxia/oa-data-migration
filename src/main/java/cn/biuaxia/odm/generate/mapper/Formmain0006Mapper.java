package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0006;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0006Mapper extends BaseMapper<Formmain0006> {
    int batchInsert(@Param("list") List<Formmain0006> list);

    int insertOrUpdate(Formmain0006 record);

    int insertOrUpdateSelective(Formmain0006 record);
}