package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ToastConfig extends Message {
  public static final String DEFAULT_PRE_COLOR_MSG = "";
  
  public static final String DEFAULT_TOAST_BACK_IMAGE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pre_color_msg;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String toast_back_image;
  
  public ToastConfig(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pre_color_msg;
      if (str1 == null) {
        this.pre_color_msg = "";
      } else {
        this.pre_color_msg = str1;
      } 
      str = paramBuilder.toast_back_image;
      if (str == null) {
        this.toast_back_image = "";
      } else {
        this.toast_back_image = str;
      } 
    } else {
      this.pre_color_msg = ((Builder)str).pre_color_msg;
      this.toast_back_image = ((Builder)str).toast_back_image;
    } 
  }
  
  public ToastConfig(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ToastConfig> {
    public String pre_color_msg;
    
    public String toast_back_image;
    
    public Builder() {}
    
    public Builder(ToastConfig param1ToastConfig) {
      super(param1ToastConfig);
      if (param1ToastConfig == null)
        return; 
      this.pre_color_msg = param1ToastConfig.pre_color_msg;
      this.toast_back_image = param1ToastConfig.toast_back_image;
    }
    
    public ToastConfig build(boolean param1Boolean) {
      return new ToastConfig(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
