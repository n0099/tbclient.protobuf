package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WorldCupPk extends Message {
  public static final String DEFAULT_PRIZE_URL = "";
  
  public static final String DEFAULT_SUM_BONUS = "";
  
  public static final String DEFAULT_SUM_GAME = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String prize_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sum_bonus;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String sum_game;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public WorldCupPk(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.sum_game;
      if (str1 == null) {
        this.sum_game = "";
      } else {
        this.sum_game = str1;
      } 
      str1 = paramBuilder.sum_bonus;
      if (str1 == null) {
        this.sum_bonus = "";
      } else {
        this.sum_bonus = str1;
      } 
      str1 = paramBuilder.prize_url;
      if (str1 == null) {
        this.prize_url = "";
      } else {
        this.prize_url = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.sum_game = ((Builder)str).sum_game;
      this.sum_bonus = ((Builder)str).sum_bonus;
      this.prize_url = ((Builder)str).prize_url;
      this.url = ((Builder)str).url;
    } 
  }
  
  public WorldCupPk(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WorldCupPk> {
    public String prize_url;
    
    public String sum_bonus;
    
    public String sum_game;
    
    public String url;
    
    public Builder() {}
    
    public Builder(WorldCupPk param1WorldCupPk) {
      super(param1WorldCupPk);
      if (param1WorldCupPk == null)
        return; 
      this.sum_game = param1WorldCupPk.sum_game;
      this.sum_bonus = param1WorldCupPk.sum_bonus;
      this.prize_url = param1WorldCupPk.prize_url;
      this.url = param1WorldCupPk.url;
    }
    
    public WorldCupPk build(boolean param1Boolean) {
      return new WorldCupPk(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
