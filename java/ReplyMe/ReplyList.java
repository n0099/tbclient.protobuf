package ReplyMe;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Baijiahao;
import tbclient.OriginThreadInfo;
import tbclient.User;
import tbclient.Zan;

public final class ReplyList extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_FNAME = "";
  
  public static final Integer DEFAULT_HIDE_FNAME;
  
  public static final Integer DEFAULT_IS_BJH;
  
  public static final Integer DEFAULT_IS_FLOOR;
  
  public static final Integer DEFAULT_IS_SHARE_THREAD;
  
  public static final Integer DEFAULT_IS_STORY;
  
  public static final String DEFAULT_ITEM_TYPE = "";
  
  public static final String DEFAULT_POST_FROM = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final String DEFAULT_QUOTE_CONTENT = "";
  
  public static final Long DEFAULT_QUOTE_PID;
  
  public static final Integer DEFAULT_SERVER_TIME;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_THREAD_IMG_URL = "";
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final Integer DEFAULT_TIME;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Integer DEFAULT_UNREAD;
  
  public static final Long DEFAULT_V_FORUM_ID;
  
  @ProtoField(tag = 27)
  public final Baijiahao baijiahao;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer hide_fname;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer is_bjh;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_floor;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer is_share_thread;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer is_story;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String item_type;
  
  @ProtoField(tag = 21)
  public final OriginThreadInfo origin_thread_info;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String post_from;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String quote_content;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long quote_pid;
  
  @ProtoField(tag = 15)
  public final User quote_user;
  
  @ProtoField(tag = 9)
  public final User replyer;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer server_time;
  
  @ProtoField(tag = 25)
  public final User thread_author_user;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String thread_img_url;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer unread;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT64)
  public final Long v_forum_id;
  
  @ProtoField(tag = 13)
  public final Zan zan;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-751210710, "Ltbclient/ReplyMe/ReplyList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-751210710, "Ltbclient/ReplyMe/ReplyList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TIME = integer;
    DEFAULT_IS_FLOOR = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_UNREAD = integer;
    DEFAULT_QUOTE_PID = long_;
    DEFAULT_SERVER_TIME = integer;
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_V_FORUM_ID = long_;
    DEFAULT_HIDE_FNAME = integer;
    DEFAULT_IS_STORY = integer;
    DEFAULT_IS_SHARE_THREAD = integer;
    DEFAULT_IS_BJH = integer;
  }
  
  public ReplyList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.thread_id;
      if (long_3 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_3;
      } 
      long_3 = paramBuilder.post_id;
      if (long_3 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_3;
      } 
      Integer integer7 = paramBuilder.time;
      if (integer7 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer7;
      } 
      String str5 = paramBuilder.title;
      if (str5 == null) {
        this.title = "";
      } else {
        this.title = str5;
      } 
      str5 = paramBuilder.fname;
      if (str5 == null) {
        this.fname = "";
      } else {
        this.fname = str5;
      } 
      str5 = paramBuilder.content;
      if (str5 == null) {
        this.content = "";
      } else {
        this.content = str5;
      } 
      Integer integer6 = paramBuilder.is_floor;
      if (integer6 == null) {
        this.is_floor = DEFAULT_IS_FLOOR;
      } else {
        this.is_floor = integer6;
      } 
      String str4 = paramBuilder.quote_content;
      if (str4 == null) {
        this.quote_content = "";
      } else {
        this.quote_content = str4;
      } 
      this.replyer = paramBuilder.replyer;
      Integer integer5 = paramBuilder.type;
      if (integer5 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer5;
      } 
      integer5 = paramBuilder.unread;
      if (integer5 == null) {
        this.unread = DEFAULT_UNREAD;
      } else {
        this.unread = integer5;
      } 
      String str3 = paramBuilder.item_type;
      if (str3 == null) {
        this.item_type = "";
      } else {
        this.item_type = str3;
      } 
      this.zan = paramBuilder.zan;
      Long long_2 = paramBuilder.quote_pid;
      if (long_2 == null) {
        this.quote_pid = DEFAULT_QUOTE_PID;
      } else {
        this.quote_pid = long_2;
      } 
      this.quote_user = paramBuilder.quote_user;
      Integer integer4 = paramBuilder.server_time;
      if (integer4 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer4;
      } 
      integer4 = paramBuilder.thread_type;
      if (integer4 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer4;
      } 
      Long long_1 = paramBuilder.v_forum_id;
      if (long_1 == null) {
        this.v_forum_id = DEFAULT_V_FORUM_ID;
      } else {
        this.v_forum_id = long_1;
      } 
      Integer integer3 = paramBuilder.hide_fname;
      if (integer3 == null) {
        this.hide_fname = DEFAULT_HIDE_FNAME;
      } else {
        this.hide_fname = integer3;
      } 
      integer3 = paramBuilder.is_story;
      if (integer3 == null) {
        this.is_story = DEFAULT_IS_STORY;
      } else {
        this.is_story = integer3;
      } 
      this.origin_thread_info = paramBuilder.origin_thread_info;
      String str2 = paramBuilder.post_from;
      if (str2 == null) {
        this.post_from = "";
      } else {
        this.post_from = str2;
      } 
      Integer integer2 = paramBuilder.is_share_thread;
      if (integer2 == null) {
        this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
      } else {
        this.is_share_thread = integer2;
      } 
      String str1 = paramBuilder.thread_img_url;
      if (str1 == null) {
        this.thread_img_url = "";
      } else {
        this.thread_img_url = str1;
      } 
      this.thread_author_user = paramBuilder.thread_author_user;
      Integer integer1 = paramBuilder.is_bjh;
      if (integer1 == null) {
        this.is_bjh = DEFAULT_IS_BJH;
      } else {
        this.is_bjh = integer1;
      } 
      this.baijiahao = paramBuilder.baijiahao;
    } else {
      this.thread_id = paramBuilder.thread_id;
      this.post_id = paramBuilder.post_id;
      this.time = paramBuilder.time;
      this.title = paramBuilder.title;
      this.fname = paramBuilder.fname;
      this.content = paramBuilder.content;
      this.is_floor = paramBuilder.is_floor;
      this.quote_content = paramBuilder.quote_content;
      this.replyer = paramBuilder.replyer;
      this.type = paramBuilder.type;
      this.unread = paramBuilder.unread;
      this.item_type = paramBuilder.item_type;
      this.zan = paramBuilder.zan;
      this.quote_pid = paramBuilder.quote_pid;
      this.quote_user = paramBuilder.quote_user;
      this.server_time = paramBuilder.server_time;
      this.thread_type = paramBuilder.thread_type;
      this.v_forum_id = paramBuilder.v_forum_id;
      this.hide_fname = paramBuilder.hide_fname;
      this.is_story = paramBuilder.is_story;
      this.origin_thread_info = paramBuilder.origin_thread_info;
      this.post_from = paramBuilder.post_from;
      this.is_share_thread = paramBuilder.is_share_thread;
      this.thread_img_url = paramBuilder.thread_img_url;
      this.thread_author_user = paramBuilder.thread_author_user;
      this.is_bjh = paramBuilder.is_bjh;
      this.baijiahao = paramBuilder.baijiahao;
    } 
  }
}
