package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BazhuSign extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_LEVEL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String level;
  
  public BazhuSign(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str = paramBuilder.level;
      if (str == null) {
        this.level = "";
      } else {
        this.level = str;
      } 
    } else {
      this.desc = ((Builder)str).desc;
      this.level = ((Builder)str).level;
    } 
  }
  
  public BazhuSign(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BazhuSign> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String desc;
    
    public String level;
    
    public Builder() {}
    
    public Builder(BazhuSign param1BazhuSign) {
      super(param1BazhuSign);
      if (param1BazhuSign == null)
        return; 
      this.desc = param1BazhuSign.desc;
      this.level = param1BazhuSign.level;
    }
    
    public BazhuSign build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BazhuSign)interceptResult.objValue; 
      } 
      return new BazhuSign(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
