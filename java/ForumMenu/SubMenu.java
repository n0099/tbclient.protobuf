package ForumMenu;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SubMenu extends Message {
  public static final Integer DEFAULT_ACTION_TYPE;
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final Integer DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_ID;
  
  public static final Integer DEFAULT_LEVEL;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_PARENT_ID;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer action_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer forum_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer level;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer parent_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-859812363, "Ltbclient/ForumMenu/SubMenu;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-859812363, "Ltbclient/ForumMenu/SubMenu;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_FORUM_ID = integer;
    DEFAULT_LEVEL = integer;
    DEFAULT_PARENT_ID = integer;
    DEFAULT_ACTION_TYPE = integer;
    DEFAULT_UPDATE_TIME = integer;
  }
  
  public SubMenu(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
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
      integer2 = paramBuilder.parent_id;
      if (integer2 == null) {
        this.parent_id = DEFAULT_PARENT_ID;
      } else {
        this.parent_id = integer2;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      Integer integer1 = paramBuilder.action_type;
      if (integer1 == null) {
        this.action_type = DEFAULT_ACTION_TYPE;
      } else {
        this.action_type = integer1;
      } 
      integer1 = paramBuilder.update_time;
      if (integer1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.forum_id = ((Builder)str).forum_id;
      this.level = ((Builder)str).level;
      this.parent_id = ((Builder)str).parent_id;
      this.name = ((Builder)str).name;
      this.action_type = ((Builder)str).action_type;
      this.update_time = ((Builder)str).update_time;
      this.content = ((Builder)str).content;
    } 
  }
}
