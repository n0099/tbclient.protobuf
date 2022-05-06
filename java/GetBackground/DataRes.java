package GetBackground;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  public static final Integer DEFAULT_DAILY_PRIVILEGE_STATUS;
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final Integer DEFAULT_FREE_USER_LEVEL;
  
  public static final Integer DEFAULT_IS_FINISHED;
  
  public static final String DEFAULT_PERMISSION = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_PROPS_STATE_IMG = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String activity_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer daily_privilege_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer free_user_level;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_finished;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String permission;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String props_state_img;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2043066246, "Ltbclient/GetBackground/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2043066246, "Ltbclient/GetBackground/DataRes;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FREE_USER_LEVEL = integer;
    DEFAULT_IS_FINISHED = integer;
    DEFAULT_DAILY_PRIVILEGE_STATUS = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.description;
      if (str == null) {
        this.description = "";
      } else {
        this.description = str;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      str = paramBuilder.permission;
      if (str == null) {
        this.permission = "";
      } else {
        this.permission = str;
      } 
      str = paramBuilder.props_state_img;
      if (str == null) {
        this.props_state_img = "";
      } else {
        this.props_state_img = str;
      } 
      str = paramBuilder.activity_url;
      if (str == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str;
      } 
      Integer integer1 = paramBuilder.free_user_level;
      if (integer1 == null) {
        this.free_user_level = DEFAULT_FREE_USER_LEVEL;
      } else {
        this.free_user_level = integer1;
      } 
      integer1 = paramBuilder.is_finished;
      if (integer1 == null) {
        this.is_finished = DEFAULT_IS_FINISHED;
      } else {
        this.is_finished = integer1;
      } 
      integer = paramBuilder.daily_privilege_status;
      if (integer == null) {
        this.daily_privilege_status = DEFAULT_DAILY_PRIVILEGE_STATUS;
      } else {
        this.daily_privilege_status = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.description = ((Builder)integer).description;
      this.pic_url = ((Builder)integer).pic_url;
      this.permission = ((Builder)integer).permission;
      this.props_state_img = ((Builder)integer).props_state_img;
      this.activity_url = ((Builder)integer).activity_url;
      this.free_user_level = ((Builder)integer).free_user_level;
      this.is_finished = ((Builder)integer).is_finished;
      this.daily_privilege_status = ((Builder)integer).daily_privilege_status;
    } 
  }
}
