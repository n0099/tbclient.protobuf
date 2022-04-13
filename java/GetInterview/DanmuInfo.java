package GetInterview;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;

public final class DanmuInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_POST_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 2)
  public final User author;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long post_id;
  
  public DanmuInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      this.author = paramBuilder.author;
      long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
    } else {
      this.content = ((Builder)long_).content;
      this.author = ((Builder)long_).author;
      this.post_id = ((Builder)long_).post_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1417531790, "Ltbclient/GetInterview/DanmuInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1417531790, "Ltbclient/GetInterview/DanmuInfo;");
          return;
        } 
      } 
    } 
  }
}
