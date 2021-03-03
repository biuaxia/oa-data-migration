package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0005;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0005Mapper extends BaseMapper<Formmain0005> {
    int batchInsert(@Param("list") List<Formmain0005> list);

    int insertOrUpdate(Formmain0005 record);

    int insertOrUpdateSelective(Formmain0005 record);
}