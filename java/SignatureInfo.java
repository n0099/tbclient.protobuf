package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignatureInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final String DEFAULT_GAME_NAME = "";
  
  public static final String DEFAULT_PLAYER = "";
  
  public static final String DEFAULT_POWER = "";
  
  public static final String DEFAULT_SERVER = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5)
  public final Avatar avatar;
  
  @ProtoField(tag = 1)
  public final Equipment equipment;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String game_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String player;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String power;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String server;
  
  public SignatureInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.equipment = paramBuilder.equipment;
      String str1 = paramBuilder.game_id;
      if (str1 == null) {
        this.game_id = "";
      } else {
        this.game_id = str1;
      } 
      str1 = paramBuilder.game_name;
      if (str1 == null) {
        this.game_name = "";
      } else {
        this.game_name = str1;
      } 
      str1 = paramBuilder.player;
      if (str1 == null) {
        this.player = "";
      } else {
        this.player = str1;
      } 
      this.avatar = paramBuilder.avatar;
      str1 = paramBuilder.power;
      if (str1 == null) {
        this.power = "";
      } else {
        this.power = str1;
      } 
      str = paramBuilder.server;
      if (str == null) {
        this.server = "";
      } else {
        this.server = str;
      } 
    } else {
      this.equipment = ((Builder)str).equipment;
      this.game_id = ((Builder)str).game_id;
      this.game_name = ((Builder)str).game_name;
      this.player = ((Builder)str).player;
      this.avatar = ((Builder)str).avatar;
      this.power = ((Builder)str).power;
      this.server = ((Builder)str).server;
    } 
  }
  
  public SignatureInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SignatureInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Avatar avatar;
    
    public Equipment equipment;
    
    public String game_id;
    
    public String game_name;
    
    public String player;
    
    public String power;
    
    public String server;
    
    public Builder() {}
    
    public Builder(SignatureInfo param1SignatureInfo) {
      super(param1SignatureInfo);
      if (param1SignatureInfo == null)
        return; 
      this.equipment = param1SignatureInfo.equipment;
      this.game_id = param1SignatureInfo.game_id;
      this.game_name = param1SignatureInfo.game_name;
      this.player = param1SignatureInfo.player;
      this.avatar = param1SignatureInfo.avatar;
      this.power = param1SignatureInfo.power;
      this.server = param1SignatureInfo.server;
    }
    
    public SignatureInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SignatureInfo)interceptResult.objValue; 
      } 
      return new SignatureInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
