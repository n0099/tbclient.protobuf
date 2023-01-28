package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetSugTopicReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetSugTopicReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetSugTopicReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetSugTopicReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetSugTopicReqIdl param1GetSugTopicReqIdl) {
      super(param1GetSugTopicReqIdl);
      if (param1GetSugTopicReqIdl == null)
        return; 
      this.data = param1GetSugTopicReqIdl.data;
    }
    
    public GetSugTopicReqIdl build(boolean param1Boolean) {
      return new GetSugTopicReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
