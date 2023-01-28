package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetMemberTaskListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetMemberTaskListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMemberTaskListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMemberTaskListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetMemberTaskListReqIdl param1GetMemberTaskListReqIdl) {
      super(param1GetMemberTaskListReqIdl);
      if (param1GetMemberTaskListReqIdl == null)
        return; 
      this.data = param1GetMemberTaskListReqIdl.data;
    }
    
    public GetMemberTaskListReqIdl build(boolean param1Boolean) {
      return new GetMemberTaskListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
