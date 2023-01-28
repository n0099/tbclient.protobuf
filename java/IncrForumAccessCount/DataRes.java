package tbclient.IncrForumAccessCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrequentlyForumInfo;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final FrequentlyForumInfo frequently_forum_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.frequently_forum_info = paramBuilder.frequently_forum_info;
    } else {
      this.frequently_forum_info = paramBuilder.frequently_forum_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public FrequentlyForumInfo frequently_forum_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.frequently_forum_info = param1DataRes.frequently_forum_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
