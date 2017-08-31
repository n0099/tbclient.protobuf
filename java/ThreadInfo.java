package tbclient;

import android.support.v4.media.TransportMediator;
import com.baidu.location.BDLocation;
import com.baidu.sapi2.SapiSafeFacade;
import com.baidu.tbadk.TbConfig;
import com.baidu.tieba.d;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ThreadInfo extends Message {
    public static final String DEFAULT_AB_TAG = "";
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final String DEFAULT_CLICK_URL = "";
    public static final String DEFAULT_COLLECT_MARK_PID = "";
    public static final String DEFAULT_ECOM = "";
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_FROM = "";
    public static final String DEFAULT_LAST_TIME = "";
    public static final String DEFAULT_LEGO_CARD = "";
    public static final String DEFAULT_LIVECOVER_SRC = "";
    public static final String DEFAULT_LIVE_POST_TYPE = "";
    public static final String DEFAULT_MEIZHI_PIC = "";
    public static final String DEFAULT_PIDS = "";
    public static final String DEFAULT_RECOM_REASON = "";
    public static final String DEFAULT_RECOM_SOURCE = "";
    public static final String DEFAULT_RECOM_WEIGHT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VIDEO = "";
    public static final String DEFAULT_VIDEO_COVER = "";
    public static final String DEFAULT_VIDEO_ID = "";
    public static final String DEFAULT_VIDEO_MOBILE_URL = "";
    public static final String DEFAULT_VIDEO_SWF = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 21)
    public final List<Abstract> _abstract;
    @ProtoField(tag = SapiSafeFacade.SAPIWEBVIEW_SMS_LOGIN, type = Message.Datatype.STRING)
    public final String ab_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 65)
    public final List<ActInfo> act_info;
    @ProtoField(tag = 132)
    public final ActivityInfo activity_info;
    @ProtoField(tag = TransportMediator.KEYCODE_MEDIA_PLAY)
    public final Agree agree;
    @ProtoField(tag = 124, type = Message.Datatype.INT32)
    public final Integer agree_num;
    @ProtoField(tag = 113)
    public final AlaLiveInfo ala_info;
    @ProtoField(tag = d.n.View_rotation)
    public final AnchorInfo anchor_info;
    @ProtoField(tag = 99)
    public final AnimationThread animation_info;
    @ProtoField(tag = 89)
    public final AppCode app_code;
    @ProtoField(tag = 117)
    public final AppInfo app_info;
    @ProtoField(tag = 18)
    public final User author;
    @ProtoField(tag = d.n.View_rotationX, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = SapiSafeFacade.SAPIWEBVIEW_BACK)
    public final BookThread book_chapter;
    @ProtoField(tag = 92)
    public final CartoonThread cartoon_info;
    @ProtoField(tag = 73, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(tag = SapiSafeFacade.SAPIWEBVIEW_LOGIN, type = Message.Datatype.UINT32)
    public final Integer cheak_repeat;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String click_url;
    @ProtoField(tag = d.n.View_translationX, type = Message.Datatype.STRING)
    public final String collect_mark_pid;
    @ProtoField(tag = 50, type = Message.Datatype.INT32)
    public final Integer collect_status;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer comment_num;
    @ProtoField(tag = 45, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 98)
    public final DealInfo deal_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 121)
    public final List<DeclareInfo> declare_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 120)
    public final List<DislikeInfo> dislike_info;
    @ProtoField(tag = d.n.View_verticalScrollbarPosition, type = Message.Datatype.STRING)
    public final String ecom;
    @ProtoField(label = Message.Label.REPEATED, tag = 90)
    public final List<TailInfo> ext_tails;
    @ProtoField(tag = 27, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = d.n.View_drawingCacheQuality, type = Message.Datatype.INT64)
    public final Long first_post_id;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = TransportMediator.KEYCODE_MEDIA_RECORD, type = Message.Datatype.INT64)
    public final Long freq_num;
    @ProtoField(tag = 49, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 63)
    public final Guess guess;
    @ProtoField(tag = d.n.View_onClick, type = Message.Datatype.INT32)
    public final Integer has_commented;
    @ProtoField(tag = 95)
    public final TogetherHi high_together;
    @ProtoField(tag = 71)
    public final HotTWThreadInfo hotTWInfo;
    @ProtoField(tag = 66, type = Message.Datatype.INT32)
    public final Integer hot_weight;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = d.n.View_scaleX, type = Message.Datatype.UINT32)
    public final Integer isLzDeleteAll;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_activity;
    @ProtoField(tag = d.n.View_scaleY, type = Message.Datatype.UINT32)
    public final Integer is_ad;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_bakan;
    @ProtoField(tag = SapiSafeFacade.SAPIWEBVIEW_FINISH, type = Message.Datatype.UINT32)
    public final Integer is_book_chapter;
    @ProtoField(tag = d.n.View_filterTouchesWhenObscured, type = Message.Datatype.INT32)
    public final Integer is_bub;
    @ProtoField(tag = 136, type = Message.Datatype.INT32)
    public final Integer is_called;
    @ProtoField(tag = 81, type = Message.Datatype.UINT32)
    public final Integer is_copythread;
    @ProtoField(tag = 97, type = Message.Datatype.INT32)
    public final Integer is_deal;
    @ProtoField(tag = d.n.View_duplicateParentState, type = Message.Datatype.INT32)
    public final Integer is_global_top;
    @ProtoField(tag = 131, type = Message.Datatype.INT32)
    public final Integer is_god;
    @ProtoField(tag = TbConfig.POST_IMAGE_QUALITY, type = Message.Datatype.INT32)
    public final Integer is_godthread_recommend;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_good;
    @ProtoField(tag = 128, type = Message.Datatype.INT32)
    public final Integer is_link_thread;
    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer is_livepost;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_meizhi;
    @ProtoField(tag = d.n.View_transformPivotY, type = Message.Datatype.INT32)
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
    @ProtoField(tag = d.n.View_saveEnabled, type = Message.Datatype.INT32)
    public final Integer is_ntitle;
    @ProtoField(tag = 114, type = Message.Datatype.UINT32)
    public final Integer is_operate_thread;
    @ProtoField(tag = TransportMediator.KEYCODE_MEDIA_PAUSE, type = Message.Datatype.INT32)
    public final Integer is_partial_visible;
    @ProtoField(tag = d.n.View_minHeight, type = Message.Datatype.INT32)
    public final Integer is_pic;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer is_protal;
    @ProtoField(tag = 134, type = Message.Datatype.INT32)
    public final Integer is_story_audit;
    @ProtoField(tag = 115, type = Message.Datatype.INT32)
    public final Integer is_tbread_dispatch;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_top;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_voice_thread;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_vote;
    @ProtoField(tag = 75)
    public final JNews jid;
    @ProtoField(tag = SapiSafeFacade.SAPIWEBVIEW_MODIFY_PWD, type = Message.Datatype.UINT64)
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
    @ProtoField(tag = BDLocation.TypeOffLineLocationFail, type = Message.Datatype.STRING)
    public final String livecover_src;
    @ProtoField(tag = 62)
    public final Lbs location;
    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<Media> media;
    @ProtoField(label = Message.Label.REPEATED, tag = 25)
    public final List<MediaNum> media_num;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String meizhi_pic;
    @ProtoField(label = Message.Label.REPEATED, tag = 122)
    public final List<MultipleForum> multiple_forum_list;
    @ProtoField(tag = 82, type = Message.Datatype.UINT32)
    public final Integer operator_flag;
    @ProtoField(tag = 133)
    public final Media pic_info;
    @ProtoField(tag = 84, type = Message.Datatype.UINT32)
    public final Integer pic_num;
    @ProtoField(tag = 61, type = Message.Datatype.STRING)
    public final String pids;
    @ProtoField(tag = 74)
    public final PollInfo poll_info;
    @ProtoField(tag = d.n.View_translationY, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(label = Message.Label.REPEATED, tag = d.n.View_minWidth)
    public final List<PostList> post_list;
    @ProtoField(tag = 69, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 101)
    public final PsInfo ps_info;
    @ProtoField(tag = 80, type = Message.Datatype.INT32)
    public final Integer push_end_time;
    @ProtoField(tag = 91)
    public final PushStatus push_status;
    @ProtoField(tag = SapiSafeFacade.SAPIWEBVIEW_REG, type = Message.Datatype.STRING)
    public final String recom_reason;
    @ProtoField(tag = SapiSafeFacade.SAPIWEBVIEW_AUTHORIZATION, type = Message.Datatype.STRING)
    public final String recom_source;
    @ProtoField(tag = 105, type = Message.Datatype.STRING)
    public final String recom_weight;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer reply_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 118)
    public final List<ReportInfo> report_info;
    @ProtoField(tag = d.n.View_hapticFeedbackEnabled, type = Message.Datatype.INT32)
    public final Integer repost_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 112)
    public final List<PbContent> rich_abstract;
    @ProtoField(label = Message.Label.REPEATED, tag = SapiSafeFacade.SAPIWEBVIEW_BIND_WIDGET)
    public final List<PbContent> rich_title;
    @ProtoField(tag = 135, type = Message.Datatype.INT64)
    public final Long share_num;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer show_commented;
    @ProtoField(tag = 100)
    public final SkinInfo skin_info;
    @ProtoField(tag = BDLocation.TypeOffLineLocationNetworkFail, type = Message.Datatype.INT32)
    public final Integer storecount;
    @ProtoField(tag = 83)
    public final TaskInfo task_info;
    @ProtoField(tag = 116)
    public final TbreadDispatch tbread_dispatch_info;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer thread_types;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = d.n.View_transformPivotX, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 64, type = Message.Datatype.UINT32)
    public final Integer timeline;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 125)
    public final Post top_agree_post;
    @ProtoField(tag = d.n.View_contentDescription)
    public final Topic topic;
    @ProtoField(tag = 72)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = d.n.View_rotationY, type = Message.Datatype.UINT32)
    public final Integer valid_post_num;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String video;
    @ProtoField(tag = 110)
    public final AdInfo video_ad_info;
    @ProtoField(tag = 119)
    public final VideoChannelInfo video_channel_info;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String video_cover;
    @ProtoField(tag = d.n.View_clickable, type = Message.Datatype.STRING)
    public final String video_id;
    @ProtoField(tag = 79)
    public final VideoInfo video_info;
    @ProtoField(tag = d.n.View_longClickable, type = Message.Datatype.STRING)
    public final String video_mobile_url;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String video_swf;
    @ProtoField(tag = 96)
    public final VideoActive videoactive_info;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer view_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Voice> voice_info;
    @ProtoField(tag = 88)
    public final YulePostActivity yule_post_activity;
    @ProtoField(tag = d.n.View_keepScreenOn)
    public final Zan zan;
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Integer DEFAULT_VIEW_NUM = 0;
    public static final Integer DEFAULT_LAST_TIME_INT = 0;
    public static final Integer DEFAULT_THREAD_TYPES = 0;
    public static final Integer DEFAULT_IS_TOP = 0;
    public static final Integer DEFAULT_IS_GOOD = 0;
    public static final Integer DEFAULT_IS_VOTE = 0;
    public static final Integer DEFAULT_IS_BAKAN = 0;
    public static final Integer DEFAULT_IS_PROTAL = 0;
    public static final Integer DEFAULT_IS_MEIZHI = 0;
    public static final Integer DEFAULT_IS_VOICE_THREAD = 0;
    public static final Integer DEFAULT_IS_ACTIVITY = 0;
    public static final Integer DEFAULT_IS_NOTICE = 0;
    public static final Integer DEFAULT_COMMENT_NUM = 0;
    public static final List<Abstract> DEFAULT_ABSTRACT = Collections.emptyList();
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final List<Voice> DEFAULT_VOICE_INFO = Collections.emptyList();
    public static final List<MediaNum> DEFAULT_MEDIA_NUM = Collections.emptyList();
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_IS_LIVEPOST = 0;
    public static final Integer DEFAULT_SHOW_COMMENTED = 0;
    public static final Integer DEFAULT_IS_NTITLE = 0;
    public static final Integer DEFAULT_IS_BUB = 0;
    public static final Long DEFAULT_FIRST_POST_ID = 0L;
    public static final Integer DEFAULT_IS_GLOBAL_TOP = 0;
    public static final Integer DEFAULT_IS_PIC = 0;
    public static final List<PostList> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_REPOST_NUM = 0;
    public static final Integer DEFAULT_HAS_COMMENTED = 0;
    public static final Integer DEFAULT_COLLECT_STATUS = 0;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_IS_MEMBERTOP = 0;
    public static final Long DEFAULT_AUTHOR_ID = 0L;
    public static final Integer DEFAULT_VALID_POST_NUM = 0;
    public static final Integer DEFAULT_ISLZDELETEALL = 0;
    public static final Integer DEFAULT_IS_AD = 0;
    public static final Integer DEFAULT_TIMELINE = 0;
    public static final List<ActInfo> DEFAULT_ACT_INFO = Collections.emptyList();
    public static final Integer DEFAULT_HOT_WEIGHT = 0;
    public static final Integer DEFAULT_STORECOUNT = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_IS_NOVEL = 0;
    public static final Integer DEFAULT_IS_NOVEL_THANK = 0;
    public static final Integer DEFAULT_IS_NOVEL_REWARD = 0;
    public static final Integer DEFAULT_PUSH_END_TIME = 0;
    public static final Integer DEFAULT_IS_COPYTHREAD = 0;
    public static final Integer DEFAULT_OPERATOR_FLAG = 0;
    public static final Integer DEFAULT_PIC_NUM = 0;
    public static final Integer DEFAULT_IS_GODTHREAD_RECOMMEND = 0;
    public static final List<TailInfo> DEFAULT_EXT_TAILS = Collections.emptyList();
    public static final Integer DEFAULT_IS_DEAL = 0;
    public static final Integer DEFAULT_IS_BOOK_CHAPTER = 0;
    public static final Long DEFAULT_LAST_READ_PID = 0L;
    public static final Integer DEFAULT_CHEAK_REPEAT = 0;
    public static final List<PbContent> DEFAULT_RICH_TITLE = Collections.emptyList();
    public static final List<PbContent> DEFAULT_RICH_ABSTRACT = Collections.emptyList();
    public static final Integer DEFAULT_IS_OPERATE_THREAD = 0;
    public static final Integer DEFAULT_IS_TBREAD_DISPATCH = 0;
    public static final List<ReportInfo> DEFAULT_REPORT_INFO = Collections.emptyList();
    public static final List<DislikeInfo> DEFAULT_DISLIKE_INFO = Collections.emptyList();
    public static final List<DeclareInfo> DEFAULT_DECLARE_LIST = Collections.emptyList();
    public static final List<MultipleForum> DEFAULT_MULTIPLE_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_MULTIFORUM_THREAD = 0;
    public static final Integer DEFAULT_AGREE_NUM = 0;
    public static final Integer DEFAULT_IS_PARTIAL_VISIBLE = 0;
    public static final Integer DEFAULT_IS_LINK_THREAD = 0;
    public static final Long DEFAULT_FREQ_NUM = 0L;
    public static final Integer DEFAULT_IS_GOD = 0;
    public static final Integer DEFAULT_IS_STORY_AUDIT = 0;
    public static final Long DEFAULT_SHARE_NUM = 0L;
    public static final Integer DEFAULT_IS_CALLED = 0;

    private ThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.reply_num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = builder.reply_num;
            }
            if (builder.view_num == null) {
                this.view_num = DEFAULT_VIEW_NUM;
            } else {
                this.view_num = builder.view_num;
            }
            if (builder.last_time == null) {
                this.last_time = "";
            } else {
                this.last_time = builder.last_time;
            }
            if (builder.last_time_int == null) {
                this.last_time_int = DEFAULT_LAST_TIME_INT;
            } else {
                this.last_time_int = builder.last_time_int;
            }
            if (builder.thread_types == null) {
                this.thread_types = DEFAULT_THREAD_TYPES;
            } else {
                this.thread_types = builder.thread_types;
            }
            if (builder.is_top == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = builder.is_top;
            }
            if (builder.is_good == null) {
                this.is_good = DEFAULT_IS_GOOD;
            } else {
                this.is_good = builder.is_good;
            }
            if (builder.is_vote == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = builder.is_vote;
            }
            if (builder.is_bakan == null) {
                this.is_bakan = DEFAULT_IS_BAKAN;
            } else {
                this.is_bakan = builder.is_bakan;
            }
            if (builder.is_protal == null) {
                this.is_protal = DEFAULT_IS_PROTAL;
            } else {
                this.is_protal = builder.is_protal;
            }
            if (builder.is_meizhi == null) {
                this.is_meizhi = DEFAULT_IS_MEIZHI;
            } else {
                this.is_meizhi = builder.is_meizhi;
            }
            if (builder.is_voice_thread == null) {
                this.is_voice_thread = DEFAULT_IS_VOICE_THREAD;
            } else {
                this.is_voice_thread = builder.is_voice_thread;
            }
            if (builder.is_activity == null) {
                this.is_activity = DEFAULT_IS_ACTIVITY;
            } else {
                this.is_activity = builder.is_activity;
            }
            if (builder.is_notice == null) {
                this.is_notice = DEFAULT_IS_NOTICE;
            } else {
                this.is_notice = builder.is_notice;
            }
            this.author = builder.author;
            this.last_replyer = builder.last_replyer;
            if (builder.comment_num == null) {
                this.comment_num = DEFAULT_COMMENT_NUM;
            } else {
                this.comment_num = builder.comment_num;
            }
            if (builder._abstract == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = immutableCopyOf(builder._abstract);
            }
            if (builder.media == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = immutableCopyOf(builder.media);
            }
            if (builder.voice_info == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = immutableCopyOf(builder.voice_info);
            }
            if (builder.meizhi_pic == null) {
                this.meizhi_pic = "";
            } else {
                this.meizhi_pic = builder.meizhi_pic;
            }
            if (builder.media_num == null) {
                this.media_num = DEFAULT_MEDIA_NUM;
            } else {
                this.media_num = immutableCopyOf(builder.media_num);
            }
            if (builder.thread_type == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = builder.thread_type;
            }
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = builder.fid;
            }
            if (builder.fname == null) {
                this.fname = "";
            } else {
                this.fname = builder.fname;
            }
            if (builder.live_post_type == null) {
                this.live_post_type = "";
            } else {
                this.live_post_type = builder.live_post_type;
            }
            if (builder.is_livepost == null) {
                this.is_livepost = DEFAULT_IS_LIVEPOST;
            } else {
                this.is_livepost = builder.is_livepost;
            }
            if (builder.show_commented == null) {
                this.show_commented = DEFAULT_SHOW_COMMENTED;
            } else {
                this.show_commented = builder.show_commented;
            }
            if (builder.click_url == null) {
                this.click_url = "";
            } else {
                this.click_url = builder.click_url;
            }
            if (builder.video == null) {
                this.video = "";
            } else {
                this.video = builder.video;
            }
            if (builder.video_swf == null) {
                this.video_swf = "";
            } else {
                this.video_swf = builder.video_swf;
            }
            if (builder.video_cover == null) {
                this.video_cover = "";
            } else {
                this.video_cover = builder.video_cover;
            }
            if (builder.video_id == null) {
                this.video_id = "";
            } else {
                this.video_id = builder.video_id;
            }
            if (builder.video_mobile_url == null) {
                this.video_mobile_url = "";
            } else {
                this.video_mobile_url = builder.video_mobile_url;
            }
            if (builder.is_ntitle == null) {
                this.is_ntitle = DEFAULT_IS_NTITLE;
            } else {
                this.is_ntitle = builder.is_ntitle;
            }
            if (builder.is_bub == null) {
                this.is_bub = DEFAULT_IS_BUB;
            } else {
                this.is_bub = builder.is_bub;
            }
            if (builder.first_post_id == null) {
                this.first_post_id = DEFAULT_FIRST_POST_ID;
            } else {
                this.first_post_id = builder.first_post_id;
            }
            this.zan = builder.zan;
            if (builder.is_global_top == null) {
                this.is_global_top = DEFAULT_IS_GLOBAL_TOP;
            } else {
                this.is_global_top = builder.is_global_top;
            }
            if (builder.is_pic == null) {
                this.is_pic = DEFAULT_IS_PIC;
            } else {
                this.is_pic = builder.is_pic;
            }
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.repost_num == null) {
                this.repost_num = DEFAULT_REPOST_NUM;
            } else {
                this.repost_num = builder.repost_num;
            }
            this.topic = builder.topic;
            if (builder.has_commented == null) {
                this.has_commented = DEFAULT_HAS_COMMENTED;
            } else {
                this.has_commented = builder.has_commented;
            }
            if (builder.from == null) {
                this.from = "";
            } else {
                this.from = builder.from;
            }
            if (builder.collect_status == null) {
                this.collect_status = DEFAULT_COLLECT_STATUS;
            } else {
                this.collect_status = builder.collect_status;
            }
            if (builder.collect_mark_pid == null) {
                this.collect_mark_pid = "";
            } else {
                this.collect_mark_pid = builder.collect_mark_pid;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.is_membertop == null) {
                this.is_membertop = DEFAULT_IS_MEMBERTOP;
            } else {
                this.is_membertop = builder.is_membertop;
            }
            this.anchor_info = builder.anchor_info;
            if (builder.author_id == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = builder.author_id;
            }
            if (builder.valid_post_num == null) {
                this.valid_post_num = DEFAULT_VALID_POST_NUM;
            } else {
                this.valid_post_num = builder.valid_post_num;
            }
            if (builder.isLzDeleteAll == null) {
                this.isLzDeleteAll = DEFAULT_ISLZDELETEALL;
            } else {
                this.isLzDeleteAll = builder.isLzDeleteAll;
            }
            if (builder.is_ad == null) {
                this.is_ad = DEFAULT_IS_AD;
            } else {
                this.is_ad = builder.is_ad;
            }
            if (builder.ecom == null) {
                this.ecom = "";
            } else {
                this.ecom = builder.ecom;
            }
            if (builder.pids == null) {
                this.pids = "";
            } else {
                this.pids = builder.pids;
            }
            this.location = builder.location;
            this.guess = builder.guess;
            if (builder.timeline == null) {
                this.timeline = DEFAULT_TIMELINE;
            } else {
                this.timeline = builder.timeline;
            }
            if (builder.act_info == null) {
                this.act_info = DEFAULT_ACT_INFO;
            } else {
                this.act_info = immutableCopyOf(builder.act_info);
            }
            if (builder.hot_weight == null) {
                this.hot_weight = DEFAULT_HOT_WEIGHT;
            } else {
                this.hot_weight = builder.hot_weight;
            }
            if (builder.livecover_src == null) {
                this.livecover_src = "";
            } else {
                this.livecover_src = builder.livecover_src;
            }
            if (builder.storecount == null) {
                this.storecount = DEFAULT_STORECOUNT;
            } else {
                this.storecount = builder.storecount;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            this.hotTWInfo = builder.hotTWInfo;
            this.twzhibo_info = builder.twzhibo_info;
            if (builder.category_name == null) {
                this.category_name = "";
            } else {
                this.category_name = builder.category_name;
            }
            this.poll_info = builder.poll_info;
            this.jid = builder.jid;
            if (builder.is_novel == null) {
                this.is_novel = DEFAULT_IS_NOVEL;
            } else {
                this.is_novel = builder.is_novel;
            }
            if (builder.is_novel_thank == null) {
                this.is_novel_thank = DEFAULT_IS_NOVEL_THANK;
            } else {
                this.is_novel_thank = builder.is_novel_thank;
            }
            if (builder.is_novel_reward == null) {
                this.is_novel_reward = DEFAULT_IS_NOVEL_REWARD;
            } else {
                this.is_novel_reward = builder.is_novel_reward;
            }
            this.video_info = builder.video_info;
            if (builder.push_end_time == null) {
                this.push_end_time = DEFAULT_PUSH_END_TIME;
            } else {
                this.push_end_time = builder.push_end_time;
            }
            if (builder.is_copythread == null) {
                this.is_copythread = DEFAULT_IS_COPYTHREAD;
            } else {
                this.is_copythread = builder.is_copythread;
            }
            if (builder.operator_flag == null) {
                this.operator_flag = DEFAULT_OPERATOR_FLAG;
            } else {
                this.operator_flag = builder.operator_flag;
            }
            this.task_info = builder.task_info;
            if (builder.pic_num == null) {
                this.pic_num = DEFAULT_PIC_NUM;
            } else {
                this.pic_num = builder.pic_num;
            }
            if (builder.is_godthread_recommend == null) {
                this.is_godthread_recommend = DEFAULT_IS_GODTHREAD_RECOMMEND;
            } else {
                this.is_godthread_recommend = builder.is_godthread_recommend;
            }
            this.yule_post_activity = builder.yule_post_activity;
            this.app_code = builder.app_code;
            if (builder.ext_tails == null) {
                this.ext_tails = DEFAULT_EXT_TAILS;
            } else {
                this.ext_tails = immutableCopyOf(builder.ext_tails);
            }
            this.push_status = builder.push_status;
            this.cartoon_info = builder.cartoon_info;
            if (builder.lego_card == null) {
                this.lego_card = "";
            } else {
                this.lego_card = builder.lego_card;
            }
            this.high_together = builder.high_together;
            this.videoactive_info = builder.videoactive_info;
            if (builder.is_deal == null) {
                this.is_deal = DEFAULT_IS_DEAL;
            } else {
                this.is_deal = builder.is_deal;
            }
            this.deal_info = builder.deal_info;
            this.animation_info = builder.animation_info;
            this.skin_info = builder.skin_info;
            this.ps_info = builder.ps_info;
            this.book_chapter = builder.book_chapter;
            if (builder.is_book_chapter == null) {
                this.is_book_chapter = DEFAULT_IS_BOOK_CHAPTER;
            } else {
                this.is_book_chapter = builder.is_book_chapter;
            }
            if (builder.recom_source == null) {
                this.recom_source = "";
            } else {
                this.recom_source = builder.recom_source;
            }
            if (builder.recom_weight == null) {
                this.recom_weight = "";
            } else {
                this.recom_weight = builder.recom_weight;
            }
            if (builder.last_read_pid == null) {
                this.last_read_pid = DEFAULT_LAST_READ_PID;
            } else {
                this.last_read_pid = builder.last_read_pid;
            }
            if (builder.cheak_repeat == null) {
                this.cheak_repeat = DEFAULT_CHEAK_REPEAT;
            } else {
                this.cheak_repeat = builder.cheak_repeat;
            }
            if (builder.ab_tag == null) {
                this.ab_tag = "";
            } else {
                this.ab_tag = builder.ab_tag;
            }
            if (builder.recom_reason == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = builder.recom_reason;
            }
            this.video_ad_info = builder.video_ad_info;
            if (builder.rich_title == null) {
                this.rich_title = DEFAULT_RICH_TITLE;
            } else {
                this.rich_title = immutableCopyOf(builder.rich_title);
            }
            if (builder.rich_abstract == null) {
                this.rich_abstract = DEFAULT_RICH_ABSTRACT;
            } else {
                this.rich_abstract = immutableCopyOf(builder.rich_abstract);
            }
            this.ala_info = builder.ala_info;
            if (builder.is_operate_thread == null) {
                this.is_operate_thread = DEFAULT_IS_OPERATE_THREAD;
            } else {
                this.is_operate_thread = builder.is_operate_thread;
            }
            if (builder.is_tbread_dispatch == null) {
                this.is_tbread_dispatch = DEFAULT_IS_TBREAD_DISPATCH;
            } else {
                this.is_tbread_dispatch = builder.is_tbread_dispatch;
            }
            this.tbread_dispatch_info = builder.tbread_dispatch_info;
            this.app_info = builder.app_info;
            if (builder.report_info == null) {
                this.report_info = DEFAULT_REPORT_INFO;
            } else {
                this.report_info = immutableCopyOf(builder.report_info);
            }
            this.video_channel_info = builder.video_channel_info;
            if (builder.dislike_info == null) {
                this.dislike_info = DEFAULT_DISLIKE_INFO;
            } else {
                this.dislike_info = immutableCopyOf(builder.dislike_info);
            }
            if (builder.declare_list == null) {
                this.declare_list = DEFAULT_DECLARE_LIST;
            } else {
                this.declare_list = immutableCopyOf(builder.declare_list);
            }
            if (builder.multiple_forum_list == null) {
                this.multiple_forum_list = DEFAULT_MULTIPLE_FORUM_LIST;
            } else {
                this.multiple_forum_list = immutableCopyOf(builder.multiple_forum_list);
            }
            if (builder.is_multiforum_thread == null) {
                this.is_multiforum_thread = DEFAULT_IS_MULTIFORUM_THREAD;
            } else {
                this.is_multiforum_thread = builder.is_multiforum_thread;
            }
            if (builder.agree_num == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = builder.agree_num;
            }
            this.top_agree_post = builder.top_agree_post;
            this.agree = builder.agree;
            if (builder.is_partial_visible == null) {
                this.is_partial_visible = DEFAULT_IS_PARTIAL_VISIBLE;
            } else {
                this.is_partial_visible = builder.is_partial_visible;
            }
            if (builder.is_link_thread == null) {
                this.is_link_thread = DEFAULT_IS_LINK_THREAD;
            } else {
                this.is_link_thread = builder.is_link_thread;
            }
            this.link_info = builder.link_info;
            if (builder.freq_num == null) {
                this.freq_num = DEFAULT_FREQ_NUM;
            } else {
                this.freq_num = builder.freq_num;
            }
            if (builder.is_god == null) {
                this.is_god = DEFAULT_IS_GOD;
            } else {
                this.is_god = builder.is_god;
            }
            this.activity_info = builder.activity_info;
            this.pic_info = builder.pic_info;
            if (builder.is_story_audit == null) {
                this.is_story_audit = DEFAULT_IS_STORY_AUDIT;
            } else {
                this.is_story_audit = builder.is_story_audit;
            }
            if (builder.share_num == null) {
                this.share_num = DEFAULT_SHARE_NUM;
            } else {
                this.share_num = builder.share_num;
            }
            if (builder.is_called == null) {
                this.is_called = DEFAULT_IS_CALLED;
                return;
            } else {
                this.is_called = builder.is_called;
                return;
            }
        }
        this.id = builder.id;
        this.tid = builder.tid;
        this.title = builder.title;
        this.reply_num = builder.reply_num;
        this.view_num = builder.view_num;
        this.last_time = builder.last_time;
        this.last_time_int = builder.last_time_int;
        this.thread_types = builder.thread_types;
        this.is_top = builder.is_top;
        this.is_good = builder.is_good;
        this.is_vote = builder.is_vote;
        this.is_bakan = builder.is_bakan;
        this.is_protal = builder.is_protal;
        this.is_meizhi = builder.is_meizhi;
        this.is_voice_thread = builder.is_voice_thread;
        this.is_activity = builder.is_activity;
        this.is_notice = builder.is_notice;
        this.author = builder.author;
        this.last_replyer = builder.last_replyer;
        this.comment_num = builder.comment_num;
        this._abstract = immutableCopyOf(builder._abstract);
        this.media = immutableCopyOf(builder.media);
        this.voice_info = immutableCopyOf(builder.voice_info);
        this.meizhi_pic = builder.meizhi_pic;
        this.media_num = immutableCopyOf(builder.media_num);
        this.thread_type = builder.thread_type;
        this.fid = builder.fid;
        this.fname = builder.fname;
        this.live_post_type = builder.live_post_type;
        this.is_livepost = builder.is_livepost;
        this.show_commented = builder.show_commented;
        this.click_url = builder.click_url;
        this.video = builder.video;
        this.video_swf = builder.video_swf;
        this.video_cover = builder.video_cover;
        this.video_id = builder.video_id;
        this.video_mobile_url = builder.video_mobile_url;
        this.is_ntitle = builder.is_ntitle;
        this.is_bub = builder.is_bub;
        this.first_post_id = builder.first_post_id;
        this.zan = builder.zan;
        this.is_global_top = builder.is_global_top;
        this.is_pic = builder.is_pic;
        this.post_list = immutableCopyOf(builder.post_list);
        this.create_time = builder.create_time;
        this.repost_num = builder.repost_num;
        this.topic = builder.topic;
        this.has_commented = builder.has_commented;
        this.from = builder.from;
        this.collect_status = builder.collect_status;
        this.collect_mark_pid = builder.collect_mark_pid;
        this.post_id = builder.post_id;
        this.time = builder.time;
        this.is_membertop = builder.is_membertop;
        this.anchor_info = builder.anchor_info;
        this.author_id = builder.author_id;
        this.valid_post_num = builder.valid_post_num;
        this.isLzDeleteAll = builder.isLzDeleteAll;
        this.is_ad = builder.is_ad;
        this.ecom = builder.ecom;
        this.pids = builder.pids;
        this.location = builder.location;
        this.guess = builder.guess;
        this.timeline = builder.timeline;
        this.act_info = immutableCopyOf(builder.act_info);
        this.hot_weight = builder.hot_weight;
        this.livecover_src = builder.livecover_src;
        this.storecount = builder.storecount;
        this.post_num = builder.post_num;
        this.hotTWInfo = builder.hotTWInfo;
        this.twzhibo_info = builder.twzhibo_info;
        this.category_name = builder.category_name;
        this.poll_info = builder.poll_info;
        this.jid = builder.jid;
        this.is_novel = builder.is_novel;
        this.is_novel_thank = builder.is_novel_thank;
        this.is_novel_reward = builder.is_novel_reward;
        this.video_info = builder.video_info;
        this.push_end_time = builder.push_end_time;
        this.is_copythread = builder.is_copythread;
        this.operator_flag = builder.operator_flag;
        this.task_info = builder.task_info;
        this.pic_num = builder.pic_num;
        this.is_godthread_recommend = builder.is_godthread_recommend;
        this.yule_post_activity = builder.yule_post_activity;
        this.app_code = builder.app_code;
        this.ext_tails = immutableCopyOf(builder.ext_tails);
        this.push_status = builder.push_status;
        this.cartoon_info = builder.cartoon_info;
        this.lego_card = builder.lego_card;
        this.high_together = builder.high_together;
        this.videoactive_info = builder.videoactive_info;
        this.is_deal = builder.is_deal;
        this.deal_info = builder.deal_info;
        this.animation_info = builder.animation_info;
        this.skin_info = builder.skin_info;
        this.ps_info = builder.ps_info;
        this.book_chapter = builder.book_chapter;
        this.is_book_chapter = builder.is_book_chapter;
        this.recom_source = builder.recom_source;
        this.recom_weight = builder.recom_weight;
        this.last_read_pid = builder.last_read_pid;
        this.cheak_repeat = builder.cheak_repeat;
        this.ab_tag = builder.ab_tag;
        this.recom_reason = builder.recom_reason;
        this.video_ad_info = builder.video_ad_info;
        this.rich_title = immutableCopyOf(builder.rich_title);
        this.rich_abstract = immutableCopyOf(builder.rich_abstract);
        this.ala_info = builder.ala_info;
        this.is_operate_thread = builder.is_operate_thread;
        this.is_tbread_dispatch = builder.is_tbread_dispatch;
        this.tbread_dispatch_info = builder.tbread_dispatch_info;
        this.app_info = builder.app_info;
        this.report_info = immutableCopyOf(builder.report_info);
        this.video_channel_info = builder.video_channel_info;
        this.dislike_info = immutableCopyOf(builder.dislike_info);
        this.declare_list = immutableCopyOf(builder.declare_list);
        this.multiple_forum_list = immutableCopyOf(builder.multiple_forum_list);
        this.is_multiforum_thread = builder.is_multiforum_thread;
        this.agree_num = builder.agree_num;
        this.top_agree_post = builder.top_agree_post;
        this.agree = builder.agree;
        this.is_partial_visible = builder.is_partial_visible;
        this.is_link_thread = builder.is_link_thread;
        this.link_info = builder.link_info;
        this.freq_num = builder.freq_num;
        this.is_god = builder.is_god;
        this.activity_info = builder.activity_info;
        this.pic_info = builder.pic_info;
        this.is_story_audit = builder.is_story_audit;
        this.share_num = builder.share_num;
        this.is_called = builder.is_called;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThreadInfo> {
        public List<Abstract> _abstract;
        public String ab_tag;
        public List<ActInfo> act_info;
        public ActivityInfo activity_info;
        public Agree agree;
        public Integer agree_num;
        public AlaLiveInfo ala_info;
        public AnchorInfo anchor_info;
        public AnimationThread animation_info;
        public AppCode app_code;
        public AppInfo app_info;
        public User author;
        public Long author_id;
        public BookThread book_chapter;
        public CartoonThread cartoon_info;
        public String category_name;
        public Integer cheak_repeat;
        public String click_url;
        public String collect_mark_pid;
        public Integer collect_status;
        public Integer comment_num;
        public Integer create_time;
        public DealInfo deal_info;
        public List<DeclareInfo> declare_list;
        public List<DislikeInfo> dislike_info;
        public String ecom;
        public List<TailInfo> ext_tails;
        public Long fid;
        public Long first_post_id;
        public String fname;
        public Long freq_num;
        public String from;
        public Guess guess;
        public Integer has_commented;
        public TogetherHi high_together;
        public HotTWThreadInfo hotTWInfo;
        public Integer hot_weight;
        public Long id;
        public Integer isLzDeleteAll;
        public Integer is_activity;
        public Integer is_ad;
        public Integer is_bakan;
        public Integer is_book_chapter;
        public Integer is_bub;
        public Integer is_called;
        public Integer is_copythread;
        public Integer is_deal;
        public Integer is_global_top;
        public Integer is_god;
        public Integer is_godthread_recommend;
        public Integer is_good;
        public Integer is_link_thread;
        public Integer is_livepost;
        public Integer is_meizhi;
        public Integer is_membertop;
        public Integer is_multiforum_thread;
        public Integer is_notice;
        public Integer is_novel;
        public Integer is_novel_reward;
        public Integer is_novel_thank;
        public Integer is_ntitle;
        public Integer is_operate_thread;
        public Integer is_partial_visible;
        public Integer is_pic;
        public Integer is_protal;
        public Integer is_story_audit;
        public Integer is_tbread_dispatch;
        public Integer is_top;
        public Integer is_voice_thread;
        public Integer is_vote;
        public JNews jid;
        public Long last_read_pid;
        public User last_replyer;
        public String last_time;
        public Integer last_time_int;
        public String lego_card;
        public LinkThreadInfo link_info;
        public String live_post_type;
        public String livecover_src;
        public Lbs location;
        public List<Media> media;
        public List<MediaNum> media_num;
        public String meizhi_pic;
        public List<MultipleForum> multiple_forum_list;
        public Integer operator_flag;
        public Media pic_info;
        public Integer pic_num;
        public String pids;
        public PollInfo poll_info;
        public Long post_id;
        public List<PostList> post_list;
        public Integer post_num;
        public PsInfo ps_info;
        public Integer push_end_time;
        public PushStatus push_status;
        public String recom_reason;
        public String recom_source;
        public String recom_weight;
        public Integer reply_num;
        public List<ReportInfo> report_info;
        public Integer repost_num;
        public List<PbContent> rich_abstract;
        public List<PbContent> rich_title;
        public Long share_num;
        public Integer show_commented;
        public SkinInfo skin_info;
        public Integer storecount;
        public TaskInfo task_info;
        public TbreadDispatch tbread_dispatch_info;
        public Integer thread_type;
        public Integer thread_types;
        public Long tid;
        public Integer time;
        public Integer timeline;
        public String title;
        public Post top_agree_post;
        public Topic topic;
        public ZhiBoInfoTW twzhibo_info;
        public Integer valid_post_num;
        public String video;
        public AdInfo video_ad_info;
        public VideoChannelInfo video_channel_info;
        public String video_cover;
        public String video_id;
        public VideoInfo video_info;
        public String video_mobile_url;
        public String video_swf;
        public VideoActive videoactive_info;
        public Integer view_num;
        public List<Voice> voice_info;
        public YulePostActivity yule_post_activity;
        public Zan zan;

        public Builder() {
        }

        public Builder(ThreadInfo threadInfo) {
            super(threadInfo);
            if (threadInfo != null) {
                this.id = threadInfo.id;
                this.tid = threadInfo.tid;
                this.title = threadInfo.title;
                this.reply_num = threadInfo.reply_num;
                this.view_num = threadInfo.view_num;
                this.last_time = threadInfo.last_time;
                this.last_time_int = threadInfo.last_time_int;
                this.thread_types = threadInfo.thread_types;
                this.is_top = threadInfo.is_top;
                this.is_good = threadInfo.is_good;
                this.is_vote = threadInfo.is_vote;
                this.is_bakan = threadInfo.is_bakan;
                this.is_protal = threadInfo.is_protal;
                this.is_meizhi = threadInfo.is_meizhi;
                this.is_voice_thread = threadInfo.is_voice_thread;
                this.is_activity = threadInfo.is_activity;
                this.is_notice = threadInfo.is_notice;
                this.author = threadInfo.author;
                this.last_replyer = threadInfo.last_replyer;
                this.comment_num = threadInfo.comment_num;
                this._abstract = ThreadInfo.copyOf(threadInfo._abstract);
                this.media = ThreadInfo.copyOf(threadInfo.media);
                this.voice_info = ThreadInfo.copyOf(threadInfo.voice_info);
                this.meizhi_pic = threadInfo.meizhi_pic;
                this.media_num = ThreadInfo.copyOf(threadInfo.media_num);
                this.thread_type = threadInfo.thread_type;
                this.fid = threadInfo.fid;
                this.fname = threadInfo.fname;
                this.live_post_type = threadInfo.live_post_type;
                this.is_livepost = threadInfo.is_livepost;
                this.show_commented = threadInfo.show_commented;
                this.click_url = threadInfo.click_url;
                this.video = threadInfo.video;
                this.video_swf = threadInfo.video_swf;
                this.video_cover = threadInfo.video_cover;
                this.video_id = threadInfo.video_id;
                this.video_mobile_url = threadInfo.video_mobile_url;
                this.is_ntitle = threadInfo.is_ntitle;
                this.is_bub = threadInfo.is_bub;
                this.first_post_id = threadInfo.first_post_id;
                this.zan = threadInfo.zan;
                this.is_global_top = threadInfo.is_global_top;
                this.is_pic = threadInfo.is_pic;
                this.post_list = ThreadInfo.copyOf(threadInfo.post_list);
                this.create_time = threadInfo.create_time;
                this.repost_num = threadInfo.repost_num;
                this.topic = threadInfo.topic;
                this.has_commented = threadInfo.has_commented;
                this.from = threadInfo.from;
                this.collect_status = threadInfo.collect_status;
                this.collect_mark_pid = threadInfo.collect_mark_pid;
                this.post_id = threadInfo.post_id;
                this.time = threadInfo.time;
                this.is_membertop = threadInfo.is_membertop;
                this.anchor_info = threadInfo.anchor_info;
                this.author_id = threadInfo.author_id;
                this.valid_post_num = threadInfo.valid_post_num;
                this.isLzDeleteAll = threadInfo.isLzDeleteAll;
                this.is_ad = threadInfo.is_ad;
                this.ecom = threadInfo.ecom;
                this.pids = threadInfo.pids;
                this.location = threadInfo.location;
                this.guess = threadInfo.guess;
                this.timeline = threadInfo.timeline;
                this.act_info = ThreadInfo.copyOf(threadInfo.act_info);
                this.hot_weight = threadInfo.hot_weight;
                this.livecover_src = threadInfo.livecover_src;
                this.storecount = threadInfo.storecount;
                this.post_num = threadInfo.post_num;
                this.hotTWInfo = threadInfo.hotTWInfo;
                this.twzhibo_info = threadInfo.twzhibo_info;
                this.category_name = threadInfo.category_name;
                this.poll_info = threadInfo.poll_info;
                this.jid = threadInfo.jid;
                this.is_novel = threadInfo.is_novel;
                this.is_novel_thank = threadInfo.is_novel_thank;
                this.is_novel_reward = threadInfo.is_novel_reward;
                this.video_info = threadInfo.video_info;
                this.push_end_time = threadInfo.push_end_time;
                this.is_copythread = threadInfo.is_copythread;
                this.operator_flag = threadInfo.operator_flag;
                this.task_info = threadInfo.task_info;
                this.pic_num = threadInfo.pic_num;
                this.is_godthread_recommend = threadInfo.is_godthread_recommend;
                this.yule_post_activity = threadInfo.yule_post_activity;
                this.app_code = threadInfo.app_code;
                this.ext_tails = ThreadInfo.copyOf(threadInfo.ext_tails);
                this.push_status = threadInfo.push_status;
                this.cartoon_info = threadInfo.cartoon_info;
                this.lego_card = threadInfo.lego_card;
                this.high_together = threadInfo.high_together;
                this.videoactive_info = threadInfo.videoactive_info;
                this.is_deal = threadInfo.is_deal;
                this.deal_info = threadInfo.deal_info;
                this.animation_info = threadInfo.animation_info;
                this.skin_info = threadInfo.skin_info;
                this.ps_info = threadInfo.ps_info;
                this.book_chapter = threadInfo.book_chapter;
                this.is_book_chapter = threadInfo.is_book_chapter;
                this.recom_source = threadInfo.recom_source;
                this.recom_weight = threadInfo.recom_weight;
                this.last_read_pid = threadInfo.last_read_pid;
                this.cheak_repeat = threadInfo.cheak_repeat;
                this.ab_tag = threadInfo.ab_tag;
                this.recom_reason = threadInfo.recom_reason;
                this.video_ad_info = threadInfo.video_ad_info;
                this.rich_title = ThreadInfo.copyOf(threadInfo.rich_title);
                this.rich_abstract = ThreadInfo.copyOf(threadInfo.rich_abstract);
                this.ala_info = threadInfo.ala_info;
                this.is_operate_thread = threadInfo.is_operate_thread;
                this.is_tbread_dispatch = threadInfo.is_tbread_dispatch;
                this.tbread_dispatch_info = threadInfo.tbread_dispatch_info;
                this.app_info = threadInfo.app_info;
                this.report_info = ThreadInfo.copyOf(threadInfo.report_info);
                this.video_channel_info = threadInfo.video_channel_info;
                this.dislike_info = ThreadInfo.copyOf(threadInfo.dislike_info);
                this.declare_list = ThreadInfo.copyOf(threadInfo.declare_list);
                this.multiple_forum_list = ThreadInfo.copyOf(threadInfo.multiple_forum_list);
                this.is_multiforum_thread = threadInfo.is_multiforum_thread;
                this.agree_num = threadInfo.agree_num;
                this.top_agree_post = threadInfo.top_agree_post;
                this.agree = threadInfo.agree;
                this.is_partial_visible = threadInfo.is_partial_visible;
                this.is_link_thread = threadInfo.is_link_thread;
                this.link_info = threadInfo.link_info;
                this.freq_num = threadInfo.freq_num;
                this.is_god = threadInfo.is_god;
                this.activity_info = threadInfo.activity_info;
                this.pic_info = threadInfo.pic_info;
                this.is_story_audit = threadInfo.is_story_audit;
                this.share_num = threadInfo.share_num;
                this.is_called = threadInfo.is_called;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadInfo build(boolean z) {
            return new ThreadInfo(this, z);
        }
    }
}
