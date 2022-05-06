import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.DealMedia;
import tbclient.DisplayWindowInfo;

public final class DisplayWindowInfo extends Message {
  public static final String DEFAULT_INTRO = "";
  
  public static final Integer DEFAULT_IS_DISPLAY;
  
  public static final Long DEFAULT_PRODUCT_ID;
  
  public static final Long DEFAULT_SALES;
  
  public static final Long DEFAULT_SHIP_FEE;
  
  public static final Long DEFAULT_STOCK;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_UNIT_PRICE;
  
  @ProtoField(tag = 4)
  public final DealMedia img;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_display;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long product_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long sales;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long ship_fee;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long stock;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long unit_price;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1328787333, "Ltbclient/DisplayWindowInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1328787333, "Ltbclient/DisplayWindowInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_PRODUCT_ID = long_;
    DEFAULT_UNIT_PRICE = long_;
    DEFAULT_STOCK = long_;
    DEFAULT_SHIP_FEE = long_;
    DEFAULT_IS_DISPLAY = Integer.valueOf(0);
    DEFAULT_SALES = long_;
  }
  
  public DisplayWindowInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.product_id;
      if (long_2 == null) {
        this.product_id = DEFAULT_PRODUCT_ID;
      } else {
        this.product_id = long_2;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.intro;
      if (str == null) {
        this.intro = "";
      } else {
        this.intro = str;
      } 
      this.img = paramBuilder.img;
      Long long_1 = paramBuilder.unit_price;
      if (long_1 == null) {
        this.unit_price = DEFAULT_UNIT_PRICE;
      } else {
        this.unit_price = long_1;
      } 
      long_1 = paramBuilder.stock;
      if (long_1 == null) {
        this.stock = DEFAULT_STOCK;
      } else {
        this.stock = long_1;
      } 
      long_1 = paramBuilder.ship_fee;
      if (long_1 == null) {
        this.ship_fee = DEFAULT_SHIP_FEE;
      } else {
        this.ship_fee = long_1;
      } 
      Integer integer = paramBuilder.is_display;
      if (integer == null) {
        this.is_display = DEFAULT_IS_DISPLAY;
      } else {
        this.is_display = integer;
      } 
      long_ = paramBuilder.sales;
      if (long_ == null) {
        this.sales = DEFAULT_SALES;
      } else {
        this.sales = long_;
      } 
    } else {
      this.product_id = ((Builder)long_).product_id;
      this.title = ((Builder)long_).title;
      this.intro = ((Builder)long_).intro;
      this.img = ((Builder)long_).img;
      this.unit_price = ((Builder)long_).unit_price;
      this.stock = ((Builder)long_).stock;
      this.ship_fee = ((Builder)long_).ship_fee;
      this.is_display = ((Builder)long_).is_display;
      this.sales = ((Builder)long_).sales;
    } 
  }
}
