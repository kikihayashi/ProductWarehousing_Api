package com.woody.productwarehousingapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class UploadRequest {
    @NotBlank
    @JsonProperty("CID")
    private String companyId;
    @NotBlank
    @JsonProperty("UID")
    private String userId;
    @NotBlank
    @JsonProperty("UPWD")
    private String userPassword;
    @NotBlank
    @JsonProperty("PDAID")
    private String pdaId;
    @NotBlank
    @JsonProperty("Tag")
    private String tag;
    @NotNull
    @JsonProperty("Data")
    private Data data;
    @JsonProperty("SerialNo")
    private SerialNo serialNo;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPdaId() {
        return pdaId;
    }

    public void setPdaId(String pdaId) {
        this.pdaId = pdaId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public SerialNo getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(SerialNo serialNo) {
        this.serialNo = serialNo;
    }

    public static class Data {
        @NotEmpty
        @JsonProperty("MasterData")
        private List<MasterData> masterDataList;

        public List<MasterData> getMasterDataList() {
            return masterDataList;
        }

        public void setMasterDataList(List<MasterData> masterDataList) {
            this.masterDataList = masterDataList;
        }
    }

    public static class MasterData {
        @NotBlank
        @JsonProperty("MKOrdNO")
        private String orderNo;
        @JsonProperty("BillDate")
        private String billDate;
        @JsonProperty("WorkTimeRealProc")
        private String workTimeRealProc;
        @JsonProperty("MKOrdDate")
        private String orderDate;
        @JsonProperty("ProductId")
        private String productId;
        @JsonProperty("ProductName")
        private String productName;
        @JsonProperty("SrcNoInQty")
        private String srcNoInQty;
        @JsonProperty("DetailData")
        private List<DetailData> detailDataList;

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getBillDate() {
            return billDate;
        }

        public void setBillDate(String billDate) {
            this.billDate = billDate;
        }

        public String getWorkTimeRealProc() {
            return workTimeRealProc;
        }

        public void setWorkTimeRealProc(String workTimeRealProc) {
            this.workTimeRealProc = workTimeRealProc;
        }

        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getSrcNoInQty() {
            return srcNoInQty;
        }

        public void setSrcNoInQty(String srcNoInQty) {
            this.srcNoInQty = srcNoInQty;
        }

        public List<DetailData> getDetailDataList() {
            return detailDataList;
        }

        public void setDetailDataList(List<DetailData> detailDataList) {
            this.detailDataList = detailDataList;
        }
    }

    public static class DetailData {

        @JsonProperty("RowNO")
        private String RowNO;
        @JsonProperty("WareInClass")
        private String WareInClass;
        @JsonProperty("WareID")
        private String WareID;
        @JsonProperty("ProdID")
        private String ProdID;
        @JsonProperty("ProdName")
        private String ProdName;
        @JsonProperty("prd_Quantity")
        private String prd_Quantity;
        @JsonProperty("ItemRemark")
        private String ItemRemark;
        @JsonProperty("DetailData")
        private List<DetailDataSub> detailDataSubList;

        public String getRowNO() {
            return RowNO;
        }

        public void setRowNO(String rowNO) {
            RowNO = rowNO;
        }

        public String getWareInClass() {
            return WareInClass;
        }

        public void setWareInClass(String wareInClass) {
            WareInClass = wareInClass;
        }

        public String getWareID() {
            return WareID;
        }

        public void setWareID(String wareID) {
            WareID = wareID;
        }

        public String getProdID() {
            return ProdID;
        }

        public void setProdID(String prodID) {
            ProdID = prodID;
        }

        public String getProdName() {
            return ProdName;
        }

        public void setProdName(String prodName) {
            ProdName = prodName;
        }

        public String getPrd_Quantity() {
            return prd_Quantity;
        }

        public void setPrd_Quantity(String prd_Quantity) {
            this.prd_Quantity = prd_Quantity;
        }

        public String getItemRemark() {
            return ItemRemark;
        }

        public void setItemRemark(String itemRemark) {
            ItemRemark = itemRemark;
        }

        public List<DetailDataSub> getDetailDataSubList() {
            return detailDataSubList;
        }

        public void setDetailDataSubList(List<DetailDataSub> detailDataSubList) {
            this.detailDataSubList = detailDataSubList;
        }
    }

    public static class DetailDataSub {
        @JsonProperty("ParentRowNO")
        private String parentRowNO;
        @JsonProperty("BatchID")
        private String batchID;
        @JsonProperty("Quantity")
        private String quantity;
        @JsonProperty("ProduceDate")
        private String produceDate;
        @JsonProperty("ValidDate")
        private String validDate;
        @JsonProperty("EstWareInDate")
        private Integer estWareInDate;
        @JsonProperty("StorageID")
        private String storageID;
        @JsonProperty("Serial")
        private String serial;
        @JsonProperty("QJSetWeight")
        private String qjSetWeight;
        @JsonProperty("Memo")
        private String memo;
        @JsonProperty("IsBox")
        private String isBox;
        @JsonProperty("Created_at")
        private String created_at;

        public String getParentRowNO() {
            return parentRowNO;
        }

        public void setParentRowNO(String parentRowNO) {
            this.parentRowNO = parentRowNO;
        }

        public String getBatchID() {
            return batchID;
        }

        public void setBatchID(String batchID) {
            this.batchID = batchID;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getProduceDate() {
            return produceDate;
        }

        public void setProduceDate(String produceDate) {
            this.produceDate = produceDate;
        }

        public String getValidDate() {
            return validDate;
        }

        public void setValidDate(String validDate) {
            this.validDate = validDate;
        }

        public Integer getEstWareInDate() {
            return estWareInDate;
        }

        public void setEstWareInDate(Integer estWareInDate) {
            this.estWareInDate = estWareInDate;
        }

        public String getStorageID() {
            return storageID;
        }

        public void setStorageID(String storageID) {
            this.storageID = storageID;
        }

        public String getSerial() {
            return serial;
        }

        public void setSerial(String serial) {
            this.serial = serial;
        }

        public String getQjSetWeight() {
            return qjSetWeight;
        }

        public void setQjSetWeight(String qjSetWeight) {
            this.qjSetWeight = qjSetWeight;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getIsBox() {
            return isBox;
        }

        public void setIsBox(String isBox) {
            this.isBox = isBox;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }
    }

    public static class SerialNo {

        @JsonProperty("AllSerialNo")
        private List<AllSerialNo> allSerialNoList;

        public List<AllSerialNo> getAllSerialNoList() {
            return allSerialNoList;
        }

        public void setAllSerialNoList(List<AllSerialNo> allSerialNoList) {
            this.allSerialNoList = allSerialNoList;
        }
    }

    public static class AllSerialNo {

        @JsonProperty("MKOrdNO")
        private String orderNo;
        @JsonProperty("PDAID")
        private String pdaId;
        @JsonProperty("ProdID")
        private String productId;
        @JsonProperty("BatchID")
        private String batchId;
        @JsonProperty("Serial")
        private String serial;
        @JsonProperty("QtyorWeight")
        private String qtyOrWeight;
        @JsonProperty("PalletNo")
        private String palletNo;

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getPdaId() {
            return pdaId;
        }

        public void setPdaId(String pdaId) {
            this.pdaId = pdaId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getBatchId() {
            return batchId;
        }

        public void setBatchId(String batchId) {
            this.batchId = batchId;
        }

        public String getSerial() {
            return serial;
        }

        public void setSerial(String serial) {
            this.serial = serial;
        }

        public String getQtyOrWeight() {
            return qtyOrWeight;
        }

        public void setQtyOrWeight(String qtyOrWeight) {
            this.qtyOrWeight = qtyOrWeight;
        }

        public String getPalletNo() {
            return palletNo;
        }

        public void setPalletNo(String palletNo) {
            this.palletNo = palletNo;
        }
    }


}
