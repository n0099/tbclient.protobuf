package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetMemberTaskListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetMemberTaskListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMemberTaskListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMemberTaskListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetMemberTaskListResIdl param1GetMemberTaskListResIdl) {
      super(param1GetMemberTaskListResIdl);
      if (param1GetMemberTaskListResIdl == null)
        return; 
      this.error = param1GetMemberTaskListResIdl.error;
      this.data = param1GetMemberTaskListResIdl.data;
    }
    
    public GetMemberTaskListResIdl build(boolean param1Boolean) {
      return new GetMemberTaskListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
