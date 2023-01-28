package tbclient.Loop;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconRes extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final IconPop pop;
  
  public IconRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.pop = paramBuilder.pop;
    } else {
      this.pop = paramBuilder.pop;
    } 
  }
  
  public IconRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<IconRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public IconPop pop;
    
    public Builder() {}
    
    public Builder(IconRes param1IconRes) {
      super(param1IconRes);
      if (param1IconRes == null)
        return; 
      this.pop = param1IconRes.pop;
    }
    
    public IconRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (IconRes)interceptResult.objValue; 
      } 
      return new IconRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
