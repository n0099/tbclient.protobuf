package PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumHeadlineImgInfo extends Message {
  public static final String DEFAULT_IMG_URL = "";
  
  public static final Long DEFAULT_IMG_USER_ID;
  
  public static final String DEFAULT_IMG_USER_NAME = "";
  
  public static final Integer DEFAULT_RANK_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_RANK_UP_INFO = "";
  
  public static final String DEFAULT_RANK_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long img_user_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_user_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer rank_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String rank_up_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String rank_url;
  
  static {
    DEFAULT_IMG_USER_ID = Long.valueOf(0L);
  }
  
  public ForumHeadlineImgInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.img_user_name;
      if (str2 == null) {
        this.img_user_name = "";
      } else {
        this.img_user_name = str2;
      } 
      str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      Integer integer = paramBuilder.rank_num;
      if (integer == null) {
        this.rank_num = DEFAULT_RANK_NUM;
      } else {
        this.rank_num = integer;
      } 
      Long long_ = paramBuilder.img_user_id;
      if (long_ == null) {
        this.img_user_id = DEFAULT_IMG_USER_ID;
      } else {
        this.img_user_id = long_;
      } 
      String str1 = paramBuilder.rank_url;
      if (str1 == null) {
        this.rank_url = "";
      } else {
        this.rank_url = str1;
      } 
      str = paramBuilder.rank_up_info;
      if (str == null) {
        this.rank_up_info = "";
      } else {
        this.rank_up_info = str;
      } 
    } else {
      this.img_user_name = ((Builder)str).img_user_name;
      this.img_url = ((Builder)str).img_url;
      this.rank_num = ((Builder)str).rank_num;
      this.img_user_id = ((Builder)str).img_user_id;
      this.rank_url = ((Builder)str).rank_url;
      this.rank_up_info = ((Builder)str).rank_up_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(955752027, "Ltbclient/PbPage/ForumHeadlineImgInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(955752027, "Ltbclient/PbPage/ForumHeadlineImgInfo;");
          return;
        } 
      } 
    } 
  }
}
