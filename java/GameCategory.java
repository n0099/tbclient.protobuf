import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameCategory;

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
    super((Message.Builder)paramBuilder);
    List list;
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
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1607088769, "Ltbclient/GameCategory;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1607088769, "Ltbclient/GameCategory;");
          return;
        } 
      } 
    } 
  }
}
