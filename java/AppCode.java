package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppCode extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_GAME_ICON = "";
  
  public static final String DEFAULT_POST_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String post_url;
  
  public AppCode(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.game_icon;
      if (str1 == null) {
        this.game_icon = "";
      } else {
        this.game_icon = str1;
      } 
      str1 = paramBuilder.post_url;
      if (str1 == null) {
        this.post_url = "";
      } else {
        this.post_url = str1;
      } 
      str = paramBuilder.button_text;
      if (str == null) {
        this.button_text = "";
      } else {
        this.button_text = str;
      } 
    } else {
      this.game_icon = ((Builder)str).game_icon;
      this.post_url = ((Builder)str).post_url;
      this.button_text = ((Builder)str).button_text;
    } 
  }
  
  public AppCode(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AppCode> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String button_text;
    
    public String game_icon;
    
    public String post_url;
    
    public Builder() {}
    
    public Builder(AppCode param1AppCode) {
      super(param1AppCode);
      if (param1AppCode == null)
        return; 
      this.game_icon = param1AppCode.game_icon;
      this.post_url = param1AppCode.post_url;
      this.button_text = param1AppCode.button_text;
    }
    
    public AppCode build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AppCode)interceptResult.objValue; 
      } 
      return new AppCode(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
