package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Rpgoldicon extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_KEY = "";
  
  public static final String DEFAULT_VALUE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String key;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String value;
  
  public Rpgoldicon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.key;
      if (str1 == null) {
        this.key = "";
      } else {
        this.key = str1;
      } 
      str = paramBuilder.value;
      if (str == null) {
        this.value = "";
      } else {
        this.value = str;
      } 
    } else {
      this.key = ((Builder)str).key;
      this.value = ((Builder)str).value;
    } 
  }
  
  public Rpgoldicon(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Rpgoldicon> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String key;
    
    public String value;
    
    public Builder() {}
    
    public Builder(Rpgoldicon param1Rpgoldicon) {
      super(param1Rpgoldicon);
      if (param1Rpgoldicon == null)
        return; 
      this.key = param1Rpgoldicon.key;
      this.value = param1Rpgoldicon.value;
    }
    
    public Rpgoldicon build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Rpgoldicon)interceptResult.objValue; 
      } 
      return new Rpgoldicon(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
