package com.letv.ofc.controller;
   

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.letv.common.utils.page.PageUtil;
import com.letv.common.utils.wrap.WrapMapper;
import com.letv.common.utils.wrap.Wrapper;
import com.letv.ofc.controller.base.BaseController;
import com.letv.ofc.domain.EqualGoods;
import com.letv.ofc.domain.query.EqualGoodsQuery;
import com.letv.ofc.proxy.service.SkuServiceProxy;
import com.letv.ofc.service.EqualGoodsService;
import com.letv.ofc.utils.exceptions.ExistedException;


/**
 * EqualGoodsController ：等价物料表控制器
 * 
 * @author zhaohengchong
 * @version 2014-9-26 14:43:48
*/
@Controller
@RequestMapping("/equalGoods")
public class EqualGoodsController extends BaseController {

    @Autowired
    private EqualGoodsService equalGoodsService;

    /** 视图前缀 */
    private static final String viewPrefix ="equalGoods";
    
    private static final Log LOG = LogFactory.getLog(EqualGoodsController.class);

    /**
     * 分页 查询数据
     * 
     * @param model
     * @param page
     * @param query
     * @return
     */
    @RequestMapping(value = "")
    public String index(Model model, PageUtil page, EqualGoodsQuery query) {
        try {
        	Date dateTimes = new Date();
        	if(query.getStatus()!=null && query.getStatus()==1){
        		query.setTime(dateTimes);
        		query.setIsNo(1);
        	}else if(query.getStatus()!=null && query.getStatus()==10){
        		query.setTime(dateTimes);
        		query.setIsNo(0);
        		query.setStatus(1);
        	}
            List<EqualGoods> dataList = equalGoodsService.queryEqualGoodsListWithPage(query, page);
            model.addAttribute("dataList", dataList);// 数据集合
            
            model.addAttribute("query", query);// 查询参数
            model.addAttribute("page", page);// 分页
            model.addAttribute("dateTimes", dateTimes);// 分页
        } catch (Exception e) {
            LOG.error("equalGoods index has error.", e);
        }
        return viewPrefix + "/index";
    }

    /**
     * 等价物料表----添加跳转
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/addForward")
    public String addForward() {
        return viewPrefix + "/add";
    }

    /**
     * 等价物料表----添加
     * 
     * @param equalGoods
     * @return
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Wrapper<?> add(EqualGoods equalGoods) {
    	equalGoods.setCreateUser(getLoginUserName());
        try {
            if (equalGoodsService.insert(equalGoods)) {
                return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "添加成功！");
            } else {
                return WrapMapper.wrap(Wrapper.ERROR_CODE, "添加失败！");
            }
        } catch (ExistedException e) {
            LOG.warn("equalGoods add fail, exist equalGoods.");
            return WrapMapper.wrap(Wrapper.ERROR_CODE, "添加失败，已经存在");
        } catch (Exception e) {
            LOG.error("equalGoods add has error.", e);
            return WrapMapper.wrap(Wrapper.ERROR_CODE, "添加失败！");
        }
    }

    /**
     * 等价物料表----更新跳转
     * 
     * @param model
     * @param equalGoods
     * @return
     */
    @RequestMapping(value = "/updateForward")
    public String updateForward(Model model, EqualGoods equalGoods) {
        try {
            EqualGoods equalGoodsResult = equalGoodsService.getEqualGoodsById(equalGoods.getId());
            model.addAttribute("equalGoods", equalGoodsResult);
        } catch (Exception e) {
            LOG.error("equalGoods updateForward has error.", e);
        }
        return viewPrefix + "/update";
    }

    /**
     * 等价物料表----更新
     * 
     * @param model
     * @param equalGoods
     * @return
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Wrapper<?> update(Model model, EqualGoods equalGoods) {
    	equalGoods.setUpdateUser(getLoginUserName());
        try {
            if (equalGoodsService.update(equalGoods)) {
                return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "更新成功！");
            } else {
                return WrapMapper.wrap(Wrapper.ERROR_CODE, "更新失败！");
            }
        } catch (Exception e) {
            LOG.error("equalGoods update has error.", e);
            return WrapMapper.error();
        }
    }

    /**
     * 等价物料表----删除
     * 
     * @param equalGoods
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Wrapper<?> delete(EqualGoods equalGoods) {
        try {
            if (equalGoodsService.delete(equalGoods)) {
                return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "删除成功！");
            } else {
                return WrapMapper.wrap(Wrapper.ERROR_CODE, "删除失败！");
            }
        } catch (Exception e) {
            LOG.error("equalGoods delete has error.", e);
            return WrapMapper.error();
        }
    }

    /**
     * 等价物料表----查询-无分页
     * 
     * @param query
     * @return
     */
    @RequestMapping(value = "/query")
    @ResponseBody
    public Wrapper<?> query(EqualGoodsQuery query) {
        try {
            List<EqualGoods> list = equalGoodsService.queryEqualGoodsList(query);
            if (!CollectionUtils.isEmpty(list)) {
                return WrapMapper.wrap(Wrapper.SUCCESS_CODE, Wrapper.SUCCESS_MESSAGE, list);
            } else {
                return WrapMapper.wrap(Wrapper.ERROR_CODE, "查询配置信息失败！");
            }
        } catch (Exception e) {
            LOG.error("equalGoods query has error.", e);
            return WrapMapper.error();
        }
    }
    
    /**
     * 查询等价物料表详情
     * 
     * @param query
     * @return
     */
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public Wrapper<?> detail(EqualGoodsQuery query) {
        if (null == query || null == query.getId()) {
            return illegalArgument();
        }

        try {
            EqualGoods equalGoods = equalGoodsService.getEqualGoodsById(query.getId());
            if (equalGoods != null) {
                return new Wrapper<EqualGoods>().result(equalGoods);
            } else {
                return WrapMapper.wrap(Wrapper.ERROR_CODE, "查询等价物料表详情失败！");
            }
        } catch (Exception e) {
            LOG.warn("detail equalGoods has error.", e);
            return error();
        }
    }
    
    /**
	  * 查询商品信息
	  * */
	 	@RequestMapping(value = "/querySkuInfo", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
	 	@ResponseBody
	    public String queryArea(@RequestParam("skuNo") String skuNo){
	 		SkuServiceProxy skuService=new SkuServiceProxy();
		 String skuInfo="";
		try {
			skuInfo = skuService.querySku(skuNo);
		} catch (Exception e) {
			LOG.error(e);
		}
		 return skuInfo;
	 }
	 	/**
	 	 * 禁用启用
	 	 * */
	 	@RequestMapping(value = "/updateStatus", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
	 	@ResponseBody
	    public Wrapper<?> updateStatus(@RequestParam("ids") String ids){
		 String [] id=ids.split(",");
		 EqualGoods equalGoods=new EqualGoods();
		 equalGoods.setUpdateUser(getLoginUserName());
		 boolean flag=false;
		 for(int i=0;i<id.length;i++){
			 equalGoods.setId(Long.valueOf(id[i]));
			 EqualGoods equalGoods1=equalGoodsService.getEqualGoodsById(Long.valueOf(id[i]));
			 if(equalGoods1.getStatus()==1){
				 equalGoods.setStatus(5); 
			 }else{
				 equalGoods.setStatus(1); 
			 }
		try {
			flag = equalGoodsService.update(equalGoods);
		} catch (Exception e) {
			LOG.error(e);
			return WrapMapper.error();
		}
		 }
		 if(flag){
		 return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "启用禁用成功！");
		 }else{
		 return WrapMapper.wrap(Wrapper.ERROR_CODE, "启用禁用失败！"); 
		 }
	 }
}
