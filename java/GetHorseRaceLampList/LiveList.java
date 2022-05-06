package GetHorseRaceLampList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LiveList extends Message {
  public static final Integer DEFAULT_AMOUNT;
  
  public static final Long DEFAULT_LIVE_ID;
  
  public static final String DEFAULT_LIVE_TITLE = "";
  
  public static final Long DEFAULT_ROB_END_TM;
  
  public static final Integer DEFAULT_SCREEN_DIRECTION;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NICKNAME = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer amount;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long live_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String live_title;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long rob_end_tm;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer screen_direction;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_nickname;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-678100838, "Ltbclient/GetHorseRaceLampList/LiveList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-678100838, "Ltbclient/GetHorseRaceLampList/LiveList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_LIVE_ID = long_;
    DEFAULT_USER_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_AMOUNT = integer;
    DEFAULT_ROB_END_TM = long_;
    DEFAULT_SCREEN_DIRECTION = integer;
  }
  
  public LiveList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.live_id;
      if (long_3 == null) {
        this.live_id = DEFAULT_LIVE_ID;
      } else {
        this.live_id = long_3;
      } 
      String str2 = paramBuilder.live_title;
      if (str2 == null) {
        this.live_title = "";
      } else {
        this.live_title = str2;
      } 
      Long long_2 = paramBuilder.user_id;
      if (long_2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_2;
      } 
      String str1 = paramBuilder.user_nickname;
      if (str1 == null) {
        this.user_nickname = "";
      } else {
        this.user_nickname = str1;
      } 
      Integer integer1 = paramBuilder.amount;
      if (integer1 == null) {
        this.amount = DEFAULT_AMOUNT;
      } else {
        this.amount = integer1;
      } 
      Long long_1 = paramBuilder.rob_end_tm;
      if (long_1 == null) {
        this.rob_end_tm = DEFAULT_ROB_END_TM;
      } else {
        this.rob_end_tm = long_1;
      } 
      integer = paramBuilder.screen_direction;
      if (integer == null) {
        this.screen_direction = DEFAULT_SCREEN_DIRECTION;
      } else {
        this.screen_direction = integer;
      } 
    } else {
      this.live_id = ((Builder)integer).live_id;
      this.live_title = ((Builder)integer).live_title;
      this.user_id = ((Builder)integer).user_id;
      this.user_nickname = ((Builder)integer).user_nickname;
      this.amount = ((Builder)integer).amount;
      this.rob_end_tm = ((Builder)integer).rob_end_tm;
      this.screen_direction = ((Builder)integer).screen_direction;
    } 
  }
}
