package tbclient.GetTopicRelateThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetTopicRelateThreadReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetTopicRelateThreadReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetTopicRelateThreadReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetTopicRelateThreadReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetTopicRelateThreadReqIdl param1GetTopicRelateThreadReqIdl) {
      super(param1GetTopicRelateThreadReqIdl);
      if (param1GetTopicRelateThreadReqIdl == null)
        return; 
      this.data = param1GetTopicRelateThreadReqIdl.data;
    }
    
    public GetTopicRelateThreadReqIdl build(boolean param1Boolean) {
      return new GetTopicRelateThreadReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
