package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeRecommand extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_BUTTON_URL = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_TIP_TEXT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tip_text;
  
  public ThemeRecommand(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.tip_text;
      if (str1 == null) {
        this.tip_text = "";
      } else {
        this.tip_text = str1;
      } 
      str1 = paramBuilder.button_url;
      if (str1 == null) {
        this.button_url = "";
      } else {
        this.button_url = str1;
      } 
      str = paramBuilder.button_text;
      if (str == null) {
        this.button_text = "";
      } else {
        this.button_text = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.tip_text = ((Builder)str).tip_text;
      this.button_url = ((Builder)str).button_url;
      this.button_text = ((Builder)str).button_text;
    } 
  }
  
  public ThemeRecommand(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeRecommand> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String button_text;
    
    public String button_url;
    
    public String icon;
    
    public String tip_text;
    
    public Builder() {}
    
    public Builder(ThemeRecommand param1ThemeRecommand) {
      super(param1ThemeRecommand);
      if (param1ThemeRecommand == null)
        return; 
      this.icon = param1ThemeRecommand.icon;
      this.tip_text = param1ThemeRecommand.tip_text;
      this.button_url = param1ThemeRecommand.button_url;
      this.button_text = param1ThemeRecommand.button_text;
    }
    
    public ThemeRecommand build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThemeRecommand)interceptResult.objValue; 
      } 
      return new ThemeRecommand(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
