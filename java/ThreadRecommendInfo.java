import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadRecommendInfo;

public final class ThreadRecommendInfo extends Message {
  public static final String DEFAULT_FORUM_AVATAR = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_RECOMMEND_REASON = "";
  
  public static final Integer DEFAULT_SHOW_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_SHOW_TYPE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_avatar;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String recommend_reason;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer show_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String show_type;
  
  public ThreadRecommendInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.forum_avatar;
      if (str2 == null) {
        this.forum_avatar = "";
      } else {
        this.forum_avatar = str2;
      } 
      str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      Integer integer = paramBuilder.show_num;
      if (integer == null) {
        this.show_num = DEFAULT_SHOW_NUM;
      } else {
        this.show_num = integer;
      } 
      String str1 = paramBuilder.show_type;
      if (str1 == null) {
        this.show_type = "";
      } else {
        this.show_type = str1;
      } 
      str = paramBuilder.recommend_reason;
      if (str == null) {
        this.recommend_reason = "";
      } else {
        this.recommend_reason = str;
      } 
    } else {
      this.forum_avatar = ((Builder)str).forum_avatar;
      this.forum_name = ((Builder)str).forum_name;
      this.show_num = ((Builder)str).show_num;
      this.show_type = ((Builder)str).show_type;
      this.recommend_reason = ((Builder)str).recommend_reason;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-640137595, "Ltbclient/ThreadRecommendInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-640137595, "Ltbclient/ThreadRecommendInfo;");
          return;
        } 
      } 
    } 
  }
}
