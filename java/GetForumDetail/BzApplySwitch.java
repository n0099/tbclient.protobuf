package tbclient.GetForumDetail;

import com.squareup.wire.Message;

public final class BzApplySwitch extends Message {
  public BzApplySwitch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public BzApplySwitch(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BzApplySwitch> {
    public Builder() {}
    
    public Builder(BzApplySwitch param1BzApplySwitch) {
      super(param1BzApplySwitch);
    }
    
    public BzApplySwitch build(boolean param1Boolean) {
      return new BzApplySwitch(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
