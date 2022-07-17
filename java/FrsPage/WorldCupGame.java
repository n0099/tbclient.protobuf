package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class WorldCupGame extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_STATUS = "";
  
  public static final List<WorldCupGameTeam> DEFAULT_TEAM = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
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
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1733287974, "Ltbclient/FrsPage/WorldCupGame;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1733287974, "Ltbclient/FrsPage/WorldCupGame;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<WorldCupGame> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
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
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (WorldCupGame)interceptResult.objValue; 
      } 
      return new WorldCupGame(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
