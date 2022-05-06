package GetGameDetail;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GameInfo;
import tbclient.GetGameDetail.RankInfo;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final GameInfo game_info;
  
  @ProtoField(tag = 2)
  public final RankInfo rank_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.game_info = paramBuilder.game_info;
      this.rank_info = paramBuilder.rank_info;
    } else {
      this.game_info = paramBuilder.game_info;
      this.rank_info = paramBuilder.rank_info;
    } 
  }
}
