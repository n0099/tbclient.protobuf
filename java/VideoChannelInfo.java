import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VideoChannelInfo;

public final class VideoChannelInfo extends Message {
  public static final String DEFAULT_CHANNEL_AVATAR = "";
  
  public static final Long DEFAULT_CHANNEL_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_CHANNEL_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String channel_avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long channel_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String channel_name;
  
  public VideoChannelInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.channel_id;
      if (long_ == null) {
        this.channel_id = DEFAULT_CHANNEL_ID;
      } else {
        this.channel_id = long_;
      } 
      String str1 = paramBuilder.channel_name;
      if (str1 == null) {
        this.channel_name = "";
      } else {
        this.channel_name = str1;
      } 
      str = paramBuilder.channel_avatar;
      if (str == null) {
        this.channel_avatar = "";
      } else {
        this.channel_avatar = str;
      } 
    } else {
      this.channel_id = ((Builder)str).channel_id;
      this.channel_name = ((Builder)str).channel_name;
      this.channel_avatar = ((Builder)str).channel_avatar;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1844416123, "Ltbclient/VideoChannelInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1844416123, "Ltbclient/VideoChannelInfo;");
          return;
        } 
      } 
    } 
  }
}
