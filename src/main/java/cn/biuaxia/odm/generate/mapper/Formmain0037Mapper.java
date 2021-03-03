package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0037;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0037Mapper extends BaseMapper<Formmain0037> {
    int batchInsert(@Param("list") List<Formmain0037> list);

    int insertOrUpdate(Formmain0037 record);

    int insertOrUpdateSelective(Formmain0037 record);
}