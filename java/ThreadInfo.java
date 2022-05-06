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
import tbclient.ActInfo;
import tbclient.ActivityInfo;
import tbclient.AdInfo;
import tbclient.Agree;
import tbclient.AlaLiveInfo;
import tbclient.AnchorInfo;
import tbclient.AnimationThread;
import tbclient.AppCode;
import tbclient.AppInfo;
import tbclient.Baijiahao;
import tbclient.BookThread;
import tbclient.CartoonThread;
import tbclient.DealInfo;
import tbclient.DeclareInfo;
import tbclient.DislikeInfo;
import tbclient.ForumFriendWatchingInfo;
import tbclient.Guess;
import tbclient.HeadItem;
import tbclient.HotTWThreadInfo;
import tbclient.Item;
import tbclient.JNews;
import tbclient.Lbs;
import tbclient.LinkThreadInfo;
import tbclient.Media;
import tbclient.MediaNum;
import tbclient.MultipleForum;
import tbclient.OriForumInfo;
import tbclient.OriginThreadInfo;
import tbclient.PbContent;
import tbclient.PbGoodsInfo;
import tbclient.PbLinkInfo;
import tbclient.PollInfo;
import tbclient.Post;
import tbclient.PostList;
import tbclient.PsInfo;
import tbclient.PushStatus;
import tbclient.RecommendTip;
import tbclient.ReportInfo;
import tbclient.SimpleForum;
import tbclient.SkinInfo;
import tbclient.SmartApp;
import tbclient.StarRankIcon;
import tbclient.TailInfo;
import tbclient.TaskInfo;
import tbclient.TbreadDispatch;
import tbclient.ThreadInfo;
import tbclient.ThreadRecommendInfo;
import tbclient.TiebaPlusAd;
import tbclient.TogetherHi;
import tbclient.Topic;
import tbclient.TopicModule;
import tbclient.User;
import tbclient.VideoActive;
import tbclient.VideoChannelInfo;
import tbclient.VideoDesc;
import tbclient.VideoInfo;
import tbclient.Voice;
import tbclient.VoiceRoom;
import tbclient.WorksInfo;
import tbclient.YulePostActivity;
import tbclient.Zan;
import tbclient.ZhiBoInfoTW;

public final class ThreadInfo extends Message {
  public static final List<Abstract> DEFAULT_ABSTRACT;
  
  public static final String DEFAULT_AB_TAG = "";
  
  public static final List<ActInfo> DEFAULT_ACT_INFO;
  
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final String DEFAULT_ARTICLE_COVER = "";
  
  public static final Long DEFAULT_AUDIT_TIME;
  
  public static final Long DEFAULT_AUTHOR_ID;
  
  public static final Integer DEFAULT_BJH_CONTENT_TAG;
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  public static final Integer DEFAULT_CHEAK_REPEAT;
  
  public static final String DEFAULT_CLICK_URL = "";
  
  public static final String DEFAULT_COLLECT_MARK_PID = "";
  
  public static final Integer DEFAULT_COLLECT_NUM;
  
  public static final Integer DEFAULT_COLLECT_STATUS;
  
  public static final Integer DEFAULT_COMMENT_NUM;
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final String DEFAULT_DAILY_PAPER_TIME = "";
  
  public static final List<DeclareInfo> DEFAULT_DECLARE_LIST;
  
  public static final List<DislikeInfo> DEFAULT_DISLIKE_INFO;
  
  public static final String DEFAULT_ECOM = "";
  
  public static final List<TailInfo> DEFAULT_EXT_TAILS;
  
  public static final Long DEFAULT_FID;
  
  public static final List<PbContent> DEFAULT_FIRST_POST_CONTENT;
  
  public static final Long DEFAULT_FIRST_POST_ID;
  
  public static final String DEFAULT_FNAME = "";
  
  public static final String DEFAULT_FORUM_USER_LIVE_MSG = "";
  
  public static final Long DEFAULT_FREQ_NUM;
  
  public static final String DEFAULT_FROM = "";
  
  public static final Integer DEFAULT_HAS_COMMENTED;
  
  public static final Integer DEFAULT_HOT_NUM;
  
  public static final Integer DEFAULT_HOT_WEIGHT;
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IF_COMMENT;
  
  public static final String DEFAULT_IF_COMMENT_INFO = "";
  
  public static final Integer DEFAULT_ISLZDELETEALL;
  
  public static final Integer DEFAULT_IS_ACTIVITY;
  
  public static final Integer DEFAULT_IS_AD;
  
  public static final Integer DEFAULT_IS_AUTHOR_VIEW;
  
  public static final Integer DEFAULT_IS_BAKAN;
  
  public static final Integer DEFAULT_IS_BJH;
  
  public static final Integer DEFAULT_IS_BOOK_CHAPTER;
  
  public static final Integer DEFAULT_IS_BUB;
  
  public static final Integer DEFAULT_IS_CALLED;
  
  public static final Integer DEFAULT_IS_COPYTHREAD;
  
  public static final Integer DEFAULT_IS_DEAL;
  
  public static final Integer DEFAULT_IS_DELETED;
  
  public static final Integer DEFAULT_IS_FRS_MASK;
  
  public static final Integer DEFAULT_IS_GLOBAL_TOP;
  
  public static final Integer DEFAULT_IS_GOD;
  
  public static final Integer DEFAULT_IS_GODTHREAD_RECOMMEND;
  
  public static final Integer DEFAULT_IS_GOOD;
  
  public static final Integer DEFAULT_IS_HEADLINEPOST;
  
  public static final Integer DEFAULT_IS_LINK_THREAD;
  
  public static final Integer DEFAULT_IS_LIVEPOST;
  
  public static final Integer DEFAULT_IS_LOCAL;
  
  public static final Integer DEFAULT_IS_MEIZHI;
  
  public static final Integer DEFAULT_IS_MEMBERTOP;
  
  public static final Integer DEFAULT_IS_MULTIFORUM_THREAD;
  
  public static final Integer DEFAULT_IS_NOTICE;
  
  public static final Integer DEFAULT_IS_NOVEL;
  
  public static final Integer DEFAULT_IS_NOVEL_REWARD;
  
  public static final Integer DEFAULT_IS_NOVEL_THANK;
  
  public static final Integer DEFAULT_IS_NTITLE;
  
  public static final Integer DEFAULT_IS_OPERATE_THREAD;
  
  public static final Integer DEFAULT_IS_PARTIAL_VISIBLE;
  
  public static final Integer DEFAULT_IS_PIC;
  
  public static final Integer DEFAULT_IS_PROTAL;
  
  public static final Integer DEFAULT_IS_SHARE_THREAD;
  
  public static final Integer DEFAULT_IS_STORY_AUDIT;
  
  public static final Integer DEFAULT_IS_S_CARD;
  
  public static final Integer DEFAULT_IS_TBREAD_DISPATCH;
  
  public static final String DEFAULT_IS_TIEBAPLUS_AD = "";
  
  public static final Integer DEFAULT_IS_TOP;
  
  public static final Integer DEFAULT_IS_TOPIC;
  
  public static final String DEFAULT_IS_TOP_IMG = "";
  
  public static final Integer DEFAULT_IS_VIDEOBIGGIE_RECOMTHREAD;
  
  public static final Integer DEFAULT_IS_VOICE_THREAD;
  
  public static final Integer DEFAULT_IS_VOTE;
  
  public static final List<HeadItem> DEFAULT_ITEM_STAR;
  
  public static final Long DEFAULT_LAST_READ_PID;
  
  public static final String DEFAULT_LAST_TIME = "";
  
  public static final Integer DEFAULT_LAST_TIME_INT;
  
  public static final String DEFAULT_LEGO_CARD = "";
  
  public static final String DEFAULT_LIVECOVER_SRC = "";
  
  public static final String DEFAULT_LIVE_POST_TYPE = "";
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final List<MediaNum> DEFAULT_MEDIA_NUM;
  
  public static final String DEFAULT_MEIZHI_PIC = "";
  
  public static final Integer DEFAULT_MIDDLE_PAGE_NUM;
  
  public static final Integer DEFAULT_MIDDLE_PAGE_PASS_FLAG;
  
  public static final List<MultipleForum> DEFAULT_MULTIPLE_FORUM_LIST;
  
  public static final String DEFAULT_MULTI_FORUM_TEXT = "";
  
  public static final String DEFAULT_NID = "";
  
  public static final Integer DEFAULT_OPERATOR_FLAG;
  
  public static final Integer DEFAULT_PB_ENTRY;
  
  public static final List<PbGoodsInfo> DEFAULT_PB_GOODS_INFO;
  
  public static final List<PbLinkInfo> DEFAULT_PB_LINK_INFO;
  
  public static final Integer DEFAULT_PIC_NUM;
  
  public static final String DEFAULT_PIDS = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final List<PostList> DEFAULT_POST_LIST;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final String DEFAULT_PRESENTATION_STYLE = "";
  
  public static final Integer DEFAULT_PUSH_END_TIME;
  
  public static final String DEFAULT_RECOM_EXTRA = "";
  
  public static final String DEFAULT_RECOM_REASON = "";
  
  public static final String DEFAULT_RECOM_SOURCE = "";
  
  public static final String DEFAULT_RECOM_TAG_ICON = "";
  
