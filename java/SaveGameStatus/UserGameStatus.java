package tbclient.SaveGameStatus;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserGameStatus extends Message {
  public static final String DEFAULT_GAME_ID = "";
  
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer status;
  
  public UserGameStatus(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.game_id;
      if (str == null) {
        this.game_id = "";
      } else {
        this.game_id = str;
      } 
      integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
    } else {
      this.game_id = ((Builder)integer).game_id;
      this.status = ((Builder)integer).status;
    } 
  }
  
  public UserGameStatus(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserGameStatus> {
    public String game_id;
    
    public Integer status;
    
    public Builder() {}
    
    public Builder(UserGameStatus param1UserGameStatus) {
      super(param1UserGameStatus);
      if (param1UserGameStatus == null)
        return; 
      this.game_id = param1UserGameStatus.game_id;
      this.status = param1UserGameStatus.status;
    }
    
    public UserGameStatus build(boolean param1Boolean) {
      return new UserGameStatus(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
