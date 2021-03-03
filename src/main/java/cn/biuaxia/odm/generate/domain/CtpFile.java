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
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "CTP_FILE")
public class CtpFile implements Serializable {

    public static final String COL_ID = "ID";
    public static final String COL_CATEGORY = "CATEGORY";
    public static final String COL_TYPE = "TYPE";
    public static final String COL_FILENAME = "FILENAME";
    public static final String COL_MIME_TYPE = "MIME_TYPE";
    public static final String COL_CREATE_DATE = "CREATE_DATE";
    public static final String COL_CREATE_MEMBER = "CREATE_MEMBER";
    public static final String COL_FILE_SIZE = "FILE_SIZE";
    public static final String COL_DESCRIPTION = "DESCRIPTION";
    public static final String COL_UPDATE_DATE = "UPDATE_DATE";
    public static final String COL_ACCOUNT_ID = "ACCOUNT_ID";
    private static final long serialVersionUID = 1L;
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "CATEGORY")
    private Integer category;

    @TableField(value = "`TYPE`")
    private Integer type;

    @TableField(value = "FILENAME")
    private String filename;

    @TableField(value = "MIME_TYPE")
    private String mimeType;

    @TableField(value = "CREATE_DATE")
    private Date createDate;

    @TableField(value = "CREATE_MEMBER")
    private Long createMember;

    @TableField(value = "FILE_SIZE")
    private Long fileSize;

    @TableField(value = "DESCRIPTION")
    private String description;

    @TableField(value = "UPDATE_DATE")
    private Date updateDate;

    @TableField(value = "ACCOUNT_ID")
    private Long accountId;
}