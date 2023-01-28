package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WorldCup extends Message {
  @ProtoField(tag = 4)
  public final WorldCupGame game;
  
  @ProtoField(tag = 3)
  public final WorldCupLottery lottery;
  
  @ProtoField(tag = 1)
  public final WorldCupNews news;
  
  @ProtoField(tag = 2)
  public final WorldCupPk pk;
  
  public WorldCup(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.news = paramBuilder.news;
      this.pk = paramBuilder.pk;
      this.lottery = paramBuilder.lottery;
      this.game = paramBuilder.game;
    } else {
      this.news = paramBuilder.news;
      this.pk = paramBuilder.pk;
      this.lottery = paramBuilder.lottery;
      this.game = paramBuilder.game;
    } 
  }
  
  public WorldCup(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WorldCup> {
    public WorldCupGame game;
    
    public WorldCupLottery lottery;
    
    public WorldCupNews news;
    
    public WorldCupPk pk;
    
    public Builder() {}
    
    public Builder(WorldCup param1WorldCup) {
      super(param1WorldCup);
      if (param1WorldCup == null)
        return; 
      this.news = param1WorldCup.news;
      this.pk = param1WorldCup.pk;
      this.lottery = param1WorldCup.lottery;
      this.game = param1WorldCup.game;
    }
    
    public WorldCup build(boolean param1Boolean) {
      return new WorldCup(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
