package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopicListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public TopicListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public TopicListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(TopicListReqIdl param1TopicListReqIdl) {
      super(param1TopicListReqIdl);
      if (param1TopicListReqIdl == null)
        return; 
      this.data = param1TopicListReqIdl.data;
    }
    
    public TopicListReqIdl build(boolean param1Boolean) {
      return new TopicListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
