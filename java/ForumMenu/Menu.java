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
import tbclient.ForumMenu.SubMenu;

public final class Menu extends Message {
  public static final Integer DEFAULT_ACTION_TYPE;
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_ID;
  
  public static final Integer DEFAULT_LEVEL;
  
  public static final String DEFAULT_NAME = "";
  
  public static final List<SubMenu> DEFAULT_SUB_MENU;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer action_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer forum_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer level;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<SubMenu> sub_menu;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2115282883, "Ltbclient/ForumMenu/Menu;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2115282883, "Ltbclient/ForumMenu/Menu;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_FORUM_ID = integer;
    DEFAULT_LEVEL = integer;
    DEFAULT_ACTION_TYPE = integer;
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_SUB_MENU = Collections.emptyList();
  }
  
  public Menu(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.id;
      if (integer2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer2;
      } 
      integer2 = paramBuilder.forum_id;
      if (integer2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = integer2;
      } 
      integer2 = paramBuilder.level;
      if (integer2 == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer2;
      } 
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      Integer integer1 = paramBuilder.action_type;
      if (integer1 == null) {
        this.action_type = DEFAULT_ACTION_TYPE;
      } else {
        this.action_type = integer1;
      } 
      integer1 = paramBuilder.create_time;
      if (integer1 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer1;
      } 
      String str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      list = paramBuilder.sub_menu;
      if (list == null) {
        this.sub_menu = DEFAULT_SUB_MENU;
      } else {
        this.sub_menu = Message.immutableCopyOf(list);
      } 
    } else {
      this.id = ((Builder)list).id;
      this.forum_id = ((Builder)list).forum_id;
      this.level = ((Builder)list).level;
      this.name = ((Builder)list).name;
      this.action_type = ((Builder)list).action_type;
      this.create_time = ((Builder)list).create_time;
      this.content = ((Builder)list).content;
      this.sub_menu = Message.immutableCopyOf(((Builder)list).sub_menu);
    } 
  }
}
