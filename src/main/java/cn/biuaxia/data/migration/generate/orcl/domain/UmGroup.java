package cn.biuaxia.data.migration.generate.orcl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "UM_GROUP")
public class UmGroup implements Serializable {
    /**
     * 组ID
     */
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    /**
     * 组类型
     */
    @TableField(value = "\"TYPE\"")
    private Integer type;

    /**
     * 所属用户id。
如果为null或者为0，表示该组为公用组；
否则表示该组是属于该用户的私有组
     */
    @TableField(value = "USER_ID")
    private Integer userId;

    /**
     * 该组的领导id
     */
    @TableField(value = "LEADER")
    private Long leader;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_TYPE = "TYPE";

    public static final String COL_USER_ID = "USER_ID";

    public static final String COL_LEADER = "LEADER";
}