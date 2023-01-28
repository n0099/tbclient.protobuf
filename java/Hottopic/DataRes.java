package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Banner;
import tbclient.RecomTopicList;

public final class DataRes extends Message {
  public static final List<Banner> DEFAULT_BANNER;
  
  public static final Integer DEFAULT_IS_GLOBAL_BLOCK;
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final List<RelateForum> DEFAULT_POST_FORUM;
  
  public static final List<RelateForum> DEFAULT_RELATE_FORUM = Collections.emptyList();
  
  public static final String DEFAULT_RELATE_FORUM_TITLE = "";
  
  public static final List<SpecialTopic> DEFAULT_SPECIAL_TOPIC;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<Banner> banner;
  
  @ProtoField(tag = 7)
  public final CommonInteraction bless_module;
  
  @ProtoField(tag = 8)
  public final CommonInteraction candle_module;
  
  @ProtoField(tag = 9)
  public final HotThread good_threads;
  
  @ProtoField(tag = 3)
  public final HotThread hot_thread;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer is_global_block;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(tag = 2)
  public final MagicPost magic_post;
  
  @ProtoField(tag = 17)
  public final RecomTopicList next_topic;
  
  @ProtoField(tag = 6)
  public final PkModule pk_module;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<RelateForum> post_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RelateForum> relate_forum;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String relate_forum_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<SpecialTopic> special_topic;
  
  @ProtoField(tag = 5)
  public final ThreadModule thread_module;
  
  @ProtoField(tag = 4)
  public final TopicInfo topic_info;
  
  @ProtoField(tag = 15)
  public final CommonInteraction weiguan_module;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_NEW_URL = integer;
    DEFAULT_POST_FORUM = Collections.emptyList();
    DEFAULT_IS_GLOBAL_BLOCK = integer;
    DEFAULT_SPECIAL_TOPIC = Collections.emptyList();
    DEFAULT_BANNER = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<RelateForum> list3 = paramBuilder.relate_forum;
      if (list3 == null) {
        this.relate_forum = DEFAULT_RELATE_FORUM;
      } else {
        this.relate_forum = Message.immutableCopyOf(list3);
      } 
      this.magic_post = paramBuilder.magic_post;
      this.hot_thread = paramBuilder.hot_thread;
      this.topic_info = paramBuilder.topic_info;
      this.thread_module = paramBuilder.thread_module;
      this.pk_module = paramBuilder.pk_module;
      this.bless_module = paramBuilder.bless_module;
      this.candle_module = paramBuilder.candle_module;
      this.good_threads = paramBuilder.good_threads;
      Integer integer2 = paramBuilder.is_new_url;
      if (integer2 == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer2;
      } 
      List<RelateForum> list2 = paramBuilder.post_forum;
      if (list2 == null) {
        this.post_forum = DEFAULT_POST_FORUM;
      } else {
        this.post_forum = Message.immutableCopyOf(list2);
      } 
      Integer integer1 = paramBuilder.is_global_block;
      if (integer1 == null) {
        this.is_global_block = DEFAULT_IS_GLOBAL_BLOCK;
      } else {
        this.is_global_block = integer1;
      } 
      List<SpecialTopic> list1 = paramBuilder.special_topic;
      if (list1 == null) {
        this.special_topic = DEFAULT_SPECIAL_TOPIC;
      } else {
        this.special_topic = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.relate_forum_title;
      if (str == null) {
        this.relate_forum_title = "";
      } else {
        this.relate_forum_title = str;
      } 
      this.weiguan_module = paramBuilder.weiguan_module;
      List<Banner> list = paramBuilder.banner;
      if (list == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = Message.immutableCopyOf(list);
      } 
      this.next_topic = paramBuilder.next_topic;
    } else {
      this.relate_forum = Message.immutableCopyOf(paramBuilder.relate_forum);
      this.magic_post = paramBuilder.magic_post;
      this.hot_thread = paramBuilder.hot_thread;
      this.topic_info = paramBuilder.topic_info;
      this.thread_module = paramBuilder.thread_module;
      this.pk_module = paramBuilder.pk_module;
      this.bless_module = paramBuilder.bless_module;
      this.candle_module = paramBuilder.candle_module;
      this.good_threads = paramBuilder.good_threads;
      this.is_new_url = paramBuilder.is_new_url;
      this.post_forum = Message.immutableCopyOf(paramBuilder.post_forum);
      this.is_global_block = paramBuilder.is_global_block;
      this.special_topic = Message.immutableCopyOf(paramBuilder.special_topic);
      this.relate_forum_title = paramBuilder.relate_forum_title;
      this.weiguan_module = paramBuilder.weiguan_module;
      this.banner = Message.immutableCopyOf(paramBuilder.banner);
      this.next_topic = paramBuilder.next_topic;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<Banner> banner;
    
    public CommonInteraction bless_module;
    
    public CommonInteraction candle_module;
    
    public HotThread good_threads;
    
    public HotThread hot_thread;
    
    public Integer is_global_block;
    
    public Integer is_new_url;
    
    public MagicPost magic_post;
    
    public RecomTopicList next_topic;
    
    public PkModule pk_module;
    
    public List<RelateForum> post_forum;
    
    public List<RelateForum> relate_forum;
    
    public String relate_forum_title;
    
    public List<SpecialTopic> special_topic;
    
    public ThreadModule thread_module;
    
    public TopicInfo topic_info;
    
    public CommonInteraction weiguan_module;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.relate_forum = Message.copyOf(param1DataRes.relate_forum);
      this.magic_post = param1DataRes.magic_post;
      this.hot_thread = param1DataRes.hot_thread;
      this.topic_info = param1DataRes.topic_info;
      this.thread_module = param1DataRes.thread_module;
      this.pk_module = param1DataRes.pk_module;
      this.bless_module = param1DataRes.bless_module;
      this.candle_module = param1DataRes.candle_module;
      this.good_threads = param1DataRes.good_threads;
      this.is_new_url = param1DataRes.is_new_url;
      this.post_forum = Message.copyOf(param1DataRes.post_forum);
      this.is_global_block = param1DataRes.is_global_block;
      this.special_topic = Message.copyOf(param1DataRes.special_topic);
      this.relate_forum_title = param1DataRes.relate_forum_title;
      this.weiguan_module = param1DataRes.weiguan_module;
      this.banner = Message.copyOf(param1DataRes.banner);
      this.next_topic = param1DataRes.next_topic;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
