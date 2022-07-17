package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Global extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TBMALL_NEWPROPS = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tbmall_newprops;
  
  public Global(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.tbmall_newprops;
      if (str == null) {
        this.tbmall_newprops = "";
      } else {
        this.tbmall_newprops = str;
      } 
    } else {
      this.tbmall_newprops = ((Builder)str).tbmall_newprops;
    } 
  }
  
  public Global(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Global> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String tbmall_newprops;
    
    public Builder() {}
    
    public Builder(Global param1Global) {
      super(param1Global);
      if (param1Global == null)
        return; 
      this.tbmall_newprops = param1Global.tbmall_newprops;
    }
    
    public Global build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Global)interceptResult.objValue; 
      } 
      return new Global(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
