import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LiveRoomInfo;

public final class LiveRoomInfo extends Message {
  public static final String DEFAULT_BTN_TITLE = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_OWN_ROOM_COUNT = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String btn_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer own_room_count;
  
  public LiveRoomInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.btn_title;
      if (str1 == null) {
        this.btn_title = "";
      } else {
        this.btn_title = str1;
      } 
      Integer integer = paramBuilder.own_room_count;
      if (integer == null) {
        this.own_room_count = DEFAULT_OWN_ROOM_COUNT;
      } else {
        this.own_room_count = integer;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.btn_title = ((Builder)str).btn_title;
      this.own_room_count = ((Builder)str).own_room_count;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-473694980, "Ltbclient/LiveRoomInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-473694980, "Ltbclient/LiveRoomInfo;");
          return;
        } 
      } 
    } 
  }
}
