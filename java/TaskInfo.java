package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TaskInfo extends Message {
  public static final String DEFAULT_BGIMG = "";
  
  public static final Integer DEFAULT_CARD_TYPE;
  
  public static final Long DEFAULT_END_TIME;
  
  public static final String DEFAULT_FLOOR_GOD_REPLY = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_GOD_REPLY;
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final Long DEFAULT_START_TIME;
  
  public static final Long DEFAULT_TASK_ID;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_THREAD_IMG = "";
  
  public static final String DEFAULT_THREAD_IMG_SIZE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bgimg;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer card_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String floor_god_reply;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer is_god_reply;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 12)
  public final RewardCard reward_card;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long start_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long task_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thread_img;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String thread_img_size;
  
  @ProtoField(tag = 11)
  public final VoteSchema vote_schema;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TASK_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_GOD_REPLY = integer;
    DEFAULT_CARD_TYPE = integer;
  }
  
  public TaskInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.task_id;
      if (long_3 == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = long_3;
      } 
      long_3 = paramBuilder.thread_id;
      if (long_3 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_3;
      } 
      String str4 = paramBuilder.bgimg;
      if (str4 == null) {
        this.bgimg = "";
      } else {
        this.bgimg = str4;
      } 
      str4 = paramBuilder.thread_img;
      if (str4 == null) {
        this.thread_img = "";
      } else {
        this.thread_img = str4;
      } 
      Long long_2 = paramBuilder.start_time;
      if (long_2 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_2;
      } 
      long_2 = paramBuilder.end_time;
      if (long_2 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_2;
      } 
      String str3 = paramBuilder.thread_img_size;
      if (str3 == null) {
        this.thread_img_size = "";
      } else {
        this.thread_img_size = str3;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      str2 = paramBuilder.obj_id;
      if (str2 == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str2;
      } 
      this.vote_schema = paramBuilder.vote_schema;
      this.reward_card = paramBuilder.reward_card;
      Integer integer1 = paramBuilder.is_god_reply;
      if (integer1 == null) {
        this.is_god_reply = DEFAULT_IS_GOD_REPLY;
      } else {
        this.is_god_reply = integer1;
      } 
      String str1 = paramBuilder.floor_god_reply;
      if (str1 == null) {
        this.floor_god_reply = "";
      } else {
        this.floor_god_reply = str1;
      } 
      integer = paramBuilder.card_type;
      if (integer == null) {
        this.card_type = DEFAULT_CARD_TYPE;
      } else {
        this.card_type = integer;
      } 
    } else {
      this.task_id = ((Builder)integer).task_id;
      this.thread_id = ((Builder)integer).thread_id;
      this.bgimg = ((Builder)integer).bgimg;
      this.thread_img = ((Builder)integer).thread_img;
      this.start_time = ((Builder)integer).start_time;
      this.end_time = ((Builder)integer).end_time;
      this.thread_img_size = ((Builder)integer).thread_img_size;
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.obj_id = ((Builder)integer).obj_id;
      this.vote_schema = ((Builder)integer).vote_schema;
      this.reward_card = ((Builder)integer).reward_card;
      this.is_god_reply = ((Builder)integer).is_god_reply;
      this.floor_god_reply = ((Builder)integer).floor_god_reply;
      this.card_type = ((Builder)integer).card_type;
    } 
  }
  
  public TaskInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TaskInfo> {
    public String bgimg;
    
    public Integer card_type;
    
    public Long end_time;
    
    public String floor_god_reply;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_god_reply;
    
    public String obj_id;
    
    public RewardCard reward_card;
    
    public Long start_time;
    
    public Long task_id;
    
    public Long thread_id;
    
    public String thread_img;
    
    public String thread_img_size;
    
    public VoteSchema vote_schema;
    
    public Builder() {}
    
    public Builder(TaskInfo param1TaskInfo) {
      super(param1TaskInfo);
      if (param1TaskInfo == null)
        return; 
      this.task_id = param1TaskInfo.task_id;
      this.thread_id = param1TaskInfo.thread_id;
      this.bgimg = param1TaskInfo.bgimg;
      this.thread_img = param1TaskInfo.thread_img;
      this.start_time = param1TaskInfo.start_time;
      this.end_time = param1TaskInfo.end_time;
      this.thread_img_size = param1TaskInfo.thread_img_size;
      this.forum_id = param1TaskInfo.forum_id;
      this.forum_name = param1TaskInfo.forum_name;
      this.obj_id = param1TaskInfo.obj_id;
      this.vote_schema = param1TaskInfo.vote_schema;
      this.reward_card = param1TaskInfo.reward_card;
      this.is_god_reply = param1TaskInfo.is_god_reply;
      this.floor_god_reply = param1TaskInfo.floor_god_reply;
      this.card_type = param1TaskInfo.card_type;
    }
    
    public TaskInfo build(boolean param1Boolean) {
      return new TaskInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
