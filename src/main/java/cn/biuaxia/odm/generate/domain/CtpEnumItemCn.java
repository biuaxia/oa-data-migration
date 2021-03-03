package cn.biuaxia.odm.generate.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "CTP_ENUM_ITEM_CN")
public class CtpEnumItemCn implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "REF_ENUMID")
    private Long refEnumid;

    @TableField(value = "SHOWVALUE")
    private String showvalue;

    @TableField(value = "ENUMVALUE")
    private String enumvalue;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_REF_ENUMID = "REF_ENUMID";

    public static final String COL_SHOWVALUE = "SHOWVALUE";

    public static final String COL_ENUMVALUE = "ENUMVALUE";
}