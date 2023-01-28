package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PostInfoList extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final List<Abstract> DEFAULT_ABSTRACT_THREAD;
  
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final String DEFAULT_ARTICLE_COVER = "";
  
  public static final List<PostInfoContent> DEFAULT_CONTENT;
  
  public static final String DEFAULT_CONTENT_THREAD = "";
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final List<PbContent> DEFAULT_FIRST_POST_CONTENT;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_FREQ_NUM;
  
  public static final Integer DEFAULT_GOOD_TYPES;
  
  public static final Integer DEFAULT_HIDE_POST;
  
  public static final String DEFAULT_IP = "";
  
  public static final Integer DEFAULT_IS_AUTHOR_VIEW;
  
  public static final Boolean DEFAULT_IS_DEAL;
  
  public static final Integer DEFAULT_IS_MANAGER;
  
  public static final Integer DEFAULT_IS_NTITLE;
  
  public static final Integer DEFAULT_IS_ORIGIN_MANAGER;
  
  public static final Integer DEFAULT_IS_POST_DELETED;
  
  public static final Integer DEFAULT_IS_REMAIN;
  
  public static final Integer DEFAULT_IS_SHARE_THREAD;
  
  public static final Integer DEFAULT_IS_THREAD;
  
  public static final Integer DEFAULT_IS_VIEW_YEAR;
  
  public static final List<HeadItem> DEFAULT_ITEM_STAR;
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final List<MultipleForum> DEFAULT_MULTIPLE_FORUM_LIST;
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final List<PbGoodsInfo> DEFAULT_PB_GOODS_INFO;
  
  public static final List<PbLinkInfo> DEFAULT_PB_LINK_INFO;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final String DEFAULT_POST_TYPE = "";
  
  public static final List<PrivSets> DEFAULT_PRIV_SETS;
  
  public static final String DEFAULT_PTYPE = "";
  
  public static final Integer DEFAULT_REPLY_NUM;
  
  public static final List<PbContent> DEFAULT_RICH_ABSTRACT;
  
  public static final List<PbContent> DEFAULT_RICH_TITLE;
  
  public static final Integer DEFAULT_SHARE_NUM;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_THREAD_TYPE;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TOP_TYPES;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_USER_PORTRAIT = "";
  
  public static final Integer DEFAULT_VIEW_NUM;
  
  public static final List<Voice> DEFAULT_VOICE_INFO;
  
  public static final Long DEFAULT_V_FORUM_ID;
  
  public static final String DEFAULT_WONDERFUL_POST_INFO = "";
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<Abstract> abstract_thread;
  
  @ProtoField(tag = 40)
  public final Agree agree;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer agree_num;
  
  @ProtoField(tag = 36)
  public final AlaLiveInfo ala_info;
  
  @ProtoField(tag = 24)
  public final AnchorInfo anchor_info;
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String article_cover;
  
  @ProtoField(tag = 50)
  public final BaijiahaoInfo baijiahao_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<PostInfoContent> content;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String content_thread;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer create_time;
  
  @ProtoField(tag = 31)
  public final DealInfo deal_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 49)
  public final List<PbContent> first_post_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer freq_num;
  
  @ProtoField(tag = 61, type = Message.Datatype.INT32)
  public final Integer good_types;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer hide_post;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String ip;
  
  @ProtoField(tag = 57, type = Message.Datatype.INT32)
  public final Integer is_author_view;
  
  @ProtoField(tag = 30, type = Message.Datatype.BOOL)
  public final Boolean is_deal;
  
  @ProtoField(tag = 59, type = Message.Datatype.INT32)
  public final Integer is_manager;
  
  @ProtoField(tag = 47, type = Message.Datatype.INT32)
  public final Integer is_ntitle;
  
  @ProtoField(tag = 60, type = Message.Datatype.INT32)
  public final Integer is_origin_manager;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer is_post_deleted;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer is_remain;
  
  @ProtoField(tag = 44, type = Message.Datatype.INT32)
  public final Integer is_share_thread;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_thread;
  
  @ProtoField(tag = 43, type = Message.Datatype.INT32)
  public final Integer is_view_year;
  
  @ProtoField(tag = 52)
  public final Item item;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 53)
  public final List<HeadItem> item_star;
  
  @ProtoField(tag = 21)
  public final LbsInfo lbs_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<Media> media;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 32)
  public final List<MultipleForum> multiple_forum_list;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 42)
  public final OriginThreadInfo origin_thread_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 55)
  public final List<PbGoodsInfo> pb_goods_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 54)
  public final List<PbLinkInfo> pb_link_info;
  
  @ProtoField(tag = 28)
  public final PollInfo poll_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String post_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 56)
  public final List<PrivSets> priv_sets;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String ptype;
  
  @ProtoField(tag = 22)
  public final Quote quote;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer reply_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 46)
  public final List<PbContent> rich_abstract;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 45)
  public final List<PbContent> rich_title;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer share_num;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 26, type = Message.Datatype.UINT64)
  public final Long thread_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 62, type = Message.Datatype.INT32)
  public final Integer top_types;
  
  @ProtoField(tag = 27)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String user_portrait;
  
  @ProtoField(tag = 63)
  public final UserPostPerm user_post_perm;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT64)
  public final Long v_forum_id;
  
  @ProtoField(tag = 29)
  public final VideoInfo video_info;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer view_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<Voice> voice_info;
  
  @ProtoField(tag = 64)
  public final VoiceRoom voice_room;
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String wonderful_post_info;
  
  @ProtoField(tag = 58)
  public final WorksInfo works_info;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_THREAD = integer;
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_IS_POST_DELETED = integer;
    DEFAULT_ABSTRACT_THREAD = Collections.emptyList();
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_REPLY_NUM = integer;
    DEFAULT_USER_ID = long_;
    DEFAULT_VOICE_INFO = Collections.emptyList();
    DEFAULT_HIDE_POST = integer;
    DEFAULT_THREAD_TYPE = long_;
    DEFAULT_IS_DEAL = Boolean.FALSE;
    DEFAULT_MULTIPLE_FORUM_LIST = Collections.emptyList();
    DEFAULT_FREQ_NUM = integer;
    DEFAULT_V_FORUM_ID = long_;
    DEFAULT_AGREE_NUM = integer;
    DEFAULT_VIEW_NUM = integer;
    DEFAULT_SHARE_NUM = integer;
    DEFAULT_IS_REMAIN = integer;
    DEFAULT_IS_VIEW_YEAR = integer;
    DEFAULT_IS_SHARE_THREAD = integer;
    DEFAULT_RICH_TITLE = Collections.emptyList();
    DEFAULT_RICH_ABSTRACT = Collections.emptyList();
    DEFAULT_IS_NTITLE = integer;
    DEFAULT_FIRST_POST_CONTENT = Collections.emptyList();
    DEFAULT_ITEM_STAR = Collections.emptyList();
    DEFAULT_PB_LINK_INFO = Collections.emptyList();
    DEFAULT_PB_GOODS_INFO = Collections.emptyList();
    DEFAULT_PRIV_SETS = Collections.emptyList();
    DEFAULT_IS_AUTHOR_VIEW = integer;
    DEFAULT_IS_MANAGER = integer;
    DEFAULT_IS_ORIGIN_MANAGER = integer;
    DEFAULT_GOOD_TYPES = integer;
    DEFAULT_TOP_TYPES = integer;
  }
  
  public PostInfoList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_4 = paramBuilder.forum_id;
      if (long_4 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_4;
      } 
      long_4 = paramBuilder.thread_id;
      if (long_4 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_4;
      } 
      long_4 = paramBuilder.post_id;
      if (long_4 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_4;
      } 
      Integer integer8 = paramBuilder.is_thread;
      if (integer8 == null) {
        this.is_thread = DEFAULT_IS_THREAD;
      } else {
        this.is_thread = integer8;
      } 
      integer8 = paramBuilder.create_time;
      if (integer8 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer8;
      } 
      String str7 = paramBuilder.forum_name;
      if (str7 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str7;
      } 
      str7 = paramBuilder.title;
      if (str7 == null) {
        this.title = "";
      } else {
        this.title = str7;
      } 
      List<PostInfoContent> list10 = paramBuilder.content;
      if (list10 == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list10);
      } 
      String str6 = paramBuilder.content_thread;
      if (str6 == null) {
        this.content_thread = "";
      } else {
        this.content_thread = str6;
      } 
      str6 = paramBuilder.user_name;
      if (str6 == null) {
        this.user_name = "";
      } else {
        this.user_name = str6;
      } 
      str6 = paramBuilder.ip;
      if (str6 == null) {
        this.ip = "";
      } else {
        this.ip = str6;
      } 
      Integer integer7 = paramBuilder.is_post_deleted;
      if (integer7 == null) {
        this.is_post_deleted = DEFAULT_IS_POST_DELETED;
      } else {
        this.is_post_deleted = integer7;
      } 
      String str5 = paramBuilder.ptype;
      if (str5 == null) {
        this.ptype = "";
      } else {
        this.ptype = str5;
      } 
      str5 = paramBuilder._abstract;
      if (str5 == null) {
        this._abstract = "";
      } else {
        this._abstract = str5;
      } 
      List<Abstract> list9 = paramBuilder.abstract_thread;
      if (list9 == null) {
        this.abstract_thread = DEFAULT_ABSTRACT_THREAD;
      } else {
        this.abstract_thread = Message.immutableCopyOf(list9);
      } 
      List<Media> list8 = paramBuilder.media;
      if (list8 == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list8);
      } 
      Integer integer6 = paramBuilder.reply_num;
      if (integer6 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = integer6;
      } 
      Long long_3 = paramBuilder.user_id;
      if (long_3 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_3;
      } 
      String str4 = paramBuilder.user_portrait;
      if (str4 == null) {
        this.user_portrait = "";
      } else {
        this.user_portrait = str4;
      } 
      str4 = paramBuilder.post_type;
      if (str4 == null) {
        this.post_type = "";
      } else {
        this.post_type = str4;
      } 
      this.lbs_info = paramBuilder.lbs_info;
      this.quote = paramBuilder.quote;
      List<Voice> list7 = paramBuilder.voice_info;
      if (list7 == null) {
        this.voice_info = DEFAULT_VOICE_INFO;
      } else {
        this.voice_info = Message.immutableCopyOf(list7);
      } 
      this.anchor_info = paramBuilder.anchor_info;
      Integer integer5 = paramBuilder.hide_post;
      if (integer5 == null) {
        this.hide_post = DEFAULT_HIDE_POST;
      } else {
        this.hide_post = integer5;
      } 
      Long long_2 = paramBuilder.thread_type;
      if (long_2 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = long_2;
      } 
      this.twzhibo_info = paramBuilder.twzhibo_info;
      this.poll_info = paramBuilder.poll_info;
      this.video_info = paramBuilder.video_info;
      Boolean bool = paramBuilder.is_deal;
      if (bool == null) {
        this.is_deal = DEFAULT_IS_DEAL;
      } else {
        this.is_deal = bool;
      } 
      this.deal_info = paramBuilder.deal_info;
      List<MultipleForum> list6 = paramBuilder.multiple_forum_list;
      if (list6 == null) {
        this.multiple_forum_list = DEFAULT_MULTIPLE_FORUM_LIST;
      } else {
        this.multiple_forum_list = Message.immutableCopyOf(list6);
      } 
      Integer integer4 = paramBuilder.freq_num;
      if (integer4 == null) {
        this.freq_num = DEFAULT_FREQ_NUM;
      } else {
        this.freq_num = integer4;
      } 
      Long long_1 = paramBuilder.v_forum_id;
      if (long_1 == null) {
        this.v_forum_id = DEFAULT_V_FORUM_ID;
      } else {
        this.v_forum_id = long_1;
      } 
      String str3 = paramBuilder.name_show;
      if (str3 == null) {
        this.name_show = "";
      } else {
        this.name_show = str3;
      } 
      this.ala_info = paramBuilder.ala_info;
      Integer integer3 = paramBuilder.agree_num;
      if (integer3 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer3;
      } 
      integer3 = paramBuilder.view_num;
      if (integer3 == null) {
        this.view_num = DEFAULT_VIEW_NUM;
      } else {
        this.view_num = integer3;
      } 
      integer3 = paramBuilder.share_num;
      if (integer3 == null) {
        this.share_num = DEFAULT_SHARE_NUM;
      } else {
        this.share_num = integer3;
      } 
      this.agree = paramBuilder.agree;
      integer3 = paramBuilder.is_remain;
      if (integer3 == null) {
        this.is_remain = DEFAULT_IS_REMAIN;
      } else {
        this.is_remain = integer3;
      } 
      this.origin_thread_info = paramBuilder.origin_thread_info;
      integer3 = paramBuilder.is_view_year;
      if (integer3 == null) {
        this.is_view_year = DEFAULT_IS_VIEW_YEAR;
      } else {
        this.is_view_year = integer3;
      } 
      integer3 = paramBuilder.is_share_thread;
      if (integer3 == null) {
        this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
      } else {
        this.is_share_thread = integer3;
      } 
      List<PbContent> list5 = paramBuilder.rich_title;
      if (list5 == null) {
        this.rich_title = DEFAULT_RICH_TITLE;
      } else {
        this.rich_title = Message.immutableCopyOf(list5);
      } 
      list5 = paramBuilder.rich_abstract;
      if (list5 == null) {
        this.rich_abstract = DEFAULT_RICH_ABSTRACT;
      } else {
        this.rich_abstract = Message.immutableCopyOf(list5);
      } 
      Integer integer2 = paramBuilder.is_ntitle;
      if (integer2 == null) {
        this.is_ntitle = DEFAULT_IS_NTITLE;
      } else {
        this.is_ntitle = integer2;
      } 
      String str2 = paramBuilder.article_cover;
      if (str2 == null) {
        this.article_cover = "";
      } else {
        this.article_cover = str2;
      } 
      List<PbContent> list4 = paramBuilder.first_post_content;
      if (list4 == null) {
        this.first_post_content = DEFAULT_FIRST_POST_CONTENT;
      } else {
        this.first_post_content = Message.immutableCopyOf(list4);
      } 
      this.baijiahao_info = paramBuilder.baijiahao_info;
      String str1 = paramBuilder.wonderful_post_info;
      if (str1 == null) {
        this.wonderful_post_info = "";
      } else {
        this.wonderful_post_info = str1;
      } 
      this.item = paramBuilder.item;
      List<HeadItem> list3 = paramBuilder.item_star;
      if (list3 == null) {
        this.item_star = DEFAULT_ITEM_STAR;
      } else {
        this.item_star = Message.immutableCopyOf(list3);
      } 
      List<PbLinkInfo> list2 = paramBuilder.pb_link_info;
      if (list2 == null) {
        this.pb_link_info = DEFAULT_PB_LINK_INFO;
      } else {
        this.pb_link_info = Message.immutableCopyOf(list2);
      } 
      List<PbGoodsInfo> list1 = paramBuilder.pb_goods_info;
      if (list1 == null) {
        this.pb_goods_info = DEFAULT_PB_GOODS_INFO;
      } else {
        this.pb_goods_info = Message.immutableCopyOf(list1);
      } 
      List<PrivSets> list = paramBuilder.priv_sets;
      if (list == null) {
        this.priv_sets = DEFAULT_PRIV_SETS;
      } else {
        this.priv_sets = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.is_author_view;
      if (integer1 == null) {
        this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
      } else {
        this.is_author_view = integer1;
      } 
      this.works_info = paramBuilder.works_info;
      integer1 = paramBuilder.is_manager;
      if (integer1 == null) {
        this.is_manager = DEFAULT_IS_MANAGER;
      } else {
        this.is_manager = integer1;
      } 
      integer1 = paramBuilder.is_origin_manager;
      if (integer1 == null) {
        this.is_origin_manager = DEFAULT_IS_ORIGIN_MANAGER;
      } else {
        this.is_origin_manager = integer1;
      } 
      integer1 = paramBuilder.good_types;
      if (integer1 == null) {
        this.good_types = DEFAULT_GOOD_TYPES;
      } else {
        this.good_types = integer1;
      } 
      integer1 = paramBuilder.top_types;
      if (integer1 == null) {
        this.top_types = DEFAULT_TOP_TYPES;
      } else {
        this.top_types = integer1;
      } 
      this.user_post_perm = paramBuilder.user_post_perm;
      this.voice_room = paramBuilder.voice_room;
      str = paramBuilder.target_scheme;
      if (str == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.thread_id = ((Builder)str).thread_id;
      this.post_id = ((Builder)str).post_id;
      this.is_thread = ((Builder)str).is_thread;
      this.create_time = ((Builder)str).create_time;
      this.forum_name = ((Builder)str).forum_name;
      this.title = ((Builder)str).title;
      this.content = Message.immutableCopyOf(((Builder)str).content);
      this.content_thread = ((Builder)str).content_thread;
      this.user_name = ((Builder)str).user_name;
      this.ip = ((Builder)str).ip;
      this.is_post_deleted = ((Builder)str).is_post_deleted;
      this.ptype = ((Builder)str).ptype;
      this._abstract = ((Builder)str)._abstract;
      this.abstract_thread = Message.immutableCopyOf(((Builder)str).abstract_thread);
      this.media = Message.immutableCopyOf(((Builder)str).media);
      this.reply_num = ((Builder)str).reply_num;
      this.user_id = ((Builder)str).user_id;
      this.user_portrait = ((Builder)str).user_portrait;
      this.post_type = ((Builder)str).post_type;
      this.lbs_info = ((Builder)str).lbs_info;
      this.quote = ((Builder)str).quote;
      this.voice_info = Message.immutableCopyOf(((Builder)str).voice_info);
      this.anchor_info = ((Builder)str).anchor_info;
      this.hide_post = ((Builder)str).hide_post;
      this.thread_type = ((Builder)str).thread_type;
      this.twzhibo_info = ((Builder)str).twzhibo_info;
      this.poll_info = ((Builder)str).poll_info;
      this.video_info = ((Builder)str).video_info;
      this.is_deal = ((Builder)str).is_deal;
      this.deal_info = ((Builder)str).deal_info;
      this.multiple_forum_list = Message.immutableCopyOf(((Builder)str).multiple_forum_list);
      this.freq_num = ((Builder)str).freq_num;
      this.v_forum_id = ((Builder)str).v_forum_id;
      this.name_show = ((Builder)str).name_show;
      this.ala_info = ((Builder)str).ala_info;
      this.agree_num = ((Builder)str).agree_num;
      this.view_num = ((Builder)str).view_num;
      this.share_num = ((Builder)str).share_num;
      this.agree = ((Builder)str).agree;
      this.is_remain = ((Builder)str).is_remain;
      this.origin_thread_info = ((Builder)str).origin_thread_info;
      this.is_view_year = ((Builder)str).is_view_year;
      this.is_share_thread = ((Builder)str).is_share_thread;
      this.rich_title = Message.immutableCopyOf(((Builder)str).rich_title);
      this.rich_abstract = Message.immutableCopyOf(((Builder)str).rich_abstract);
      this.is_ntitle = ((Builder)str).is_ntitle;
      this.article_cover = ((Builder)str).article_cover;
      this.first_post_content = Message.immutableCopyOf(((Builder)str).first_post_content);
      this.baijiahao_info = ((Builder)str).baijiahao_info;
      this.wonderful_post_info = ((Builder)str).wonderful_post_info;
      this.item = ((Builder)str).item;
      this.item_star = Message.immutableCopyOf(((Builder)str).item_star);
      this.pb_link_info = Message.immutableCopyOf(((Builder)str).pb_link_info);
      this.pb_goods_info = Message.immutableCopyOf(((Builder)str).pb_goods_info);
      this.priv_sets = Message.immutableCopyOf(((Builder)str).priv_sets);
      this.is_author_view = ((Builder)str).is_author_view;
      this.works_info = ((Builder)str).works_info;
      this.is_manager = ((Builder)str).is_manager;
      this.is_origin_manager = ((Builder)str).is_origin_manager;
      this.good_types = ((Builder)str).good_types;
      this.top_types = ((Builder)str).top_types;
      this.user_post_perm = ((Builder)str).user_post_perm;
      this.voice_room = ((Builder)str).voice_room;
      this.target_scheme = ((Builder)str).target_scheme;
    } 
  }
  
  public PostInfoList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PostInfoList> {
    public String _abstract;
    
    public List<Abstract> abstract_thread;
    
    public Agree agree;
    
    public Integer agree_num;
    
    public AlaLiveInfo ala_info;
    
    public AnchorInfo anchor_info;
    
    public String article_cover;
    
    public BaijiahaoInfo baijiahao_info;
    
    public List<PostInfoContent> content;
    
    public String content_thread;
    
    public Integer create_time;
    
    public DealInfo deal_info;
    
    public List<PbContent> first_post_content;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer freq_num;
    
    public Integer good_types;
    
    public Integer hide_post;
    
    public String ip;
    
    public Integer is_author_view;
    
    public Boolean is_deal;
    
    public Integer is_manager;
    
    public Integer is_ntitle;
    
    public Integer is_origin_manager;
    
    public Integer is_post_deleted;
    
    public Integer is_remain;
    
    public Integer is_share_thread;
    
    public Integer is_thread;
    
    public Integer is_view_year;
    
    public Item item;
    
    public List<HeadItem> item_star;
    
    public LbsInfo lbs_info;
    
    public List<Media> media;
    
    public List<MultipleForum> multiple_forum_list;
    
    public String name_show;
    
    public OriginThreadInfo origin_thread_info;
    
    public List<PbGoodsInfo> pb_goods_info;
    
    public List<PbLinkInfo> pb_link_info;
    
    public PollInfo poll_info;
    
    public Long post_id;
    
    public String post_type;
    
    public List<PrivSets> priv_sets;
    
    public String ptype;
    
    public Quote quote;
    
    public Integer reply_num;
    
    public List<PbContent> rich_abstract;
    
    public List<PbContent> rich_title;
    
    public Integer share_num;
    
    public String target_scheme;
    
    public Long thread_id;
    
    public Long thread_type;
    
    public String title;
    
    public Integer top_types;
    
    public ZhiBoInfoTW twzhibo_info;
    
    public Long user_id;
    
    public String user_name;
    
    public String user_portrait;
    
    public UserPostPerm user_post_perm;
    
    public Long v_forum_id;
    
    public VideoInfo video_info;
    
    public Integer view_num;
    
    public List<Voice> voice_info;
    
    public VoiceRoom voice_room;
    
    public String wonderful_post_info;
    
    public WorksInfo works_info;
    
    public Builder() {}
    
    public Builder(PostInfoList param1PostInfoList) {
      super(param1PostInfoList);
      if (param1PostInfoList == null)
        return; 
      this.forum_id = param1PostInfoList.forum_id;
      this.thread_id = param1PostInfoList.thread_id;
      this.post_id = param1PostInfoList.post_id;
      this.is_thread = param1PostInfoList.is_thread;
      this.create_time = param1PostInfoList.create_time;
      this.forum_name = param1PostInfoList.forum_name;
      this.title = param1PostInfoList.title;
      this.content = Message.copyOf(param1PostInfoList.content);
      this.content_thread = param1PostInfoList.content_thread;
      this.user_name = param1PostInfoList.user_name;
      this.ip = param1PostInfoList.ip;
      this.is_post_deleted = param1PostInfoList.is_post_deleted;
      this.ptype = param1PostInfoList.ptype;
      this._abstract = param1PostInfoList._abstract;
      this.abstract_thread = Message.copyOf(param1PostInfoList.abstract_thread);
      this.media = Message.copyOf(param1PostInfoList.media);
      this.reply_num = param1PostInfoList.reply_num;
      this.user_id = param1PostInfoList.user_id;
      this.user_portrait = param1PostInfoList.user_portrait;
      this.post_type = param1PostInfoList.post_type;
      this.lbs_info = param1PostInfoList.lbs_info;
      this.quote = param1PostInfoList.quote;
      this.voice_info = Message.copyOf(param1PostInfoList.voice_info);
      this.anchor_info = param1PostInfoList.anchor_info;
      this.hide_post = param1PostInfoList.hide_post;
      this.thread_type = param1PostInfoList.thread_type;
      this.twzhibo_info = param1PostInfoList.twzhibo_info;
      this.poll_info = param1PostInfoList.poll_info;
      this.video_info = param1PostInfoList.video_info;
      this.is_deal = param1PostInfoList.is_deal;
      this.deal_info = param1PostInfoList.deal_info;
      this.multiple_forum_list = Message.copyOf(param1PostInfoList.multiple_forum_list);
      this.freq_num = param1PostInfoList.freq_num;
      this.v_forum_id = param1PostInfoList.v_forum_id;
      this.name_show = param1PostInfoList.name_show;
      this.ala_info = param1PostInfoList.ala_info;
      this.agree_num = param1PostInfoList.agree_num;
      this.view_num = param1PostInfoList.view_num;
      this.share_num = param1PostInfoList.share_num;
      this.agree = param1PostInfoList.agree;
      this.is_remain = param1PostInfoList.is_remain;
      this.origin_thread_info = param1PostInfoList.origin_thread_info;
      this.is_view_year = param1PostInfoList.is_view_year;
      this.is_share_thread = param1PostInfoList.is_share_thread;
      this.rich_title = Message.copyOf(param1PostInfoList.rich_title);
      this.rich_abstract = Message.copyOf(param1PostInfoList.rich_abstract);
      this.is_ntitle = param1PostInfoList.is_ntitle;
      this.article_cover = param1PostInfoList.article_cover;
      this.first_post_content = Message.copyOf(param1PostInfoList.first_post_content);
      this.baijiahao_info = param1PostInfoList.baijiahao_info;
      this.wonderful_post_info = param1PostInfoList.wonderful_post_info;
      this.item = param1PostInfoList.item;
      this.item_star = Message.copyOf(param1PostInfoList.item_star);
      this.pb_link_info = Message.copyOf(param1PostInfoList.pb_link_info);
      this.pb_goods_info = Message.copyOf(param1PostInfoList.pb_goods_info);
      this.priv_sets = Message.copyOf(param1PostInfoList.priv_sets);
      this.is_author_view = param1PostInfoList.is_author_view;
      this.works_info = param1PostInfoList.works_info;
      this.is_manager = param1PostInfoList.is_manager;
      this.is_origin_manager = param1PostInfoList.is_origin_manager;
      this.good_types = param1PostInfoList.good_types;
      this.top_types = param1PostInfoList.top_types;
      this.user_post_perm = param1PostInfoList.user_post_perm;
      this.voice_room = param1PostInfoList.voice_room;
      this.target_scheme = param1PostInfoList.target_scheme;
    }
    
    public PostInfoList build(boolean param1Boolean) {
      return new PostInfoList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
