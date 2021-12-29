package com.djpt.qj.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zw
 * @since 2021-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DJFZ")
public class Djfz implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 系统ID
     */
    @TableId(value = "ID", type = IdType.ID_WORKER_STR)
    private String id;

    /**
     * 业务号
     */
    @TableField("YWH")
    private String ywh;

    /**
     * 要素代码
     */
    @TableField("YSDM")
    private String ysdm;

    /**
     * 发证人员
     */
    @TableField("FZRY")
    private String fzry;

    /**
     * 发证时间
     */
    @TableField("FZSJ")
    private Date fzsj;

    /**
     * 发证名称
     */
    @TableField("FZMC")
    private String fzmc;

    /**
     * 发证数量
     */
    @TableField("FZSL")
    private BigDecimal fzsl;

    /**
     * 领证人姓名
     */
    @TableField("LZRXM")
    private String lzrxm;

    /**
     * 领证人证件类别
     */
    @TableField("LZRZJLB")
    private BigDecimal lzrzjlb;

    /**
     * 领证人证件号码
     */
    @TableField("LZRZJHM")
    private String lzrzjhm;

    /**
     * 领证人电话
     */
    @TableField("LZRDH")
    private String lzrdh;

    /**
     * 领证人地址
     */
    @TableField("LZRDZ")
    private String lzrdz;

    /**
     * 领证人邮编
     */
    @TableField("LZRYB")
    private String lzryb;

    /**
     * 备注
     */
    @TableField("BZ")
    private String bz;

    /**
     * 签发状态 0：未签发  1：已签发
     */
    @TableField("QFZT")
    private String qfzt;

    /**
     * 卷宗号
     */
    @TableField("JZH")
    private String jzh;

    /**
     * 文件件数
     */
    @TableField("WJJS")
    private String wjjs;

    /**
     * 总页数
     */
    @TableField("ZYS")
    private String zys;

    /**
     * 操作人
     */
    @TableField("CZR")
    private String czr;

    /**
     * 归档时间
     */
    @TableField("GDSJ")
    private Date gdsj;

    /**
     * 备注
     */
    @TableField("BZ1")
    private String bz1;

    /**
     * 登记大类
     */
    @TableField("DJDL")
    private String djdl;


}
