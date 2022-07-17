package tbclient.GetTails;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ColorInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FONTCOLOR = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String fontColor;
  
  public ColorInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.fontColor;
      if (str == null) {
        this.fontColor = "";
      } else {
        this.fontColor = str;
      } 
    } else {
      this.fontColor = ((Builder)str).fontColor;
    } 
  }
  
  public ColorInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ColorInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String fontColor;
    
    public Builder() {}
    
    public Builder(ColorInfo param1ColorInfo) {
      super(param1ColorInfo);
      if (param1ColorInfo == null)
        return; 
      this.fontColor = param1ColorInfo.fontColor;
    }
    
    public ColorInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ColorInfo)interceptResult.objValue; 
      } 
      return new ColorInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
