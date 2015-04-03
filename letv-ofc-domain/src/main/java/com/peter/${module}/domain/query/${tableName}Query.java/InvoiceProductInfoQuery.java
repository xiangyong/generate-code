package com.peter.pms.domain.query;
/**
*
*@author 自动生成
*InvoiceProductInfo
*下发订单发票商品信息
*/
public class InvoiceProductInfoQuery{
	
		/**
	 	* 
	 	*/
		private Long ID;
		/**
	 	*下发订单主表ID 
	 	*/
		private String orderCode;
		/**
	 	*发票ID 
	 	*/
		private String invoiceId;
		/**
	 	*商品编码 
	 	*/
		private String skuNo;
		/**
	 	*商品单位 
	 	*/
		private String skuUnit;
		/**
	 	*商品数量 
	 	*/
		private Integer skuQuantity;
		/**
	 	*优惠后价格 
	 	*/
		private Double itemPrice;
		/**
	 	*商品优惠后单价 
	 	*/
		private Double skuPrice;
		/**
	 	*发票金额 
	 	*/
		private Double amount;
		/**
	 	*税率 
	 	*/
		private Double taxRate;
		/**
	 	*税额 
	 	*/
		private Double tax;
		/**
	 	*发票型号 
	 	*/
		private String invoiceType;
		/**
	 	*发票产品名称 
	 	*/
		private String invoiceProductName;
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
	 	*商品金额（税前） 
	 	*/
		private Double productAmount;
	
	
		/**
		 *  
		 * @return ID
	 	*/
		private Long getID(){
			return ID;
		}

		/**
		 *  
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
		 * 发票ID 
		 * @return invoiceId
	 	*/
		private String getInvoiceId(){
			return invoiceId;
		}

		/**
		 * 发票ID 
	 	 * @param invoiceId
		*/
		public void setInvoiceId(String invoiceId) {
			this.invoiceId = invoiceId;
		}
		/**
		 * 商品编码 
		 * @return skuNo
	 	*/
		private String getSkuNo(){
			return skuNo;
		}

		/**
		 * 商品编码 
	 	 * @param skuNo
		*/
		public void setSkuNo(String skuNo) {
			this.skuNo = skuNo;
		}
		/**
		 * 商品单位 
		 * @return skuUnit
	 	*/
		private String getSkuUnit(){
			return skuUnit;
		}

		/**
		 * 商品单位 
	 	 * @param skuUnit
		*/
		public void setSkuUnit(String skuUnit) {
			this.skuUnit = skuUnit;
		}
		/**
		 * 商品数量 
		 * @return skuQuantity
	 	*/
		private Integer getSkuQuantity(){
			return skuQuantity;
		}

		/**
		 * 商品数量 
	 	 * @param skuQuantity
		*/
		public void setSkuQuantity(Integer skuQuantity) {
			this.skuQuantity = skuQuantity;
		}
		/**
		 * 优惠后价格 
		 * @return itemPrice
	 	*/
		private Double getItemPrice(){
			return itemPrice;
		}

		/**
		 * 优惠后价格 
	 	 * @param itemPrice
		*/
		public void setItemPrice(Double itemPrice) {
			this.itemPrice = itemPrice;
		}
		/**
		 * 商品优惠后单价 
		 * @return skuPrice
	 	*/
		private Double getSkuPrice(){
			return skuPrice;
		}

		/**
		 * 商品优惠后单价 
	 	 * @param skuPrice
		*/
		public void setSkuPrice(Double skuPrice) {
			this.skuPrice = skuPrice;
		}
		/**
		 * 发票金额 
		 * @return amount
	 	*/
		private Double getAmount(){
			return amount;
		}

		/**
		 * 发票金额 
	 	 * @param amount
		*/
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		/**
		 * 税率 
		 * @return taxRate
	 	*/
		private Double getTaxRate(){
			return taxRate;
		}

		/**
		 * 税率 
	 	 * @param taxRate
		*/
		public void setTaxRate(Double taxRate) {
			this.taxRate = taxRate;
		}
		/**
		 * 税额 
		 * @return tax
	 	*/
		private Double getTax(){
			return tax;
		}

		/**
		 * 税额 
	 	 * @param tax
		*/
		public void setTax(Double tax) {
			this.tax = tax;
		}
		/**
		 * 发票型号 
		 * @return invoiceType
	 	*/
		private String getInvoiceType(){
			return invoiceType;
		}

		/**
		 * 发票型号 
	 	 * @param invoiceType
		*/
		public void setInvoiceType(String invoiceType) {
			this.invoiceType = invoiceType;
		}
		/**
		 * 发票产品名称 
		 * @return invoiceProductName
	 	*/
		private String getInvoiceProductName(){
			return invoiceProductName;
		}

		/**
		 * 发票产品名称 
	 	 * @param invoiceProductName
		*/
		public void setInvoiceProductName(String invoiceProductName) {
			this.invoiceProductName = invoiceProductName;
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
		 * 商品金额（税前） 
		 * @return productAmount
	 	*/
		private Double getProductAmount(){
			return productAmount;
		}

		/**
		 * 商品金额（税前） 
	 	 * @param productAmount
		*/
		public void setProductAmount(Double productAmount) {
			this.productAmount = productAmount;
		}
	
}