package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class EsportStatic extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public EsportStatic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img;
      if (str1 == null) {
        this.img = "";
      } else {
        this.img = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.img = ((Builder)str).img;
      this.url = ((Builder)str).url;
    } 
  }
  
  public EsportStatic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<EsportStatic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String img;
    
    public String url;
    
    public Builder() {}
    
    public Builder(EsportStatic param1EsportStatic) {
      super(param1EsportStatic);
      if (param1EsportStatic == null)
        return; 
      this.img = param1EsportStatic.img;
      this.url = param1EsportStatic.url;
    }
    
    public EsportStatic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (EsportStatic)interceptResult.objValue; 
      } 
      return new EsportStatic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
