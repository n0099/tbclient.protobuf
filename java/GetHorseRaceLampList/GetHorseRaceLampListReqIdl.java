package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetHorseRaceLampListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetHorseRaceLampListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetHorseRaceLampListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetHorseRaceLampListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetHorseRaceLampListReqIdl param1GetHorseRaceLampListReqIdl) {
      super(param1GetHorseRaceLampListReqIdl);
      if (param1GetHorseRaceLampListReqIdl == null)
        return; 
      this.data = param1GetHorseRaceLampListReqIdl.data;
    }
    
    public GetHorseRaceLampListReqIdl build(boolean param1Boolean) {
      return new GetHorseRaceLampListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
