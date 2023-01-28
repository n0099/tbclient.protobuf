package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class WorldCupGame extends Message {
  public static final String DEFAULT_STATUS = "";
  
  public static final List<WorldCupGameTeam> DEFAULT_TEAM = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<WorldCupGameTeam> team;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public WorldCupGame(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<WorldCupGameTeam> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.status;
      if (str == null) {
        this.status = "";
      } else {
        this.status = str;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      list = paramBuilder.team;
      if (list == null) {
        this.team = DEFAULT_TEAM;
      } else {
        this.team = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.status = ((Builder)list).status;
      this.url = ((Builder)list).url;
      this.team = Message.immutableCopyOf(((Builder)list).team);
    } 
  }
  
  public WorldCupGame(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WorldCupGame> {
    public String status;
    
    public List<WorldCupGameTeam> team;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(WorldCupGame param1WorldCupGame) {
      super(param1WorldCupGame);
      if (param1WorldCupGame == null)
        return; 
      this.title = param1WorldCupGame.title;
      this.status = param1WorldCupGame.status;
      this.url = param1WorldCupGame.url;
      this.team = Message.copyOf(param1WorldCupGame.team);
    }
    
    public WorldCupGame build(boolean param1Boolean) {
      return new WorldCupGame(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
