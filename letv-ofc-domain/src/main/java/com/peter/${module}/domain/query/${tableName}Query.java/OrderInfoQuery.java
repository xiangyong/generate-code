package com.peter.pms.domain.query;
/**
*
*@author 自动生成
*OrderInfo
*下发订单主表信息
*/
public class OrderInfoQuery{
	
		/**
	 	*id 
	 	*/
		private Long id;
		/**
	 	*仓库第三方编码 
	 	*/
		private String storeCode;
		/**
	 	*order_id 
	 	*/
		private String orderCode;
		/**
	 	*操作子类型,默认LE001 
	 	*/
		private String orderType;
		/**
	 	*订单创建时间 
	 	*/
		private java.util.Date orderCreateTime;
		/**
	 	*订单总金额 
	 	*/
		private Double totalAmount;
		/**
	 	*订单标记 
	 	*/
		private String orderFlag;
		/**
	 	*物流公司编码 
	 	*/
		private String tmsServiceCode;
		/**
	 	*收货方信息 
	 	*/
		private String receiverInfo;
		/**
	 	*发货方信息 
	 	*/
		private String senderInfo;
		/**
	 	*备注 
	 	*/
		private String remark;
		/**
	 	*订单来源编码 
	 	*/
		private Integer orderWayCode;
		/**
	 	*订单来源名称 
	 	*/
		private String orderWayName;
		/**
	 	*订单类型编码 
	 	*/
		private Integer orderTypeCode;
		/**
	 	*订单类型名称 
	 	*/
		private String orderTypeName;
		/**
	 	*仓库ID 
	 	*/
		private Long storageId;
		/**
	 	*仓库编码 
	 	*/
		private String storageCode;
		/**
	 	*仓库属性 
	 	*/
		private Integer storageType;
		/**
	 	* 
	 	*/
		private Integer isInvoice;
		/**
	 	*1 不需要发票 2 普通发票  3 增值税发票 
	 	*/
		private Integer invoiceType;
		/**
	 	*国家 
	 	*/
		private Integer countryId;
		/**
	 	*国家名称 
	 	*/
		private String countryName;
		/**
	 	*省 
	 	*/
		private Integer provinceId;
		/**
	 	*省名称 
	 	*/
		private String provinceName;
		/**
	 	*市 
	 	*/
		private Integer cityId;
		/**
	 	*市名称 
	 	*/
		private String cityName;
		/**
	 	*县 
	 	*/
		private Integer districtId;
		/**
	 	*县名称 
	 	*/
		private String districtName;
		/**
	 	*镇 
	 	*/
		private Integer townId;
		/**
	 	*镇名称 
	 	*/
		private String townName;
		/**
	 	* 
	 	*/
		private String zipCode;
		/**
	 	* 
	 	*/
		private String address;
		/**
	 	* 
	 	*/
		private String receiver;
		/**
	 	* 
	 	*/
		private String mobile;
		/**
	 	* 
	 	*/
		private String sMobile;
		/**
	 	* 
	 	*/
		private String telphone;
		/**
	 	* 
	 	*/
		private String sTelphone;
		/**
	 	*运费信息 
	 	*/
		private Double shippingFee;
		/**
	 	*发票总金额 
	 	*/
		private Double invoiceAmount;
		/**
	 	*会员ID 
	 	*/
		private String userId;
		/**
	 	*是否正常 
	 	*/
		private Integer isOk;
		/**
	 	*任务表ID 
	 	*/
		private Long taskId;
		/**
	 	*任务处理结果 
	 	*/
		private Integer taskResult;
		/**
	 	*创建时间 
	 	*/
		private java.util.Date createTime;
		/**
	 	*更新时间 
	 	*/
		private java.util.Date updateTime;
		/**
	 	*是否有效 
	 	*/
		private Integer yn;
		/**
	 	*支付时间 
	 	*/
		private java.util.Date paymentTime;
		/**
	 	*邮箱 
	 	*/
		private String email;
		/**
	 	*订单下发规则 
	 	*/
		private String issuedRule;
		/**
	 	* 
	 	*/
		private String issuedRemark;
		/**
	 	*销售部门编号 
	 	*/
		private String saleDepNo;
		/**
	 	*销售部门名称 
	 	*/
		private String saleDepName;
		/**
	 	*线下客户编号 
	 	*/
		private String offlineCustomorNo;
		/**
	 	*线下客户名称 
	 	*/
		private String offlineCustomorName;
		/**
	 	*下发仓库号 
	 	*/
		private String issuedWarehouseNo;
		/**
	 	*下发承运商编码 
	 	*/
		private String issuedExpressNo;
		/**
	 	*下发仓库名称 
	 	*/
		private String issuedWarehouseName;
		/**
	 	*下发承运商名称 
	 	*/
		private String issuedExpressName;
		/**
	 	*仓库名称 
	 	*/
		private String warehouseName;
		/**
	 	*销售员id 
	 	*/
		private String sellerId;
		/**
	 	*支付方式 
	 	*/
		private String payMethod;
		/**
	 	*支付类型 
	 	*/
		private String payType;
		/**
	 	*承运商名称 
	 	*/
		private String expressName;
		/**
	 	*是否发货 0,否；1：是 
	 	*/
		private Integer isShipment;
		/**
	 	*是否预约，1为预约。0为否 
	 	*/
		private Integer isSubscribe;
		/**
	 	*预约承运商号 
	 	*/
		private String subscribeExpressNo;
		/**
	 	*预约承运商名称 
	 	*/
		private String subscribeExpressName;
		/**
	 	*承运商到库房提货时间 
	 	*/
		private java.util.Date subscribeTime;
		/**
	 	*0否,10裸机,20联通合约,30移动合约,40电信合约 
	 	*/
		private Integer contractType;
		/**
	 	*身份证 
	 	*/
		private String IDCard;
		/**
	 	*合约机号 
	 	*/
		private String contractNumber;
		/**
	 	*渠道 
	 	*/
		private String orderChannel;
	
	
		/**
		 * id 
		 * @return id
	 	*/
		private Long getId(){
			return id;
		}

