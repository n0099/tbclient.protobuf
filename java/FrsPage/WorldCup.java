package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrsPage.WorldCupGame;
import tbclient.FrsPage.WorldCupLottery;
import tbclient.FrsPage.WorldCupNews;
import tbclient.FrsPage.WorldCupPk;

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
    super((Message.Builder)paramBuilder);
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
}
