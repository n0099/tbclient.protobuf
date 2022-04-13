package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsPage.CommonDistance;
import tbclient.FrsPage.CommonForum;
import tbclient.FrsPage.PostInfo;
import tbclient.FrsPage.UserInfo;

public final class RecomUserInfo extends Message {
  public static final List<CommonForum> DEFAULT_COMMON_FORUM = Collections.emptyList();
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final List<PostInfo> DEFAULT_POST_INFO = Collections.emptyList();
  
  public static final String DEFAULT_POS_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<CommonForum> common_forum;
  
  @ProtoField(tag = 6)
  public final CommonDistance distanceinfo;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pos_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<PostInfo> post_info;
  
  @ProtoField(tag = 1)
  public final UserInfo user_info;
  
  public RecomUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      List list = paramBuilder.common_forum;
      if (list == null) {
        this.common_forum = DEFAULT_COMMON_FORUM;
      } else {
        this.common_forum = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.post_info;
      if (list == null) {
        this.post_info = DEFAULT_POST_INFO;
      } else {
        this.post_info = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.pos_name;
      if (str == null) {
        this.pos_name = "";
      } else {
        this.pos_name = str;
      } 
      str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
      this.distanceinfo = paramBuilder.distanceinfo;
    } else {
      this.user_info = paramBuilder.user_info;
      this.common_forum = Message.immutableCopyOf(paramBuilder.common_forum);
      this.post_info = Message.immutableCopyOf(paramBuilder.post_info);
      this.pos_name = paramBuilder.pos_name;
      this.message = paramBuilder.message;
      this.distanceinfo = paramBuilder.distanceinfo;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1139974615, "Ltbclient/FrsPage/RecomUserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1139974615, "Ltbclient/FrsPage/RecomUserInfo;");
          return;
        } 
      } 
    } 
  }
}
