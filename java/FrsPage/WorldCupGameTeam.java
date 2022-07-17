package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WorldCupGameTeam extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_LOGO_URL = "";
  
  public static final String DEFAULT_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String logo_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public WorldCupGameTeam(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.logo_url;
      if (str == null) {
        this.logo_url = "";
      } else {
        this.logo_url = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.logo_url = ((Builder)str).logo_url;
    } 
  }
  
  public WorldCupGameTeam(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WorldCupGameTeam> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String logo_url;
    
    public String name;
    
    public Builder() {}
    
    public Builder(WorldCupGameTeam param1WorldCupGameTeam) {
      super(param1WorldCupGameTeam);
      if (param1WorldCupGameTeam == null)
        return; 
      this.name = param1WorldCupGameTeam.name;
      this.logo_url = param1WorldCupGameTeam.logo_url;
    }
    
    public WorldCupGameTeam build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (WorldCupGameTeam)interceptResult.objValue; 
      } 
      return new WorldCupGameTeam(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
