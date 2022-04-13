import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SdkTopicThread;

public final class SdkTopicThread extends Message {
  public static final Integer DEFAULT_NEED_TOPIC;
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Long DEFAULT_POST_NUM;
  
  public static final Long DEFAULT_TID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_ZAN_NUM;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer need_topic;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long post_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long zan_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-770811278, "Ltbclient/SdkTopicThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-770811278, "Ltbclient/SdkTopicThread;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_POST_NUM = long_;
    DEFAULT_ZAN_NUM = long_;
    DEFAULT_TID = long_;
    DEFAULT_NEED_TOPIC = Integer.valueOf(0);
  }
  
  public SdkTopicThread(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      Long long_ = paramBuilder.post_num;
      if (long_ == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = long_;
      } 
      long_ = paramBuilder.zan_num;
      if (long_ == null) {
        this.zan_num = DEFAULT_ZAN_NUM;
      } else {
        this.zan_num = long_;
      } 
      long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      integer = paramBuilder.need_topic;
      if (integer == null) {
        this.need_topic = DEFAULT_NEED_TOPIC;
      } else {
        this.need_topic = integer;
      } 
    } else {
      this.pic_url = ((Builder)integer).pic_url;
      this.title = ((Builder)integer).title;
      this.post_num = ((Builder)integer).post_num;
      this.zan_num = ((Builder)integer).zan_num;
      this.tid = ((Builder)integer).tid;
      this.need_topic = ((Builder)integer).need_topic;
    } 
  }
}
