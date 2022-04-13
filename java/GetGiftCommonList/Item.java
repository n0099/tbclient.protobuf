package GetGiftCommonList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Item extends Message {
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final Integer DEFAULT_IOS_COUNT;
  
  public static final Integer DEFAULT_IOS_PRICE;
  
  public static final String DEFAULT_IOS_PRODUCT_ID = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PLAY_URL = "";
  
  public static final Integer DEFAULT_PRICE;
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer ios_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer ios_price;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String ios_product_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String play_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer price;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1158833310, "Ltbclient/GetGiftCommonList/Item;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1158833310, "Ltbclient/GetGiftCommonList/Item;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_GIFT_ID = integer;
    DEFAULT_PRICE = integer;
    DEFAULT_IOS_PRICE = integer;
    DEFAULT_IOS_COUNT = integer;
  }
  
  public Item(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.gift_id;
      if (integer3 == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer3;
      } 
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      Integer integer2 = paramBuilder.price;
      if (integer2 == null) {
        this.price = DEFAULT_PRICE;
      } else {
        this.price = integer2;
      } 
      String str1 = paramBuilder.thumbnail_url;
      if (str1 == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str1;
      } 
      str1 = paramBuilder.play_url;
      if (str1 == null) {
        this.play_url = "";
      } else {
        this.play_url = str1;
      } 
      str1 = paramBuilder.ios_product_id;
      if (str1 == null) {
        this.ios_product_id = "";
      } else {
        this.ios_product_id = str1;
      } 
      Integer integer1 = paramBuilder.ios_price;
      if (integer1 == null) {
        this.ios_price = DEFAULT_IOS_PRICE;
      } else {
        this.ios_price = integer1;
      } 
      integer = paramBuilder.ios_count;
      if (integer == null) {
        this.ios_count = DEFAULT_IOS_COUNT;
      } else {
        this.ios_count = integer;
      } 
    } else {
      this.gift_id = ((Builder)integer).gift_id;
      this.name = ((Builder)integer).name;
      this.price = ((Builder)integer).price;
      this.thumbnail_url = ((Builder)integer).thumbnail_url;
      this.play_url = ((Builder)integer).play_url;
      this.ios_product_id = ((Builder)integer).ios_product_id;
      this.ios_price = ((Builder)integer).ios_price;
      this.ios_count = ((Builder)integer).ios_count;
    } 
  }
}
