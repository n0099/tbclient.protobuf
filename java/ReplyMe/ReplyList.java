package tbclient.ReplyMe;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Baijiahao;
import tbclient.NewFloorInfo;
import tbclient.OriginThreadInfo;
import tbclient.User;
import tbclient.Zan;

public final class ReplyList extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_FNAME = "";
  
  public static final Integer DEFAULT_HAS_AGREE;
  
  public static final Integer DEFAULT_HIDE_FNAME;
  
  public static final Integer DEFAULT_IS_BJH;
  
  public static final Integer DEFAULT_IS_FLOOR;
  
  public static final Integer DEFAULT_IS_SHARE_THREAD;
  
  public static final Integer DEFAULT_IS_STORY;
  
  public static final String DEFAULT_ITEM_TYPE = "";
  
  public static final List<NewFloorInfo> DEFAULT_NEW_FLOOR_INFO;
  
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
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 27)
  public final Baijiahao baijiahao;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer has_agree;
  
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
  
  @ProtoField(label = Message.Label.REPEATED, tag = 28)
  public final List<NewFloorInfo> new_floor_info;
  
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
    DEFAULT_NEW_FLOOR_INFO = Collections.emptyList();
    DEFAULT_HAS_AGREE = integer;
  }
  
  public ReplyList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
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
      List<NewFloorInfo> list = paramBuilder.new_floor_info;
      if (list == null) {
        this.new_floor_info = DEFAULT_NEW_FLOOR_INFO;
      } else {
        this.new_floor_info = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.has_agree;
      if (integer == null) {
        this.has_agree = DEFAULT_HAS_AGREE;
      } else {
        this.has_agree = integer;
      } 
    } else {
      this.thread_id = ((Builder)integer).thread_id;
      this.post_id = ((Builder)integer).post_id;
      this.time = ((Builder)integer).time;
      this.title = ((Builder)integer).title;
      this.fname = ((Builder)integer).fname;
      this.content = ((Builder)integer).content;
      this.is_floor = ((Builder)integer).is_floor;
      this.quote_content = ((Builder)integer).quote_content;
      this.replyer = ((Builder)integer).replyer;
      this.type = ((Builder)integer).type;
      this.unread = ((Builder)integer).unread;
      this.item_type = ((Builder)integer).item_type;
      this.zan = ((Builder)integer).zan;
      this.quote_pid = ((Builder)integer).quote_pid;
      this.quote_user = ((Builder)integer).quote_user;
      this.server_time = ((Builder)integer).server_time;
      this.thread_type = ((Builder)integer).thread_type;
      this.v_forum_id = ((Builder)integer).v_forum_id;
      this.hide_fname = ((Builder)integer).hide_fname;
      this.is_story = ((Builder)integer).is_story;
      this.origin_thread_info = ((Builder)integer).origin_thread_info;
      this.post_from = ((Builder)integer).post_from;
      this.is_share_thread = ((Builder)integer).is_share_thread;
      this.thread_img_url = ((Builder)integer).thread_img_url;
      this.thread_author_user = ((Builder)integer).thread_author_user;
      this.is_bjh = ((Builder)integer).is_bjh;
      this.baijiahao = ((Builder)integer).baijiahao;
      this.new_floor_info = Message.immutableCopyOf(((Builder)integer).new_floor_info);
      this.has_agree = ((Builder)integer).has_agree;
    } 
  }
  
  public ReplyList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Baijiahao baijiahao;
    
    public String content;
    
    public String fname;
    
    public Integer has_agree;
    
    public Integer hide_fname;
    
    public Integer is_bjh;
    
    public Integer is_floor;
    
    public Integer is_share_thread;
    
    public Integer is_story;
    
    public String item_type;
    
    public List<NewFloorInfo> new_floor_info;
    
    public OriginThreadInfo origin_thread_info;
    
    public String post_from;
    
    public Long post_id;
    
    public String quote_content;
    
    public Long quote_pid;
    
    public User quote_user;
    
    public User replyer;
    
    public Integer server_time;
    
    public User thread_author_user;
    
    public Long thread_id;
    
    public String thread_img_url;
    
    public Integer thread_type;
    
    public Integer time;
    
    public String title;
    
    public Integer type;
    
    public Integer unread;
    
    public Long v_forum_id;
    
    public Zan zan;
    
    public Builder() {}
    
    public Builder(ReplyList param1ReplyList) {
      super(param1ReplyList);
      if (param1ReplyList == null)
        return; 
      this.thread_id = param1ReplyList.thread_id;
      this.post_id = param1ReplyList.post_id;
      this.time = param1ReplyList.time;
      this.title = param1ReplyList.title;
      this.fname = param1ReplyList.fname;
      this.content = param1ReplyList.content;
      this.is_floor = param1ReplyList.is_floor;
      this.quote_content = param1ReplyList.quote_content;
      this.replyer = param1ReplyList.replyer;
      this.type = param1ReplyList.type;
      this.unread = param1ReplyList.unread;
      this.item_type = param1ReplyList.item_type;
      this.zan = param1ReplyList.zan;
      this.quote_pid = param1ReplyList.quote_pid;
      this.quote_user = param1ReplyList.quote_user;
      this.server_time = param1ReplyList.server_time;
      this.thread_type = param1ReplyList.thread_type;
      this.v_forum_id = param1ReplyList.v_forum_id;
      this.hide_fname = param1ReplyList.hide_fname;
      this.is_story = param1ReplyList.is_story;
      this.origin_thread_info = param1ReplyList.origin_thread_info;
      this.post_from = param1ReplyList.post_from;
      this.is_share_thread = param1ReplyList.is_share_thread;
      this.thread_img_url = param1ReplyList.thread_img_url;
      this.thread_author_user = param1ReplyList.thread_author_user;
      this.is_bjh = param1ReplyList.is_bjh;
      this.baijiahao = param1ReplyList.baijiahao;
      this.new_floor_info = Message.copyOf(param1ReplyList.new_floor_info);
      this.has_agree = param1ReplyList.has_agree;
    }
    
    public ReplyList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReplyList)interceptResult.objValue; 
      } 
      return new ReplyList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
