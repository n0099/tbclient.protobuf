package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class McnAdInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_AD_END_TIME;
  
  public static final Long DEFAULT_AD_START_TIME;
  
  public static final String DEFAULT_BUTTON_TITLE = "";
  
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final Long DEFAULT_EFFECT_TIME;
  
  public static final Long DEFAULT_EXPIRE_TIME;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long ad_end_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long ad_start_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String button_title;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long effect_time;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long expire_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1731970716, "Ltbclient/McnAdInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1731970716, "Ltbclient/McnAdInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_AD_START_TIME = long_;
    DEFAULT_AD_END_TIME = long_;
    DEFAULT_EFFECT_TIME = long_;
    DEFAULT_EXPIRE_TIME = long_;
  }
  
  public McnAdInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.ad_start_time;
      if (long_2 == null) {
        this.ad_start_time = DEFAULT_AD_START_TIME;
      } else {
        this.ad_start_time = long_2;
      } 
      long_2 = paramBuilder.ad_end_time;
      if (long_2 == null) {
        this.ad_end_time = DEFAULT_AD_END_TIME;
      } else {
        this.ad_end_time = long_2;
      } 
      String str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
      str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      str = paramBuilder.button_title;
      if (str == null) {
        this.button_title = "";
      } else {
        this.button_title = str;
      } 
      Long long_1 = paramBuilder.effect_time;
      if (long_1 == null) {
        this.effect_time = DEFAULT_EFFECT_TIME;
      } else {
        this.effect_time = long_1;
      } 
      long_ = paramBuilder.expire_time;
      if (long_ == null) {
        this.expire_time = DEFAULT_EXPIRE_TIME;
      } else {
        this.expire_time = long_;
      } 
    } else {
      this.ad_start_time = ((Builder)long_).ad_start_time;
      this.ad_end_time = ((Builder)long_).ad_end_time;
      this.pic_url = ((Builder)long_).pic_url;
      this.jump_url = ((Builder)long_).jump_url;
      this.card_title = ((Builder)long_).card_title;
      this.button_title = ((Builder)long_).button_title;
      this.effect_time = ((Builder)long_).effect_time;
      this.expire_time = ((Builder)long_).expire_time;
    } 
  }
  
  public McnAdInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<McnAdInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long ad_end_time;
    
    public Long ad_start_time;
    
    public String button_title;
    
    public String card_title;
    
    public Long effect_time;
    
    public Long expire_time;
    
    public String jump_url;
    
    public String pic_url;
    
    public Builder() {}
    
    public Builder(McnAdInfo param1McnAdInfo) {
      super(param1McnAdInfo);
      if (param1McnAdInfo == null)
        return; 
      this.ad_start_time = param1McnAdInfo.ad_start_time;
      this.ad_end_time = param1McnAdInfo.ad_end_time;
      this.pic_url = param1McnAdInfo.pic_url;
      this.jump_url = param1McnAdInfo.jump_url;
      this.card_title = param1McnAdInfo.card_title;
      this.button_title = param1McnAdInfo.button_title;
      this.effect_time = param1McnAdInfo.effect_time;
      this.expire_time = param1McnAdInfo.expire_time;
    }
    
    public McnAdInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (McnAdInfo)interceptResult.objValue; 
      } 
      return new McnAdInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