		/**
		 * id 
	 	 * @param id
		*/
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * 仓库第三方编码 
		 * @return storeCode
	 	*/
		private String getStoreCode(){
			return storeCode;
		}

		/**
		 * 仓库第三方编码 
	 	 * @param storeCode
		*/
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		/**
		 * order_id 
		 * @return orderCode
	 	*/
		private String getOrderCode(){
			return orderCode;
		}

		/**
		 * order_id 
	 	 * @param orderCode
		*/
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		/**
		 * 操作子类型,默认LE001 
		 * @return orderType
	 	*/
		private String getOrderType(){
			return orderType;
		}

		/**
		 * 操作子类型,默认LE001 
	 	 * @param orderType
		*/
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		/**
		 * 订单创建时间 
		 * @return orderCreateTime
	 	*/
		private java.util.Date getOrderCreateTime(){
			return orderCreateTime;
		}

		/**
		 * 订单创建时间 
	 	 * @param orderCreateTime
		*/
		public void setOrderCreateTime(java.util.Date orderCreateTime) {
			this.orderCreateTime = orderCreateTime;
		}
		/**
		 * 订单总金额 
		 * @return totalAmount
	 	*/
		private Double getTotalAmount(){
			return totalAmount;
		}

		/**
		 * 订单总金额 
	 	 * @param totalAmount
		*/
		public void setTotalAmount(Double totalAmount) {
			this.totalAmount = totalAmount;
		}
		/**
		 * 订单标记 
		 * @return orderFlag
	 	*/
		private String getOrderFlag(){
			return orderFlag;
		}

		/**
		 * 订单标记 
	 	 * @param orderFlag
		*/
		public void setOrderFlag(String orderFlag) {
			this.orderFlag = orderFlag;
		}
		/**
		 * 物流公司编码 
		 * @return tmsServiceCode
	 	*/
		private String getTmsServiceCode(){
			return tmsServiceCode;
		}

