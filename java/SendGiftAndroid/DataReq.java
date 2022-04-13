package SendGiftAndroid;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_GIFT_FROM;
  
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final Integer DEFAULT_NUM;
  
  public static final String DEFAULT_PASSWORD = "";
  
  public static final Integer DEFAULT_PRICE;
  
  public static final Long DEFAULT_RECEIVER_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long gift_from;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer num;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String password;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer price;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long receiver_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1458761161, "Ltbclient/SendGiftAndroid/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1458761161, "Ltbclient/SendGiftAndroid/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_RECEIVER_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_GIFT_ID = integer;
    DEFAULT_PRICE = integer;
    DEFAULT_NUM = integer;
    DEFAULT_GIFT_FROM = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_2 = paramBuilder.receiver_id;
      if (long_2 == null) {
        this.receiver_id = DEFAULT_RECEIVER_ID;
      } else {
        this.receiver_id = long_2;
      } 
      Integer integer = paramBuilder.gift_id;
      if (integer == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer;
      } 
      integer = paramBuilder.price;
      if (integer == null) {
        this.price = DEFAULT_PRICE;
      } else {
        this.price = integer;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
      Long long_1 = paramBuilder.gift_from;
      if (long_1 == null) {
        this.gift_from = DEFAULT_GIFT_FROM;
      } else {
        this.gift_from = long_1;
      } 
      str = paramBuilder.password;
      if (str == null) {
        this.password = "";
      } else {
        this.password = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.receiver_id = ((Builder)str).receiver_id;
      this.gift_id = ((Builder)str).gift_id;
      this.price = ((Builder)str).price;
      this.num = ((Builder)str).num;
      this.gift_from = ((Builder)str).gift_from;
      this.password = ((Builder)str).password;
    } 
  }
}
