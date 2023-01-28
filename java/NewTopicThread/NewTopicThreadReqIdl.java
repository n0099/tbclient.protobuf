package tbclient.NewTopicThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NewTopicThreadReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public NewTopicThreadReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public NewTopicThreadReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewTopicThreadReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(NewTopicThreadReqIdl param1NewTopicThreadReqIdl) {
      super(param1NewTopicThreadReqIdl);
      if (param1NewTopicThreadReqIdl == null)
        return; 
      this.data = param1NewTopicThreadReqIdl.data;
    }
    
    public NewTopicThreadReqIdl build(boolean param1Boolean) {
      return new NewTopicThreadReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
