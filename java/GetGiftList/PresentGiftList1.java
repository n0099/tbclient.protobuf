package GetGiftList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PresentGiftList1 extends Message {
  public static final Integer DEFAULT_ACTIVITY_TYPE;
  
  public static final Integer DEFAULT_BEGIN_TIME;
  
  public static final Integer DEFAULT_CURRENCY;
  
  public static final Integer DEFAULT_CURRENCY_UNIT;
  
  public static final Integer DEFAULT_DISCOUNT;
  
  public static final Integer DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_GIFT_COUNT;
  
  public static final String DEFAULT_GIFT_DESC = "";
  
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final String DEFAULT_GIFT_NAME = "";
  
  public static final Integer DEFAULT_IOS_DISCOUNT;
  
  public static final Integer DEFAULT_IOS_PRICE;
  
  public static final String DEFAULT_MARK_URL = "";
  
  public static final Integer DEFAULT_PITCH_ON;
  
  public static final Integer DEFAULT_PRICE;
  
  public static final Integer DEFAULT_PROPORTION;
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer activity_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer begin_time;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer currency;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer currency_unit;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer discount;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer end_time;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer gift_count;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String gift_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String gift_name;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer ios_discount;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer ios_price;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String mark_url;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer pitch_on;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer price;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer proportion;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(44059902, "Ltbclient/GetGiftList/PresentGiftList1;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(44059902, "Ltbclient/GetGiftList/PresentGiftList1;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_GIFT_ID = integer;
    DEFAULT_PRICE = integer;
    DEFAULT_IOS_PRICE = integer;
    DEFAULT_ACTIVITY_TYPE = integer;
    DEFAULT_BEGIN_TIME = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_DISCOUNT = integer;
    DEFAULT_IOS_DISCOUNT = integer;
    DEFAULT_PROPORTION = integer;
    DEFAULT_GIFT_COUNT = integer;
    DEFAULT_PITCH_ON = integer;
    DEFAULT_CURRENCY_UNIT = integer;
    DEFAULT_CURRENCY = integer;
  }
  
  public PresentGiftList1(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer5 = paramBuilder.gift_id;
      if (integer5 == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer5;
      } 
      String str4 = paramBuilder.gift_name;
      if (str4 == null) {
        this.gift_name = "";
      } else {
        this.gift_name = str4;
      } 
      Integer integer4 = paramBuilder.price;
      if (integer4 == null) {
        this.price = DEFAULT_PRICE;
      } else {
        this.price = integer4;
      } 
      String str3 = paramBuilder.thumbnail_url;
      if (str3 == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str3;
      } 
      Integer integer3 = paramBuilder.ios_price;
      if (integer3 == null) {
        this.ios_price = DEFAULT_IOS_PRICE;
      } else {
        this.ios_price = integer3;
      } 
      String str2 = paramBuilder.gift_desc;
      if (str2 == null) {
        this.gift_desc = "";
      } else {
        this.gift_desc = str2;
      } 
      Integer integer2 = paramBuilder.activity_type;
      if (integer2 == null) {
        this.activity_type = DEFAULT_ACTIVITY_TYPE;
      } else {
        this.activity_type = integer2;
      } 
      String str1 = paramBuilder.mark_url;
      if (str1 == null) {
        this.mark_url = "";
      } else {
        this.mark_url = str1;
      } 
      Integer integer1 = paramBuilder.begin_time;
      if (integer1 == null) {
        this.begin_time = DEFAULT_BEGIN_TIME;
      } else {
        this.begin_time = integer1;
      } 
      integer1 = paramBuilder.end_time;
      if (integer1 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer1;
      } 
      integer1 = paramBuilder.discount;
      if (integer1 == null) {
        this.discount = DEFAULT_DISCOUNT;
      } else {
        this.discount = integer1;
      } 
      integer1 = paramBuilder.ios_discount;
      if (integer1 == null) {
        this.ios_discount = DEFAULT_IOS_DISCOUNT;
      } else {
        this.ios_discount = integer1;
      } 
      integer1 = paramBuilder.proportion;
      if (integer1 == null) {
        this.proportion = DEFAULT_PROPORTION;
      } else {
        this.proportion = integer1;
      } 
      integer1 = paramBuilder.gift_count;
      if (integer1 == null) {
        this.gift_count = DEFAULT_GIFT_COUNT;
      } else {
        this.gift_count = integer1;
      } 
      integer1 = paramBuilder.pitch_on;
      if (integer1 == null) {
        this.pitch_on = DEFAULT_PITCH_ON;
      } else {
        this.pitch_on = integer1;
      } 
      integer1 = paramBuilder.currency_unit;
      if (integer1 == null) {
        this.currency_unit = DEFAULT_CURRENCY_UNIT;
      } else {
        this.currency_unit = integer1;
      } 
      integer = paramBuilder.currency;
      if (integer == null) {
        this.currency = DEFAULT_CURRENCY;
      } else {
        this.currency = integer;
      } 
    } else {
      this.gift_id = ((Builder)integer).gift_id;
      this.gift_name = ((Builder)integer).gift_name;
      this.price = ((Builder)integer).price;
      this.thumbnail_url = ((Builder)integer).thumbnail_url;
      this.ios_price = ((Builder)integer).ios_price;
      this.gift_desc = ((Builder)integer).gift_desc;
      this.activity_type = ((Builder)integer).activity_type;
      this.mark_url = ((Builder)integer).mark_url;
      this.begin_time = ((Builder)integer).begin_time;
      this.end_time = ((Builder)integer).end_time;
      this.discount = ((Builder)integer).discount;
      this.ios_discount = ((Builder)integer).ios_discount;
      this.proportion = ((Builder)integer).proportion;
      this.gift_count = ((Builder)integer).gift_count;
      this.pitch_on = ((Builder)integer).pitch_on;
      this.currency_unit = ((Builder)integer).currency_unit;
      this.currency = ((Builder)integer).currency;
    } 
  }
}
