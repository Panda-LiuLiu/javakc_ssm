package com.zhg.javakc.modules.supplier.entity;

import com.zhg.javakc.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author LiuLiu
 * @version v0.0.1
 * @date 2019/11/22 17:13
 */
// ##push测试
@Getter
@Setter
@ToString
public class SupplierEntity extends BaseEntity<SupplierEntity> {

    /**
     * 主键
     */
    private String supplierId;
    /**
     * 供应商类型
     */
    private String supplierType;
    /**
     * 供应商组织id
     */
    private String supplierGroupId;
    /**
     * 供应商编码（新加）
     */
    private Integer supplierCode;
    /**
     * 供应商物资关系id
     */
    private String relationId;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 供应商分类
     */
    private String supplierClass;
    /**
     * 供应商简称
     */
    private String supplierAbbname;
    /**
     * 法人
     */
    private String supplierLegper;
    /**
     * 法人电话
     */
    private String supplierLegperTel;
    /**
     * 供应商地址
     */
    private String supplierAdd;
    /**
     * 信任代码
     */
    private String supplierTrustcode;
    /**
     * 联系人
     */
    private String supplierContact;
    /**
     * 联系人电话
     */
    private String supplierContactTel;
    /**
     * 联系人邮箱
     */
    private String supplierContactMail;
    /**
     * 是否启用门户
     */
    private Integer supplierIsenableportal;
    /**
     * 是否必须合同
     */
    private Integer supplierIscontract;



}


















