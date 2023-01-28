package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PsRankListItem extends Message {
  public static final Long DEFAULT_GAME_ID;
  
  public static final Long DEFAULT_SCORE;
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long game_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long score;
  
  @ProtoField(tag = 4)
  public final User user;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_GAME_ID = long_;
    DEFAULT_USER_ID = long_;
    DEFAULT_SCORE = long_;
  }
  
  public PsRankListItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.game_id;
      if (long_ == null) {
        this.game_id = DEFAULT_GAME_ID;
      } else {
        this.game_id = long_;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      long_ = paramBuilder.score;
      if (long_ == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = long_;
      } 
      this.user = paramBuilder.user;
    } else {
      this.game_id = paramBuilder.game_id;
      this.user_id = paramBuilder.user_id;
      this.score = paramBuilder.score;
      this.user = paramBuilder.user;
    } 
  }
  
  public PsRankListItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PsRankListItem> {
    public Long game_id;
    
    public Long score;
    
    public User user;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(PsRankListItem param1PsRankListItem) {
      super(param1PsRankListItem);
      if (param1PsRankListItem == null)
        return; 
      this.game_id = param1PsRankListItem.game_id;
      this.user_id = param1PsRankListItem.user_id;
      this.score = param1PsRankListItem.score;
      this.user = param1PsRankListItem.user;
    }
    
    public PsRankListItem build(boolean param1Boolean) {
      return new PsRankListItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
