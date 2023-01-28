package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GameInfo;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final GameInfo game_info;
  
  @ProtoField(tag = 2)
  public final RankInfo rank_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.game_info = paramBuilder.game_info;
      this.rank_info = paramBuilder.rank_info;
    } else {
      this.game_info = paramBuilder.game_info;
      this.rank_info = paramBuilder.rank_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public GameInfo game_info;
    
    public RankInfo rank_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.game_info = param1DataRes.game_info;
      this.rank_info = param1DataRes.rank_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