		/**
		 * 物流公司编码 
	 	 * @param tmsServiceCode
		*/
		public void setTmsServiceCode(String tmsServiceCode) {
			this.tmsServiceCode = tmsServiceCode;
		}
		/**
		 * 收货方信息 
		 * @return receiverInfo
	 	*/
		private String getReceiverInfo(){
			return receiverInfo;
		}

		/**
		 * 收货方信息 
	 	 * @param receiverInfo
		*/
		public void setReceiverInfo(String receiverInfo) {
			this.receiverInfo = receiverInfo;
		}
		/**
		 * 发货方信息 
		 * @return senderInfo
	 	*/
		private String getSenderInfo(){
			return senderInfo;
		}

		/**
		 * 发货方信息 
	 	 * @param senderInfo
		*/
		public void setSenderInfo(String senderInfo) {
			this.senderInfo = senderInfo;
		}
		/**
		 * 备注 
		 * @return remark
	 	*/
		private String getRemark(){
			return remark;
		}

		/**
		 * 备注 
	 	 * @param remark
		*/
		public void setRemark(String remark) {
			this.remark = remark;
		}
		/**
		 * 订单来源编码 
		 * @return orderWayCode
	 	*/
		private Integer getOrderWayCode(){
			return orderWayCode;
		}

		/**
		 * 订单来源编码 
	 	 * @param orderWayCode
		*/
		public void setOrderWayCode(Integer orderWayCode) {
			this.orderWayCode = orderWayCode;
		}
		/**
		 * 订单来源名称 
		 * @return orderWayName
	 	*/
		private String getOrderWayName(){
			return orderWayName;
		}

		/**
		 * 订单来源名称 
	 	 * @param orderWayName
		*/
		public void setOrderWayName(String orderWayName) {
			this.orderWayName = orderWayName;
		}
		/**
		 * 订单类型编码 
		 * @return orderTypeCode
	 	*/
		private Integer getOrderTypeCode(){
			return orderTypeCode;
		}

		/**
		 * 订单类型编码 
	 	 * @param orderTypeCode
		*/
		public void setOrderTypeCode(Integer orderTypeCode) {
			this.orderTypeCode = orderTypeCode;
		}
		/**
		 * 订单类型名称 
		 * @return orderTypeName
	 	*/
		private String getOrderTypeName(){
			return orderTypeName;
		}

		/**
		 * 订单类型名称 
	 	 * @param orderTypeName
		*/
		public void setOrderTypeName(String orderTypeName) {
			this.orderTypeName = orderTypeName;
		}
		/**
		 * 仓库ID 
		 * @return storageId
	 	*/
		private Long getStorageId(){
			return storageId;
		}

		/**
		 * 仓库ID 
	 	 * @param storageId
		*/
		public void setStorageId(Long storageId) {
			this.storageId = storageId;
		}
		/**
		 * 仓库编码 
		 * @return storageCode
	 	*/
		private String getStorageCode(){
			return storageCode;
		}

		/**
		 * 仓库编码 
	 	 * @param storageCode
		*/
		public void setStorageCode(String storageCode) {
			this.storageCode = storageCode;
		}
		/**
		 * 仓库属性 
		 * @return storageType
	 	*/
		private Integer getStorageType(){
			return storageType;
		}

		/**
		 * 仓库属性 
	 	 * @param storageType
		*/
		public void setStorageType(Integer storageType) {
			this.storageType = storageType;
		}
		/**
		 *  
		 * @return isInvoice
	 	*/
		private Integer getIsInvoice(){
			return isInvoice;
		}

		/**
		 *  
	 	 * @param isInvoice
		*/
		public void setIsInvoice(Integer isInvoice) {
			this.isInvoice = isInvoice;
		}
		/**
		 * 1 不需要发票 2 普通发票  3 增值税发票 
		 * @return invoiceType
	 	*/
		private Integer getInvoiceType(){
			return invoiceType;
		}

