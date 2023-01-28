package tbclient.GetBubbleByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetBubbleByCategoryReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetBubbleByCategoryReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetBubbleByCategoryReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBubbleByCategoryReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetBubbleByCategoryReqIdl param1GetBubbleByCategoryReqIdl) {
      super(param1GetBubbleByCategoryReqIdl);
      if (param1GetBubbleByCategoryReqIdl == null)
        return; 
      this.data = param1GetBubbleByCategoryReqIdl.data;
    }
    
    public GetBubbleByCategoryReqIdl build(boolean param1Boolean) {
      return new GetBubbleByCategoryReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
