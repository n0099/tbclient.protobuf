package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Toast extends Message {
  public static final String DEFAULT_BACKGROUND = "";
  
  public static final List<ToastContent> DEFAULT_CONTENT;
  
  public static final Integer DEFAULT_ICON_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String background;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ToastContent> content;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer icon_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    DEFAULT_CONTENT = Collections.emptyList();
  }
  
  public Toast(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.icon_type;
      if (integer == null) {
        this.icon_type = DEFAULT_ICON_TYPE;
      } else {
        this.icon_type = integer;
      } 
      List<ToastContent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.background;
      if (str == null) {
        this.background = "";
      } else {
        this.background = str;
      } 
    } else {
      this.icon_type = ((Builder)str).icon_type;
      this.content = Message.immutableCopyOf(((Builder)str).content);
      this.url = ((Builder)str).url;
      this.background = ((Builder)str).background;
    } 
  }
  
  public Toast(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Toast> {
    public String background;
    
    public List<ToastContent> content;
    
    public Integer icon_type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(Toast param1Toast) {
      super(param1Toast);
      if (param1Toast == null)
        return; 
      this.icon_type = param1Toast.icon_type;
      this.content = Message.copyOf(param1Toast.content);
      this.url = param1Toast.url;
      this.background = param1Toast.background;
    }
    
    public Toast build(boolean param1Boolean) {
      return new Toast(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
