package tbclient.RedNotify;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RedNotify extends Message {
  public static final Integer DEFAULT_NOTIFY_STATUS = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer notify_status;
  
  public RedNotify(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.notify_status;
      if (integer == null) {
        this.notify_status = DEFAULT_NOTIFY_STATUS;
      } else {
        this.notify_status = integer;
      } 
    } else {
      this.notify_status = ((Builder)integer).notify_status;
    } 
  }
  
  public RedNotify(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RedNotify> {
    public Integer notify_status;
    
    public Builder() {}
    
    public Builder(RedNotify param1RedNotify) {
      super(param1RedNotify);
      if (param1RedNotify == null)
        return; 
      this.notify_status = param1RedNotify.notify_status;
    }
    
    public RedNotify build(boolean param1Boolean) {
      return new RedNotify(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
