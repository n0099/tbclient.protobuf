import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GodInfo;

public final class GodInfo extends Message {
  public static final Integer DEFAULT_CAN_SEND_MSG;
  
  public static final Long DEFAULT_FID;
  
  public static final Integer DEFAULT_FOLLOWED;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_PREFIX = "";
  
  public static final String DEFAULT_RECOMMEND_REASON = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer can_send_msg;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer followed;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String prefix;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String recommend_reason;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2057186587, "Ltbclient/GodInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2057186587, "Ltbclient/GodInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_FID = long_;
    DEFAULT_FOLLOWED = integer;
    DEFAULT_CAN_SEND_MSG = integer;
  }
  
  public GodInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.id;
      if (long_2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_2;
      } 
      String str2 = paramBuilder.intro;
      if (str2 == null) {
        this.intro = "";
      } else {
        this.intro = str2;
      } 
      Integer integer3 = paramBuilder.type;
      if (integer3 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer3;
      } 
      Long long_1 = paramBuilder.fid;
      if (long_1 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_1;
      } 
      Integer integer2 = paramBuilder.followed;
      if (integer2 == null) {
        this.followed = DEFAULT_FOLLOWED;
      } else {
        this.followed = integer2;
      } 
      String str1 = paramBuilder.recommend_reason;
      if (str1 == null) {
        this.recommend_reason = "";
      } else {
        this.recommend_reason = str1;
      } 
      str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      Integer integer1 = paramBuilder.can_send_msg;
      if (integer1 == null) {
        this.can_send_msg = DEFAULT_CAN_SEND_MSG;
      } else {
        this.can_send_msg = integer1;
      } 
      str = paramBuilder.prefix;
      if (str == null) {
        this.prefix = "";
      } else {
        this.prefix = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.intro = ((Builder)str).intro;
      this.type = ((Builder)str).type;
      this.fid = ((Builder)str).fid;
      this.followed = ((Builder)str).followed;
      this.recommend_reason = ((Builder)str).recommend_reason;
      this.forum_name = ((Builder)str).forum_name;
      this.can_send_msg = ((Builder)str).can_send_msg;
      this.prefix = ((Builder)str).prefix;
    } 
  }
}
