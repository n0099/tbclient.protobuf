package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetForumsFromForumClassReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetForumsFromForumClassReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetForumsFromForumClassReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetForumsFromForumClassReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetForumsFromForumClassReqIdl param1GetForumsFromForumClassReqIdl) {
      super(param1GetForumsFromForumClassReqIdl);
      if (param1GetForumsFromForumClassReqIdl == null)
        return; 
      this.data = param1GetForumsFromForumClassReqIdl.data;
    }
    
    public GetForumsFromForumClassReqIdl build(boolean param1Boolean) {
      return new GetForumsFromForumClassReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
