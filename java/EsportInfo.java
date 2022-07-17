package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class EsportInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_INTRO = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String intro;
  
  public EsportInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.intro;
      if (str == null) {
        this.intro = "";
      } else {
        this.intro = str;
      } 
    } else {
      this.intro = ((Builder)str).intro;
    } 
  }
  
  public EsportInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<EsportInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String intro;
    
    public Builder() {}
    
    public Builder(EsportInfo param1EsportInfo) {
      super(param1EsportInfo);
      if (param1EsportInfo == null)
        return; 
      this.intro = param1EsportInfo.intro;
    }
    
    public EsportInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (EsportInfo)interceptResult.objValue; 
      } 
      return new EsportInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
