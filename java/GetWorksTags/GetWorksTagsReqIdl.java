package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetWorksTagsReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetWorksTagsReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetWorksTagsReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetWorksTagsReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetWorksTagsReqIdl param1GetWorksTagsReqIdl) {
      super(param1GetWorksTagsReqIdl);
      if (param1GetWorksTagsReqIdl == null)
        return; 
      this.data = param1GetWorksTagsReqIdl.data;
    }
    
    public GetWorksTagsReqIdl build(boolean param1Boolean) {
      return new GetWorksTagsReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
