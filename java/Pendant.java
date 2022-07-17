package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Pendant extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final Long DEFAULT_PROPS_ID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long props_id;
  
  public Pendant(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.props_id;
      if (long_ == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = long_;
      } 
      str = paramBuilder.img_url;
      if (str == null) {
        this.img_url = "";
      } else {
        this.img_url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.img_url = ((Builder)str).img_url;
    } 
  }
  
  public Pendant(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(588355337, "Ltbclient/Pendant;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(588355337, "Ltbclient/Pendant;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Pendant> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String img_url;
    
    public Long props_id;
    
    public Builder() {}
    
    public Builder(Pendant param1Pendant) {
      super(param1Pendant);
      if (param1Pendant == null)
        return; 
      this.props_id = param1Pendant.props_id;
      this.img_url = param1Pendant.img_url;
    }
    
    public Pendant build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Pendant)interceptResult.objValue; 
      } 
      return new Pendant(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
