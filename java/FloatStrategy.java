import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FloatStrategy;

public final class FloatStrategy extends Message {
  public static final String DEFAULT_BROWSETIMEPAGE = "";
  
  public static final Integer DEFAULT_DURATION;
  
  public static final Integer DEFAULT_SHOW_NUM;
  
  public static final Long DEFAULT_SHOW_TIME_BEGIN;
  
  public static final Long DEFAULT_SHOW_TIME_END;
  
  public static final String DEFAULT_TOAST = "";
  
  public static final Integer DEFAULT_UN_DO_MISSION;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String browsetimepage;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer duration;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer show_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long show_time_begin;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long show_time_end;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String toast;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer un_do_mission;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-15341674, "Ltbclient/FloatStrategy;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-15341674, "Ltbclient/FloatStrategy;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_UN_DO_MISSION = integer;
    DEFAULT_DURATION = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_SHOW_TIME_BEGIN = long_;
    DEFAULT_SHOW_TIME_END = long_;
    DEFAULT_SHOW_NUM = integer;
  }
  
  public FloatStrategy(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.un_do_mission;
      if (integer3 == null) {
        this.un_do_mission = DEFAULT_UN_DO_MISSION;
      } else {
        this.un_do_mission = integer3;
      } 
      String str1 = paramBuilder.browsetimepage;
      if (str1 == null) {
        this.browsetimepage = "";
      } else {
        this.browsetimepage = str1;
      } 
      Integer integer2 = paramBuilder.duration;
      if (integer2 == null) {
        this.duration = DEFAULT_DURATION;
      } else {
        this.duration = integer2;
      } 
      Long long_ = paramBuilder.show_time_begin;
      if (long_ == null) {
        this.show_time_begin = DEFAULT_SHOW_TIME_BEGIN;
      } else {
        this.show_time_begin = long_;
      } 
      long_ = paramBuilder.show_time_end;
      if (long_ == null) {
        this.show_time_end = DEFAULT_SHOW_TIME_END;
      } else {
        this.show_time_end = long_;
      } 
      Integer integer1 = paramBuilder.show_num;
      if (integer1 == null) {
        this.show_num = DEFAULT_SHOW_NUM;
      } else {
        this.show_num = integer1;
      } 
      str = paramBuilder.toast;
      if (str == null) {
        this.toast = "";
      } else {
        this.toast = str;
      } 
    } else {
      this.un_do_mission = ((Builder)str).un_do_mission;
      this.browsetimepage = ((Builder)str).browsetimepage;
      this.duration = ((Builder)str).duration;
      this.show_time_begin = ((Builder)str).show_time_begin;
      this.show_time_end = ((Builder)str).show_time_end;
      this.show_num = ((Builder)str).show_num;
      this.toast = ((Builder)str).toast;
    } 
  }
}