  public static final String DEFAULT_RECOM_WEIGHT = "";
  
  public static final Integer DEFAULT_REPLY_NUM;
  
  public static final List<ReportInfo> DEFAULT_REPORT_INFO;
  
  public static final Integer DEFAULT_REPOST_NUM;
  
  public static final List<PbContent> DEFAULT_RICH_ABSTRACT;
  
  public static final List<PbContent> DEFAULT_RICH_TITLE;
  
  public static final String DEFAULT_SCARD_PACKET_ID = "";
  
  public static final Long DEFAULT_SHARE_NUM;
  
  public static final Integer DEFAULT_SHOW_COMMENTED;
  
  public static final Integer DEFAULT_STORECOUNT;
  
  public static final Integer DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final Integer DEFAULT_TAB_SHOW_MODE;
  
  public static final List<ThreadRecommendInfo> DEFAULT_THREAD_RECOMMEND_INFOS;
  
  public static final String DEFAULT_THREAD_SHARE_LINK = "";
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final Integer DEFAULT_THREAD_TYPES;
  
  public static final Long DEFAULT_TID;
  
  public static final Integer DEFAULT_TIEBAPLUS_CANT_DELETE;
  
  public static final String DEFAULT_TIEBAPLUS_EXTRA_PARAM = "";
  
  public static final String DEFAULT_TIEBAPLUS_ORDER_ID = "";
  
  public static final String DEFAULT_TIEBAPLUS_TOKEN = "";
  
  public static final String DEFAULT_TIEBA_GAME_INFORMATION_SOURCE = "";
  
  public static final Integer DEFAULT_TIME;
  
  public static final Integer DEFAULT_TIMELINE;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TOPIC_H5_URL = "";
  
  public static final String DEFAULT_TOPIC_USER_NAME = "";
  
  public static final Long DEFAULT_TRANS_NUM;
  
  public static final String DEFAULT_T_SHARE_IMG = "";
  
  public static final Integer DEFAULT_VALID_POST_NUM;
  
  public static final String DEFAULT_VIDEO = "";
  
  public static final String DEFAULT_VIDEO_COVER = "";
  
  public static final String DEFAULT_VIDEO_ID = "";
  
  public static final String DEFAULT_VIDEO_MOBILE_URL = "";
  
  public static final String DEFAULT_VIDEO_SWF = "";
  
  public static final Integer DEFAULT_VIEW_NUM;
  
  public static final List<Voice> DEFAULT_VOICE_INFO;
  
