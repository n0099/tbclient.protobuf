import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActiveCenter;
import tbclient.ActiveCenterMission;
import tbclient.ActiveCenterStatus;

public final class ActiveCenter extends Message {
  public static final Integer DEFAULT_IS_FIRST_UP;
  
  public static final Integer DEFAULT_IS_NEW_WINDOW;
  
  public static final List<ActiveCenterStatus> DEFAULT_MISSION_STATUS_LIST = Collections.emptyList();
  
  public static final String DEFAULT_WIN_DESC = "";
  
  public static final Integer DEFAULT_WIN_JUMP_TIME;
  
  public static final String DEFAULT_WIN_TITLE = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_first_up;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_new_window;
  
  @ProtoField(tag = 3)
  public final ActiveCenterMission mission;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ActiveCenterStatus> mission_status_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String win_desc;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer win_jump_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String win_title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIN_JUMP_TIME = integer;
    DEFAULT_IS_NEW_WINDOW = integer;
    DEFAULT_IS_FIRST_UP = integer;
  }
  
  public ActiveCenter(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.win_title;
      if (str == null) {
        this.win_title = "";
      } else {
        this.win_title = str;
      } 
      str = paramBuilder.win_desc;
      if (str == null) {
        this.win_desc = "";
      } else {
        this.win_desc = str;
      } 
      this.mission = paramBuilder.mission;
      List list = paramBuilder.mission_status_list;
      if (list == null) {
        this.mission_status_list = DEFAULT_MISSION_STATUS_LIST;
      } else {
        this.mission_status_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.win_jump_time;
      if (integer1 == null) {
        this.win_jump_time = DEFAULT_WIN_JUMP_TIME;
      } else {
        this.win_jump_time = integer1;
      } 
      integer1 = paramBuilder.is_new_window;
      if (integer1 == null) {
        this.is_new_window = DEFAULT_IS_NEW_WINDOW;
      } else {
        this.is_new_window = integer1;
      } 
      integer = paramBuilder.is_first_up;
      if (integer == null) {
        this.is_first_up = DEFAULT_IS_FIRST_UP;
      } else {
        this.is_first_up = integer;
      } 
    } else {
      this.win_title = ((Builder)integer).win_title;
      this.win_desc = ((Builder)integer).win_desc;
      this.mission = ((Builder)integer).mission;
      this.mission_status_list = Message.immutableCopyOf(((Builder)integer).mission_status_list);
      this.win_jump_time = ((Builder)integer).win_jump_time;
      this.is_new_window = ((Builder)integer).is_new_window;
      this.is_first_up = ((Builder)integer).is_first_up;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-990103562, "Ltbclient/ActiveCenter;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-990103562, "Ltbclient/ActiveCenter;");
          return;
        } 
      } 
    } 
  }
}
