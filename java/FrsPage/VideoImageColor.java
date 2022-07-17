package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VideoImageColor extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_COLOR = "";
  
  public static final Integer DEFAULT_TIME = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String color;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer time;
  
  public VideoImageColor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.time;
      if (integer == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer;
      } 
      str = paramBuilder.color;
      if (str == null) {
        this.color = "";
      } else {
        this.color = str;
      } 
    } else {
      this.time = ((Builder)str).time;
      this.color = ((Builder)str).color;
    } 
  }
  
  public VideoImageColor(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1547294053, "Ltbclient/FrsPage/VideoImageColor;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1547294053, "Ltbclient/FrsPage/VideoImageColor;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<VideoImageColor> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String color;
    
    public Integer time;
    
    public Builder() {}
    
    public Builder(VideoImageColor param1VideoImageColor) {
      super(param1VideoImageColor);
      if (param1VideoImageColor == null)
        return; 
      this.time = param1VideoImageColor.time;
      this.color = param1VideoImageColor.color;
    }
    
    public VideoImageColor build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VideoImageColor)interceptResult.objValue; 
      } 
      return new VideoImageColor(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