  public static final String DEFAULT_WONDERFUL_POST_INFO = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 21)
  public final List<Abstract> _abstract;
  
  @ProtoField(tag = 108, type = Message.Datatype.STRING)
  public final String ab_tag;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 65)
  public final List<ActInfo> act_info;
  
  @ProtoField(tag = 132)
  public final ActivityInfo activity_info;
  
  @ProtoField(tag = 126)
  public final Agree agree;
  
  @ProtoField(tag = 124, type = Message.Datatype.INT32)
  public final Integer agree_num;
  
  @ProtoField(tag = 113)
  public final AlaLiveInfo ala_info;
  
  @ProtoField(tag = 55)
  public final AnchorInfo anchor_info;
  
  @ProtoField(tag = 99)
  public final AnimationThread animation_info;
  
  @ProtoField(tag = 89)
  public final AppCode app_code;
  
  @ProtoField(tag = 117)
  public final AppInfo app_info;
  
  @ProtoField(tag = 162, type = Message.Datatype.STRING)
  public final String article_cover;
  
  @ProtoField(tag = 138, type = Message.Datatype.INT64)
  public final Long audit_time;
  
  @ProtoField(tag = 18)
  public final User author;
  
  @ProtoField(tag = 56, type = Message.Datatype.INT64)
  public final Long author_id;
  
  @ProtoField(tag = 169)
  public final Baijiahao baijiahao;
  
  @ProtoField(tag = 163, type = Message.Datatype.INT32)
  public final Integer bjh_content_tag;
  
  @ProtoField(tag = 102)
  public final BookThread book_chapter;
  
  @ProtoField(tag = 92)
  public final CartoonThread cartoon_info;
  
  @ProtoField(tag = 73, type = Message.Datatype.STRING)
  public final String category_name;
  
  @ProtoField(tag = 107, type = Message.Datatype.UINT32)
  public final Integer cheak_repeat;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String click_url;
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String collect_mark_pid;
  
  @ProtoField(tag = 190, type = Message.Datatype.UINT32)
  public final Integer collect_num;
  
  @ProtoField(tag = 50, type = Message.Datatype.INT32)
  public final Integer collect_status;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer comment_num;
  
  @ProtoField(tag = 45, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 154, type = Message.Datatype.STRING)
  public final String daily_paper_time;
  
  @ProtoField(tag = 98)
  public final DealInfo deal_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 121)
  public final List<DeclareInfo> declare_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 120)
  public final List<DislikeInfo> dislike_info;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String ecom;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 90)
  public final List<TailInfo> ext_tails;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 142)
  public final List<PbContent> first_post_content;
  
  @ProtoField(tag = 40, type = Message.Datatype.INT64)
  public final Long first_post_id;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 188)
  public final ForumFriendWatchingInfo forum_friend_watching_info;
  
  @ProtoField(tag = 155)
  public final SimpleForum forum_info;
  
  @ProtoField(tag = 187, type = Message.Datatype.STRING)
  public final String forum_user_live_msg;
  
  @ProtoField(tag = 130, type = Message.Datatype.INT64)
  public final Long freq_num;
  
  @ProtoField(tag = 49, type = Message.Datatype.STRING)
  public final String from;
  
  @ProtoField(tag = 63)
  public final Guess guess;
  
  @ProtoField(tag = 48, type = Message.Datatype.INT32)
  public final Integer has_commented;
  
  @ProtoField(tag = 95)
  public final TogetherHi high_together;
  
  @ProtoField(tag = 71)
  public final HotTWThreadInfo hotTWInfo;
  
  @ProtoField(tag = 182, type = Message.Datatype.INT32)
  public final Integer hot_num;
  
  @ProtoField(tag = 66, type = Message.Datatype.INT32)
  public final Integer hot_weight;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 173, type = Message.Datatype.INT32)
  public final Integer if_comment;
  
  @ProtoField(tag = 174, type = Message.Datatype.STRING)
  public final String if_comment_info;
  
  @ProtoField(tag = 58, type = Message.Datatype.UINT32)
  public final Integer isLzDeleteAll;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_activity;
  
  @ProtoField(tag = 59, type = Message.Datatype.UINT32)
  public final Integer is_ad;
  
  @ProtoField(tag = 186, type = Message.Datatype.INT32)
  public final Integer is_author_view;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_bakan;
  
  @ProtoField(tag = 161, type = Message.Datatype.INT32)
  public final Integer is_bjh;
  
  @ProtoField(tag = 103, type = Message.Datatype.UINT32)
  public final Integer is_book_chapter;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer is_bub;
  
  @ProtoField(tag = 136, type = Message.Datatype.INT32)
  public final Integer is_called;
  
  @ProtoField(tag = 81, type = Message.Datatype.UINT32)
  public final Integer is_copythread;
  
  @ProtoField(tag = 97, type = Message.Datatype.INT32)
  public final Integer is_deal;
  
  @ProtoField(tag = 181, type = Message.Datatype.INT32)
  public final Integer is_deleted;
  
  @ProtoField(tag = 198, type = Message.Datatype.INT32)
  public final Integer is_frs_mask;
  
  @ProtoField(tag = 42, type = Message.Datatype.INT32)
  public final Integer is_global_top;
  
  @ProtoField(tag = 131, type = Message.Datatype.INT32)
  public final Integer is_god;
  
  @ProtoField(tag = 85, type = Message.Datatype.INT32)
  public final Integer is_godthread_recommend;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_good;
  
  @ProtoField(tag = 165, type = Message.Datatype.INT32)
  public final Integer is_headlinepost;
  
  @ProtoField(tag = 128, type = Message.Datatype.INT32)
  public final Integer is_link_thread;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer is_livepost;
  
  @ProtoField(tag = 184, type = Message.Datatype.UINT32)
  public final Integer is_local;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer is_meizhi;
  
  @ProtoField(tag = 54, type = Message.Datatype.INT32)
  public final Integer is_membertop;
  
  @ProtoField(tag = 123, type = Message.Datatype.INT32)
  public final Integer is_multiforum_thread;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer is_notice;
  
  @ProtoField(tag = 76, type = Message.Datatype.INT32)
  public final Integer is_novel;
  
  @ProtoField(tag = 78, type = Message.Datatype.INT32)
  public final Integer is_novel_reward;
  
  @ProtoField(tag = 77, type = Message.Datatype.INT32)
  public final Integer is_novel_thank;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer is_ntitle;
  
  @ProtoField(tag = 114, type = Message.Datatype.UINT32)
  public final Integer is_operate_thread;
  
  @ProtoField(tag = 127, type = Message.Datatype.INT32)
  public final Integer is_partial_visible;
  
  @ProtoField(tag = 43, type = Message.Datatype.INT32)
  public final Integer is_pic;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer is_protal;
  
  @ProtoField(tag = 170, type = Message.Datatype.UINT32)
  public final Integer is_s_card;
  
  @ProtoField(tag = 143, type = Message.Datatype.INT32)
  public final Integer is_share_thread;
  
  @ProtoField(tag = 134, type = Message.Datatype.INT32)
  public final Integer is_story_audit;
  
  @ProtoField(tag = 115, type = Message.Datatype.INT32)
  public final Integer is_tbread_dispatch;
  
  @ProtoField(tag = 193, type = Message.Datatype.STRING)
  public final String is_tiebaplus_ad;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_top;
  
  @ProtoField(tag = 158, type = Message.Datatype.STRING)
  public final String is_top_img;
  
  @ProtoField(tag = 148, type = Message.Datatype.INT32)
  public final Integer is_topic;
  
  @ProtoField(tag = 153, type = Message.Datatype.INT32)
  public final Integer is_videobiggie_recomthread;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer is_voice_thread;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_vote;
  
  @ProtoField(tag = 179)
  public final Item item;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 180)
  public final List<HeadItem> item_star;
  
  @ProtoField(tag = 75)
  public final JNews jid;
  
  @ProtoField(tag = 106, type = Message.Datatype.UINT64)
  public final Long last_read_pid;
  
  @ProtoField(tag = 19)
  public final User last_replyer;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String last_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer last_time_int;
  
  @ProtoField(tag = 94, type = Message.Datatype.STRING)
  public final String lego_card;
  
  @ProtoField(tag = 129)
  public final LinkThreadInfo link_info;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String live_post_type;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String livecover_src;
  
  @ProtoField(tag = 62)
  public final Lbs location;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 22)
  public final List<Media> media;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 25)
  public final List<MediaNum> media_num;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String meizhi_pic;
  
  @ProtoField(tag = 139, type = Message.Datatype.INT32)
  public final Integer middle_page_num;
  
  @ProtoField(tag = 140, type = Message.Datatype.INT32)
  public final Integer middle_page_pass_flag;
  
  @ProtoField(tag = 146, type = Message.Datatype.STRING)
  public final String multi_forum_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 122)
  public final List<MultipleForum> multiple_forum_list;
  
  @ProtoField(tag = 164, type = Message.Datatype.STRING)
  public final String nid;
  
  @ProtoField(tag = 82, type = Message.Datatype.UINT32)
  public final Integer operator_flag;
  
  @ProtoField(tag = 152)
  public final OriForumInfo ori_forum_info;
  
  @ProtoField(tag = 141)
  public final OriginThreadInfo origin_thread_info;
  
  @ProtoField(tag = 185, type = Message.Datatype.INT32)
  public final Integer pb_entry;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 183)
  public final List<PbGoodsInfo> pb_goods_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 178)
  public final List<PbLinkInfo> pb_link_info;
  
  @ProtoField(tag = 133)
  public final Media pic_info;
  
  @ProtoField(tag = 84, type = Message.Datatype.UINT32)
  public final Integer pic_num;
  
  @ProtoField(tag = 61, type = Message.Datatype.STRING)
  public final String pids;
  
  @ProtoField(tag = 74)
  public final PollInfo poll_info;
  
  @ProtoField(tag = 52, type = Message.Datatype.INT64)
  public final Long post_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 44)
  public final List<PostList> post_list;
  
  @ProtoField(tag = 69, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 151, type = Message.Datatype.STRING)
  public final String presentation_style;
  
  @ProtoField(tag = 101)
  public final PsInfo ps_info;
  
  @ProtoField(tag = 80, type = Message.Datatype.INT32)
  public final Integer push_end_time;
  
  @ProtoField(tag = 91)
  public final PushStatus push_status;
  
  @ProtoField(tag = 144, type = Message.Datatype.STRING)
  public final String recom_extra;
  
  @ProtoField(tag = 109, type = Message.Datatype.STRING)
  public final String recom_reason;
  
  @ProtoField(tag = 104, type = Message.Datatype.STRING)
  public final String recom_source;
  
  @ProtoField(tag = 192, type = Message.Datatype.STRING)
  public final String recom_tag_icon;
  
  @ProtoField(tag = 105, type = Message.Datatype.STRING)
  public final String recom_weight;
  
  @ProtoField(tag = 202)
  public final RecommendTip recommend_tip;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer reply_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 118)
  public final List<ReportInfo> report_info;
  
  @ProtoField(tag = 46, type = Message.Datatype.INT32)
  public final Integer repost_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 112)
  public final List<PbContent> rich_abstract;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 111)
  public final List<PbContent> rich_title;
  
  @ProtoField(tag = 171, type = Message.Datatype.STRING)
  public final String scard_packet_id;
  
  @ProtoField(tag = 135, type = Message.Datatype.INT64)
  public final Long share_num;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer show_commented;
  
  @ProtoField(tag = 100)
  public final SkinInfo skin_info;
  
  @ProtoField(tag = 147)
  public final StarRankIcon star_rank_icon;
  
  @ProtoField(tag = 68, type = Message.Datatype.INT32)
  public final Integer storecount;
  
  @ProtoField(tag = 156)
  public final SmartApp swan_info;
  
  @ProtoField(tag = 159, type = Message.Datatype.STRING)
  public final String t_share_img;
  
  @ProtoField(tag = 175, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  @ProtoField(tag = 176, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 200, type = Message.Datatype.INT32)
  public final Integer tab_show_mode;
  
  @ProtoField(tag = 83)
  public final TaskInfo task_info;
  
  @ProtoField(tag = 116)
  public final TbreadDispatch tbread_dispatch_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 191)
  public final List<ThreadRecommendInfo> thread_recommend_infos;
  
  @ProtoField(tag = 172, type = Message.Datatype.STRING)
  public final String thread_share_link;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer thread_types;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 137, type = Message.Datatype.STRING)
  public final String tieba_game_information_source;
  
  @ProtoField(tag = 201)
  public final TiebaPlusAd tiebaplus_ad;
  
  @ProtoField(tag = 197, type = Message.Datatype.INT32)
  public final Integer tiebaplus_cant_delete;
  
  @ProtoField(tag = 196, type = Message.Datatype.STRING)
  public final String tiebaplus_extra_param;
  
  @ProtoField(tag = 194, type = Message.Datatype.STRING)
  public final String tiebaplus_order_id;
  
  @ProtoField(tag = 195, type = Message.Datatype.STRING)
  public final String tiebaplus_token;
  
  @ProtoField(tag = 53, type = Message.Datatype.INT32)
  public final Integer time;
  
  @ProtoField(tag = 64, type = Message.Datatype.UINT32)
  public final Integer timeline;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 125)
  public final Post top_agree_post;
  
  @ProtoField(tag = 47)
  public final Topic topic;
  
  @ProtoField(tag = 150, type = Message.Datatype.STRING)
  public final String topic_h5_url;
  
  @ProtoField(tag = 160)
  public final TopicModule topic_module;
  
  @ProtoField(tag = 149, type = Message.Datatype.STRING)
  public final String topic_user_name;
  
  @ProtoField(tag = 145, type = Message.Datatype.UINT64)
  public final Long trans_num;
  
  @ProtoField(tag = 72)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 57, type = Message.Datatype.UINT32)
  public final Integer valid_post_num;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String video;
  
  @ProtoField(tag = 110)
  public final AdInfo video_ad_info;
  
  @ProtoField(tag = 119)
  public final VideoChannelInfo video_channel_info;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String video_cover;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String video_id;
  
  @ProtoField(tag = 79)
  public final VideoInfo video_info;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String video_mobile_url;
  
  @ProtoField(tag = 157)
  public final VideoDesc video_segment;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String video_swf;
  
  @ProtoField(tag = 96)
  public final VideoActive videoactive_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer view_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<Voice> voice_info;
  
  @ProtoField(tag = 199)
  public final VoiceRoom voice_room;
  
  @ProtoField(tag = 177, type = Message.Datatype.STRING)
  public final String wonderful_post_info;
  
  @ProtoField(tag = 189)
  public final WorksInfo works_info;
  
  @ProtoField(tag = 88)
  public final YulePostActivity yule_post_activity;
  
  @ProtoField(tag = 41)
  public final Zan zan;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-771524039, "Ltbclient/ThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-771524039, "Ltbclient/ThreadInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_TID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_REPLY_NUM = integer;
    DEFAULT_VIEW_NUM = integer;
    DEFAULT_LAST_TIME_INT = integer;
    DEFAULT_THREAD_TYPES = integer;
    DEFAULT_IS_TOP = integer;
    DEFAULT_IS_GOOD = integer;
    DEFAULT_IS_VOTE = integer;
    DEFAULT_IS_BAKAN = integer;
    DEFAULT_IS_PROTAL = integer;
    DEFAULT_IS_MEIZHI = integer;
    DEFAULT_IS_VOICE_THREAD = integer;
    DEFAULT_IS_ACTIVITY = integer;
    DEFAULT_IS_NOTICE = integer;
    DEFAULT_COMMENT_NUM = integer;
    DEFAULT_ABSTRACT = Collections.emptyList();
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_VOICE_INFO = Collections.emptyList();
    DEFAULT_MEDIA_NUM = Collections.emptyList();
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_FID = long_;
    DEFAULT_IS_LIVEPOST = integer;
    DEFAULT_SHOW_COMMENTED = integer;
    DEFAULT_IS_NTITLE = integer;
    DEFAULT_IS_BUB = integer;
    DEFAULT_FIRST_POST_ID = long_;
    DEFAULT_IS_GLOBAL_TOP = integer;
    DEFAULT_IS_PIC = integer;
    DEFAULT_POST_LIST = Collections.emptyList();
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_REPOST_NUM = integer;
    DEFAULT_HAS_COMMENTED = integer;
    DEFAULT_COLLECT_STATUS = integer;
    DEFAULT_POST_ID = long_;
    DEFAULT_TIME = integer;
    DEFAULT_IS_MEMBERTOP = integer;
    DEFAULT_AUTHOR_ID = long_;
    DEFAULT_VALID_POST_NUM = integer;
    DEFAULT_ISLZDELETEALL = integer;
    DEFAULT_IS_AD = integer;
    DEFAULT_TIMELINE = integer;
    DEFAULT_ACT_INFO = Collections.emptyList();
    DEFAULT_HOT_WEIGHT = integer;
    DEFAULT_STORECOUNT = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_NOVEL = integer;
    DEFAULT_IS_NOVEL_THANK = integer;
    DEFAULT_IS_NOVEL_REWARD = integer;
    DEFAULT_PUSH_END_TIME = integer;
    DEFAULT_IS_COPYTHREAD = integer;
    DEFAULT_OPERATOR_FLAG = integer;
    DEFAULT_PIC_NUM = integer;
    DEFAULT_IS_GODTHREAD_RECOMMEND = integer;
    DEFAULT_EXT_TAILS = Collections.emptyList();
    DEFAULT_IS_DEAL = integer;
    DEFAULT_IS_BOOK_CHAPTER = integer;
    DEFAULT_LAST_READ_PID = long_;
    DEFAULT_CHEAK_REPEAT = integer;
    DEFAULT_RICH_TITLE = Collections.emptyList();
    DEFAULT_RICH_ABSTRACT = Collections.emptyList();
    DEFAULT_IS_OPERATE_THREAD = integer;
    DEFAULT_IS_TBREAD_DISPATCH = integer;
    DEFAULT_REPORT_INFO = Collections.emptyList();
    DEFAULT_DISLIKE_INFO = Collections.emptyList();
    DEFAULT_DECLARE_LIST = Collections.emptyList();
    DEFAULT_MULTIPLE_FORUM_LIST = Collections.emptyList();
    DEFAULT_IS_MULTIFORUM_THREAD = integer;
    DEFAULT_AGREE_NUM = integer;
    DEFAULT_IS_PARTIAL_VISIBLE = integer;
    DEFAULT_IS_LINK_THREAD = integer;
    DEFAULT_FREQ_NUM = long_;
    DEFAULT_IS_GOD = integer;
    DEFAULT_IS_STORY_AUDIT = integer;
    DEFAULT_SHARE_NUM = long_;
    DEFAULT_IS_CALLED = integer;
    DEFAULT_AUDIT_TIME = long_;
    DEFAULT_MIDDLE_PAGE_NUM = integer;
    DEFAULT_MIDDLE_PAGE_PASS_FLAG = integer;
    DEFAULT_FIRST_POST_CONTENT = Collections.emptyList();
    DEFAULT_IS_SHARE_THREAD = integer;
    DEFAULT_TRANS_NUM = long_;
    DEFAULT_IS_TOPIC = integer;
    DEFAULT_IS_VIDEOBIGGIE_RECOMTHREAD = integer;
    DEFAULT_IS_BJH = integer;
    DEFAULT_BJH_CONTENT_TAG = integer;
    DEFAULT_IS_HEADLINEPOST = integer;
    DEFAULT_IS_S_CARD = integer;
    DEFAULT_IF_COMMENT = integer;
    DEFAULT_TAB_ID = integer;
    DEFAULT_PB_LINK_INFO = Collections.emptyList();
    DEFAULT_ITEM_STAR = Collections.emptyList();
    DEFAULT_IS_DELETED = integer;
    DEFAULT_HOT_NUM = integer;
    DEFAULT_PB_GOODS_INFO = Collections.emptyList();
    DEFAULT_IS_LOCAL = integer;
    DEFAULT_PB_ENTRY = integer;
    DEFAULT_IS_AUTHOR_VIEW = integer;
    DEFAULT_COLLECT_NUM = integer;
    DEFAULT_THREAD_RECOMMEND_INFOS = Collections.emptyList();
    DEFAULT_TIEBAPLUS_CANT_DELETE = integer;
    DEFAULT_IS_FRS_MASK = integer;
    DEFAULT_TAB_SHOW_MODE = integer;
  }
  
  public ThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_10 = paramBuilder.id;
      if (long_10 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_10;
      } 
      long_10 = paramBuilder.tid;
      if (long_10 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_10;
      } 
      String str25 = paramBuilder.title;
      if (str25 == null) {
        this.title = "";
      } else {
        this.title = str25;
      } 
      Integer integer33 = paramBuilder.reply_num;
      if (integer33 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = integer33;
      } 
      integer33 = paramBuilder.view_num;
      if (integer33 == null) {
        this.view_num = DEFAULT_VIEW_NUM;
      } else {
        this.view_num = integer33;
      } 
      String str24 = paramBuilder.last_time;
      if (str24 == null) {
        this.last_time = "";
      } else {
        this.last_time = str24;
      } 
      Integer integer32 = paramBuilder.last_time_int;
      if (integer32 == null) {
        this.last_time_int = DEFAULT_LAST_TIME_INT;
      } else {
        this.last_time_int = integer32;
      } 
      integer32 = paramBuilder.thread_types;
      if (integer32 == null) {
        this.thread_types = DEFAULT_THREAD_TYPES;
      } else {
        this.thread_types = integer32;
      } 
      integer32 = paramBuilder.is_top;
      if (integer32 == null) {
        this.is_top = DEFAULT_IS_TOP;
      } else {
        this.is_top = integer32;
      } 
      integer32 = paramBuilder.is_good;
      if (integer32 == null) {
        this.is_good = DEFAULT_IS_GOOD;
      } else {
        this.is_good = integer32;
      } 
      integer32 = paramBuilder.is_vote;
      if (integer32 == null) {
        this.is_vote = DEFAULT_IS_VOTE;
      } else {
        this.is_vote = integer32;
      } 
      integer32 = paramBuilder.is_bakan;
      if (integer32 == null) {
        this.is_bakan = DEFAULT_IS_BAKAN;
      } else {
        this.is_bakan = integer32;
      } 
      integer32 = paramBuilder.is_protal;
      if (integer32 == null) {
        this.is_protal = DEFAULT_IS_PROTAL;
      } else {
        this.is_protal = integer32;
      } 
      integer32 = paramBuilder.is_meizhi;
      if (integer32 == null) {
        this.is_meizhi = DEFAULT_IS_MEIZHI;
      } else {
        this.is_meizhi = integer32;
      } 
      integer32 = paramBuilder.is_voice_thread;
      if (integer32 == null) {
        this.is_voice_thread = DEFAULT_IS_VOICE_THREAD;
      } else {
        this.is_voice_thread = integer32;
      } 
      integer32 = paramBuilder.is_activity;
      if (integer32 == null) {
        this.is_activity = DEFAULT_IS_ACTIVITY;
      } else {
        this.is_activity = integer32;
      } 
      integer32 = paramBuilder.is_notice;
      if (integer32 == null) {
        this.is_notice = DEFAULT_IS_NOTICE;
      } else {
        this.is_notice = integer32;
      } 
      this.author = paramBuilder.author;
      this.last_replyer = paramBuilder.last_replyer;
      integer32 = paramBuilder.comment_num;
      if (integer32 == null) {
        this.comment_num = DEFAULT_COMMENT_NUM;
      } else {
        this.comment_num = integer32;
      } 
      List list11 = paramBuilder._abstract;
      if (list11 == null) {
        this._abstract = DEFAULT_ABSTRACT;
      } else {
        this._abstract = Message.immutableCopyOf(list11);
      } 
      list11 = paramBuilder.media;
      if (list11 == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list11);
      } 
      list11 = paramBuilder.voice_info;
      if (list11 == null) {
        this.voice_info = DEFAULT_VOICE_INFO;
      } else {
        this.voice_info = Message.immutableCopyOf(list11);
      } 
      String str23 = paramBuilder.meizhi_pic;
      if (str23 == null) {
        this.meizhi_pic = "";
      } else {
        this.meizhi_pic = str23;
      } 
      List list10 = paramBuilder.media_num;
      if (list10 == null) {
        this.media_num = DEFAULT_MEDIA_NUM;
      } else {
        this.media_num = Message.immutableCopyOf(list10);
      } 
      Integer integer31 = paramBuilder.thread_type;
      if (integer31 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer31;
      } 
      Long long_9 = paramBuilder.fid;
      if (long_9 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_9;
      } 
      String str22 = paramBuilder.fname;
      if (str22 == null) {
        this.fname = "";
      } else {
        this.fname = str22;
      } 
      str22 = paramBuilder.live_post_type;
      if (str22 == null) {
        this.live_post_type = "";
      } else {
        this.live_post_type = str22;
      } 
      Integer integer30 = paramBuilder.is_livepost;
      if (integer30 == null) {
        this.is_livepost = DEFAULT_IS_LIVEPOST;
      } else {
        this.is_livepost = integer30;
      } 
      integer30 = paramBuilder.show_commented;
      if (integer30 == null) {
        this.show_commented = DEFAULT_SHOW_COMMENTED;
      } else {
        this.show_commented = integer30;
      } 
      String str21 = paramBuilder.click_url;
      if (str21 == null) {
        this.click_url = "";
      } else {
        this.click_url = str21;
      } 
      str21 = paramBuilder.video;
      if (str21 == null) {
        this.video = "";
      } else {
        this.video = str21;
      } 
      str21 = paramBuilder.video_swf;
      if (str21 == null) {
        this.video_swf = "";
      } else {
        this.video_swf = str21;
      } 
      str21 = paramBuilder.video_cover;
      if (str21 == null) {
        this.video_cover = "";
      } else {
        this.video_cover = str21;
      } 
      str21 = paramBuilder.video_id;
      if (str21 == null) {
        this.video_id = "";
      } else {
        this.video_id = str21;
      } 
      str21 = paramBuilder.video_mobile_url;
      if (str21 == null) {
        this.video_mobile_url = "";
      } else {
        this.video_mobile_url = str21;
      } 
      Integer integer29 = paramBuilder.is_ntitle;
      if (integer29 == null) {
        this.is_ntitle = DEFAULT_IS_NTITLE;
      } else {
        this.is_ntitle = integer29;
      } 
      integer29 = paramBuilder.is_bub;
      if (integer29 == null) {
        this.is_bub = DEFAULT_IS_BUB;
      } else {
        this.is_bub = integer29;
      } 
      Long long_8 = paramBuilder.first_post_id;
      if (long_8 == null) {
        this.first_post_id = DEFAULT_FIRST_POST_ID;
      } else {
        this.first_post_id = long_8;
      } 
      this.zan = paramBuilder.zan;
      Integer integer28 = paramBuilder.is_global_top;
      if (integer28 == null) {
        this.is_global_top = DEFAULT_IS_GLOBAL_TOP;
      } else {
        this.is_global_top = integer28;
      } 
      integer28 = paramBuilder.is_pic;
      if (integer28 == null) {
        this.is_pic = DEFAULT_IS_PIC;
      } else {
        this.is_pic = integer28;
      } 
      List list9 = paramBuilder.post_list;
      if (list9 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list9);
      } 
      Integer integer27 = paramBuilder.create_time;
      if (integer27 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer27;
      } 
      integer27 = paramBuilder.repost_num;
      if (integer27 == null) {
        this.repost_num = DEFAULT_REPOST_NUM;
      } else {
        this.repost_num = integer27;
      } 
      this.topic = paramBuilder.topic;
      integer27 = paramBuilder.has_commented;
      if (integer27 == null) {
        this.has_commented = DEFAULT_HAS_COMMENTED;
      } else {
        this.has_commented = integer27;
      } 
      String str20 = paramBuilder.from;
      if (str20 == null) {
        this.from = "";
      } else {
        this.from = str20;
      } 
      Integer integer26 = paramBuilder.collect_status;
      if (integer26 == null) {
        this.collect_status = DEFAULT_COLLECT_STATUS;
      } else {
        this.collect_status = integer26;
      } 
      String str19 = paramBuilder.collect_mark_pid;
      if (str19 == null) {
        this.collect_mark_pid = "";
      } else {
        this.collect_mark_pid = str19;
      } 
      Long long_7 = paramBuilder.post_id;
      if (long_7 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_7;
      } 
      Integer integer25 = paramBuilder.time;
      if (integer25 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer25;
      } 
      integer25 = paramBuilder.is_membertop;
      if (integer25 == null) {
        this.is_membertop = DEFAULT_IS_MEMBERTOP;
      } else {
        this.is_membertop = integer25;
      } 
      this.anchor_info = paramBuilder.anchor_info;
      Long long_6 = paramBuilder.author_id;
      if (long_6 == null) {
        this.author_id = DEFAULT_AUTHOR_ID;
      } else {
        this.author_id = long_6;
      } 
      Integer integer24 = paramBuilder.valid_post_num;
      if (integer24 == null) {
        this.valid_post_num = DEFAULT_VALID_POST_NUM;
      } else {
        this.valid_post_num = integer24;
      } 
      integer24 = paramBuilder.isLzDeleteAll;
      if (integer24 == null) {
        this.isLzDeleteAll = DEFAULT_ISLZDELETEALL;
      } else {
        this.isLzDeleteAll = integer24;
      } 
      integer24 = paramBuilder.is_ad;
      if (integer24 == null) {
        this.is_ad = DEFAULT_IS_AD;
      } else {
        this.is_ad = integer24;
      } 
      String str18 = paramBuilder.ecom;
      if (str18 == null) {
        this.ecom = "";
      } else {
        this.ecom = str18;
      } 
      str18 = paramBuilder.pids;
      if (str18 == null) {
        this.pids = "";
      } else {
        this.pids = str18;
      } 
      this.location = paramBuilder.location;
      this.guess = paramBuilder.guess;
      Integer integer23 = paramBuilder.timeline;
      if (integer23 == null) {
        this.timeline = DEFAULT_TIMELINE;
      } else {
        this.timeline = integer23;
      } 
      List list8 = paramBuilder.act_info;
      if (list8 == null) {
        this.act_info = DEFAULT_ACT_INFO;
      } else {
        this.act_info = Message.immutableCopyOf(list8);
      } 
      Integer integer22 = paramBuilder.hot_weight;
      if (integer22 == null) {
        this.hot_weight = DEFAULT_HOT_WEIGHT;
      } else {
        this.hot_weight = integer22;
      } 
      String str17 = paramBuilder.livecover_src;
      if (str17 == null) {
        this.livecover_src = "";
      } else {
        this.livecover_src = str17;
      } 
      Integer integer21 = paramBuilder.storecount;
      if (integer21 == null) {
        this.storecount = DEFAULT_STORECOUNT;
      } else {
        this.storecount = integer21;
      } 
      integer21 = paramBuilder.post_num;
      if (integer21 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer21;
      } 
      this.hotTWInfo = paramBuilder.hotTWInfo;
      this.twzhibo_info = paramBuilder.twzhibo_info;
      String str16 = paramBuilder.category_name;
      if (str16 == null) {
        this.category_name = "";
      } else {
        this.category_name = str16;
      } 
      this.poll_info = paramBuilder.poll_info;
      this.jid = paramBuilder.jid;
      Integer integer20 = paramBuilder.is_novel;
      if (integer20 == null) {
        this.is_novel = DEFAULT_IS_NOVEL;
      } else {
        this.is_novel = integer20;
      } 
      integer20 = paramBuilder.is_novel_thank;
      if (integer20 == null) {
        this.is_novel_thank = DEFAULT_IS_NOVEL_THANK;
      } else {
        this.is_novel_thank = integer20;
      } 
      integer20 = paramBuilder.is_novel_reward;
      if (integer20 == null) {
        this.is_novel_reward = DEFAULT_IS_NOVEL_REWARD;
      } else {
        this.is_novel_reward = integer20;
      } 
      this.video_info = paramBuilder.video_info;
      integer20 = paramBuilder.push_end_time;
      if (integer20 == null) {
        this.push_end_time = DEFAULT_PUSH_END_TIME;
      } else {
        this.push_end_time = integer20;
      } 
      integer20 = paramBuilder.is_copythread;
      if (integer20 == null) {
        this.is_copythread = DEFAULT_IS_COPYTHREAD;
      } else {
        this.is_copythread = integer20;
      } 
      integer20 = paramBuilder.operator_flag;
      if (integer20 == null) {
        this.operator_flag = DEFAULT_OPERATOR_FLAG;
      } else {
        this.operator_flag = integer20;
      } 
      this.task_info = paramBuilder.task_info;
      integer20 = paramBuilder.pic_num;
      if (integer20 == null) {
        this.pic_num = DEFAULT_PIC_NUM;
      } else {
        this.pic_num = integer20;
      } 
      integer20 = paramBuilder.is_godthread_recommend;
      if (integer20 == null) {
        this.is_godthread_recommend = DEFAULT_IS_GODTHREAD_RECOMMEND;
      } else {
        this.is_godthread_recommend = integer20;
      } 
      this.yule_post_activity = paramBuilder.yule_post_activity;
      this.app_code = paramBuilder.app_code;
      List list7 = paramBuilder.ext_tails;
      if (list7 == null) {
        this.ext_tails = DEFAULT_EXT_TAILS;
      } else {
        this.ext_tails = Message.immutableCopyOf(list7);
      } 
      this.push_status = paramBuilder.push_status;
      this.cartoon_info = paramBuilder.cartoon_info;
      String str15 = paramBuilder.lego_card;
      if (str15 == null) {
        this.lego_card = "";
      } else {
        this.lego_card = str15;
      } 
      this.high_together = paramBuilder.high_together;
      this.videoactive_info = paramBuilder.videoactive_info;
      Integer integer19 = paramBuilder.is_deal;
      if (integer19 == null) {
        this.is_deal = DEFAULT_IS_DEAL;
      } else {
        this.is_deal = integer19;
      } 
      this.deal_info = paramBuilder.deal_info;
      this.animation_info = paramBuilder.animation_info;
      this.skin_info = paramBuilder.skin_info;
      this.ps_info = paramBuilder.ps_info;
      this.book_chapter = paramBuilder.book_chapter;
      integer19 = paramBuilder.is_book_chapter;
      if (integer19 == null) {
        this.is_book_chapter = DEFAULT_IS_BOOK_CHAPTER;
      } else {
        this.is_book_chapter = integer19;
      } 
      String str14 = paramBuilder.recom_source;
      if (str14 == null) {
        this.recom_source = "";
      } else {
        this.recom_source = str14;
      } 
      str14 = paramBuilder.recom_weight;
      if (str14 == null) {
        this.recom_weight = "";
      } else {
        this.recom_weight = str14;
      } 
      Long long_5 = paramBuilder.last_read_pid;
      if (long_5 == null) {
        this.last_read_pid = DEFAULT_LAST_READ_PID;
      } else {
        this.last_read_pid = long_5;
      } 
      Integer integer18 = paramBuilder.cheak_repeat;
      if (integer18 == null) {
        this.cheak_repeat = DEFAULT_CHEAK_REPEAT;
      } else {
        this.cheak_repeat = integer18;
      } 
      String str13 = paramBuilder.ab_tag;
      if (str13 == null) {
        this.ab_tag = "";
      } else {
        this.ab_tag = str13;
      } 
      str13 = paramBuilder.recom_reason;
      if (str13 == null) {
        this.recom_reason = "";
      } else {
        this.recom_reason = str13;
      } 
      this.video_ad_info = paramBuilder.video_ad_info;
      List list6 = paramBuilder.rich_title;
      if (list6 == null) {
        this.rich_title = DEFAULT_RICH_TITLE;
      } else {
        this.rich_title = Message.immutableCopyOf(list6);
      } 
      list6 = paramBuilder.rich_abstract;
      if (list6 == null) {
        this.rich_abstract = DEFAULT_RICH_ABSTRACT;
      } else {
        this.rich_abstract = Message.immutableCopyOf(list6);
      } 
      this.ala_info = paramBuilder.ala_info;
      Integer integer17 = paramBuilder.is_operate_thread;
      if (integer17 == null) {
        this.is_operate_thread = DEFAULT_IS_OPERATE_THREAD;
      } else {
        this.is_operate_thread = integer17;
      } 
      integer17 = paramBuilder.is_tbread_dispatch;
      if (integer17 == null) {
        this.is_tbread_dispatch = DEFAULT_IS_TBREAD_DISPATCH;
      } else {
        this.is_tbread_dispatch = integer17;
      } 
      this.tbread_dispatch_info = paramBuilder.tbread_dispatch_info;
      this.app_info = paramBuilder.app_info;
      List list5 = paramBuilder.report_info;
      if (list5 == null) {
        this.report_info = DEFAULT_REPORT_INFO;
      } else {
        this.report_info = Message.immutableCopyOf(list5);
      } 
      this.video_channel_info = paramBuilder.video_channel_info;
      list5 = paramBuilder.dislike_info;
      if (list5 == null) {
        this.dislike_info = DEFAULT_DISLIKE_INFO;
      } else {
        this.dislike_info = Message.immutableCopyOf(list5);
      } 
      list5 = paramBuilder.declare_list;
      if (list5 == null) {
        this.declare_list = DEFAULT_DECLARE_LIST;
      } else {
        this.declare_list = Message.immutableCopyOf(list5);
      } 
      list5 = paramBuilder.multiple_forum_list;
      if (list5 == null) {
        this.multiple_forum_list = DEFAULT_MULTIPLE_FORUM_LIST;
      } else {
        this.multiple_forum_list = Message.immutableCopyOf(list5);
      } 
      Integer integer16 = paramBuilder.is_multiforum_thread;
      if (integer16 == null) {
        this.is_multiforum_thread = DEFAULT_IS_MULTIFORUM_THREAD;
      } else {
        this.is_multiforum_thread = integer16;
      } 
      integer16 = paramBuilder.agree_num;
      if (integer16 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer16;
      } 
      this.top_agree_post = paramBuilder.top_agree_post;
      this.agree = paramBuilder.agree;
      integer16 = paramBuilder.is_partial_visible;
      if (integer16 == null) {
        this.is_partial_visible = DEFAULT_IS_PARTIAL_VISIBLE;
      } else {
        this.is_partial_visible = integer16;
      } 
      integer16 = paramBuilder.is_link_thread;
      if (integer16 == null) {
        this.is_link_thread = DEFAULT_IS_LINK_THREAD;
      } else {
        this.is_link_thread = integer16;
      } 
      this.link_info = paramBuilder.link_info;
      Long long_4 = paramBuilder.freq_num;
      if (long_4 == null) {
        this.freq_num = DEFAULT_FREQ_NUM;
      } else {
        this.freq_num = long_4;
      } 
      Integer integer15 = paramBuilder.is_god;
      if (integer15 == null) {
        this.is_god = DEFAULT_IS_GOD;
      } else {
        this.is_god = integer15;
      } 
      this.activity_info = paramBuilder.activity_info;
      this.pic_info = paramBuilder.pic_info;
      integer15 = paramBuilder.is_story_audit;
      if (integer15 == null) {
        this.is_story_audit = DEFAULT_IS_STORY_AUDIT;
      } else {
        this.is_story_audit = integer15;
      } 
      Long long_3 = paramBuilder.share_num;
      if (long_3 == null) {
        this.share_num = DEFAULT_SHARE_NUM;
      } else {
        this.share_num = long_3;
      } 
      Integer integer14 = paramBuilder.is_called;
      if (integer14 == null) {
        this.is_called = DEFAULT_IS_CALLED;
      } else {
        this.is_called = integer14;
      } 
      String str12 = paramBuilder.tieba_game_information_source;
      if (str12 == null) {
        this.tieba_game_information_source = "";
      } else {
        this.tieba_game_information_source = str12;
      } 
      Long long_2 = paramBuilder.audit_time;
      if (long_2 == null) {
        this.audit_time = DEFAULT_AUDIT_TIME;
      } else {
        this.audit_time = long_2;
      } 
      Integer integer13 = paramBuilder.middle_page_num;
      if (integer13 == null) {
        this.middle_page_num = DEFAULT_MIDDLE_PAGE_NUM;
      } else {
        this.middle_page_num = integer13;
      } 
      integer13 = paramBuilder.middle_page_pass_flag;
      if (integer13 == null) {
        this.middle_page_pass_flag = DEFAULT_MIDDLE_PAGE_PASS_FLAG;
      } else {
        this.middle_page_pass_flag = integer13;
      } 
      this.origin_thread_info = paramBuilder.origin_thread_info;
      List list4 = paramBuilder.first_post_content;
      if (list4 == null) {
        this.first_post_content = DEFAULT_FIRST_POST_CONTENT;
      } else {
        this.first_post_content = Message.immutableCopyOf(list4);
      } 
      Integer integer12 = paramBuilder.is_share_thread;
      if (integer12 == null) {
        this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
      } else {
        this.is_share_thread = integer12;
      } 
      String str11 = paramBuilder.recom_extra;
      if (str11 == null) {
        this.recom_extra = "";
      } else {
        this.recom_extra = str11;
      } 
      Long long_1 = paramBuilder.trans_num;
      if (long_1 == null) {
        this.trans_num = DEFAULT_TRANS_NUM;
      } else {
        this.trans_num = long_1;
      } 
      String str10 = paramBuilder.multi_forum_text;
      if (str10 == null) {
        this.multi_forum_text = "";
      } else {
        this.multi_forum_text = str10;
      } 
      this.star_rank_icon = paramBuilder.star_rank_icon;
      Integer integer11 = paramBuilder.is_topic;
      if (integer11 == null) {
        this.is_topic = DEFAULT_IS_TOPIC;
      } else {
        this.is_topic = integer11;
      } 
      String str9 = paramBuilder.topic_user_name;
      if (str9 == null) {
        this.topic_user_name = "";
      } else {
        this.topic_user_name = str9;
      } 
      str9 = paramBuilder.topic_h5_url;
      if (str9 == null) {
        this.topic_h5_url = "";
      } else {
        this.topic_h5_url = str9;
      } 
      str9 = paramBuilder.presentation_style;
      if (str9 == null) {
        this.presentation_style = "";
      } else {
        this.presentation_style = str9;
      } 
      this.ori_forum_info = paramBuilder.ori_forum_info;
      Integer integer10 = paramBuilder.is_videobiggie_recomthread;
      if (integer10 == null) {
        this.is_videobiggie_recomthread = DEFAULT_IS_VIDEOBIGGIE_RECOMTHREAD;
      } else {
        this.is_videobiggie_recomthread = integer10;
      } 
      String str8 = paramBuilder.daily_paper_time;
      if (str8 == null) {
        this.daily_paper_time = "";
      } else {
        this.daily_paper_time = str8;
      } 
      this.forum_info = paramBuilder.forum_info;
      this.swan_info = paramBuilder.swan_info;
      this.video_segment = paramBuilder.video_segment;
      str8 = paramBuilder.is_top_img;
      if (str8 == null) {
        this.is_top_img = "";
      } else {
        this.is_top_img = str8;
      } 
      str8 = paramBuilder.t_share_img;
      if (str8 == null) {
        this.t_share_img = "";
      } else {
        this.t_share_img = str8;
      } 
      this.topic_module = paramBuilder.topic_module;
      Integer integer9 = paramBuilder.is_bjh;
      if (integer9 == null) {
        this.is_bjh = DEFAULT_IS_BJH;
      } else {
        this.is_bjh = integer9;
      } 
      String str7 = paramBuilder.article_cover;
      if (str7 == null) {
        this.article_cover = "";
      } else {
        this.article_cover = str7;
      } 
      Integer integer8 = paramBuilder.bjh_content_tag;
      if (integer8 == null) {
        this.bjh_content_tag = DEFAULT_BJH_CONTENT_TAG;
      } else {
        this.bjh_content_tag = integer8;
      } 
      String str6 = paramBuilder.nid;
      if (str6 == null) {
        this.nid = "";
      } else {
        this.nid = str6;
      } 
      Integer integer7 = paramBuilder.is_headlinepost;
      if (integer7 == null) {
        this.is_headlinepost = DEFAULT_IS_HEADLINEPOST;
      } else {
        this.is_headlinepost = integer7;
      } 
      this.baijiahao = paramBuilder.baijiahao;
      integer7 = paramBuilder.is_s_card;
      if (integer7 == null) {
        this.is_s_card = DEFAULT_IS_S_CARD;
      } else {
        this.is_s_card = integer7;
      } 
      String str5 = paramBuilder.scard_packet_id;
      if (str5 == null) {
        this.scard_packet_id = "";
      } else {
        this.scard_packet_id = str5;
      } 
      str5 = paramBuilder.thread_share_link;
      if (str5 == null) {
        this.thread_share_link = "";
      } else {
        this.thread_share_link = str5;
      } 
      Integer integer6 = paramBuilder.if_comment;
      if (integer6 == null) {
        this.if_comment = DEFAULT_IF_COMMENT;
      } else {
        this.if_comment = integer6;
      } 
      String str4 = paramBuilder.if_comment_info;
      if (str4 == null) {
        this.if_comment_info = "";
      } else {
        this.if_comment_info = str4;
      } 
      Integer integer5 = paramBuilder.tab_id;
      if (integer5 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer5;
      } 
      String str3 = paramBuilder.tab_name;
      if (str3 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str3;
      } 
      str3 = paramBuilder.wonderful_post_info;
      if (str3 == null) {
        this.wonderful_post_info = "";
      } else {
        this.wonderful_post_info = str3;
      } 
      List list3 = paramBuilder.pb_link_info;
      if (list3 == null) {
        this.pb_link_info = DEFAULT_PB_LINK_INFO;
      } else {
        this.pb_link_info = Message.immutableCopyOf(list3);
      } 
      this.item = paramBuilder.item;
      list3 = paramBuilder.item_star;
      if (list3 == null) {
        this.item_star = DEFAULT_ITEM_STAR;
      } else {
        this.item_star = Message.immutableCopyOf(list3);
      } 
      Integer integer4 = paramBuilder.is_deleted;
      if (integer4 == null) {
        this.is_deleted = DEFAULT_IS_DELETED;
      } else {
        this.is_deleted = integer4;
      } 
      integer4 = paramBuilder.hot_num;
      if (integer4 == null) {
        this.hot_num = DEFAULT_HOT_NUM;
      } else {
        this.hot_num = integer4;
      } 
      List list2 = paramBuilder.pb_goods_info;
      if (list2 == null) {
        this.pb_goods_info = DEFAULT_PB_GOODS_INFO;
      } else {
        this.pb_goods_info = Message.immutableCopyOf(list2);
      } 
      Integer integer3 = paramBuilder.is_local;
      if (integer3 == null) {
        this.is_local = DEFAULT_IS_LOCAL;
      } else {
        this.is_local = integer3;
      } 
      integer3 = paramBuilder.pb_entry;
      if (integer3 == null) {
        this.pb_entry = DEFAULT_PB_ENTRY;
      } else {
        this.pb_entry = integer3;
      } 
      integer3 = paramBuilder.is_author_view;
      if (integer3 == null) {
        this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
      } else {
        this.is_author_view = integer3;
      } 
      String str2 = paramBuilder.forum_user_live_msg;
      if (str2 == null) {
        this.forum_user_live_msg = "";
      } else {
        this.forum_user_live_msg = str2;
      } 
      this.forum_friend_watching_info = paramBuilder.forum_friend_watching_info;
      this.works_info = paramBuilder.works_info;
      Integer integer2 = paramBuilder.collect_num;
      if (integer2 == null) {
        this.collect_num = DEFAULT_COLLECT_NUM;
      } else {
        this.collect_num = integer2;
      } 
      List list1 = paramBuilder.thread_recommend_infos;
      if (list1 == null) {
        this.thread_recommend_infos = DEFAULT_THREAD_RECOMMEND_INFOS;
      } else {
        this.thread_recommend_infos = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.recom_tag_icon;
      if (str1 == null) {
        this.recom_tag_icon = "";
      } else {
        this.recom_tag_icon = str1;
      } 
      str1 = paramBuilder.is_tiebaplus_ad;
      if (str1 == null) {
        this.is_tiebaplus_ad = "";
      } else {
        this.is_tiebaplus_ad = str1;
      } 
      str1 = paramBuilder.tiebaplus_order_id;
      if (str1 == null) {
        this.tiebaplus_order_id = "";
      } else {
        this.tiebaplus_order_id = str1;
      } 
      str1 = paramBuilder.tiebaplus_token;
      if (str1 == null) {
        this.tiebaplus_token = "";
      } else {
        this.tiebaplus_token = str1;
      } 
      str1 = paramBuilder.tiebaplus_extra_param;
      if (str1 == null) {
        this.tiebaplus_extra_param = "";
      } else {
        this.tiebaplus_extra_param = str1;
      } 
      Integer integer1 = paramBuilder.tiebaplus_cant_delete;
      if (integer1 == null) {
        this.tiebaplus_cant_delete = DEFAULT_TIEBAPLUS_CANT_DELETE;
      } else {
        this.tiebaplus_cant_delete = integer1;
      } 
      integer1 = paramBuilder.is_frs_mask;
      if (integer1 == null) {
        this.is_frs_mask = DEFAULT_IS_FRS_MASK;
      } else {
        this.is_frs_mask = integer1;
      } 
      this.voice_room = paramBuilder.voice_room;
      integer1 = paramBuilder.tab_show_mode;
      if (integer1 == null) {
        this.tab_show_mode = DEFAULT_TAB_SHOW_MODE;
      } else {
        this.tab_show_mode = integer1;
      } 
      this.tiebaplus_ad = paramBuilder.tiebaplus_ad;
      this.recommend_tip = paramBuilder.recommend_tip;
    } else {
      this.id = paramBuilder.id;
      this.tid = paramBuilder.tid;
      this.title = paramBuilder.title;
      this.reply_num = paramBuilder.reply_num;
      this.view_num = paramBuilder.view_num;
      this.last_time = paramBuilder.last_time;
      this.last_time_int = paramBuilder.last_time_int;
      this.thread_types = paramBuilder.thread_types;
      this.is_top = paramBuilder.is_top;
      this.is_good = paramBuilder.is_good;
      this.is_vote = paramBuilder.is_vote;
      this.is_bakan = paramBuilder.is_bakan;
      this.is_protal = paramBuilder.is_protal;
      this.is_meizhi = paramBuilder.is_meizhi;
      this.is_voice_thread = paramBuilder.is_voice_thread;
      this.is_activity = paramBuilder.is_activity;
      this.is_notice = paramBuilder.is_notice;
      this.author = paramBuilder.author;
      this.last_replyer = paramBuilder.last_replyer;
      this.comment_num = paramBuilder.comment_num;
      this._abstract = Message.immutableCopyOf(paramBuilder._abstract);
      this.media = Message.immutableCopyOf(paramBuilder.media);
      this.voice_info = Message.immutableCopyOf(paramBuilder.voice_info);
      this.meizhi_pic = paramBuilder.meizhi_pic;
      this.media_num = Message.immutableCopyOf(paramBuilder.media_num);
      this.thread_type = paramBuilder.thread_type;
      this.fid = paramBuilder.fid;
      this.fname = paramBuilder.fname;
      this.live_post_type = paramBuilder.live_post_type;
      this.is_livepost = paramBuilder.is_livepost;
      this.show_commented = paramBuilder.show_commented;
      this.click_url = paramBuilder.click_url;
      this.video = paramBuilder.video;
      this.video_swf = paramBuilder.video_swf;
      this.video_cover = paramBuilder.video_cover;
      this.video_id = paramBuilder.video_id;
      this.video_mobile_url = paramBuilder.video_mobile_url;
      this.is_ntitle = paramBuilder.is_ntitle;
      this.is_bub = paramBuilder.is_bub;
      this.first_post_id = paramBuilder.first_post_id;
      this.zan = paramBuilder.zan;
      this.is_global_top = paramBuilder.is_global_top;
      this.is_pic = paramBuilder.is_pic;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.create_time = paramBuilder.create_time;
      this.repost_num = paramBuilder.repost_num;
      this.topic = paramBuilder.topic;
      this.has_commented = paramBuilder.has_commented;
      this.from = paramBuilder.from;
      this.collect_status = paramBuilder.collect_status;
      this.collect_mark_pid = paramBuilder.collect_mark_pid;
      this.post_id = paramBuilder.post_id;
      this.time = paramBuilder.time;
      this.is_membertop = paramBuilder.is_membertop;
      this.anchor_info = paramBuilder.anchor_info;
      this.author_id = paramBuilder.author_id;
      this.valid_post_num = paramBuilder.valid_post_num;
      this.isLzDeleteAll = paramBuilder.isLzDeleteAll;
      this.is_ad = paramBuilder.is_ad;
      this.ecom = paramBuilder.ecom;
      this.pids = paramBuilder.pids;
      this.location = paramBuilder.location;
      this.guess = paramBuilder.guess;
      this.timeline = paramBuilder.timeline;
      this.act_info = Message.immutableCopyOf(paramBuilder.act_info);
      this.hot_weight = paramBuilder.hot_weight;
      this.livecover_src = paramBuilder.livecover_src;
      this.storecount = paramBuilder.storecount;
      this.post_num = paramBuilder.post_num;
      this.hotTWInfo = paramBuilder.hotTWInfo;
      this.twzhibo_info = paramBuilder.twzhibo_info;
      this.category_name = paramBuilder.category_name;
      this.poll_info = paramBuilder.poll_info;
      this.jid = paramBuilder.jid;
      this.is_novel = paramBuilder.is_novel;
      this.is_novel_thank = paramBuilder.is_novel_thank;
      this.is_novel_reward = paramBuilder.is_novel_reward;
      this.video_info = paramBuilder.video_info;
      this.push_end_time = paramBuilder.push_end_time;
      this.is_copythread = paramBuilder.is_copythread;
      this.operator_flag = paramBuilder.operator_flag;
      this.task_info = paramBuilder.task_info;
      this.pic_num = paramBuilder.pic_num;
      this.is_godthread_recommend = paramBuilder.is_godthread_recommend;
      this.yule_post_activity = paramBuilder.yule_post_activity;
      this.app_code = paramBuilder.app_code;
      this.ext_tails = Message.immutableCopyOf(paramBuilder.ext_tails);
      this.push_status = paramBuilder.push_status;
      this.cartoon_info = paramBuilder.cartoon_info;
      this.lego_card = paramBuilder.lego_card;
      this.high_together = paramBuilder.high_together;
      this.videoactive_info = paramBuilder.videoactive_info;
      this.is_deal = paramBuilder.is_deal;
      this.deal_info = paramBuilder.deal_info;
      this.animation_info = paramBuilder.animation_info;
      this.skin_info = paramBuilder.skin_info;
      this.ps_info = paramBuilder.ps_info;
      this.book_chapter = paramBuilder.book_chapter;
      this.is_book_chapter = paramBuilder.is_book_chapter;
      this.recom_source = paramBuilder.recom_source;
      this.recom_weight = paramBuilder.recom_weight;
      this.last_read_pid = paramBuilder.last_read_pid;
      this.cheak_repeat = paramBuilder.cheak_repeat;
      this.ab_tag = paramBuilder.ab_tag;
      this.recom_reason = paramBuilder.recom_reason;
      this.video_ad_info = paramBuilder.video_ad_info;
      this.rich_title = Message.immutableCopyOf(paramBuilder.rich_title);
      this.rich_abstract = Message.immutableCopyOf(paramBuilder.rich_abstract);
      this.ala_info = paramBuilder.ala_info;
      this.is_operate_thread = paramBuilder.is_operate_thread;
      this.is_tbread_dispatch = paramBuilder.is_tbread_dispatch;
      this.tbread_dispatch_info = paramBuilder.tbread_dispatch_info;
      this.app_info = paramBuilder.app_info;
      this.report_info = Message.immutableCopyOf(paramBuilder.report_info);
      this.video_channel_info = paramBuilder.video_channel_info;
      this.dislike_info = Message.immutableCopyOf(paramBuilder.dislike_info);
      this.declare_list = Message.immutableCopyOf(paramBuilder.declare_list);
      this.multiple_forum_list = Message.immutableCopyOf(paramBuilder.multiple_forum_list);
      this.is_multiforum_thread = paramBuilder.is_multiforum_thread;
      this.agree_num = paramBuilder.agree_num;
      this.top_agree_post = paramBuilder.top_agree_post;
      this.agree = paramBuilder.agree;
      this.is_partial_visible = paramBuilder.is_partial_visible;
      this.is_link_thread = paramBuilder.is_link_thread;
      this.link_info = paramBuilder.link_info;
      this.freq_num = paramBuilder.freq_num;
      this.is_god = paramBuilder.is_god;
      this.activity_info = paramBuilder.activity_info;
      this.pic_info = paramBuilder.pic_info;
      this.is_story_audit = paramBuilder.is_story_audit;
      this.share_num = paramBuilder.share_num;
      this.is_called = paramBuilder.is_called;
      this.tieba_game_information_source = paramBuilder.tieba_game_information_source;
      this.audit_time = paramBuilder.audit_time;
      this.middle_page_num = paramBuilder.middle_page_num;
      this.middle_page_pass_flag = paramBuilder.middle_page_pass_flag;
      this.origin_thread_info = paramBuilder.origin_thread_info;
      this.first_post_content = Message.immutableCopyOf(paramBuilder.first_post_content);
      this.is_share_thread = paramBuilder.is_share_thread;
      this.recom_extra = paramBuilder.recom_extra;
      this.trans_num = paramBuilder.trans_num;
      this.multi_forum_text = paramBuilder.multi_forum_text;
      this.star_rank_icon = paramBuilder.star_rank_icon;
      this.is_topic = paramBuilder.is_topic;
      this.topic_user_name = paramBuilder.topic_user_name;
      this.topic_h5_url = paramBuilder.topic_h5_url;
      this.presentation_style = paramBuilder.presentation_style;
      this.ori_forum_info = paramBuilder.ori_forum_info;
      this.is_videobiggie_recomthread = paramBuilder.is_videobiggie_recomthread;
      this.daily_paper_time = paramBuilder.daily_paper_time;
      this.forum_info = paramBuilder.forum_info;
      this.swan_info = paramBuilder.swan_info;
      this.video_segment = paramBuilder.video_segment;
      this.is_top_img = paramBuilder.is_top_img;
      this.t_share_img = paramBuilder.t_share_img;
      this.topic_module = paramBuilder.topic_module;
      this.is_bjh = paramBuilder.is_bjh;
      this.article_cover = paramBuilder.article_cover;
      this.bjh_content_tag = paramBuilder.bjh_content_tag;
      this.nid = paramBuilder.nid;
      this.is_headlinepost = paramBuilder.is_headlinepost;
      this.baijiahao = paramBuilder.baijiahao;
      this.is_s_card = paramBuilder.is_s_card;
      this.scard_packet_id = paramBuilder.scard_packet_id;
      this.thread_share_link = paramBuilder.thread_share_link;
      this.if_comment = paramBuilder.if_comment;
      this.if_comment_info = paramBuilder.if_comment_info;
      this.tab_id = paramBuilder.tab_id;
      this.tab_name = paramBuilder.tab_name;
      this.wonderful_post_info = paramBuilder.wonderful_post_info;
      this.pb_link_info = Message.immutableCopyOf(paramBuilder.pb_link_info);
      this.item = paramBuilder.item;
      this.item_star = Message.immutableCopyOf(paramBuilder.item_star);
      this.is_deleted = paramBuilder.is_deleted;
      this.hot_num = paramBuilder.hot_num;
      this.pb_goods_info = Message.immutableCopyOf(paramBuilder.pb_goods_info);
      this.is_local = paramBuilder.is_local;
      this.pb_entry = paramBuilder.pb_entry;
      this.is_author_view = paramBuilder.is_author_view;
      this.forum_user_live_msg = paramBuilder.forum_user_live_msg;
      this.forum_friend_watching_info = paramBuilder.forum_friend_watching_info;
      this.works_info = paramBuilder.works_info;
      this.collect_num = paramBuilder.collect_num;
      this.thread_recommend_infos = Message.immutableCopyOf(paramBuilder.thread_recommend_infos);
      this.recom_tag_icon = paramBuilder.recom_tag_icon;
      this.is_tiebaplus_ad = paramBuilder.is_tiebaplus_ad;
      this.tiebaplus_order_id = paramBuilder.tiebaplus_order_id;
      this.tiebaplus_token = paramBuilder.tiebaplus_token;
      this.tiebaplus_extra_param = paramBuilder.tiebaplus_extra_param;
      this.tiebaplus_cant_delete = paramBuilder.tiebaplus_cant_delete;
      this.is_frs_mask = paramBuilder.is_frs_mask;
      this.voice_room = paramBuilder.voice_room;
      this.tab_show_mode = paramBuilder.tab_show_mode;
      this.tiebaplus_ad = paramBuilder.tiebaplus_ad;
      this.recommend_tip = paramBuilder.recommend_tip;
    } 
  }
}
