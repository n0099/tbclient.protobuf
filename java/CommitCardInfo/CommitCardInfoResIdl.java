package tbclient.CommitCardInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class CommitCardInfoResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public CommitCardInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public CommitCardInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CommitCardInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(CommitCardInfoResIdl param1CommitCardInfoResIdl) {
      super(param1CommitCardInfoResIdl);
      if (param1CommitCardInfoResIdl == null)
        return; 
      this.error = param1CommitCardInfoResIdl.error;
      this.data = param1CommitCardInfoResIdl.data;
    }
    
    public CommitCardInfoResIdl build(boolean param1Boolean) {
      return new CommitCardInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
