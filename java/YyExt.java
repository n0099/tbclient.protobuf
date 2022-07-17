package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class YyExt extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_IS_YY_GAME = Integer.valueOf(0);
  
  public static final String DEFAULT_RANK_SHOW = "";
  
  public static final String DEFAULT_SID = "";
  
  public static final String DEFAULT_SSID = "";
  
  public static final String DEFAULT_STREAM_INFO = "";
  
  public static final String DEFAULT_TEMPLATE_ID = "";
  
  public static final String DEFAULT_YY_UID = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_yy_game;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String rank_show;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String sid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ssid;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String stream_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String template_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String yy_uid;
  
  public YyExt(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.sid;
      if (str2 == null) {
        this.sid = "";
      } else {
        this.sid = str2;
      } 
      str2 = paramBuilder.ssid;
      if (str2 == null) {
        this.ssid = "";
      } else {
        this.ssid = str2;
      } 
      str2 = paramBuilder.template_id;
      if (str2 == null) {
        this.template_id = "";
      } else {
        this.template_id = str2;
      } 
      str2 = paramBuilder.yy_uid;
      if (str2 == null) {
        this.yy_uid = "";
      } else {
        this.yy_uid = str2;
      } 
      Integer integer = paramBuilder.is_yy_game;
      if (integer == null) {
        this.is_yy_game = DEFAULT_IS_YY_GAME;
      } else {
        this.is_yy_game = integer;
      } 
      String str1 = paramBuilder.stream_info;
      if (str1 == null) {
        this.stream_info = "";
      } else {
        this.stream_info = str1;
      } 
      str1 = paramBuilder.rank_show;
      if (str1 == null) {
        this.rank_show = "";
      } else {
        this.rank_show = str1;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
    } else {
      this.sid = ((Builder)str).sid;
      this.ssid = ((Builder)str).ssid;
      this.template_id = ((Builder)str).template_id;
      this.yy_uid = ((Builder)str).yy_uid;
      this.is_yy_game = ((Builder)str).is_yy_game;
      this.stream_info = ((Builder)str).stream_info;
      this.rank_show = ((Builder)str).rank_show;
      this.icon_url = ((Builder)str).icon_url;
    } 
  }
  
  public YyExt(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(811855588, "Ltbclient/YyExt;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(811855588, "Ltbclient/YyExt;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<YyExt> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String icon_url;
    
    public Integer is_yy_game;
    
    public String rank_show;
    
    public String sid;
    
    public String ssid;
    
    public String stream_info;
    
    public String template_id;
    
    public String yy_uid;
    
    public Builder() {}
    
    public Builder(YyExt param1YyExt) {
      super(param1YyExt);
      if (param1YyExt == null)
        return; 
      this.sid = param1YyExt.sid;
      this.ssid = param1YyExt.ssid;
      this.template_id = param1YyExt.template_id;
      this.yy_uid = param1YyExt.yy_uid;
      this.is_yy_game = param1YyExt.is_yy_game;
      this.stream_info = param1YyExt.stream_info;
      this.rank_show = param1YyExt.rank_show;
      this.icon_url = param1YyExt.icon_url;
    }
    
    public YyExt build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (YyExt)interceptResult.objValue; 
      } 
      return new YyExt(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
