package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Global extends Message {
  public static final String DEFAULT_TBMALL_NEWPROPS = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tbmall_newprops;
  
  public Global(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.tbmall_newprops;
      if (str == null) {
        this.tbmall_newprops = "";
      } else {
        this.tbmall_newprops = str;
      } 
    } else {
      this.tbmall_newprops = ((Builder)str).tbmall_newprops;
    } 
  }
  
  public Global(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Global> {
    public String tbmall_newprops;
    
    public Builder() {}
    
    public Builder(Global param1Global) {
      super(param1Global);
      if (param1Global == null)
        return; 
      this.tbmall_newprops = param1Global.tbmall_newprops;
    }
    
    public Global build(boolean param1Boolean) {
      return new Global(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
