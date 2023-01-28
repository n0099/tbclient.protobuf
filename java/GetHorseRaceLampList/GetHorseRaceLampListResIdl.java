package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetHorseRaceLampListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetHorseRaceLampListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetHorseRaceLampListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetHorseRaceLampListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetHorseRaceLampListResIdl param1GetHorseRaceLampListResIdl) {
      super(param1GetHorseRaceLampListResIdl);
      if (param1GetHorseRaceLampListResIdl == null)
        return; 
      this.error = param1GetHorseRaceLampListResIdl.error;
      this.data = param1GetHorseRaceLampListResIdl.data;
    }
    
    public GetHorseRaceLampListResIdl build(boolean param1Boolean) {
      return new GetHorseRaceLampListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
