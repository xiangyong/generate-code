package com.peter.pms.domain;
/**
*
*@author 自动生成
*OrderItemInfo
*下发订单商品明细
*/
public class OrderItemInfo{
	
		/**
	 	*id 
	 	*/
		private Long id;
		/**
	 	*下发订单主表ID 
	 	*/
		private String orderCode;
		/**
	 	*货主ID 
	 	*/
		private String providerTpId;
		/**
	 	*商品编码 
	 	*/
		private String itemCode;
		/**
	 	*商品名称 
	 	*/
		private String itemName;
		/**
	 	*商品状态 
	 	*/
		private String inventoryType;
		/**
	 	*商品等级 
	 	*/
		private String itemLevel;
		/**
	 	*最后商品数量 
	 	*/
		private Long itemQuantity;
		/**
	 	*优惠后价格 
	 	*/
		private Double itemPrice;
		/**
	 	*type 
	 	*/
		private Integer type;
		/**
	 	*商品单位 
	 	*/
		private String unit;
		/**
	 	*商品一级品类 
	 	*/
		private String categoryNoOne;
		/**
	 	*商品三级品类 
	 	*/
		private String categoryNoThree;
		/**
	 	*promotion_id 
	 	*/
		private String promotionId;
		/**
	 	*product_id 
	 	*/
		private String productId;
		/**
	 	*原商品编码 
	 	*/
		private String pcode;
		/**
	 	*商品数量 
	 	*/
		private Integer quantity;
		/**
	 	* 
	 	*/
		private Integer quantityInGroup;
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
	 	*下发商品编码 
	 	*/
		private String issuedGoodsNo;
		/**
	 	*下发商品名称 
	 	*/
		private String issuedGoodsName;
		/**
	 	*是否主商品 
	 	*/
		private Integer isMain;
		/**
	 	*是否虚拟 
	 	*/
		private Integer isVirtual;
	
	
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
		 * 货主ID 
		 * @return providerTpId
	 	*/
		private String getProviderTpId(){
			return providerTpId;
		}

		/**
		 * 货主ID 
	 	 * @param providerTpId
		*/
		public void setProviderTpId(String providerTpId) {
			this.providerTpId = providerTpId;
		}
		/**
		 * 商品编码 
		 * @return itemCode
	 	*/
		private String getItemCode(){
			return itemCode;
		}

		/**
		 * 商品编码 
	 	 * @param itemCode
		*/
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		/**
		 * 商品名称 
		 * @return itemName
	 	*/
		private String getItemName(){
			return itemName;
		}

		/**
		 * 商品名称 
	 	 * @param itemName
		*/
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		/**
		 * 商品状态 
		 * @return inventoryType
	 	*/
		private String getInventoryType(){
			return inventoryType;
		}

		/**
		 * 商品状态 
	 	 * @param inventoryType
		*/
		public void setInventoryType(String inventoryType) {
			this.inventoryType = inventoryType;
		}
		/**
		 * 商品等级 
		 * @return itemLevel
	 	*/
		private String getItemLevel(){
			return itemLevel;
		}

		/**
		 * 商品等级 
	 	 * @param itemLevel
		*/
		public void setItemLevel(String itemLevel) {
			this.itemLevel = itemLevel;
		}
		/**
		 * 最后商品数量 
		 * @return itemQuantity
	 	*/
		private Long getItemQuantity(){
			return itemQuantity;
		}

		/**
		 * 最后商品数量 
	 	 * @param itemQuantity
		*/
		public void setItemQuantity(Long itemQuantity) {
			this.itemQuantity = itemQuantity;
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
		 * type 
		 * @return type
	 	*/
		private Integer getType(){
			return type;
		}

		/**
		 * type 
	 	 * @param type
		*/
		public void setType(Integer type) {
			this.type = type;
		}
		/**
		 * 商品单位 
		 * @return unit
	 	*/
		private String getUnit(){
			return unit;
		}

		/**
		 * 商品单位 
	 	 * @param unit
		*/
		public void setUnit(String unit) {
			this.unit = unit;
		}
		/**
		 * 商品一级品类 
		 * @return categoryNoOne
	 	*/
		private String getCategoryNoOne(){
			return categoryNoOne;
		}

		/**
		 * 商品一级品类 
	 	 * @param categoryNoOne
		*/
		public void setCategoryNoOne(String categoryNoOne) {
			this.categoryNoOne = categoryNoOne;
		}
		/**
		 * 商品三级品类 
		 * @return categoryNoThree
	 	*/
		private String getCategoryNoThree(){
			return categoryNoThree;
		}

		/**
		 * 商品三级品类 
	 	 * @param categoryNoThree
		*/
		public void setCategoryNoThree(String categoryNoThree) {
			this.categoryNoThree = categoryNoThree;
		}
		/**
		 * promotion_id 
		 * @return promotionId
	 	*/
		private String getPromotionId(){
			return promotionId;
		}

		/**
		 * promotion_id 
	 	 * @param promotionId
		*/
		public void setPromotionId(String promotionId) {
			this.promotionId = promotionId;
		}
		/**
		 * product_id 
		 * @return productId
	 	*/
		private String getProductId(){
			return productId;
		}

		/**
		 * product_id 
	 	 * @param productId
		*/
		public void setProductId(String productId) {
			this.productId = productId;
		}
		/**
		 * 原商品编码 
		 * @return pcode
	 	*/
		private String getPcode(){
			return pcode;
		}

		/**
		 * 原商品编码 
	 	 * @param pcode
		*/
		public void setPcode(String pcode) {
			this.pcode = pcode;
		}
		/**
		 * 商品数量 
		 * @return quantity
	 	*/
		private Integer getQuantity(){
			return quantity;
		}

		/**
		 * 商品数量 
	 	 * @param quantity
		*/
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		/**
		 *  
		 * @return quantityInGroup
	 	*/
		private Integer getQuantityInGroup(){
			return quantityInGroup;
		}

		/**
		 *  
	 	 * @param quantityInGroup
		*/
		public void setQuantityInGroup(Integer quantityInGroup) {
			this.quantityInGroup = quantityInGroup;
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
		 * 下发商品编码 
		 * @return issuedGoodsNo
	 	*/
		private String getIssuedGoodsNo(){
			return issuedGoodsNo;
		}

		/**
		 * 下发商品编码 
	 	 * @param issuedGoodsNo
		*/
		public void setIssuedGoodsNo(String issuedGoodsNo) {
			this.issuedGoodsNo = issuedGoodsNo;
		}
		/**
		 * 下发商品名称 
		 * @return issuedGoodsName
	 	*/
		private String getIssuedGoodsName(){
			return issuedGoodsName;
		}

		/**
		 * 下发商品名称 
	 	 * @param issuedGoodsName
		*/
		public void setIssuedGoodsName(String issuedGoodsName) {
			this.issuedGoodsName = issuedGoodsName;
		}
		/**
		 * 是否主商品 
		 * @return isMain
	 	*/
		private Integer getIsMain(){
			return isMain;
		}

		/**
		 * 是否主商品 
	 	 * @param isMain
		*/
		public void setIsMain(Integer isMain) {
			this.isMain = isMain;
		}
		/**
		 * 是否虚拟 
		 * @return isVirtual
	 	*/
		private Integer getIsVirtual(){
			return isVirtual;
		}

		/**
		 * 是否虚拟 
	 	 * @param isVirtual
		*/
		public void setIsVirtual(Integer isVirtual) {
			this.isVirtual = isVirtual;
		}
	
}