package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ToastContent extends Message {
  public static final Integer DEFAULT_HAS_COLOR = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public ToastContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      integer = paramBuilder.has_color;
      if (integer == null) {
        this.has_color = DEFAULT_HAS_COLOR;
      } else {
        this.has_color = integer;
      } 
    } else {
      this.text = ((Builder)integer).text;
      this.has_color = ((Builder)integer).has_color;
    } 
  }
  
  public ToastContent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ToastContent> {
    public Integer has_color;
    
    public String text;
    
    public Builder() {}
    
    public Builder(ToastContent param1ToastContent) {
      super(param1ToastContent);
      if (param1ToastContent == null)
        return; 
      this.text = param1ToastContent.text;
      this.has_color = param1ToastContent.has_color;
    }
    
    public ToastContent build(boolean param1Boolean) {
      return new ToastContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
