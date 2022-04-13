import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PbGoodsInfo;

public final class PbGoodsInfo extends Message {
  public static final String DEFAULT_GOODS_FROM = "";
  
  public static final String DEFAULT_GOODS_IMAGE = "";
  
  public static final String DEFAULT_GOODS_PRICE = "";
  
  public static final String DEFAULT_GOODS_TITLE = "";
  
  public static final String DEFAULT_GOODS_URL = "";
  
  public static final String DEFAULT_GOODS_URL_H5 = "";
  
  public static final Integer DEFAULT_SORT = Integer.valueOf(0);
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String goods_from;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String goods_image;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String goods_price;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String goods_title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String goods_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String goods_url_h5;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer sort;
  
  public PbGoodsInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.goods_title;
      if (str2 == null) {
        this.goods_title = "";
      } else {
        this.goods_title = str2;
      } 
      str2 = paramBuilder.goods_image;
      if (str2 == null) {
        this.goods_image = "";
      } else {
        this.goods_image = str2;
      } 
      str2 = paramBuilder.goods_price;
      if (str2 == null) {
        this.goods_price = "";
      } else {
        this.goods_price = str2;
      } 
      str2 = paramBuilder.goods_url;
      if (str2 == null) {
        this.goods_url = "";
      } else {
        this.goods_url = str2;
      } 
      Integer integer = paramBuilder.sort;
      if (integer == null) {
        this.sort = DEFAULT_SORT;
      } else {
        this.sort = integer;
      } 
      String str1 = paramBuilder.goods_from;
      if (str1 == null) {
        this.goods_from = "";
      } else {
        this.goods_from = str1;
      } 
      str = paramBuilder.goods_url_h5;
      if (str == null) {
        this.goods_url_h5 = "";
      } else {
        this.goods_url_h5 = str;
      } 
    } else {
      this.goods_title = ((Builder)str).goods_title;
      this.goods_image = ((Builder)str).goods_image;
      this.goods_price = ((Builder)str).goods_price;
      this.goods_url = ((Builder)str).goods_url;
      this.sort = ((Builder)str).sort;
      this.goods_from = ((Builder)str).goods_from;
      this.goods_url_h5 = ((Builder)str).goods_url_h5;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2003469037, "Ltbclient/PbGoodsInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2003469037, "Ltbclient/PbGoodsInfo;");
          return;
        } 
      } 
    } 
  }
}
