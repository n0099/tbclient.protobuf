package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Equipment extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  public Equipment(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public Equipment(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Equipment> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String name;
    
    public String portrait;
    
    public Builder() {}
    
    public Builder(Equipment param1Equipment) {
      super(param1Equipment);
      if (param1Equipment == null)
        return; 
      this.name = param1Equipment.name;
      this.portrait = param1Equipment.portrait;
    }
    
    public Equipment build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Equipment)interceptResult.objValue; 
      } 
      return new Equipment(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
