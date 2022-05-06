package Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserAgreeInfo extends Message {
  public static final Long DEFAULT_ALA_AGREE_NUM;
  
  public static final Integer DEFAULT_HAS_USER_AGREE;
  
  public static final Long DEFAULT_NORMAL_AGREE_NUM;
  
  public static final Long DEFAULT_TOTAL_AGREE_NUM;
  
  public static final Long DEFAULT_USER_AGREE_NUM;
  
  public static final Long DEFAULT_VIDEO_AGREE_NUM;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long ala_agree_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer has_user_agree;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long normal_agree_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long total_agree_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_agree_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long video_agree_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1138840868, "Ltbclient/Profile/UserAgreeInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1138840868, "Ltbclient/Profile/UserAgreeInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOTAL_AGREE_NUM = long_;
    DEFAULT_NORMAL_AGREE_NUM = long_;
    DEFAULT_USER_AGREE_NUM = long_;
    DEFAULT_VIDEO_AGREE_NUM = long_;
    DEFAULT_ALA_AGREE_NUM = long_;
    DEFAULT_HAS_USER_AGREE = Integer.valueOf(0);
  }
  
  public UserAgreeInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.total_agree_num;
      if (long_ == null) {
        this.total_agree_num = DEFAULT_TOTAL_AGREE_NUM;
      } else {
        this.total_agree_num = long_;
      } 
      long_ = paramBuilder.normal_agree_num;
      if (long_ == null) {
        this.normal_agree_num = DEFAULT_NORMAL_AGREE_NUM;
      } else {
        this.normal_agree_num = long_;
      } 
      long_ = paramBuilder.user_agree_num;
      if (long_ == null) {
        this.user_agree_num = DEFAULT_USER_AGREE_NUM;
      } else {
        this.user_agree_num = long_;
      } 
      long_ = paramBuilder.video_agree_num;
      if (long_ == null) {
        this.video_agree_num = DEFAULT_VIDEO_AGREE_NUM;
      } else {
        this.video_agree_num = long_;
      } 
      long_ = paramBuilder.ala_agree_num;
      if (long_ == null) {
        this.ala_agree_num = DEFAULT_ALA_AGREE_NUM;
      } else {
        this.ala_agree_num = long_;
      } 
      integer = paramBuilder.has_user_agree;
      if (integer == null) {
        this.has_user_agree = DEFAULT_HAS_USER_AGREE;
      } else {
        this.has_user_agree = integer;
      } 
    } else {
      this.total_agree_num = ((Builder)integer).total_agree_num;
      this.normal_agree_num = ((Builder)integer).normal_agree_num;
      this.user_agree_num = ((Builder)integer).user_agree_num;
      this.video_agree_num = ((Builder)integer).video_agree_num;
      this.ala_agree_num = ((Builder)integer).ala_agree_num;
      this.has_user_agree = ((Builder)integer).has_user_agree;
    } 
  }
}
