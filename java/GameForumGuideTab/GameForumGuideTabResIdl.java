package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GameForumGuideTabResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GameForumGuideTabResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GameForumGuideTabResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GameForumGuideTabResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GameForumGuideTabResIdl param1GameForumGuideTabResIdl) {
      super(param1GameForumGuideTabResIdl);
      if (param1GameForumGuideTabResIdl == null)
        return; 
      this.error = param1GameForumGuideTabResIdl.error;
      this.data = param1GameForumGuideTabResIdl.data;
    }
    
    public GameForumGuideTabResIdl build(boolean param1Boolean) {
      return new GameForumGuideTabResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
