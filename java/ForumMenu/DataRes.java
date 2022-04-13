package ForumMenu;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumMenu.Menu;

public final class DataRes extends Message {
  public static final Integer DEFAULT_HAS_MENU;
  
  public static final List<Menu> DEFAULT_PARENT_MENU = Collections.emptyList();
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_menu;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Menu> parent_menu;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_HAS_MENU = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.parent_menu;
      if (list == null) {
        this.parent_menu = DEFAULT_PARENT_MENU;
      } else {
        this.parent_menu = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.update_time;
      if (integer1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer1;
      } 
      integer = paramBuilder.has_menu;
      if (integer == null) {
        this.has_menu = DEFAULT_HAS_MENU;
      } else {
        this.has_menu = integer;
      } 
    } else {
      this.parent_menu = Message.immutableCopyOf(((Builder)integer).parent_menu);
      this.update_time = ((Builder)integer).update_time;
      this.has_menu = ((Builder)integer).has_menu;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1269147650, "Ltbclient/ForumMenu/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1269147650, "Ltbclient/ForumMenu/DataRes;");
          return;
        } 
      } 
    } 
  }
}
