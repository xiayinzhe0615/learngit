package com.netease.finance.constant;

public class CommonConstant
{
	public final static String FILE_PATH = "/home/wyb/finance_upload";
//	public final static String FILE_PATH = "d:/wyb";
	
	public final static String DOWNLOAD_FILE_PATH = "/home/wyb/finance_download";
	
//	public final static String DOWNLOAD_FILE_PATH = "d:/wyb";
	
	public final static String INI_NAME_SETTLE_AUDIT_MAIL = "FINANCE_SETTLE_AUDIT_MAIL";
	
	public final static String MAIL_TEMPLATE_NAME = "";
	
	public final static String AUDIT_MAIL_TEMPLATE_NAME = "settleAuditMail.ftl";
	
	public final static String DEFAULT_AUDIT_MAIL = "liujianing@corp.netease.com";
	
	public final static String MAIL_SUBJECT = "商户备付金结算详情";

	public static final String HOST = "http://123.58.185.43/";
	
	public static final String P2P_CATEGORY= "p2p";   //p2p大类，在tb_common_closing与其他类进行区分
	
	public static final String DHB_CATEGORY="dhb";
	
	public static final String DHB_TYPE="dhb_handfee";
	
	public static final String INIT = "init";

	public static final String PASS = "pass";

	public static final String FAILED = "failed";
	
	public static final String SUCCESS = "success";
	
	public static final String CSV_SPLIT=",";
}
