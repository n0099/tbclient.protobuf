package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AccessState extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TOKEN = "";
  
  public static final String DEFAULT_TYPE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String token;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  @ProtoField(tag = 3)
  public final UserSessionInfo userinfo;
  
  public AccessState(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
      str = paramBuilder.token;
      if (str == null) {
        this.token = "";
      } else {
        this.token = str;
      } 
      this.userinfo = paramBuilder.userinfo;
    } else {
      this.type = paramBuilder.type;
      this.token = paramBuilder.token;
      this.userinfo = paramBuilder.userinfo;
    } 
  }
  
  public AccessState(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AccessState> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String token;
    
    public String type;
    
    public UserSessionInfo userinfo;
    
    public Builder() {}
    
    public Builder(AccessState param1AccessState) {
      super(param1AccessState);
      if (param1AccessState == null)
        return; 
      this.type = param1AccessState.type;
      this.token = param1AccessState.token;
      this.userinfo = param1AccessState.userinfo;
    }
    
    public AccessState build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AccessState)interceptResult.objValue; 
      } 
      return new AccessState(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
