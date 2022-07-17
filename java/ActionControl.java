package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActionControl extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_TEXT_COLOR = "";
  
  public static final String DEFAULT_TEXT_COLOR_PRESSED = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String text_color_pressed;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public ActionControl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.text_color;
      if (str1 == null) {
        this.text_color = "";
      } else {
        this.text_color = str1;
      } 
      str = paramBuilder.text_color_pressed;
      if (str == null) {
        this.text_color_pressed = "";
      } else {
        this.text_color_pressed = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.name = ((Builder)str).name;
      this.text_color = ((Builder)str).text_color;
      this.text_color_pressed = ((Builder)str).text_color_pressed;
    } 
  }
  
  public ActionControl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActionControl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String name;
    
    public String text_color;
    
    public String text_color_pressed;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ActionControl param1ActionControl) {
      super(param1ActionControl);
      if (param1ActionControl == null)
        return; 
      this.url = param1ActionControl.url;
      this.name = param1ActionControl.name;
      this.text_color = param1ActionControl.text_color;
      this.text_color_pressed = param1ActionControl.text_color_pressed;
    }
    
    public ActionControl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ActionControl)interceptResult.objValue; 
      } 
      return new ActionControl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
