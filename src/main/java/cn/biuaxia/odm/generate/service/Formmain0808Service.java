package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0808;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0808Service extends IService<Formmain0808> {


    int updateBatch(List<Formmain0808> list);

    int updateBatchSelective(List<Formmain0808> list);

    int batchInsert(List<Formmain0808> list);

    int insertOrUpdate(Formmain0808 record);

    int insertOrUpdateSelective(Formmain0808 record);

}
