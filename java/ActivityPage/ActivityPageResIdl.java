package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ActivityPageResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ActivityPageResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ActivityPageResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActivityPageResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ActivityPageResIdl param1ActivityPageResIdl) {
      super(param1ActivityPageResIdl);
      if (param1ActivityPageResIdl == null)
        return; 
      this.error = param1ActivityPageResIdl.error;
      this.data = param1ActivityPageResIdl.data;
    }
    
    public ActivityPageResIdl build(boolean param1Boolean) {
      return new ActivityPageResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
