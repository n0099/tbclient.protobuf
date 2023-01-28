package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ContriInfo extends Message {
  public static final String DEFAULT_AFTER_MSG = "";
  
  public static final String DEFAULT_COLOR_MSG = "";
  
  public static final List<ToastConfig> DEFAULT_TOAST_CONFIG = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String after_msg;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String color_msg;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ToastConfig> toast_config;
  
  public ContriInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ToastConfig> list;
    if (paramBoolean == true) {
      String str = paramBuilder.color_msg;
      if (str == null) {
        this.color_msg = "";
      } else {
        this.color_msg = str;
      } 
      str = paramBuilder.after_msg;
      if (str == null) {
        this.after_msg = "";
      } else {
        this.after_msg = str;
      } 
      list = paramBuilder.toast_config;
      if (list == null) {
        this.toast_config = DEFAULT_TOAST_CONFIG;
      } else {
        this.toast_config = Message.immutableCopyOf(list);
      } 
    } else {
      this.color_msg = ((Builder)list).color_msg;
      this.after_msg = ((Builder)list).after_msg;
      this.toast_config = Message.immutableCopyOf(((Builder)list).toast_config);
    } 
  }
  
  public ContriInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ContriInfo> {
    public String after_msg;
    
    public String color_msg;
    
    public List<ToastConfig> toast_config;
    
    public Builder() {}
    
    public Builder(ContriInfo param1ContriInfo) {
      super(param1ContriInfo);
      if (param1ContriInfo == null)
        return; 
      this.color_msg = param1ContriInfo.color_msg;
      this.after_msg = param1ContriInfo.after_msg;
      this.toast_config = Message.copyOf(param1ContriInfo.toast_config);
    }
    
    public ContriInfo build(boolean param1Boolean) {
      return new ContriInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
