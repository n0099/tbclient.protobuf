package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbGoodsInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_GOODS_FROM = "";
  
  public static final Long DEFAULT_GOODS_ID;
  
  public static final String DEFAULT_GOODS_IMAGE = "";
  
  public static final String DEFAULT_GOODS_PRICE = "";
  
  public static final String DEFAULT_GOODS_TITLE = "";
  
  public static final String DEFAULT_GOODS_URL = "";
  
  public static final String DEFAULT_GOODS_URL_H5 = "";
  
  public static final Integer DEFAULT_SORT = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String goods_from;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long goods_id;
  
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
  
  static {
    DEFAULT_GOODS_ID = Long.valueOf(0L);
  }
  
  public PbGoodsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
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
      str1 = paramBuilder.goods_url_h5;
      if (str1 == null) {
        this.goods_url_h5 = "";
      } else {
        this.goods_url_h5 = str1;
      } 
      long_ = paramBuilder.goods_id;
      if (long_ == null) {
        this.goods_id = DEFAULT_GOODS_ID;
      } else {
        this.goods_id = long_;
      } 
    } else {
      this.goods_title = ((Builder)long_).goods_title;
      this.goods_image = ((Builder)long_).goods_image;
      this.goods_price = ((Builder)long_).goods_price;
      this.goods_url = ((Builder)long_).goods_url;
      this.sort = ((Builder)long_).sort;
      this.goods_from = ((Builder)long_).goods_from;
      this.goods_url_h5 = ((Builder)long_).goods_url_h5;
      this.goods_id = ((Builder)long_).goods_id;
    } 
  }
  
  public PbGoodsInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<PbGoodsInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String goods_from;
    
    public Long goods_id;
    
    public String goods_image;
    
    public String goods_price;
    
    public String goods_title;
    
    public String goods_url;
    
    public String goods_url_h5;
    
    public Integer sort;
    
    public Builder() {}
    
    public Builder(PbGoodsInfo param1PbGoodsInfo) {
      super(param1PbGoodsInfo);
      if (param1PbGoodsInfo == null)
        return; 
      this.goods_title = param1PbGoodsInfo.goods_title;
      this.goods_image = param1PbGoodsInfo.goods_image;
      this.goods_price = param1PbGoodsInfo.goods_price;
      this.goods_url = param1PbGoodsInfo.goods_url;
      this.sort = param1PbGoodsInfo.sort;
      this.goods_from = param1PbGoodsInfo.goods_from;
      this.goods_url_h5 = param1PbGoodsInfo.goods_url_h5;
      this.goods_id = param1PbGoodsInfo.goods_id;
    }
    
    public PbGoodsInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PbGoodsInfo)interceptResult.objValue; 
      } 
      return new PbGoodsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
