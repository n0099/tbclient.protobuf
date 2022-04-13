import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AlaShareInfo;

public final class AlaShareInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_RECORD_TID;
  
  public static final Integer DEFAULT_SHARE_COUNT;
  
  public static final Integer DEFAULT_SHARE_USER_COUNT;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long record_tid;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer share_count;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer share_user_count;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-135787974, "Ltbclient/AlaShareInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-135787974, "Ltbclient/AlaShareInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHARE_USER_COUNT = integer;
    DEFAULT_SHARE_COUNT = integer;
    DEFAULT_RECORD_TID = Long.valueOf(0L);
  }
  
  public AlaShareInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      Integer integer = paramBuilder.share_user_count;
      if (integer == null) {
        this.share_user_count = DEFAULT_SHARE_USER_COUNT;
      } else {
        this.share_user_count = integer;
      } 
      integer = paramBuilder.share_count;
      if (integer == null) {
        this.share_count = DEFAULT_SHARE_COUNT;
      } else {
        this.share_count = integer;
      } 
      long_ = paramBuilder.record_tid;
      if (long_ == null) {
        this.record_tid = DEFAULT_RECORD_TID;
      } else {
        this.record_tid = long_;
      } 
    } else {
      this.content = ((Builder)long_).content;
      this.share_user_count = ((Builder)long_).share_user_count;
      this.share_count = ((Builder)long_).share_count;
      this.record_tid = ((Builder)long_).record_tid;
    } 
  }
}
