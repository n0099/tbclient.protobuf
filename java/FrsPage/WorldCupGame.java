package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsPage.WorldCupGameTeam;

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
    super((Message.Builder)paramBuilder);
    List list;
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
}