		/**
		 * 1 不需要发票 2 普通发票  3 增值税发票 
	 	 * @param invoiceType
		*/
		public void setInvoiceType(Integer invoiceType) {
			this.invoiceType = invoiceType;
		}
		/**
		 * 国家 
		 * @return countryId
	 	*/
		private Integer getCountryId(){
			return countryId;
		}

		/**
		 * 国家 
	 	 * @param countryId
		*/
		public void setCountryId(Integer countryId) {
			this.countryId = countryId;
		}
		/**
		 * 国家名称 
		 * @return countryName
	 	*/
		private String getCountryName(){
			return countryName;
		}

		/**
		 * 国家名称 
	 	 * @param countryName
		*/
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		/**
		 * 省 
		 * @return provinceId
	 	*/
		private Integer getProvinceId(){
			return provinceId;
		}

		/**
		 * 省 
	 	 * @param provinceId
		*/
		public void setProvinceId(Integer provinceId) {
			this.provinceId = provinceId;
		}
		/**
		 * 省名称 
		 * @return provinceName
	 	*/
		private String getProvinceName(){
			return provinceName;
		}

		/**
		 * 省名称 
	 	 * @param provinceName
		*/
		public void setProvinceName(String provinceName) {
			this.provinceName = provinceName;
		}
		/**
		 * 市 
		 * @return cityId
	 	*/
		private Integer getCityId(){
			return cityId;
		}

		/**
		 * 市 
	 	 * @param cityId
		*/
		public void setCityId(Integer cityId) {
			this.cityId = cityId;
		}
		/**
		 * 市名称 
		 * @return cityName
	 	*/
		private String getCityName(){
			return cityName;
		}

		/**
		 * 市名称 
	 	 * @param cityName
		*/
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		/**
		 * 县 
		 * @return districtId
	 	*/
		private Integer getDistrictId(){
			return districtId;
		}

		/**
		 * 县 
	 	 * @param districtId
		*/
		public void setDistrictId(Integer districtId) {
			this.districtId = districtId;
		}
		/**
		 * 县名称 
		 * @return districtName
	 	*/
		private String getDistrictName(){
			return districtName;
		}

		/**
		 * 县名称 
	 	 * @param districtName
		*/
		public void setDistrictName(String districtName) {
			this.districtName = districtName;
		}
		/**
		 * 镇 
		 * @return townId
	 	*/
		private Integer getTownId(){
			return townId;
		}

		/**
		 * 镇 
	 	 * @param townId
		*/
		public void setTownId(Integer townId) {
			this.townId = townId;
		}
		/**
		 * 镇名称 
		 * @return townName
	 	*/
		private String getTownName(){
			return townName;
		}

		/**
		 * 镇名称 
	 	 * @param townName
		*/
		public void setTownName(String townName) {
			this.townName = townName;
		}
		/**
		 *  
		 * @return zipCode
	 	*/
		private String getZipCode(){
			return zipCode;
		}

		/**
		 *  
	 	 * @param zipCode
		*/
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		/**
		 *  
		 * @return address
	 	*/
		private String getAddress(){
			return address;
		}

		/**
		 *  
	 	 * @param address
		*/
		public void setAddress(String address) {
			this.address = address;
		}
		/**
		 *  
		 * @return receiver
	 	*/
		private String getReceiver(){
			return receiver;
		}

		/**
		 *  
	 	 * @param receiver
		*/
		public void setReceiver(String receiver) {
			this.receiver = receiver;
		}
		/**
		 *  
		 * @return mobile
	 	*/
		private String getMobile(){
			return mobile;
		}

		/**
		 *  
	 	 * @param mobile
		*/
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		/**
		 *  
		 * @return sMobile
	 	*/
		private String getSMobile(){
			return sMobile;
		}

		/**
		 *  
	 	 * @param sMobile
		*/
		public void setSMobile(String sMobile) {
			this.sMobile = sMobile;
		}
		/**
		 *  
		 * @return telphone
	 	*/
		private String getTelphone(){
			return telphone;
		}

