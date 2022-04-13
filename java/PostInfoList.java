import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Abstract;
import tbclient.Agree;
import tbclient.AlaLiveInfo;
import tbclient.AnchorInfo;
import tbclient.BaijiahaoInfo;
import tbclient.DealInfo;
import tbclient.HeadItem;
import tbclient.Item;
import tbclient.LbsInfo;
import tbclient.Media;
import tbclient.MultipleForum;
import tbclient.OriginThreadInfo;
import tbclient.PbContent;
import tbclient.PbGoodsInfo;
import tbclient.PbLinkInfo;
import tbclient.PollInfo;
import tbclient.PostInfoContent;
import tbclient.PostInfoList;
import tbclient.PrivSets;
import tbclient.Quote;
import tbclient.UserPostPerm;
import tbclient.VideoInfo;
import tbclient.Voice;
import tbclient.VoiceRoom;
import tbclient.WorksInfo;
import tbclient.ZhiBoInfoTW;

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
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-422954523, "Ltbclient/PostInfoList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-422954523, "Ltbclient/PostInfoList;");
          return;
        } 
      } 
    } 
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
    super((Message.Builder)paramBuilder);
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
      List list7 = paramBuilder.content;
      if (list7 == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list7);
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
      List list6 = paramBuilder.abstract_thread;
      if (list6 == null) {
        this.abstract_thread = DEFAULT_ABSTRACT_THREAD;
      } else {
        this.abstract_thread = Message.immutableCopyOf(list6);
      } 
      list6 = paramBuilder.media;
      if (list6 == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list6);
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
      List list5 = paramBuilder.voice_info;
      if (list5 == null) {
        this.voice_info = DEFAULT_VOICE_INFO;
      } else {
        this.voice_info = Message.immutableCopyOf(list5);
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
      List list4 = paramBuilder.multiple_forum_list;
      if (list4 == null) {
        this.multiple_forum_list = DEFAULT_MULTIPLE_FORUM_LIST;
      } else {
        this.multiple_forum_list = Message.immutableCopyOf(list4);
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
      List list3 = paramBuilder.rich_title;
      if (list3 == null) {
        this.rich_title = DEFAULT_RICH_TITLE;
      } else {
        this.rich_title = Message.immutableCopyOf(list3);
      } 
      list3 = paramBuilder.rich_abstract;
      if (list3 == null) {
        this.rich_abstract = DEFAULT_RICH_ABSTRACT;
      } else {
        this.rich_abstract = Message.immutableCopyOf(list3);
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
      List list2 = paramBuilder.first_post_content;
      if (list2 == null) {
        this.first_post_content = DEFAULT_FIRST_POST_CONTENT;
      } else {
        this.first_post_content = Message.immutableCopyOf(list2);
      } 
      this.baijiahao_info = paramBuilder.baijiahao_info;
      String str1 = paramBuilder.wonderful_post_info;
      if (str1 == null) {
        this.wonderful_post_info = "";
      } else {
        this.wonderful_post_info = str1;
      } 
      this.item = paramBuilder.item;
      List list1 = paramBuilder.item_star;
      if (list1 == null) {
        this.item_star = DEFAULT_ITEM_STAR;
      } else {
        this.item_star = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.pb_link_info;
      if (list1 == null) {
        this.pb_link_info = DEFAULT_PB_LINK_INFO;
      } else {
        this.pb_link_info = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.pb_goods_info;
      if (list1 == null) {
        this.pb_goods_info = DEFAULT_PB_GOODS_INFO;
      } else {
        this.pb_goods_info = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.priv_sets;
      if (list1 == null) {
        this.priv_sets = DEFAULT_PRIV_SETS;
      } else {
        this.priv_sets = Message.immutableCopyOf(list1);
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
    } else {
      this.forum_id = paramBuilder.forum_id;
      this.thread_id = paramBuilder.thread_id;
      this.post_id = paramBuilder.post_id;
      this.is_thread = paramBuilder.is_thread;
      this.create_time = paramBuilder.create_time;
      this.forum_name = paramBuilder.forum_name;
      this.title = paramBuilder.title;
      this.content = Message.immutableCopyOf(paramBuilder.content);
      this.content_thread = paramBuilder.content_thread;
      this.user_name = paramBuilder.user_name;
      this.ip = paramBuilder.ip;
      this.is_post_deleted = paramBuilder.is_post_deleted;
      this.ptype = paramBuilder.ptype;
      this._abstract = paramBuilder._abstract;
      this.abstract_thread = Message.immutableCopyOf(paramBuilder.abstract_thread);
      this.media = Message.immutableCopyOf(paramBuilder.media);
      this.reply_num = paramBuilder.reply_num;
      this.user_id = paramBuilder.user_id;
      this.user_portrait = paramBuilder.user_portrait;
      this.post_type = paramBuilder.post_type;
      this.lbs_info = paramBuilder.lbs_info;
      this.quote = paramBuilder.quote;
      this.voice_info = Message.immutableCopyOf(paramBuilder.voice_info);
      this.anchor_info = paramBuilder.anchor_info;
      this.hide_post = paramBuilder.hide_post;
      this.thread_type = paramBuilder.thread_type;
      this.twzhibo_info = paramBuilder.twzhibo_info;
      this.poll_info = paramBuilder.poll_info;
      this.video_info = paramBuilder.video_info;
      this.is_deal = paramBuilder.is_deal;
      this.deal_info = paramBuilder.deal_info;
      this.multiple_forum_list = Message.immutableCopyOf(paramBuilder.multiple_forum_list);
      this.freq_num = paramBuilder.freq_num;
      this.v_forum_id = paramBuilder.v_forum_id;
      this.name_show = paramBuilder.name_show;
      this.ala_info = paramBuilder.ala_info;
      this.agree_num = paramBuilder.agree_num;
      this.view_num = paramBuilder.view_num;
      this.share_num = paramBuilder.share_num;
      this.agree = paramBuilder.agree;
      this.is_remain = paramBuilder.is_remain;
      this.origin_thread_info = paramBuilder.origin_thread_info;
      this.is_view_year = paramBuilder.is_view_year;
      this.is_share_thread = paramBuilder.is_share_thread;
      this.rich_title = Message.immutableCopyOf(paramBuilder.rich_title);
      this.rich_abstract = Message.immutableCopyOf(paramBuilder.rich_abstract);
      this.is_ntitle = paramBuilder.is_ntitle;
      this.article_cover = paramBuilder.article_cover;
      this.first_post_content = Message.immutableCopyOf(paramBuilder.first_post_content);
      this.baijiahao_info = paramBuilder.baijiahao_info;
      this.wonderful_post_info = paramBuilder.wonderful_post_info;
      this.item = paramBuilder.item;
      this.item_star = Message.immutableCopyOf(paramBuilder.item_star);
      this.pb_link_info = Message.immutableCopyOf(paramBuilder.pb_link_info);
      this.pb_goods_info = Message.immutableCopyOf(paramBuilder.pb_goods_info);
      this.priv_sets = Message.immutableCopyOf(paramBuilder.priv_sets);
      this.is_author_view = paramBuilder.is_author_view;
      this.works_info = paramBuilder.works_info;
      this.is_manager = paramBuilder.is_manager;
      this.is_origin_manager = paramBuilder.is_origin_manager;
      this.good_types = paramBuilder.good_types;
      this.top_types = paramBuilder.top_types;
      this.user_post_perm = paramBuilder.user_post_perm;
      this.voice_room = paramBuilder.voice_room;
    } 
  }
}
