package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetMemberInfoResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetMemberInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetMemberInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMemberInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetMemberInfoResIdl param1GetMemberInfoResIdl) {
      super(param1GetMemberInfoResIdl);
      if (param1GetMemberInfoResIdl == null)
        return; 
      this.data = param1GetMemberInfoResIdl.data;
      this.error = param1GetMemberInfoResIdl.error;
    }
    
    public GetMemberInfoResIdl build(boolean param1Boolean) {
      return new GetMemberInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