		/**
		 *  
	 	 * @param telphone
		*/
		public void setTelphone(String telphone) {
			this.telphone = telphone;
		}
		/**
		 *  
		 * @return sTelphone
	 	*/
		private String getSTelphone(){
			return sTelphone;
		}

		/**
		 *  
	 	 * @param sTelphone
		*/
		public void setSTelphone(String sTelphone) {
			this.sTelphone = sTelphone;
		}
		/**
		 * 运费信息 
		 * @return shippingFee
	 	*/
		private Double getShippingFee(){
			return shippingFee;
		}

		/**
		 * 运费信息 
	 	 * @param shippingFee
		*/
		public void setShippingFee(Double shippingFee) {
			this.shippingFee = shippingFee;
		}
		/**
		 * 发票总金额 
		 * @return invoiceAmount
	 	*/
		private Double getInvoiceAmount(){
			return invoiceAmount;
		}

		/**
		 * 发票总金额 
	 	 * @param invoiceAmount
		*/
		public void setInvoiceAmount(Double invoiceAmount) {
			this.invoiceAmount = invoiceAmount;
		}
		/**
		 * 会员ID 
		 * @return userId
	 	*/
		private String getUserId(){
			return userId;
		}

		/**
		 * 会员ID 
	 	 * @param userId
		*/
		public void setUserId(String userId) {
			this.userId = userId;
		}
		/**
		 * 是否正常 
		 * @return isOk
	 	*/
		private Integer getIsOk(){
			return isOk;
		}

		/**
		 * 是否正常 
	 	 * @param isOk
		*/
		public void setIsOk(Integer isOk) {
			this.isOk = isOk;
		}
		/**
		 * 任务表ID 
		 * @return taskId
	 	*/
		private Long getTaskId(){
			return taskId;
		}

