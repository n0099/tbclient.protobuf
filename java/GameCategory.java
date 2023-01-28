package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GameCategory extends Message {
  public static final List<String> DEFAULT_GAME_LIST;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
  public final List<String> game_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  static {
    DEFAULT_GAME_LIST = Collections.emptyList();
  }
  
  public GameCategory(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
      list = paramBuilder.game_list;
      if (list == null) {
        this.game_list = DEFAULT_GAME_LIST;
      } else {
        this.game_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.id = ((Builder)list).id;
      this.name = ((Builder)list).name;
      this.icon_url = ((Builder)list).icon_url;
      this.game_list = Message.immutableCopyOf(((Builder)list).game_list);
    } 
  }
  
  public GameCategory(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GameCategory> {
    public List<String> game_list;
    
    public String icon_url;
    
    public Integer id;
    
    public String name;
    
    public Builder() {}
    
    public Builder(GameCategory param1GameCategory) {
      super(param1GameCategory);
      if (param1GameCategory == null)
        return; 
      this.id = param1GameCategory.id;
      this.name = param1GameCategory.name;
      this.icon_url = param1GameCategory.icon_url;
      this.game_list = Message.copyOf(param1GameCategory.game_list);
    }
    
    public GameCategory build(boolean param1Boolean) {
      return new GameCategory(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
