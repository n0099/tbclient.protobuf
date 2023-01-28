package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Toast extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  public Toast(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.content = ((Builder)str).content;
    } 
  }
  
  public Toast(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Toast> {
    public String content;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(Toast param1Toast) {
      super(param1Toast);
      if (param1Toast == null)
        return; 
      this.type = param1Toast.type;
      this.content = param1Toast.content;
    }
    
    public Toast build(boolean param1Boolean) {
      return new Toast(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
