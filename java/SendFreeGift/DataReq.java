package SendFreeGift;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_BENEFIT_USERID;
  
  public static final String DEFAULT_BENEFIT_USERNAME = "";
  
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final Integer DEFAULT_NUM;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final String DEFAULT_SCENE_FROM = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long benefit_userid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String benefit_username;
  
  @ProtoField(tag = 5)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer num;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String scene_from;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-778148888, "Ltbclient/SendFreeGift/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-778148888, "Ltbclient/SendFreeGift/DataReq;");
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
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.gift_id;
      if (integer2 == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer2;
      } 
      Long long_2 = paramBuilder.benefit_userid;
      if (long_2 == null) {
        this.benefit_userid = DEFAULT_BENEFIT_USERID;
      } else {
        this.benefit_userid = long_2;
      } 
      String str2 = paramBuilder.benefit_username;
      if (str2 == null) {
        this.benefit_username = "";
      } else {
        this.benefit_username = str2;
      } 
      Integer integer1 = paramBuilder.num;
      if (integer1 == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer1;
      } 
      this.common = paramBuilder.common;
      String str1 = paramBuilder.scene_from;
      if (str1 == null) {
        this.scene_from = "";
      } else {
        this.scene_from = str1;
      } 
      Long long_1 = paramBuilder.thread_id;
      if (long_1 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_1;
      } 
      long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
    } else {
      this.gift_id = ((Builder)long_).gift_id;
      this.benefit_userid = ((Builder)long_).benefit_userid;
      this.benefit_username = ((Builder)long_).benefit_username;
      this.num = ((Builder)long_).num;
      this.common = ((Builder)long_).common;
      this.scene_from = ((Builder)long_).scene_from;
      this.thread_id = ((Builder)long_).thread_id;
      this.post_id = ((Builder)long_).post_id;
    } 
  }
}
