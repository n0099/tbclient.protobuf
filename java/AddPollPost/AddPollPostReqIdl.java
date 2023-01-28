package tbclient.AddPollPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddPollPostReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public AddPollPostReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AddPollPostReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddPollPostReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(AddPollPostReqIdl param1AddPollPostReqIdl) {
      super(param1AddPollPostReqIdl);
      if (param1AddPollPostReqIdl == null)
        return; 
      this.data = param1AddPollPostReqIdl.data;
    }
    
    public AddPollPostReqIdl build(boolean param1Boolean) {
      return new AddPollPostReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
