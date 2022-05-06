package PlaceOrder;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_ACCOUNT_ID;
  
  public static final Integer DEFAULT_ACCOUNT_TYPE;
  
  public static final Long DEFAULT_BENEFIT_USERID;
  
  public static final String DEFAULT_BENEFIT_USERNAME = "";
  
  public static final Integer DEFAULT_CURRENCY;
  
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final Integer DEFAULT_NUM;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final String DEFAULT_SCENE_FROM = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long account_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer account_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long benefit_userid;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String benefit_username;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer currency;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer num;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String scene_from;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(98506661, "Ltbclient/PlaceOrder/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(98506661, "Ltbclient/PlaceOrder/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_GIFT_ID = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_BENEFIT_USERID = long_;
    DEFAULT_NUM = integer;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    DEFAULT_ACCOUNT_ID = long_;
    DEFAULT_ACCOUNT_TYPE = integer;
    DEFAULT_CURRENCY = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str2 = paramBuilder.scene_from;
      if (str2 == null) {
        this.scene_from = "";
      } else {
        this.scene_from = str2;
      } 
      Integer integer3 = paramBuilder.gift_id;
      if (integer3 == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer3;
      } 
      Long long_2 = paramBuilder.benefit_userid;
      if (long_2 == null) {
        this.benefit_userid = DEFAULT_BENEFIT_USERID;
      } else {
        this.benefit_userid = long_2;
      } 
      String str1 = paramBuilder.benefit_username;
      if (str1 == null) {
        this.benefit_username = "";
      } else {
        this.benefit_username = str1;
      } 
      Integer integer2 = paramBuilder.num;
      if (integer2 == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer2;
      } 
      Long long_1 = paramBuilder.thread_id;
      if (long_1 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_1;
      } 
      long_1 = paramBuilder.post_id;
      if (long_1 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_1;
      } 
      long_1 = paramBuilder.account_id;
      if (long_1 == null) {
        this.account_id = DEFAULT_ACCOUNT_ID;
      } else {
        this.account_id = long_1;
      } 
      Integer integer1 = paramBuilder.account_type;
      if (integer1 == null) {
        this.account_type = DEFAULT_ACCOUNT_TYPE;
      } else {
        this.account_type = integer1;
      } 
      integer = paramBuilder.currency;
      if (integer == null) {
        this.currency = DEFAULT_CURRENCY;
      } else {
        this.currency = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.scene_from = ((Builder)integer).scene_from;
      this.gift_id = ((Builder)integer).gift_id;
      this.benefit_userid = ((Builder)integer).benefit_userid;
      this.benefit_username = ((Builder)integer).benefit_username;
      this.num = ((Builder)integer).num;
      this.thread_id = ((Builder)integer).thread_id;
      this.post_id = ((Builder)integer).post_id;
      this.account_id = ((Builder)integer).account_id;
      this.account_type = ((Builder)integer).account_type;
      this.currency = ((Builder)integer).currency;
    } 
  }
}
