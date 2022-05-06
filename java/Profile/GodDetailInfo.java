package Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GodDetailInfo extends Message {
  public static final String DEFAULT_DETAIL_INTRO = "";
  
  public static final Long DEFAULT_GOD_ID;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String detail_intro;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long god_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1165217776, "Ltbclient/Profile/GodDetailInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1165217776, "Ltbclient/Profile/GodDetailInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_GOD_ID = long_;
    DEFAULT_USER_ID = long_;
  }
  
  public GodDetailInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.god_id;
      if (long_ == null) {
        this.god_id = DEFAULT_GOD_ID;
      } else {
        this.god_id = long_;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.intro;
      if (str1 == null) {
        this.intro = "";
      } else {
        this.intro = str1;
      } 
      str = paramBuilder.detail_intro;
      if (str == null) {
        this.detail_intro = "";
      } else {
        this.detail_intro = str;
      } 
    } else {
      this.god_id = ((Builder)str).god_id;
      this.user_id = ((Builder)str).user_id;
      this.intro = ((Builder)str).intro;
      this.detail_intro = ((Builder)str).detail_intro;
    } 
  }
}
