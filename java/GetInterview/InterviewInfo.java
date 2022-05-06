package GetInterview;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;
import tbclient.User;

public final class InterviewInfo extends Message {
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final Long DEFAULT_CREATE_TIME;
  
  public static final Long DEFAULT_MAIN_PID;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 5)
  public final User author;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<PbContent> content;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long create_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long main_pid;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long post_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1769838854, "Ltbclient/GetInterview/InterviewInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1769838854, "Ltbclient/GetInterview/InterviewInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_POST_ID = long_;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_CREATE_TIME = long_;
    DEFAULT_TYPE = Integer.valueOf(0);
    DEFAULT_MAIN_PID = long_;
  }
  
  public InterviewInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.post_id;
      if (long_2 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_2;
      } 
      List list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.create_time;
      if (long_1 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = long_1;
      } 
      this.author = paramBuilder.author;
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      long_ = paramBuilder.main_pid;
      if (long_ == null) {
        this.main_pid = DEFAULT_MAIN_PID;
      } else {
        this.main_pid = long_;
      } 
    } else {
      this.post_id = ((Builder)long_).post_id;
      this.content = Message.immutableCopyOf(((Builder)long_).content);
      this.create_time = ((Builder)long_).create_time;
      this.author = ((Builder)long_).author;
      this.type = ((Builder)long_).type;
      this.main_pid = ((Builder)long_).main_pid;
    } 
  }
}
