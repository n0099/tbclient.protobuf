package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WindowToast extends Message {
  public static final String DEFAULT_TOAST_CONTENT = "";
  
  public static final String DEFAULT_TOAST_LINK = "";
  
  public static final Integer DEFAULT_TOAST_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String toast_content;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String toast_link;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer toast_type;
  
  public WindowToast(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.toast_type;
      if (integer == null) {
        this.toast_type = DEFAULT_TOAST_TYPE;
      } else {
        this.toast_type = integer;
      } 
      String str1 = paramBuilder.toast_link;
      if (str1 == null) {
        this.toast_link = "";
      } else {
        this.toast_link = str1;
      } 
      str = paramBuilder.toast_content;
      if (str == null) {
        this.toast_content = "";
      } else {
        this.toast_content = str;
      } 
    } else {
      this.toast_type = ((Builder)str).toast_type;
      this.toast_link = ((Builder)str).toast_link;
      this.toast_content = ((Builder)str).toast_content;
    } 
  }
  
  public WindowToast(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WindowToast> {
    public String toast_content;
    
    public String toast_link;
    
    public Integer toast_type;
    
    public Builder() {}
    
    public Builder(WindowToast param1WindowToast) {
      super(param1WindowToast);
      if (param1WindowToast == null)
        return; 
      this.toast_type = param1WindowToast.toast_type;
      this.toast_link = param1WindowToast.toast_link;
      this.toast_content = param1WindowToast.toast_content;
    }
    
    public WindowToast build(boolean param1Boolean) {
      return new WindowToast(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
