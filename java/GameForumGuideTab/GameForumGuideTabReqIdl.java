package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GameForumGuideTabReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GameForumGuideTabReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GameForumGuideTabReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GameForumGuideTabReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GameForumGuideTabReqIdl param1GameForumGuideTabReqIdl) {
      super(param1GameForumGuideTabReqIdl);
      if (param1GameForumGuideTabReqIdl == null)
        return; 
      this.data = param1GameForumGuideTabReqIdl.data;
    }
    
    public GameForumGuideTabReqIdl build(boolean param1Boolean) {
      return new GameForumGuideTabReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
