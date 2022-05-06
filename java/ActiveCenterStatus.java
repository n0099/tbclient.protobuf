import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ActiveCenterStatus;

public final class ActiveCenterStatus extends Message {
  public static final Integer DEFAULT_DAY;
  
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_IS_COMPLETED;
  
  public static final Integer DEFAULT_IS_TODAY_MISSION;
  
  public static final String DEFAULT_MISSION = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer day;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_completed;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_today_mission;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String mission;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(621348324, "Ltbclient/ActiveCenterStatus;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(621348324, "Ltbclient/ActiveCenterStatus;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_DAY = integer;
    DEFAULT_IS_COMPLETED = integer;
    DEFAULT_IS_TODAY_MISSION = integer;
  }
  
  public ActiveCenterStatus(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.day;
      if (integer2 == null) {
        this.day = DEFAULT_DAY;
      } else {
        this.day = integer2;
      } 
      integer2 = paramBuilder.is_completed;
      if (integer2 == null) {
        this.is_completed = DEFAULT_IS_COMPLETED;
      } else {
        this.is_completed = integer2;
      } 
      String str1 = paramBuilder.mission;
      if (str1 == null) {
        this.mission = "";
      } else {
        this.mission = str1;
      } 
      Integer integer1 = paramBuilder.is_today_mission;
      if (integer1 == null) {
        this.is_today_mission = DEFAULT_IS_TODAY_MISSION;
      } else {
        this.is_today_mission = integer1;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
    } else {
      this.day = ((Builder)str).day;
      this.is_completed = ((Builder)str).is_completed;
      this.mission = ((Builder)str).mission;
      this.is_today_mission = ((Builder)str).is_today_mission;
      this.desc = ((Builder)str).desc;
    } 
  }
}
