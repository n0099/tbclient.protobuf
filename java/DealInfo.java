import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DealAuthInfo;
import tbclient.DealInfo;
import tbclient.DealMedia;

public final class DealInfo extends Message {
  public static final List<DealAuthInfo> DEFAULT_AUTH_INFO;
  
  public static final String DEFAULT_DES = "";
  
  public static final Integer DEFAULT_EXPIRE_TIME;
  
  public static final Boolean DEFAULT_HAS_RECOMMEND;
  
  public static final List<DealMedia> DEFAULT_MEDIA;
  
  public static final Long DEFAULT_PRODUCT_ID;
  
  public static final Long DEFAULT_RECOMMENDATIONS;
  
  public static final Long DEFAULT_SALES;
  
  public static final String DEFAULT_SELLER_ADDRESS = "";
  
  public static final Long DEFAULT_SHIP_FEE;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Long DEFAULT_STOCK;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_UNIT_PRICE;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<DealAuthInfo> auth_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String des;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer expire_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.BOOL)
  public final Boolean has_recommend;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<DealMedia> media;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long product_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long recommendations;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long sales;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String seller_address;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long ship_fee;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long stock;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long unit_price;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1466993001, "Ltbclient/DealInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1466993001, "Ltbclient/DealInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_STOCK = long_;
    DEFAULT_SALES = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_EXPIRE_TIME = integer;
    DEFAULT_UNIT_PRICE = long_;
    DEFAULT_PRODUCT_ID = long_;
    DEFAULT_RECOMMENDATIONS = long_;
    DEFAULT_HAS_RECOMMEND = Boolean.FALSE;
    DEFAULT_STATUS = integer;
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_AUTH_INFO = Collections.emptyList();
    DEFAULT_SHIP_FEE = long_;
  }
  
  public DealInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.des;
      if (str2 == null) {
        this.des = "";
      } else {
        this.des = str2;
      } 
      Long long_3 = paramBuilder.stock;
      if (long_3 == null) {
        this.stock = DEFAULT_STOCK;
      } else {
        this.stock = long_3;
      } 
      long_3 = paramBuilder.sales;
      if (long_3 == null) {
        this.sales = DEFAULT_SALES;
      } else {
        this.sales = long_3;
      } 
      Integer integer2 = paramBuilder.expire_time;
      if (integer2 == null) {
        this.expire_time = DEFAULT_EXPIRE_TIME;
      } else {
        this.expire_time = integer2;
      } 
      Long long_2 = paramBuilder.unit_price;
      if (long_2 == null) {
        this.unit_price = DEFAULT_UNIT_PRICE;
      } else {
        this.unit_price = long_2;
      } 
      long_2 = paramBuilder.product_id;
      if (long_2 == null) {
        this.product_id = DEFAULT_PRODUCT_ID;
      } else {
        this.product_id = long_2;
      } 
      String str1 = paramBuilder.seller_address;
      if (str1 == null) {
        this.seller_address = "";
      } else {
        this.seller_address = str1;
      } 
      Long long_1 = paramBuilder.recommendations;
      if (long_1 == null) {
        this.recommendations = DEFAULT_RECOMMENDATIONS;
      } else {
        this.recommendations = long_1;
      } 
      Boolean bool = paramBuilder.has_recommend;
      if (bool == null) {
        this.has_recommend = DEFAULT_HAS_RECOMMEND;
      } else {
        this.has_recommend = bool;
      } 
      Integer integer1 = paramBuilder.status;
      if (integer1 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer1;
      } 
      List list = paramBuilder.media;
      if (list == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.auth_info;
      if (list == null) {
        this.auth_info = DEFAULT_AUTH_INFO;
      } else {
        this.auth_info = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.ship_fee;
      if (long_ == null) {
        this.ship_fee = DEFAULT_SHIP_FEE;
      } else {
        this.ship_fee = long_;
      } 
    } else {
      this.title = ((Builder)long_).title;
      this.des = ((Builder)long_).des;
      this.stock = ((Builder)long_).stock;
      this.sales = ((Builder)long_).sales;
      this.expire_time = ((Builder)long_).expire_time;
      this.unit_price = ((Builder)long_).unit_price;
      this.product_id = ((Builder)long_).product_id;
      this.seller_address = ((Builder)long_).seller_address;
      this.recommendations = ((Builder)long_).recommendations;
      this.has_recommend = ((Builder)long_).has_recommend;
      this.status = ((Builder)long_).status;
      this.media = Message.immutableCopyOf(((Builder)long_).media);
      this.auth_info = Message.immutableCopyOf(((Builder)long_).auth_info);
      this.ship_fee = ((Builder)long_).ship_fee;
    } 
  }
}
