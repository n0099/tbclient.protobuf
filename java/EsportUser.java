package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class EsportUser extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_STEAM_NAME = "";
  
  public static final String DEFAULT_STEAM_PORTRAIT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String steam_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String steam_portrait;
  
  public EsportUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.steam_name;
      if (str1 == null) {
        this.steam_name = "";
      } else {
        this.steam_name = str1;
      } 
      str = paramBuilder.steam_portrait;
      if (str == null) {
        this.steam_portrait = "";
      } else {
        this.steam_portrait = str;
      } 
    } else {
      this.steam_name = ((Builder)str).steam_name;
      this.steam_portrait = ((Builder)str).steam_portrait;
    } 
  }
  
  public EsportUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<EsportUser> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String steam_name;
    
    public String steam_portrait;
    
    public Builder() {}
    
    public Builder(EsportUser param1EsportUser) {
      super(param1EsportUser);
      if (param1EsportUser == null)
        return; 
      this.steam_name = param1EsportUser.steam_name;
      this.steam_portrait = param1EsportUser.steam_portrait;
    }
    
    public EsportUser build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (EsportUser)interceptResult.objValue; 
      } 
      return new EsportUser(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
