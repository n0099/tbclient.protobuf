package tbclient.NewHottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TimeLineInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BG_COLOR = "";
  
  public static final String DEFAULT_SHOW_TIME = "";
  
  public static final String DEFAULT_SMALL_TITLE = "";
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String bg_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String show_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String small_title;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public TimeLineInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.show_time;
      if (str1 == null) {
        this.show_time = "";
      } else {
        this.show_time = str1;
      } 
      str1 = paramBuilder.bg_color;
      if (str1 == null) {
        this.bg_color = "";
      } else {
        this.bg_color = str1;
      } 
      str = paramBuilder.small_title;
      if (str == null) {
        this.small_title = "";
      } else {
        this.small_title = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.title = ((Builder)str).title;
      this.show_time = ((Builder)str).show_time;
      this.bg_color = ((Builder)str).bg_color;
      this.small_title = ((Builder)str).small_title;
    } 
  }
  
  public TimeLineInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1647277845, "Ltbclient/NewHottopic/TimeLineInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1647277845, "Ltbclient/NewHottopic/TimeLineInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<TimeLineInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String bg_color;
    
    public String show_time;
    
    public String small_title;
    
    public Long tid;
    
    public String title;
    
    public Builder() {}
    
    public Builder(TimeLineInfo param1TimeLineInfo) {
      super(param1TimeLineInfo);
      if (param1TimeLineInfo == null)
        return; 
      this.tid = param1TimeLineInfo.tid;
      this.title = param1TimeLineInfo.title;
      this.show_time = param1TimeLineInfo.show_time;
      this.bg_color = param1TimeLineInfo.bg_color;
      this.small_title = param1TimeLineInfo.small_title;
    }
    
    public TimeLineInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TimeLineInfo)interceptResult.objValue; 
      } 
      return new TimeLineInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