		/**
		 * 任务表ID 
	 	 * @param taskId
		*/
		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}
		/**
		 * 任务处理结果 
		 * @return taskResult
	 	*/
		private Integer getTaskResult(){
			return taskResult;
		}

		/**
		 * 任务处理结果 
	 	 * @param taskResult
		*/
		public void setTaskResult(Integer taskResult) {
			this.taskResult = taskResult;
		}
		/**
		 * 创建时间 
		 * @return createTime
	 	*/
		private java.util.Date getCreateTime(){
			return createTime;
		}

		/**
		 * 创建时间 
	 	 * @param createTime
		*/
		public void setCreateTime(java.util.Date createTime) {
			this.createTime = createTime;
		}
		/**
		 * 更新时间 
		 * @return updateTime
	 	*/
		private java.util.Date getUpdateTime(){
			return updateTime;
		}

		/**
		 * 更新时间 
	 	 * @param updateTime
		*/
		public void setUpdateTime(java.util.Date updateTime) {
			this.updateTime = updateTime;
		}
		/**
		 * 是否有效 
		 * @return yn
	 	*/
		private Integer getYn(){
			return yn;
		}

		/**
		 * 是否有效 
	 	 * @param yn
		*/
		public void setYn(Integer yn) {
			this.yn = yn;
		}
		/**
		 * 支付时间 
		 * @return paymentTime
	 	*/
		private java.util.Date getPaymentTime(){
			return paymentTime;
		}

		/**
		 * 支付时间 
	 	 * @param paymentTime
		*/
		public void setPaymentTime(java.util.Date paymentTime) {
			this.paymentTime = paymentTime;
		}
		/**
		 * 邮箱 
		 * @return email
	 	*/
		private String getEmail(){
			return email;
		}

		/**
		 * 邮箱 
	 	 * @param email
		*/
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * 订单下发规则 
		 * @return issuedRule
	 	*/
		private String getIssuedRule(){
			return issuedRule;
		}

		/**
		 * 订单下发规则 
	 	 * @param issuedRule
		*/
		public void setIssuedRule(String issuedRule) {
			this.issuedRule = issuedRule;
		}
		/**
		 *  
		 * @return issuedRemark
	 	*/
		private String getIssuedRemark(){
			return issuedRemark;
		}

		/**
		 *  
	 	 * @param issuedRemark
		*/
		public void setIssuedRemark(String issuedRemark) {
			this.issuedRemark = issuedRemark;
		}
		/**
		 * 销售部门编号 
		 * @return saleDepNo
	 	*/
		private String getSaleDepNo(){
			return saleDepNo;
		}

		/**
		 * 销售部门编号 
	 	 * @param saleDepNo
		*/
		public void setSaleDepNo(String saleDepNo) {
			this.saleDepNo = saleDepNo;
		}
		/**
		 * 销售部门名称 
		 * @return saleDepName
	 	*/
		private String getSaleDepName(){
			return saleDepName;
		}

		/**
		 * 销售部门名称 
	 	 * @param saleDepName
		*/
		public void setSaleDepName(String saleDepName) {
			this.saleDepName = saleDepName;
		}
		/**
		 * 线下客户编号 
		 * @return offlineCustomorNo
	 	*/
		private String getOfflineCustomorNo(){
			return offlineCustomorNo;
		}

		/**
		 * 线下客户编号 
	 	 * @param offlineCustomorNo
		*/
		public void setOfflineCustomorNo(String offlineCustomorNo) {
			this.offlineCustomorNo = offlineCustomorNo;
		}
		/**
		 * 线下客户名称 
		 * @return offlineCustomorName
	 	*/
		private String getOfflineCustomorName(){
			return offlineCustomorName;
		}

		/**
		 * 线下客户名称 
	 	 * @param offlineCustomorName
		*/
		public void setOfflineCustomorName(String offlineCustomorName) {
			this.offlineCustomorName = offlineCustomorName;
		}
		/**
		 * 下发仓库号 
		 * @return issuedWarehouseNo
	 	*/
		private String getIssuedWarehouseNo(){
			return issuedWarehouseNo;
		}

		/**
		 * 下发仓库号 
	 	 * @param issuedWarehouseNo
		*/
		public void setIssuedWarehouseNo(String issuedWarehouseNo) {
			this.issuedWarehouseNo = issuedWarehouseNo;
		}
		/**
		 * 下发承运商编码 
		 * @return issuedExpressNo
	 	*/
		private String getIssuedExpressNo(){
			return issuedExpressNo;
		}

		/**
		 * 下发承运商编码 
	 	 * @param issuedExpressNo
		*/
		public void setIssuedExpressNo(String issuedExpressNo) {
			this.issuedExpressNo = issuedExpressNo;
		}
		/**
		 * 下发仓库名称 
		 * @return issuedWarehouseName
	 	*/
		private String getIssuedWarehouseName(){
			return issuedWarehouseName;
		}

		/**
		 * 下发仓库名称 
	 	 * @param issuedWarehouseName
		*/
		public void setIssuedWarehouseName(String issuedWarehouseName) {
			this.issuedWarehouseName = issuedWarehouseName;
		}
		/**
		 * 下发承运商名称 
		 * @return issuedExpressName
	 	*/
		private String getIssuedExpressName(){
			return issuedExpressName;
		}

		/**
		 * 下发承运商名称 
	 	 * @param issuedExpressName
		*/
		public void setIssuedExpressName(String issuedExpressName) {
			this.issuedExpressName = issuedExpressName;
		}
		/**
		 * 仓库名称 
		 * @return warehouseName
	 	*/
		private String getWarehouseName(){
			return warehouseName;
		}

		/**
		 * 仓库名称 
	 	 * @param warehouseName
		*/
		public void setWarehouseName(String warehouseName) {
			this.warehouseName = warehouseName;
		}
		/**
		 * 销售员id 
		 * @return sellerId
	 	*/
		private String getSellerId(){
			return sellerId;
		}

		/**
		 * 销售员id 
	 	 * @param sellerId
		*/
		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}
		/**
		 * 支付方式 
		 * @return payMethod
	 	*/
		private String getPayMethod(){
			return payMethod;
		}

		/**
		 * 支付方式 
	 	 * @param payMethod
		*/
		public void setPayMethod(String payMethod) {
			this.payMethod = payMethod;
		}
		/**
		 * 支付类型 
		 * @return payType
	 	*/
		private String getPayType(){
			return payType;
		}

		/**
		 * 支付类型 
	 	 * @param payType
		*/
		public void setPayType(String payType) {
			this.payType = payType;
		}
		/**
		 * 承运商名称 
		 * @return expressName
	 	*/
		private String getExpressName(){
			return expressName;
		}

		/**
		 * 承运商名称 
	 	 * @param expressName
		*/
		public void setExpressName(String expressName) {
			this.expressName = expressName;
		}
		/**
		 * 是否发货 0,否；1：是 
		 * @return isShipment
	 	*/
		private Integer getIsShipment(){
			return isShipment;
		}

		/**
		 * 是否发货 0,否；1：是 
	 	 * @param isShipment
		*/
		public void setIsShipment(Integer isShipment) {
			this.isShipment = isShipment;
		}
		/**
		 * 是否预约，1为预约。0为否 
		 * @return isSubscribe
	 	*/
		private Integer getIsSubscribe(){
			return isSubscribe;
		}

		/**
		 * 是否预约，1为预约。0为否 
	 	 * @param isSubscribe
		*/
		public void setIsSubscribe(Integer isSubscribe) {
			this.isSubscribe = isSubscribe;
		}
		/**
		 * 预约承运商号 
		 * @return subscribeExpressNo
	 	*/
		private String getSubscribeExpressNo(){
			return subscribeExpressNo;
		}

		/**
		 * 预约承运商号 
	 	 * @param subscribeExpressNo
		*/
		public void setSubscribeExpressNo(String subscribeExpressNo) {
			this.subscribeExpressNo = subscribeExpressNo;
		}
		/**
		 * 预约承运商名称 
		 * @return subscribeExpressName
	 	*/
		private String getSubscribeExpressName(){
			return subscribeExpressName;
		}

		/**
		 * 预约承运商名称 
	 	 * @param subscribeExpressName
		*/
		public void setSubscribeExpressName(String subscribeExpressName) {
			this.subscribeExpressName = subscribeExpressName;
		}
		/**
		 * 承运商到库房提货时间 
		 * @return subscribeTime
	 	*/
		private java.util.Date getSubscribeTime(){
			return subscribeTime;
		}

		/**
		 * 承运商到库房提货时间 
	 	 * @param subscribeTime
		*/
		public void setSubscribeTime(java.util.Date subscribeTime) {
			this.subscribeTime = subscribeTime;
		}
		/**
		 * 0否,10裸机,20联通合约,30移动合约,40电信合约 
		 * @return contractType
	 	*/
		private Integer getContractType(){
			return contractType;
		}

		/**
		 * 0否,10裸机,20联通合约,30移动合约,40电信合约 
	 	 * @param contractType
		*/
		public void setContractType(Integer contractType) {
			this.contractType = contractType;
		}
		/**
		 * 身份证 
		 * @return IDCard
	 	*/
		private String getIDCard(){
			return IDCard;
		}

		/**
		 * 身份证 
	 	 * @param IDCard
		*/
		public void setIDCard(String IDCard) {
			this.IDCard = IDCard;
		}
		/**
		 * 合约机号 
		 * @return contractNumber
	 	*/
		private String getContractNumber(){
			return contractNumber;
		}

		/**
		 * 合约机号 
	 	 * @param contractNumber
		*/
		public void setContractNumber(String contractNumber) {
			this.contractNumber = contractNumber;
		}
		/**
		 * 渠道 
		 * @return orderChannel
	 	*/
		private String getOrderChannel(){
			return orderChannel;
		}

		/**
		 * 渠道 
	 	 * @param orderChannel
		*/
		public void setOrderChannel(String orderChannel) {
			this.orderChannel = orderChannel;
		}
	
}