package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopCode extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CODE_LINK = "";
  
  public static final String DEFAULT_GAME_LINK = "";
  
  public static final Integer DEFAULT_GET_TYPE = Integer.valueOf(0);
  
  public static final Long DEFAULT_GIFTWORTH = Long.valueOf(0L);
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_SUBTITLE = "";
  
  public static final String DEFAULT_SUMMARY = "";
  
  public static final String DEFAULT_SURPLUSGIFT = "";
  
  public static final String DEFAULT_TYPE_TEXT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String code_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_link;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer get_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long giftworth;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String subtitle;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String summary;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String surplusgift;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String type_text;
  
  public TopCode(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.img_url;
      if (str3 == null) {
        this.img_url = "";
      } else {
        this.img_url = str3;
      } 
      str3 = paramBuilder.game_link;
      if (str3 == null) {
        this.game_link = "";
      } else {
        this.game_link = str3;
      } 
      str3 = paramBuilder.summary;
      if (str3 == null) {
        this.summary = "";
      } else {
        this.summary = str3;
      } 
      str3 = paramBuilder.code_link;
      if (str3 == null) {
        this.code_link = "";
      } else {
        this.code_link = str3;
      } 
      Integer integer = paramBuilder.get_type;
      if (integer == null) {
        this.get_type = DEFAULT_GET_TYPE;
      } else {
        this.get_type = integer;
      } 
      String str2 = paramBuilder.surplusgift;
      if (str2 == null) {
        this.surplusgift = "";
      } else {
        this.surplusgift = str2;
      } 
      Long long_ = paramBuilder.giftworth;
      if (long_ == null) {
        this.giftworth = DEFAULT_GIFTWORTH;
      } else {
        this.giftworth = long_;
      } 
      String str1 = paramBuilder.type_text;
      if (str1 == null) {
        this.type_text = "";
      } else {
        this.type_text = str1;
      } 
      str = paramBuilder.subtitle;
      if (str == null) {
        this.subtitle = "";
      } else {
        this.subtitle = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.game_link = ((Builder)str).game_link;
      this.summary = ((Builder)str).summary;
      this.code_link = ((Builder)str).code_link;
      this.get_type = ((Builder)str).get_type;
      this.surplusgift = ((Builder)str).surplusgift;
      this.giftworth = ((Builder)str).giftworth;
      this.type_text = ((Builder)str).type_text;
      this.subtitle = ((Builder)str).subtitle;
    } 
  }
  
  public TopCode(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(275922492, "Ltbclient/FrsPage/TopCode;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(275922492, "Ltbclient/FrsPage/TopCode;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<TopCode> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String code_link;
    
    public String game_link;
    
    public Integer get_type;
    
    public Long giftworth;
    
    public String img_url;
    
    public String subtitle;
    
    public String summary;
    
    public String surplusgift;
    
    public String type_text;
    
    public Builder() {}
    
    public Builder(TopCode param1TopCode) {
      super(param1TopCode);
      if (param1TopCode == null)
        return; 
      this.img_url = param1TopCode.img_url;
      this.game_link = param1TopCode.game_link;
      this.summary = param1TopCode.summary;
      this.code_link = param1TopCode.code_link;
      this.get_type = param1TopCode.get_type;
      this.surplusgift = param1TopCode.surplusgift;
      this.giftworth = param1TopCode.giftworth;
      this.type_text = param1TopCode.type_text;
      this.subtitle = param1TopCode.subtitle;
    }
    
    public TopCode build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TopCode)interceptResult.objValue; 
      } 
      return new TopCode(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
