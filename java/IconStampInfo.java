package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconStampInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_STAMP_TEXT = "";
  
  public static final String DEFAULT_STAMP_TITLE = "";
  
  public static final Integer DEFAULT_STAMP_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String stamp_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String stamp_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer stamp_type;
  
  public IconStampInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.stamp_title;
      if (str == null) {
        this.stamp_title = "";
      } else {
        this.stamp_title = str;
      } 
      str = paramBuilder.stamp_text;
      if (str == null) {
        this.stamp_text = "";
      } else {
        this.stamp_text = str;
      } 
      integer = paramBuilder.stamp_type;
      if (integer == null) {
        this.stamp_type = DEFAULT_STAMP_TYPE;
      } else {
        this.stamp_type = integer;
      } 
    } else {
      this.stamp_title = ((Builder)integer).stamp_title;
      this.stamp_text = ((Builder)integer).stamp_text;
      this.stamp_type = ((Builder)integer).stamp_type;
    } 
  }
  
  public IconStampInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-904582131, "Ltbclient/IconStampInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-904582131, "Ltbclient/IconStampInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<IconStampInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String stamp_text;
    
    public String stamp_title;
    
    public Integer stamp_type;
    
    public Builder() {}
    
    public Builder(IconStampInfo param1IconStampInfo) {
      super(param1IconStampInfo);
      if (param1IconStampInfo == null)
        return; 
      this.stamp_title = param1IconStampInfo.stamp_title;
      this.stamp_text = param1IconStampInfo.stamp_text;
      this.stamp_type = param1IconStampInfo.stamp_type;
    }
    
    public IconStampInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (IconStampInfo)interceptResult.objValue; 
      } 
      return new IconStampInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
