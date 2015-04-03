package com.peter.pms.domain.query;
/**
*
*@author 自动生成
*OrderIssuedMonitor
*订单寻源监控表
*/
public class OrderIssuedMonitorQuery{
	
		/**
	 	*主键 
	 	*/
		private Long id;
		/**
	 	*订单来源编码 
	 	*/
		private String orderWayCode;
		/**
	 	*订单来源名称 
	 	*/
		private String orderWayName;
		/**
	 	*订单类型编码 
	 	*/
		private String orderTypeCode;
		/**
	 	*订单类型名称 
	 	*/
		private String orderTypeName;
		/**
	 	*仓库ID 
	 	*/
		private String storageId;
		/**
	 	*仓库编码 
	 	*/
		private String storageCode;
		/**
	 	*库房名称 
	 	*/
		private String warehouseName;
		/**
	 	*销售部门编号 
	 	*/
		private String saleDepNo;
		/**
	 	*销售部门名称 
	 	*/
		private String saleDepName;
		/**
	 	*销售员编码 
	 	*/
		private String sellerId;
		/**
	 	*销售员姓名 
	 	*/
		private String sellerName;
		/**
	 	*客户编号 
	 	*/
		private String offlineCustomorNo;
		/**
	 	*客户名称 
	 	*/
		private String offlineCustomorName;
		/**
	 	*订单支付时间 
	 	*/
		private java.util.Date paymentTime;
		/**
	 	*商品编码 
	 	*/
		private String itemCode;
		/**
	 	*商品名称 
	 	*/
		private String itemName;
		/**
	 	*商品数量 
	 	*/
		private String quantity;
		/**
	 	*是否有效 
	 	*/
		private Integer yn;
		/**
	 	*创建时间 
	 	*/
		private java.util.Date createTime;
		/**
	 	*订单生成时间 
	 	*/
		private java.util.Date orderCtime;
	
	
		/**
		 * 主键 
		 * @return id
	 	*/
		private Long getId(){
			return id;
		}

		/**
		 * 主键 
	 	 * @param id
		*/
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * 订单来源编码 
		 * @return orderWayCode
	 	*/
		private String getOrderWayCode(){
			return orderWayCode;
		}

		/**
		 * 订单来源编码 
	 	 * @param orderWayCode
		*/
		public void setOrderWayCode(String orderWayCode) {
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
		private String getOrderTypeCode(){
			return orderTypeCode;
		}

		/**
		 * 订单类型编码 
	 	 * @param orderTypeCode
		*/
		public void setOrderTypeCode(String orderTypeCode) {
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
		private String getStorageId(){
			return storageId;
		}

		/**
		 * 仓库ID 
	 	 * @param storageId
		*/
		public void setStorageId(String storageId) {
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
		 * 库房名称 
		 * @return warehouseName
	 	*/
		private String getWarehouseName(){
			return warehouseName;
		}

		/**
		 * 库房名称 
	 	 * @param warehouseName
		*/
		public void setWarehouseName(String warehouseName) {
			this.warehouseName = warehouseName;
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
		 * 销售员编码 
		 * @return sellerId
	 	*/
		private String getSellerId(){
			return sellerId;
		}

		/**
		 * 销售员编码 
	 	 * @param sellerId
		*/
		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}
		/**
		 * 销售员姓名 
		 * @return sellerName
	 	*/
		private String getSellerName(){
			return sellerName;
		}

		/**
		 * 销售员姓名 
	 	 * @param sellerName
		*/
		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}
		/**
		 * 客户编号 
		 * @return offlineCustomorNo
	 	*/
		private String getOfflineCustomorNo(){
			return offlineCustomorNo;
		}

		/**
		 * 客户编号 
	 	 * @param offlineCustomorNo
		*/
		public void setOfflineCustomorNo(String offlineCustomorNo) {
			this.offlineCustomorNo = offlineCustomorNo;
		}
		/**
		 * 客户名称 
		 * @return offlineCustomorName
	 	*/
		private String getOfflineCustomorName(){
			return offlineCustomorName;
		}

		/**
		 * 客户名称 
	 	 * @param offlineCustomorName
		*/
		public void setOfflineCustomorName(String offlineCustomorName) {
			this.offlineCustomorName = offlineCustomorName;
		}
		/**
		 * 订单支付时间 
		 * @return paymentTime
	 	*/
		private java.util.Date getPaymentTime(){
			return paymentTime;
		}

		/**
		 * 订单支付时间 
	 	 * @param paymentTime
		*/
		public void setPaymentTime(java.util.Date paymentTime) {
			this.paymentTime = paymentTime;
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
		 * 商品数量 
		 * @return quantity
	 	*/
		private String getQuantity(){
			return quantity;
		}

		/**
		 * 商品数量 
	 	 * @param quantity
		*/
		public void setQuantity(String quantity) {
			this.quantity = quantity;
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
		 * 订单生成时间 
		 * @return orderCtime
	 	*/
		private java.util.Date getOrderCtime(){
			return orderCtime;
		}

		/**
		 * 订单生成时间 
	 	 * @param orderCtime
		*/
		public void setOrderCtime(java.util.Date orderCtime) {
			this.orderCtime = orderCtime;
		}
	
}