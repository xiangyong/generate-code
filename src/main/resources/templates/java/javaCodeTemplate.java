/**
*
*@author 自动生成
*${table.tableName}
*${table.tableComment}
*/
public class {table.tableComment}{
	<!--循环字段列表来生成属性值-->
	<#list table.columnList as column>
		/**
	 	*${column.columnComment} 
	 	*/
		private ${column.columnType} ${column.columnName};
	</#list>
	
	<!--循环字段列表来生成get，set方法-->
	<#list table.columnList as column>
		/**
		 * 
		 * @return ${column.columnName}
	 	*/
		private ${column.columnType} get${column.columnName?cap_first}(){
			return ${column.columnName};
		}

		/**
		 * 
	 	 * @param ${column.columnName}
		*/
		public void set${column.columnName?cap_first}(${column.columnType} ${column.columnName}) {
			this.${column.columnName} = ${column.columnName};
		}
	</#list>
	
}