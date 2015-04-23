package com.netease.finance.constant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CcbCrossConstant
{

	public static final String ACTION_CROSS_PURCHASING = "purchasing";
	public static final String ACTION_CROSS_PAYMENT = "payment";
	public static final String ACTION_BATCH_STATE_QUERY = "queryState";
	public static final String ACTION_SINGLE_OUT_QUERY = "singleOutQuery";
	public static final String ACTION_REPORT_REDUCTION = "reportReduction";

	public static final String CUSTOM_ID = "P3301001702180#1V"; //网银客户号
	public static final String USER_ID = "WLPT07"; //外联操作员
	public static final String PASSWORD = "111111"; //操作员密码
	public static final String TXCODE_CROSS_PAY = "6W5004"; //跨境支付交易码
	public static final String TXCODE_FILE_UPLOAD = "6W0112"; //文件上传操作码
	public static final String TXCODE_FILE_DOWNLOAD = "6W0111"; //文件下载操作码
	public static final String LANGUAGE = "CN"; //语言

	//子交易码
	public static final String SUBTX_CROSS_PURCHASING = "TP2001"; //购结汇
	public static final String SUBTX_CROSS_SINGLE_OUT_QUERY = "TP2002"; //购结汇掉单查询
	public static final String SUBTX_CROSS_PAYMENT = "TP2003"; //付汇	
	public static final String SUBTX_CROSS_RECEIPT = "TP2004"; //收汇	
	public static final String SUBTX_CROSS_REPORT_REDUCTION = "TP2005"; //还原申报	
	public static final String SUBTX_CROSS_BATCH_STATE_QUERY = "TP2006"; //批次状态查询

	public static final String OPERATER_GRADE = "3";//操作员级别
	public static final String USER_NAME = "WLPT07"; //外联操作员
	public static final String FUNCID = "330000004"; //功能id
	public static final String DEPT_CODE = "08001"; //网易宝单位编码
	public static final String TRADE_ROAD = "2";//交易渠道：外联

	//业务类型
	public static final String TRADE_ATTR_GH = "GH";//购汇
	public static final String TRADE_ATTR_JH = "JH";//结汇
	public static final String TRADE_ATTR_HC = "HC";//汇出
	//客户类型
	public static final String TRADE_FLAG_PERSONAL = "01";//个人客户
	public static final String TRADE_FLAG_ORGANIZATION = "02";//机构客户

	public static final String PROGRESSFLAG = "0";//处理标志

	//明细文件摘要头
	public static final String REMARK_PURCHASING = "网易宝购汇明细文件";
	public static final String REMARK_PAYMENT = "网易宝付汇明细文件";
	public static final String CARD_NO = "12345678901234567890";//任意真实账号即可
	public static final String CURCODE = "14"; //购汇币种-14-美元
	public static final String CURTYPE = "USD"; //购汇币种-USD-美元
	public static final String ACCNAME2 = "网易宝有限公司";//购汇申请主体名称
	public static final String ACCDEPTNAME2 = "WYB001";//购汇申请主体组织机构代码

	//填报人电话
	public static final String PHONE_NUMBER = "15700099461";
	//交易编码
	public static final String TRADE_CODE = "122030";//未纳入海关统计的网络购物

	public static final String SERVER = "10.120.83.222"; //建行服务器ip
	public static final int PORT = 8888; //建行服务器端口

	public static final String ENCODE = "GB2312";
	public static final BigDecimal EXCHANGE_RATE = new BigDecimal("6.23");//人民币美元汇率,随便写的,后期调汇率接口查询
	//交易日期格式
	public static final String DATE_FORMATE_YYYYMMDD = "yyyyMMdd";
	//超时时间
	public static final int DEFAULT_TIME_OUT = 5000;//设置读超时时间

	public static final String RETURN_CODE_SUCCESS = "000000";
	public static final String TRADE_FLAG_SUCESS = "00";
	public static final String DEFAULT_VALUE = "0";
	public static final String DEFAULT_ACCTNO_VALUE = "000";
	public static final String DEFAULT_COUNTERNO_VALUE = "330000000";
	public static final String ERROR_CODE_UNSIGN = "42001";
	public static final Map<String, String> MAP_NETEASE_CODE = new HashMap<String, String>();
	public static final Map<String, String> MAP_NETEASE_MSG = new HashMap<String, String>();
	public static final List<String> LIST_USER_ERROR_CODE = new ArrayList<String>();
	static
	{
		LIST_USER_ERROR_CODE.add("8330ZX209999");//客户编号不存在,卡档记录不存在,余额不足
		LIST_USER_ERROR_CODE.add("81001");//身份校验错误
		LIST_USER_ERROR_CODE.add("81003");//手机号校验错误
		LIST_USER_ERROR_CODE.add("41001");//账户状态异常
		LIST_USER_ERROR_CODE.add("42001");//该账户尚未通过验证,该账户未签约

		MAP_NETEASE_CODE.put("8330ZX209999", "6019");//客户编号不存在,卡档记录不存,余额不足 请咨询银行
		MAP_NETEASE_CODE.put("8330ZX100002", "6014");//系统暂时无法处理您的交易，请稍后再试 银行内部错误
		MAP_NETEASE_CODE.put("0250E2000003", "6014");//flowexceed6F0001 银行内部错误
		MAP_NETEASE_CODE.put("0250E2000004", "6014");//交易状态不确定 银行内部错误
		MAP_NETEASE_CODE.put("WLPT_Err1001", "6014");//通讯超时(12002)（如果该笔交易为帐务交易，则处理结果不确定，请先核对明细！） 银行内部错误
		MAP_NETEASE_CODE.put("WLPT_Err1015", "6014");//连接服务器失败(12152)（如果该笔交易为帐务交易，则处理结果不确定，请先核对明细！） 银行内部错误
		MAP_NETEASE_CODE.put("81001", "6019");//身份校验错误 请咨询银行
		MAP_NETEASE_CODE.put("81002", "6019");//姓名校验错误 请咨询银行
		MAP_NETEASE_CODE.put("81003", "6019");//手机号校验错误 请咨询银行
		MAP_NETEASE_CODE.put("41001", "6007");//账户状态异常 银行卡异常
		MAP_NETEASE_CODE.put("42001", "6019");//该账户尚未通过验证,该账户未签约 请咨询银行

		MAP_NETEASE_MSG.put("8330ZX100002", "银行系统内部错误，请稍后再试");//系统暂时无法处理您的交易，请稍后再试
		MAP_NETEASE_MSG.put("0250E2000003", "银行系统内部错误，请稍后再试");//flowexceed6F0001
		MAP_NETEASE_MSG.put("0250E2000004", "银行系统内部错误，请稍后再试");//交易状态不确定
		MAP_NETEASE_MSG.put("WLPT_Err1001", "银行系统内部错误，请稍后再试");//通讯超时(12002)（如果该笔交易为帐务交易，则处理结果不确定，请先核对明细！）
		MAP_NETEASE_MSG.put("WLPT_Err1015", "银行系统内部错误，请稍后再试");//连接服务器失败(12152)（如果该笔交易为帐务交易，则处理结果不确定，请先核对明细！）
		MAP_NETEASE_MSG.put("81001", "身份证号校验错误");//身份校验错误
	}
	public final static String RESULT_SUCCESS = "success";
	public final static String RESULT_FAIL = "fail";
	public static final String LOCAL_REMOTE = "1"; //0-网银文件服务器，1-网银后端系统
	public static final String UPFILEPATH = "330000000";//浙江建行
	public static final String KEEP_FILENAME = "1";//0或空-系统重新命名，1-保持原文件名
	public static final String KEEP_FILENAME2 = "1";//1-保持原文件名

}
