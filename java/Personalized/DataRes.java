package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActiveCenter;
import tbclient.Anti;
import tbclient.BannerList;
import tbclient.DiscoverHotForum;
import tbclient.FavoritePanel;
import tbclient.SimpleForum;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<CardForum> DEFAULT_CARD_FORUM;
  
  public static final List<CardGod> DEFAULT_CARD_GOD;
  
  public static final List<CardTopic> DEFAULT_CARD_TOPIC;
  
  public static final Integer DEFAULT_FRESH_CTRL_NUM;
  
  public static final List<TagStruct> DEFAULT_INTERESTION;
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final List<SimpleForum> DEFAULT_LIKE_FORUMS;
  
  public static final List<Resource> DEFAULT_RESOURCE_LIST;
  
  public static final Integer DEFAULT_SHOW_ADSENSE;
  
  public static final String DEFAULT_STAT_KEY = "";
  
  public static final Integer DEFAULT_STYLE_AB_TAG;
  
  public static final Integer DEFAULT_SUG_SECONDS;
  
  public static final List<TagInfo> DEFAULT_TAG_LIST = Collections.emptyList();
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final List<ThreadPersonalized> DEFAULT_THREAD_PERSONALIZED;
  
  @ProtoField(tag = 22)
  public final ActiveCenter active_center;
  
  @ProtoField(tag = 10)
  public final AgeSexModule age_sex;
  
  @ProtoField(tag = 16)
  public final Anti anti;
  
  @ProtoField(tag = 9)
  public final BannerList banner_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<CardForum> card_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<CardGod> card_god;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<CardTopic> card_topic;
  
  @ProtoField(tag = 24)
  public final FavoritePanel favorite_panel;
  
  @ProtoField(tag = 18)
  public final FloatInfo float_info;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer fresh_ctrl_num;
  
  @ProtoField(tag = 26)
  public final HeaderCard header_card;
  
  @ProtoField(tag = 23)
  public final DiscoverHotForum hot_recomforum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<TagStruct> interestion;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<SimpleForum> like_forums;
  
  @ProtoField(tag = 17)
  public final LiveAnswer live_answer;
  
  @ProtoField(tag = 19)
  public final RecomPostTopic recom_post_topic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Resource> resource_list;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer show_adsense;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String stat_key;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer style_ab_tag;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer sug_seconds;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<TagInfo> tag_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ThreadPersonalized> thread_personalized;
  
  @ProtoField(tag = 20)
  public final UserFollowLive user_follow_live;
  
  static {
    DEFAULT_RESOURCE_LIST = Collections.emptyList();
    DEFAULT_CARD_FORUM = Collections.emptyList();
    DEFAULT_CARD_TOPIC = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_SUG_SECONDS = integer;
    DEFAULT_THREAD_PERSONALIZED = Collections.emptyList();
    DEFAULT_IS_NEW_URL = integer;
    DEFAULT_INTERESTION = Collections.emptyList();
    DEFAULT_CARD_GOD = Collections.emptyList();
    DEFAULT_LIKE_FORUMS = Collections.emptyList();
    DEFAULT_STYLE_AB_TAG = integer;
    DEFAULT_FRESH_CTRL_NUM = integer;
    DEFAULT_SHOW_ADSENSE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<TagInfo> list8 = paramBuilder.tag_list;
      if (list8 == null) {
        this.tag_list = DEFAULT_TAG_LIST;
      } else {
        this.tag_list = Message.immutableCopyOf(list8);
      } 
      List<ThreadInfo> list7 = paramBuilder.thread_list;
      if (list7 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list7);
      } 
      List<Resource> list6 = paramBuilder.resource_list;
      if (list6 == null) {
        this.resource_list = DEFAULT_RESOURCE_LIST;
      } else {
        this.resource_list = Message.immutableCopyOf(list6);
      } 
      List<CardForum> list5 = paramBuilder.card_forum;
      if (list5 == null) {
        this.card_forum = DEFAULT_CARD_FORUM;
      } else {
        this.card_forum = Message.immutableCopyOf(list5);
      } 
      List<CardTopic> list4 = paramBuilder.card_topic;
      if (list4 == null) {
        this.card_topic = DEFAULT_CARD_TOPIC;
      } else {
        this.card_topic = Message.immutableCopyOf(list4);
      } 
      Integer integer3 = paramBuilder.sug_seconds;
      if (integer3 == null) {
        this.sug_seconds = DEFAULT_SUG_SECONDS;
      } else {
        this.sug_seconds = integer3;
      } 
      List<ThreadPersonalized> list3 = paramBuilder.thread_personalized;
      if (list3 == null) {
        this.thread_personalized = DEFAULT_THREAD_PERSONALIZED;
      } else {
        this.thread_personalized = Message.immutableCopyOf(list3);
      } 
      Integer integer2 = paramBuilder.is_new_url;
      if (integer2 == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer2;
      } 
      this.banner_list = paramBuilder.banner_list;
      this.age_sex = paramBuilder.age_sex;
      List<TagStruct> list2 = paramBuilder.interestion;
      if (list2 == null) {
        this.interestion = DEFAULT_INTERESTION;
      } else {
        this.interestion = Message.immutableCopyOf(list2);
      } 
      List<CardGod> list1 = paramBuilder.card_god;
      if (list1 == null) {
        this.card_god = DEFAULT_CARD_GOD;
      } else {
        this.card_god = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.stat_key;
      if (str == null) {
        this.stat_key = "";
      } else {
        this.stat_key = str;
      } 
      List<SimpleForum> list = paramBuilder.like_forums;
      if (list == null) {
        this.like_forums = DEFAULT_LIKE_FORUMS;
      } else {
        this.like_forums = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.style_ab_tag;
      if (integer1 == null) {
        this.style_ab_tag = DEFAULT_STYLE_AB_TAG;
      } else {
        this.style_ab_tag = integer1;
      } 
      this.anti = paramBuilder.anti;
      this.live_answer = paramBuilder.live_answer;
      this.float_info = paramBuilder.float_info;
      this.recom_post_topic = paramBuilder.recom_post_topic;
      this.user_follow_live = paramBuilder.user_follow_live;
      integer1 = paramBuilder.fresh_ctrl_num;
      if (integer1 == null) {
        this.fresh_ctrl_num = DEFAULT_FRESH_CTRL_NUM;
      } else {
        this.fresh_ctrl_num = integer1;
      } 
      this.active_center = paramBuilder.active_center;
      this.hot_recomforum = paramBuilder.hot_recomforum;
      this.favorite_panel = paramBuilder.favorite_panel;
      integer1 = paramBuilder.show_adsense;
      if (integer1 == null) {
        this.show_adsense = DEFAULT_SHOW_ADSENSE;
      } else {
        this.show_adsense = integer1;
      } 
      this.header_card = paramBuilder.header_card;
    } else {
      this.tag_list = Message.immutableCopyOf(paramBuilder.tag_list);
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.resource_list = Message.immutableCopyOf(paramBuilder.resource_list);
      this.card_forum = Message.immutableCopyOf(paramBuilder.card_forum);
      this.card_topic = Message.immutableCopyOf(paramBuilder.card_topic);
      this.sug_seconds = paramBuilder.sug_seconds;
      this.thread_personalized = Message.immutableCopyOf(paramBuilder.thread_personalized);
      this.is_new_url = paramBuilder.is_new_url;
      this.banner_list = paramBuilder.banner_list;
      this.age_sex = paramBuilder.age_sex;
      this.interestion = Message.immutableCopyOf(paramBuilder.interestion);
      this.card_god = Message.immutableCopyOf(paramBuilder.card_god);
      this.stat_key = paramBuilder.stat_key;
      this.like_forums = Message.immutableCopyOf(paramBuilder.like_forums);
      this.style_ab_tag = paramBuilder.style_ab_tag;
      this.anti = paramBuilder.anti;
      this.live_answer = paramBuilder.live_answer;
      this.float_info = paramBuilder.float_info;
      this.recom_post_topic = paramBuilder.recom_post_topic;
      this.user_follow_live = paramBuilder.user_follow_live;
      this.fresh_ctrl_num = paramBuilder.fresh_ctrl_num;
      this.active_center = paramBuilder.active_center;
      this.hot_recomforum = paramBuilder.hot_recomforum;
      this.favorite_panel = paramBuilder.favorite_panel;
      this.show_adsense = paramBuilder.show_adsense;
      this.header_card = paramBuilder.header_card;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ActiveCenter active_center;
    
    public AgeSexModule age_sex;
    
    public Anti anti;
    
    public BannerList banner_list;
    
    public List<CardForum> card_forum;
    
    public List<CardGod> card_god;
    
    public List<CardTopic> card_topic;
    
    public FavoritePanel favorite_panel;
    
    public FloatInfo float_info;
    
    public Integer fresh_ctrl_num;
    
    public HeaderCard header_card;
    
    public DiscoverHotForum hot_recomforum;
    
    public List<TagStruct> interestion;
    
    public Integer is_new_url;
    
    public List<SimpleForum> like_forums;
    
    public LiveAnswer live_answer;
    
    public RecomPostTopic recom_post_topic;
    
    public List<Resource> resource_list;
    
    public Integer show_adsense;
    
    public String stat_key;
    
    public Integer style_ab_tag;
    
    public Integer sug_seconds;
    
    public List<TagInfo> tag_list;
    
    public List<ThreadInfo> thread_list;
    
    public List<ThreadPersonalized> thread_personalized;
    
    public UserFollowLive user_follow_live;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.tag_list = Message.copyOf(param1DataRes.tag_list);
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.resource_list = Message.copyOf(param1DataRes.resource_list);
      this.card_forum = Message.copyOf(param1DataRes.card_forum);
      this.card_topic = Message.copyOf(param1DataRes.card_topic);
      this.sug_seconds = param1DataRes.sug_seconds;
      this.thread_personalized = Message.copyOf(param1DataRes.thread_personalized);
      this.is_new_url = param1DataRes.is_new_url;
      this.banner_list = param1DataRes.banner_list;
      this.age_sex = param1DataRes.age_sex;
      this.interestion = Message.copyOf(param1DataRes.interestion);
      this.card_god = Message.copyOf(param1DataRes.card_god);
      this.stat_key = param1DataRes.stat_key;
      this.like_forums = Message.copyOf(param1DataRes.like_forums);
      this.style_ab_tag = param1DataRes.style_ab_tag;
      this.anti = param1DataRes.anti;
      this.live_answer = param1DataRes.live_answer;
      this.float_info = param1DataRes.float_info;
      this.recom_post_topic = param1DataRes.recom_post_topic;
      this.user_follow_live = param1DataRes.user_follow_live;
      this.fresh_ctrl_num = param1DataRes.fresh_ctrl_num;
      this.active_center = param1DataRes.active_center;
      this.hot_recomforum = param1DataRes.hot_recomforum;
      this.favorite_panel = param1DataRes.favorite_panel;
      this.show_adsense = param1DataRes.show_adsense;
      this.header_card = param1DataRes.header_card;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
