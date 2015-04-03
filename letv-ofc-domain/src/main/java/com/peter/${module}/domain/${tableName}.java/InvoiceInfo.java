package com.peter.pms.domain;
/**
*
*@author 自动生成
*InvoiceInfo
*下发订单发票
*/
public class InvoiceInfo{
	
		/**
	 	*ID 
	 	*/
		private Long ID;
		/**
	 	*下发订单主表ID 
	 	*/
		private String orderCode;
		/**
	 	*发票id 
	 	*/
		private String invoiceId;
		/**
	 	*发票编码 
	 	*/
		private String invoiceTypeCode;
		/**
	 	*发票名称 
	 	*/
		private String invoiceTypeName;
		/**
	 	*发票的合计金额 
	 	*/
		private String totalAmount;
		/**
	 	*发票抬头 
	 	*/
		private String title;
		/**
	 	*订单号ORDER_ID 
	 	*/
		private String remark;
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
		 * ID 
		 * @return ID
	 	*/
		private Long getID(){
			return ID;
		}

		/**
		 * ID 
	 	 * @param ID
		*/
		public void setID(Long ID) {
			this.ID = ID;
		}
		/**
		 * 下发订单主表ID 
		 * @return orderCode
	 	*/
		private String getOrderCode(){
			return orderCode;
		}

		/**
		 * 下发订单主表ID 
	 	 * @param orderCode
		*/
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		/**
		 * 发票id 
		 * @return invoiceId
	 	*/
		private String getInvoiceId(){
			return invoiceId;
		}

		/**
		 * 发票id 
	 	 * @param invoiceId
		*/
		public void setInvoiceId(String invoiceId) {
			this.invoiceId = invoiceId;
		}
		/**
		 * 发票编码 
		 * @return invoiceTypeCode
	 	*/
		private String getInvoiceTypeCode(){
			return invoiceTypeCode;
		}

		/**
		 * 发票编码 
	 	 * @param invoiceTypeCode
		*/
		public void setInvoiceTypeCode(String invoiceTypeCode) {
			this.invoiceTypeCode = invoiceTypeCode;
		}
		/**
		 * 发票名称 
		 * @return invoiceTypeName
	 	*/
		private String getInvoiceTypeName(){
			return invoiceTypeName;
		}

		/**
		 * 发票名称 
	 	 * @param invoiceTypeName
		*/
		public void setInvoiceTypeName(String invoiceTypeName) {
			this.invoiceTypeName = invoiceTypeName;
		}
		/**
		 * 发票的合计金额 
		 * @return totalAmount
	 	*/
		private String getTotalAmount(){
			return totalAmount;
		}

		/**
		 * 发票的合计金额 
	 	 * @param totalAmount
		*/
		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}
		/**
		 * 发票抬头 
		 * @return title
	 	*/
		private String getTitle(){
			return title;
		}

		/**
		 * 发票抬头 
	 	 * @param title
		*/
		public void setTitle(String title) {
			this.title = title;
		}
		/**
		 * 订单号ORDER_ID 
		 * @return remark
	 	*/
		private String getRemark(){
			return remark;
		}

		/**
		 * 订单号ORDER_ID 
	 	 * @param remark
		*/
		public void setRemark(String remark) {
			this.remark = remark;
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
	
}