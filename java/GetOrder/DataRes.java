package GetOrder;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetOrder.NotifyPopup;

public final class DataRes extends Message {
  public static final String DEFAULT_CALL_TYPE = "";
  
  public static final Long DEFAULT_CUSTOMERID;
  
  public static final Integer DEFAULT_DEVICETYPE;
  
  public static final String DEFAULT_EXTDATA = "";
  
  public static final String DEFAULT_IMEI = "";
  
  public static final String DEFAULT_ITEMINFO = "";
  
  public static final String DEFAULT_MOBILE = "";
  
  public static final String DEFAULT_NOTIFYURL = "";
  
  public static final Integer DEFAULT_ORDERCREATETIME;
  
  public static final String DEFAULT_ORDERID = "";
  
  public static final Long DEFAULT_ORIGINALAMOUNT;
  
  public static final String DEFAULT_PASSUID = "";
  
  public static final Long DEFAULT_PAYAMOUNT;
  
  public static final String DEFAULT_PAY_CHANNEL = "";
  
  public static final String DEFAULT_PAY_URL = "";
  
  public static final Integer DEFAULT_SDK;
  
  public static final Integer DEFAULT_SDKSTYLE;
  
  public static final String DEFAULT_SERVICE = "";
  
  public static final String DEFAULT_SIGN = "";
  
  public static final Integer DEFAULT_SIGNTYPE;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TN = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String call_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long customerId;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer deviceType;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String extData;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String imei;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String itemInfo;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String mobile;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String notifyUrl;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer orderCreateTime;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String orderId;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long originalAmount;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String passuid;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long payAmount;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String pay_channel;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String pay_url;
  
  @ProtoField(tag = 21)
  public final NotifyPopup popup;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer sdk;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer sdkStyle;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String service;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String sign;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer signType;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String tn;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1502074226, "Ltbclient/GetOrder/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1502074226, "Ltbclient/GetOrder/DataRes;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_CUSTOMERID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_ORDERCREATETIME = integer;
    DEFAULT_DEVICETYPE = integer;
    DEFAULT_PAYAMOUNT = long_;
    DEFAULT_ORIGINALAMOUNT = long_;
    DEFAULT_SDK = integer;
    DEFAULT_SDKSTYLE = integer;
    DEFAULT_SIGNTYPE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.customerId;
      if (long_2 == null) {
        this.customerId = DEFAULT_CUSTOMERID;
      } else {
        this.customerId = long_2;
      } 
      String str4 = paramBuilder.service;
      if (str4 == null) {
        this.service = "";
      } else {
        this.service = str4;
      } 
      str4 = paramBuilder.orderId;
      if (str4 == null) {
        this.orderId = "";
      } else {
        this.orderId = str4;
      } 
      Integer integer3 = paramBuilder.orderCreateTime;
      if (integer3 == null) {
        this.orderCreateTime = DEFAULT_ORDERCREATETIME;
      } else {
        this.orderCreateTime = integer3;
      } 
      integer3 = paramBuilder.deviceType;
      if (integer3 == null) {
        this.deviceType = DEFAULT_DEVICETYPE;
      } else {
        this.deviceType = integer3;
      } 
      Long long_1 = paramBuilder.payAmount;
      if (long_1 == null) {
        this.payAmount = DEFAULT_PAYAMOUNT;
      } else {
        this.payAmount = long_1;
      } 
      long_1 = paramBuilder.originalAmount;
      if (long_1 == null) {
        this.originalAmount = DEFAULT_ORIGINALAMOUNT;
      } else {
        this.originalAmount = long_1;
      } 
      String str3 = paramBuilder.notifyUrl;
      if (str3 == null) {
        this.notifyUrl = "";
      } else {
        this.notifyUrl = str3;
      } 
      str3 = paramBuilder.passuid;
      if (str3 == null) {
        this.passuid = "";
      } else {
        this.passuid = str3;
      } 
      str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.tn;
      if (str3 == null) {
        this.tn = "";
      } else {
        this.tn = str3;
      } 
      str3 = paramBuilder.url;
      if (str3 == null) {
        this.url = "";
      } else {
        this.url = str3;
      } 
      str3 = paramBuilder.mobile;
      if (str3 == null) {
        this.mobile = "";
      } else {
        this.mobile = str3;
      } 
      str3 = paramBuilder.itemInfo;
      if (str3 == null) {
        this.itemInfo = "";
      } else {
        this.itemInfo = str3;
      } 
      str3 = paramBuilder.imei;
      if (str3 == null) {
        this.imei = "";
      } else {
        this.imei = str3;
      } 
      Integer integer2 = paramBuilder.sdk;
      if (integer2 == null) {
        this.sdk = DEFAULT_SDK;
      } else {
        this.sdk = integer2;
      } 
      integer2 = paramBuilder.sdkStyle;
      if (integer2 == null) {
        this.sdkStyle = DEFAULT_SDKSTYLE;
      } else {
        this.sdkStyle = integer2;
      } 
      String str2 = paramBuilder.extData;
      if (str2 == null) {
        this.extData = "";
      } else {
        this.extData = str2;
      } 
      Integer integer1 = paramBuilder.signType;
      if (integer1 == null) {
        this.signType = DEFAULT_SIGNTYPE;
      } else {
        this.signType = integer1;
      } 
      String str1 = paramBuilder.sign;
      if (str1 == null) {
        this.sign = "";
      } else {
        this.sign = str1;
      } 
      this.popup = paramBuilder.popup;
      str1 = paramBuilder.pay_url;
      if (str1 == null) {
        this.pay_url = "";
      } else {
        this.pay_url = str1;
      } 
      str1 = paramBuilder.call_type;
      if (str1 == null) {
        this.call_type = "";
      } else {
        this.call_type = str1;
      } 
      str = paramBuilder.pay_channel;
      if (str == null) {
        this.pay_channel = "";
      } else {
        this.pay_channel = str;
      } 
    } else {
      this.customerId = ((Builder)str).customerId;
      this.service = ((Builder)str).service;
      this.orderId = ((Builder)str).orderId;
      this.orderCreateTime = ((Builder)str).orderCreateTime;
      this.deviceType = ((Builder)str).deviceType;
      this.payAmount = ((Builder)str).payAmount;
      this.originalAmount = ((Builder)str).originalAmount;
      this.notifyUrl = ((Builder)str).notifyUrl;
      this.passuid = ((Builder)str).passuid;
      this.title = ((Builder)str).title;
      this.tn = ((Builder)str).tn;
      this.url = ((Builder)str).url;
      this.mobile = ((Builder)str).mobile;
      this.itemInfo = ((Builder)str).itemInfo;
      this.imei = ((Builder)str).imei;
      this.sdk = ((Builder)str).sdk;
      this.sdkStyle = ((Builder)str).sdkStyle;
      this.extData = ((Builder)str).extData;
      this.signType = ((Builder)str).signType;
      this.sign = ((Builder)str).sign;
      this.popup = ((Builder)str).popup;
      this.pay_url = ((Builder)str).pay_url;
      this.call_type = ((Builder)str).call_type;
      this.pay_channel = ((Builder)str).pay_channel;
    } 
  }
}
