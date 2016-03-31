package tbclient;

import com.baidu.location.BDLocation;
import com.baidu.location.a0;
import com.baidu.tbadk.TbConfig;
import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ThreadInfo extends Message {
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final String DEFAULT_CLICK_URL = "";
    public static final String DEFAULT_COLLECT_MARK_PID = "";
    public static final String DEFAULT_ECOM = "";
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_FROM = "";
    public static final String DEFAULT_LAST_TIME = "";
    public static final String DEFAULT_LIVECOVER_SRC = "";
    public static final String DEFAULT_LIVE_POST_TYPE = "";
    public static final String DEFAULT_MEIZHI_PIC = "";
    public static final String DEFAULT_PIDS = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VIDEO = "";
    public static final String DEFAULT_VIDEO_COVER = "";
    public static final String DEFAULT_VIDEO_ID = "";
    public static final String DEFAULT_VIDEO_MOBILE_URL = "";
    public static final String DEFAULT_VIDEO_SWF = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 21)
    public final List<Abstract> _abstract;
    @ProtoField(label = Message.Label.REPEATED, tag = 65)
    public final List<ActInfo> act_info;
    @ProtoField(tag = a0.B)
    public final AnchorInfo anchor_info;
    @ProtoField(tag = 89)
    public final AppCode app_code;
    @ProtoField(tag = 18)
    public final User author;
    @ProtoField(tag = a0.z, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = a0.f39try)
    public final CartoonThread cartoon_info;
    @ProtoField(tag = 73, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String click_url;
    @ProtoField(tag = a0.C, type = Message.Datatype.STRING)
    public final String collect_mark_pid;
    @ProtoField(tag = 50, type = Message.Datatype.INT32)
    public final Integer collect_status;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer comment_num;
    @ProtoField(tag = TbConfig.VIEW_IMAGE_QUALITY_LOW_VALUE, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 60, type = Message.Datatype.STRING)
    public final String ecom;
    @ProtoField(label = Message.Label.REPEATED, tag = 90)
    public final List<TailInfo> ext_tails;
    @ProtoField(tag = 27, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 40, type = Message.Datatype.INT64)
    public final Long first_post_id;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 49, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 63)
    public final Guess guess;
    @ProtoField(tag = 48, type = Message.Datatype.INT32)
    public final Integer has_commented;
    @ProtoField(tag = a0.w)
    public final HotTWThreadInfo hotTWInfo;
    @ProtoField(tag = BDLocation.TypeOffLineLocation, type = Message.Datatype.INT32)
    public final Integer hot_weight;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 58, type = Message.Datatype.UINT32)
    public final Integer isLzDeleteAll;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_activity;
    @ProtoField(tag = 59, type = Message.Datatype.UINT32)
    public final Integer is_ad;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_bakan;
    @ProtoField(tag = 39, type = Message.Datatype.INT32)
    public final Integer is_bub;
    @ProtoField(tag = a0.y, type = Message.Datatype.UINT32)
    public final Integer is_copythread;
    @ProtoField(tag = a0.e, type = Message.Datatype.INT32)
    public final Integer is_global_top;
    @ProtoField(tag = 85, type = Message.Datatype.INT32)
    public final Integer is_godthread_recommend;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_good;
    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer is_livepost;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_meizhi;
    @ProtoField(tag = a0.A, type = Message.Datatype.INT32)
    public final Integer is_membertop;
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
    @ProtoField(tag = a0.f29case, type = Message.Datatype.INT32)
    public final Integer is_pic;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer is_protal;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_top;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_voice_thread;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_vote;
    @ProtoField(tag = 75)
    public final JNews jid;
    @ProtoField(tag = 19)
    public final User last_replyer;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String last_time;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer last_time_int;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_PUSH_RECOMMEND_PB, type = Message.Datatype.STRING)
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
    @ProtoField(tag = 82, type = Message.Datatype.UINT32)
    public final Integer operator_flag;
    @ProtoField(tag = 84, type = Message.Datatype.UINT32)
    public final Integer pic_num;
    @ProtoField(tag = 61, type = Message.Datatype.STRING)
    public final String pids;
    @ProtoField(tag = 74)
    public final PollInfo poll_info;
    @ProtoField(tag = a0.f, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 44)
    public final List<PostList> post_list;
    @ProtoField(tag = 69, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 80, type = Message.Datatype.INT32)
    public final Integer push_end_time;
    @ProtoField(tag = a0.v)
    public final PushStatus push_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer reply_num;
    @ProtoField(tag = 46, type = Message.Datatype.INT32)
    public final Integer repost_num;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer show_commented;
    @ProtoField(tag = BDLocation.TypeOffLineLocationNetworkFail, type = Message.Datatype.INT32)
    public final Integer storecount;
    @ProtoField(tag = 83)
    public final TaskInfo task_info;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer thread_types;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = a0.D, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 64, type = Message.Datatype.UINT32)
    public final Integer timeline;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 47)
    public final Topic topic;
    @ProtoField(tag = 72)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = a0.m, type = Message.Datatype.UINT32)
    public final Integer valid_post_num;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_MY_COLLECT_UPDATE, type = Message.Datatype.STRING)
    public final String video;
    @ProtoField(tag = TbConfig.FRS_NOABSTRACT_ITEM_NUMBER, type = Message.Datatype.STRING)
    public final String video_cover;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String video_id;
    @ProtoField(tag = 79)
    public final VideoInfo video_info;
    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String video_mobile_url;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String video_swf;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer view_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Voice> voice_info;
    @ProtoField(tag = 88)
    public final YulePostActivity yule_post_activity;
    @ProtoField(tag = a0.x)
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

    /* synthetic */ ThreadInfo(Builder builder, boolean z, ThreadInfo threadInfo) {
        this(builder, z);
    }

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
            return;
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
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThreadInfo> {
        public List<Abstract> _abstract;
        public List<ActInfo> act_info;
        public AnchorInfo anchor_info;
        public AppCode app_code;
        public User author;
        public Long author_id;
        public CartoonThread cartoon_info;
        public String category_name;
        public String click_url;
        public String collect_mark_pid;
        public Integer collect_status;
        public Integer comment_num;
        public Integer create_time;
        public String ecom;
        public List<TailInfo> ext_tails;
        public Long fid;
        public Long first_post_id;
        public String fname;
        public String from;
        public Guess guess;
        public Integer has_commented;
        public HotTWThreadInfo hotTWInfo;
        public Integer hot_weight;
        public Long id;
        public Integer isLzDeleteAll;
        public Integer is_activity;
        public Integer is_ad;
        public Integer is_bakan;
        public Integer is_bub;
        public Integer is_copythread;
        public Integer is_global_top;
        public Integer is_godthread_recommend;
        public Integer is_good;
        public Integer is_livepost;
        public Integer is_meizhi;
        public Integer is_membertop;
        public Integer is_notice;
        public Integer is_novel;
        public Integer is_novel_reward;
        public Integer is_novel_thank;
        public Integer is_ntitle;
        public Integer is_pic;
        public Integer is_protal;
        public Integer is_top;
        public Integer is_voice_thread;
        public Integer is_vote;
        public JNews jid;
        public User last_replyer;
        public String last_time;
        public Integer last_time_int;
        public String live_post_type;
        public String livecover_src;
        public Lbs location;
        public List<Media> media;
        public List<MediaNum> media_num;
        public String meizhi_pic;
        public Integer operator_flag;
        public Integer pic_num;
        public String pids;
        public PollInfo poll_info;
        public Long post_id;
        public List<PostList> post_list;
        public Integer post_num;
        public Integer push_end_time;
        public PushStatus push_status;
        public Integer reply_num;
        public Integer repost_num;
        public Integer show_commented;
        public Integer storecount;
        public TaskInfo task_info;
        public Integer thread_type;
        public Integer thread_types;
        public Long tid;
        public Integer time;
        public Integer timeline;
        public String title;
        public Topic topic;
        public ZhiBoInfoTW twzhibo_info;
        public Integer valid_post_num;
        public String video;
        public String video_cover;
        public String video_id;
        public VideoInfo video_info;
        public String video_mobile_url;
        public String video_swf;
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadInfo build(boolean z) {
            return new ThreadInfo(this, z, null);
        }
    }
}
