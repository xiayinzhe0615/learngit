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

}
