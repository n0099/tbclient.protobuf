package tbclient.FinishMemberTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class FinishMemberTaskResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public FinishMemberTaskResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public FinishMemberTaskResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FinishMemberTaskResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(FinishMemberTaskResIdl param1FinishMemberTaskResIdl) {
      super(param1FinishMemberTaskResIdl);
      if (param1FinishMemberTaskResIdl == null)
        return; 
      this.error = param1FinishMemberTaskResIdl.error;
      this.data = param1FinishMemberTaskResIdl.data;
    }
    
    public FinishMemberTaskResIdl build(boolean param1Boolean) {
      return new FinishMemberTaskResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
