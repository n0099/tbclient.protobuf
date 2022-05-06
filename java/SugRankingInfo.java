import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.RankingParam;
import tbclient.SugRankingInfo;

public final class SugRankingInfo extends Message {
  public static final String DEFAULT_RANK_TITLE = "";
  
  @ProtoField(tag = 2)
  public final RankingParam rank_param;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String rank_title;
  
  public SugRankingInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.rank_title;
      if (str == null) {
        this.rank_title = "";
      } else {
        this.rank_title = str;
      } 
      this.rank_param = paramBuilder.rank_param;
    } else {
      this.rank_title = paramBuilder.rank_title;
      this.rank_param = paramBuilder.rank_param;
    } 
  }
}
