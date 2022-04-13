import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.MissionInfo;

public final class MissionInfo extends Message {
  public static final Integer DEFAULT_ACTIVITYID;
  
  public static final Integer DEFAULT_BROWSETIME;
  
  public static final String DEFAULT_BROWSETIMEPAGE = "";
  
  public static final Integer DEFAULT_CLEARTIME;
  
  public static final Integer DEFAULT_CLEARTYPE;
  
  public static final Integer DEFAULT_MISSIONID;
  
  public static final Integer DEFAULT_TASKTYPE;
  
  public static final Integer DEFAULT_THREADNUM;
  
  public static final Integer DEFAULT_TOTAL_LIMIT;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer activityid;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer browsetime;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String browsetimepage;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer cleartime;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer cleartype;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer missionid;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer tasktype;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer threadnum;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer total_limit;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1618484981, "Ltbclient/MissionInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1618484981, "Ltbclient/MissionInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_MISSIONID = integer;
    DEFAULT_TOTAL_LIMIT = integer;
    DEFAULT_BROWSETIME = integer;
    DEFAULT_TASKTYPE = integer;
    DEFAULT_THREADNUM = integer;
    DEFAULT_ACTIVITYID = integer;
    DEFAULT_CLEARTYPE = integer;
    DEFAULT_CLEARTIME = integer;
  }
  
  public MissionInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.missionid;
      if (integer2 == null) {
        this.missionid = DEFAULT_MISSIONID;
      } else {
        this.missionid = integer2;
      } 
      integer2 = paramBuilder.total_limit;
      if (integer2 == null) {
        this.total_limit = DEFAULT_TOTAL_LIMIT;
      } else {
        this.total_limit = integer2;
      } 
      integer2 = paramBuilder.browsetime;
      if (integer2 == null) {
        this.browsetime = DEFAULT_BROWSETIME;
      } else {
        this.browsetime = integer2;
      } 
      integer2 = paramBuilder.tasktype;
      if (integer2 == null) {
        this.tasktype = DEFAULT_TASKTYPE;
      } else {
        this.tasktype = integer2;
      } 
      integer2 = paramBuilder.threadnum;
      if (integer2 == null) {
        this.threadnum = DEFAULT_THREADNUM;
      } else {
        this.threadnum = integer2;
      } 
      String str = paramBuilder.browsetimepage;
      if (str == null) {
        this.browsetimepage = "";
      } else {
        this.browsetimepage = str;
      } 
      Integer integer1 = paramBuilder.activityid;
      if (integer1 == null) {
        this.activityid = DEFAULT_ACTIVITYID;
      } else {
        this.activityid = integer1;
      } 
      integer1 = paramBuilder.cleartype;
      if (integer1 == null) {
        this.cleartype = DEFAULT_CLEARTYPE;
      } else {
        this.cleartype = integer1;
      } 
      integer = paramBuilder.cleartime;
      if (integer == null) {
        this.cleartime = DEFAULT_CLEARTIME;
      } else {
        this.cleartime = integer;
      } 
    } else {
      this.missionid = ((Builder)integer).missionid;
      this.total_limit = ((Builder)integer).total_limit;
      this.browsetime = ((Builder)integer).browsetime;
      this.tasktype = ((Builder)integer).tasktype;
      this.threadnum = ((Builder)integer).threadnum;
      this.browsetimepage = ((Builder)integer).browsetimepage;
      this.activityid = ((Builder)integer).activityid;
      this.cleartype = ((Builder)integer).cleartype;
      this.cleartime = ((Builder)integer).cleartime;
    } 
  }
}
