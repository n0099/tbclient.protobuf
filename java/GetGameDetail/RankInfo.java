package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RankInfo extends Message {
  public static final List<RankItem> DEFAULT_RANK_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RankItem> rank_list;
  
  public RankInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RankItem> list;
    if (paramBoolean == true) {
      list = paramBuilder.rank_list;
      if (list == null) {
        this.rank_list = DEFAULT_RANK_LIST;
      } else {
        this.rank_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.rank_list = Message.immutableCopyOf(((Builder)list).rank_list);
    } 
  }
  
  public RankInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RankInfo> {
    public List<RankItem> rank_list;
    
    public Builder() {}
    
    public Builder(RankInfo param1RankInfo) {
      super(param1RankInfo);
      if (param1RankInfo == null)
        return; 
      this.rank_list = Message.copyOf(param1RankInfo.rank_list);
    }
    
    public RankInfo build(boolean param1Boolean) {
      return new RankInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
