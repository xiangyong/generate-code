package com.peter.pms.domain;
/**
*
*@author 自动生成
*RequestInfo
*
*/
public class RequestInfo{
	
		/**
	 	*ID 
	 	*/
		private Long id;
		/**
	 	*接口类型 
	 	*/
		private Integer type;
		/**
	 	*请求状态 
	 	*/
		private Integer requestStatus;
		/**
	 	*请求类型 
	 	*/
		private Integer requestType;
		/**
	 	* 
	 	*/
		private String requestUrl;
		/**
	 	*请求协议 
	 	*/
		private String requestProtocol;
		/**
	 	*请求方式 
	 	*/
		private Integer requestMethod;
		/**
	 	*关键字1 
	 	*/
		private String keyword1;
		/**
	 	*关键字2 
	 	*/
		private String keyword2;
		/**
	 	*请求内容 
	 	*/
		private String requestContent;
		/**
	 	*请求时间 
	 	*/
		private java.util.Date requestTime;
		/**
	 	*请求服务方 
	 	*/
		private String requestService;
		/**
	 	*返回结果 
	 	*/
		private String responseResult;
		/**
	 	*返回时间 
	 	*/
		private java.util.Date responseTime;
		/**
	 	*调用执行时间 
	 	*/
		private Integer execTime;
		/**
	 	*创建时间 
	 	*/
		private java.util.Date createTime;
		/**
	 	*更新时间 
	 	*/
		private java.util.Date updateTime;
		/**
	 	*1,有效；0，无效 
	 	*/
		private Integer yn;
	
	
		/**
		 * ID 
		 * @return id
	 	*/
		private Long getId(){
			return id;
		}

		/**
		 * ID 
	 	 * @param id
		*/
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * 接口类型 
		 * @return type
	 	*/
		private Integer getType(){
			return type;
		}

		/**
		 * 接口类型 
	 	 * @param type
		*/
		public void setType(Integer type) {
			this.type = type;
		}
		/**
		 * 请求状态 
		 * @return requestStatus
	 	*/
		private Integer getRequestStatus(){
			return requestStatus;
		}

		/**
		 * 请求状态 
	 	 * @param requestStatus
		*/
		public void setRequestStatus(Integer requestStatus) {
			this.requestStatus = requestStatus;
		}
		/**
		 * 请求类型 
		 * @return requestType
	 	*/
		private Integer getRequestType(){
			return requestType;
		}

		/**
		 * 请求类型 
	 	 * @param requestType
		*/
		public void setRequestType(Integer requestType) {
			this.requestType = requestType;
		}
		/**
		 *  
		 * @return requestUrl
	 	*/
		private String getRequestUrl(){
			return requestUrl;
		}

		/**
		 *  
	 	 * @param requestUrl
		*/
		public void setRequestUrl(String requestUrl) {
			this.requestUrl = requestUrl;
		}
		/**
		 * 请求协议 
		 * @return requestProtocol
	 	*/
		private String getRequestProtocol(){
			return requestProtocol;
		}

		/**
		 * 请求协议 
	 	 * @param requestProtocol
		*/
		public void setRequestProtocol(String requestProtocol) {
			this.requestProtocol = requestProtocol;
		}
		/**
		 * 请求方式 
		 * @return requestMethod
	 	*/
		private Integer getRequestMethod(){
			return requestMethod;
		}

		/**
		 * 请求方式 
	 	 * @param requestMethod
		*/
		public void setRequestMethod(Integer requestMethod) {
			this.requestMethod = requestMethod;
		}
		/**
		 * 关键字1 
		 * @return keyword1
	 	*/
		private String getKeyword1(){
			return keyword1;
		}

		/**
		 * 关键字1 
	 	 * @param keyword1
		*/
		public void setKeyword1(String keyword1) {
			this.keyword1 = keyword1;
		}
		/**
		 * 关键字2 
		 * @return keyword2
	 	*/
		private String getKeyword2(){
			return keyword2;
		}

		/**
		 * 关键字2 
	 	 * @param keyword2
		*/
		public void setKeyword2(String keyword2) {
			this.keyword2 = keyword2;
		}
		/**
		 * 请求内容 
		 * @return requestContent
	 	*/
		private String getRequestContent(){
			return requestContent;
		}

		/**
		 * 请求内容 
	 	 * @param requestContent
		*/
		public void setRequestContent(String requestContent) {
			this.requestContent = requestContent;
		}
		/**
		 * 请求时间 
		 * @return requestTime
	 	*/
		private java.util.Date getRequestTime(){
			return requestTime;
		}

		/**
		 * 请求时间 
	 	 * @param requestTime
		*/
		public void setRequestTime(java.util.Date requestTime) {
			this.requestTime = requestTime;
		}
		/**
		 * 请求服务方 
		 * @return requestService
	 	*/
		private String getRequestService(){
			return requestService;
		}

		/**
		 * 请求服务方 
	 	 * @param requestService
		*/
		public void setRequestService(String requestService) {
			this.requestService = requestService;
		}
		/**
		 * 返回结果 
		 * @return responseResult
	 	*/
		private String getResponseResult(){
			return responseResult;
		}

		/**
		 * 返回结果 
	 	 * @param responseResult
		*/
		public void setResponseResult(String responseResult) {
			this.responseResult = responseResult;
		}
		/**
		 * 返回时间 
		 * @return responseTime
	 	*/
		private java.util.Date getResponseTime(){
			return responseTime;
		}

		/**
		 * 返回时间 
	 	 * @param responseTime
		*/
		public void setResponseTime(java.util.Date responseTime) {
			this.responseTime = responseTime;
		}
		/**
		 * 调用执行时间 
		 * @return execTime
	 	*/
		private Integer getExecTime(){
			return execTime;
		}

		/**
		 * 调用执行时间 
	 	 * @param execTime
		*/
		public void setExecTime(Integer execTime) {
			this.execTime = execTime;
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
		 * 1,有效；0，无效 
		 * @return yn
	 	*/
		private Integer getYn(){
			return yn;
		}

		/**
		 * 1,有效；0，无效 
	 	 * @param yn
		*/
		public void setYn(Integer yn) {
			this.yn = yn;
		}
	
}