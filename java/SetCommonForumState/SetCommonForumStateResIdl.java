package tbclient.SetCommonForumState;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SetCommonForumStateResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SetCommonForumStateResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SetCommonForumStateResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetCommonForumStateResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SetCommonForumStateResIdl param1SetCommonForumStateResIdl) {
      super(param1SetCommonForumStateResIdl);
      if (param1SetCommonForumStateResIdl == null)
        return; 
      this.error = param1SetCommonForumStateResIdl.error;
      this.data = param1SetCommonForumStateResIdl.data;
    }
    
    public SetCommonForumStateResIdl build(boolean param1Boolean) {
      return new SetCommonForumStateResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
