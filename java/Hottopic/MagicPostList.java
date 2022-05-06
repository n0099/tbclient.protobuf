package Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Hottopic.UserInfo;
import tbclient.Quote;
import tbclient.Zan;

public final class MagicPostList extends Message {
  public static final String DEFAULT_CONTENT_TEXT = "";
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_IS_COMMENT;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_POST_NO;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String content_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer create_time;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer is_comment;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer post_no;
  
  @ProtoField(tag = 10)
  public final Quote quote;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3)
  public final UserInfo user_info;
  
  @ProtoField(tag = 9)
  public final Zan zan;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-717828077, "Ltbclient/Hottopic/MagicPostList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-717828077, "Ltbclient/Hottopic/MagicPostList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_POST_NO = integer;
    DEFAULT_IS_COMMENT = integer;
  }
  
  public MagicPostList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
      long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
      this.user_info = paramBuilder.user_info;
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.content_text;
      if (str == null) {
        this.content_text = "";
      } else {
        this.content_text = str;
      } 
      Integer integer = paramBuilder.create_time;
      if (integer == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer;
      } 
      integer = paramBuilder.post_no;
      if (integer == null) {
        this.post_no = DEFAULT_POST_NO;
      } else {
        this.post_no = integer;
      } 
      integer = paramBuilder.is_comment;
      if (integer == null) {
        this.is_comment = DEFAULT_IS_COMMENT;
      } else {
        this.is_comment = integer;
      } 
      this.zan = paramBuilder.zan;
      this.quote = paramBuilder.quote;
    } else {
      this.thread_id = paramBuilder.thread_id;
      this.post_id = paramBuilder.post_id;
      this.user_info = paramBuilder.user_info;
      this.title = paramBuilder.title;
      this.content_text = paramBuilder.content_text;
      this.create_time = paramBuilder.create_time;
      this.post_no = paramBuilder.post_no;
      this.is_comment = paramBuilder.is_comment;
      this.zan = paramBuilder.zan;
      this.quote = paramBuilder.quote;
    } 
  }
}
