package tbclient;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.baidu.sapi2.SapiAccountManager;
import com.baidu.tbadk.TbConfig;
import com.baidu.tbadk.TbadkApplication;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ThreadInfo extends Message {
    public static final String DEFAULT_CLICK_URL = "";
    public static final String DEFAULT_COLLECT_MARK_PID = "";
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_FROM = "";
    public static final String DEFAULT_LAST_TIME = "";
    public static final String DEFAULT_LIVE_POST_TYPE = "";
    public static final String DEFAULT_MEIZHI_PIC = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VIDEO = "";
    public static final String DEFAULT_VIDEO_COVER = "";
    public static final String DEFAULT_VIDEO_ID = "";
    public static final String DEFAULT_VIDEO_MOBILE_URL = "";
    public static final String DEFAULT_VIDEO_SWF = "";
    @ProtoField(label = Message.Label.REPEATED, tag = TbConfig.NOTIFY_LIVE_NOTIFY)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 55)
    public final AnchorInfo anchor_info;
    @ProtoField(tag = 18)
    public final User author;
    @ProtoField(tag = 56, type = Message.Datatype.INT32)
    public final Integer author_id;
    @ProtoField(tag = AccessibilityNodeInfoCompat.ACTION_LONG_CLICK, type = Message.Datatype.STRING)
    public final String click_url;
    @ProtoField(tag = 51, type = Message.Datatype.STRING)
    public final String collect_mark_pid;
    @ProtoField(tag = TbadkApplication.MEMORY_FOURM_COUNT, type = Message.Datatype.INT32)
    public final Integer collect_status;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer comment_num;
    @ProtoField(tag = TbConfig.VIEW_IMAGE_QUALITY_LOW_VALUE, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 27, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 40, type = Message.Datatype.INT64)
    public final Long first_post_id;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 49, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 48, type = Message.Datatype.INT32)
    public final Integer has_commented;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_activity;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_bakan;
    @ProtoField(tag = 39, type = Message.Datatype.INT32)
    public final Integer is_bub;
    @ProtoField(tag = 42, type = Message.Datatype.INT32)
    public final Integer is_global_top;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_good;
    @ProtoField(tag = TbConfig.MAX_PRELOAD_PHOTO_NUM, type = Message.Datatype.INT32)
    public final Integer is_livepost;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_meizhi;
    @ProtoField(tag = 54, type = Message.Datatype.INT32)
    public final Integer is_membertop;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer is_notice;
    @ProtoField(tag = 38, type = Message.Datatype.INT32)
    public final Integer is_ntitle;
    @ProtoField(tag = 43, type = Message.Datatype.INT32)
    public final Integer is_pic;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer is_protal;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_top;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_voice_thread;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_vote;
    @ProtoField(tag = 19)
    public final User last_replyer;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String last_time;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer last_time_int;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String live_post_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<Media> media;
    @ProtoField(label = Message.Label.REPEATED, tag = 25)
    public final List<MediaNum> media_num;
    @ProtoField(tag = SapiAccountManager.VERSION_CODE, type = Message.Datatype.STRING)
    public final String meizhi_pic;
    @ProtoField(tag = 52, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 44)
    public final List<PostList> post_list;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer reply_num;
    @ProtoField(tag = 46, type = Message.Datatype.INT32)
    public final Integer repost_num;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer show_commented;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer thread_types;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 53, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 47)
    public final Topic topic;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String video;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String video_cover;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String video_id;
    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String video_mobile_url;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String video_swf;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer view_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Voice> voice_info;
    @ProtoField(tag = 41)
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
    public static final Integer DEFAULT_AUTHOR_ID = 0;

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
                return;
            } else {
                this.author_id = builder.author_id;
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
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ThreadInfo> {
        public List<Abstract> _abstract;
        public AnchorInfo anchor_info;
        public User author;
        public Integer author_id;
        public String click_url;
        public String collect_mark_pid;
        public Integer collect_status;
        public Integer comment_num;
        public Integer create_time;
        public Long fid;
        public Long first_post_id;
        public String fname;
        public String from;
        public Integer has_commented;
        public Long id;
        public Integer is_activity;
        public Integer is_bakan;
        public Integer is_bub;
        public Integer is_global_top;
        public Integer is_good;
        public Integer is_livepost;
        public Integer is_meizhi;
        public Integer is_membertop;
        public Integer is_notice;
        public Integer is_ntitle;
        public Integer is_pic;
        public Integer is_protal;
        public Integer is_top;
        public Integer is_voice_thread;
        public Integer is_vote;
        public User last_replyer;
        public String last_time;
        public Integer last_time_int;
        public String live_post_type;
        public List<Media> media;
        public List<MediaNum> media_num;
        public String meizhi_pic;
        public Long post_id;
        public List<PostList> post_list;
        public Integer reply_num;
        public Integer repost_num;
        public Integer show_commented;
        public Integer thread_type;
        public Integer thread_types;
        public Long tid;
        public Integer time;
        public String title;
        public Topic topic;
        public String video;
        public String video_cover;
        public String video_id;
        public String video_mobile_url;
        public String video_swf;
        public Integer view_num;
        public List<Voice> voice_info;
        public Zan zan;

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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadInfo build(boolean z) {
            return new ThreadInfo(this, z, null);
        }
    }
}
