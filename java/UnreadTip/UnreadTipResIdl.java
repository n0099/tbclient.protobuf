package tbclient.UnreadTip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class UnreadTipResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public UnreadTipResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public UnreadTipResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UnreadTipResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(UnreadTipResIdl param1UnreadTipResIdl) {
      super(param1UnreadTipResIdl);
      if (param1UnreadTipResIdl == null)
        return; 
      this.error = param1UnreadTipResIdl.error;
      this.data = param1UnreadTipResIdl.data;
    }
    
    public UnreadTipResIdl build(boolean param1Boolean) {
      return new UnreadTipResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
