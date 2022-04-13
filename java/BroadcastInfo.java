import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BroadcastInfo;
import tbclient.RecommendForumInfo;
import tbclient.ThreadInfo;

public final class BroadcastInfo extends Message {
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final Long DEFAULT_BCAST_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_CTR = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Integer DEFAULT_PUBLISH_TIME;
  
  public static final Integer DEFAULT_PUSHUSER_CNT;
  
  public static final Integer DEFAULT_PV;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long bcast_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String ctr;
  
  @ProtoField(tag = 5)
  public final RecommendForumInfo forum_info;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer publish_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer pushuser_cnt;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer pv;
  
  @ProtoField(tag = 10)
  public final ThreadInfo thread_infos;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PUBLISH_TIME = integer;
    DEFAULT_PUSHUSER_CNT = integer;
    DEFAULT_PV = integer;
    DEFAULT_AUDIT_STATUS = integer;
  }
  
  public BroadcastInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.bcast_id;
      if (long_ == null) {
        this.bcast_id = DEFAULT_BCAST_ID;
      } else {
        this.bcast_id = long_;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.content;
      if (str2 == null) {
        this.content = "";
      } else {
        this.content = str2;
      } 
      this.forum_info = paramBuilder.forum_info;
      Integer integer2 = paramBuilder.publish_time;
      if (integer2 == null) {
        this.publish_time = DEFAULT_PUBLISH_TIME;
      } else {
        this.publish_time = integer2;
      } 
      integer2 = paramBuilder.pushuser_cnt;
      if (integer2 == null) {
        this.pushuser_cnt = DEFAULT_PUSHUSER_CNT;
      } else {
        this.pushuser_cnt = integer2;
      } 
      integer2 = paramBuilder.pv;
      if (integer2 == null) {
        this.pv = DEFAULT_PV;
      } else {
        this.pv = integer2;
      } 
      String str1 = paramBuilder.ctr;
      if (str1 == null) {
        this.ctr = "";
      } else {
        this.ctr = str1;
      } 
      this.thread_infos = paramBuilder.thread_infos;
      Integer integer1 = paramBuilder.audit_status;
      if (integer1 == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer1;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
    } else {
      this.bcast_id = ((Builder)str).bcast_id;
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
      this.forum_info = ((Builder)str).forum_info;
      this.publish_time = ((Builder)str).publish_time;
      this.pushuser_cnt = ((Builder)str).pushuser_cnt;
      this.pv = ((Builder)str).pv;
      this.ctr = ((Builder)str).ctr;
      this.thread_infos = ((Builder)str).thread_infos;
      this.audit_status = ((Builder)str).audit_status;
      this.pic_url = ((Builder)str).pic_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1415389066, "Ltbclient/BroadcastInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1415389066, "Ltbclient/BroadcastInfo;");
          return;
        } 
      } 
    } 
  }
}
