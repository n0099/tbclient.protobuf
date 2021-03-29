package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class Thread_Info extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final Integer DEFAULT_COMMENT_NUM;
    public static final Integer DEFAULT_HOTCOUNT;
    public static final Boolean DEFAULT_IS_BAKAN;
    public static final Boolean DEFAULT_IS_GOOD;
    public static final Boolean DEFAULT_IS_HASTITLE;
    public static final Integer DEFAULT_IS_NOTICE;
    public static final Boolean DEFAULT_IS_NOTITLE;
    public static final Boolean DEFAULT_IS_PIC;
    public static final Boolean DEFAULT_IS_PROTAL;
    public static final Boolean DEFAULT_IS_TOP;
    public static final Boolean DEFAULT_IS_VOICE_THREAD;
    public static final Boolean DEFAULT_IS_VOTE;
    public static final String DEFAULT_LAST_TIME = "";
    public static final List<Media> DEFAULT_MEDIA;
    public static final List<Media_Num> DEFAULT_MEDIA_NUM;
    public static final Integer DEFAULT_OTHER_TYPES;
    public static final Integer DEFAULT_THREAD_TYPE;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TITLE_LINK = "";
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer comment_num;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer hotcount;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean is_bakan;
    @ProtoField(tag = 8, type = Message.Datatype.BOOL)
    public final Boolean is_good;
    @ProtoField(tag = 14, type = Message.Datatype.BOOL)
    public final Boolean is_hastitle;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_notice;
    @ProtoField(tag = 13, type = Message.Datatype.BOOL)
    public final Boolean is_notitle;
    @ProtoField(tag = 12, type = Message.Datatype.BOOL)
    public final Boolean is_pic;
    @ProtoField(tag = 11, type = Message.Datatype.BOOL)
    public final Boolean is_protal;
    @ProtoField(tag = 7, type = Message.Datatype.BOOL)
    public final Boolean is_top;
    @ProtoField(tag = 15, type = Message.Datatype.BOOL)
    public final Boolean is_voice_thread;
    @ProtoField(tag = 9, type = Message.Datatype.BOOL)
    public final Boolean is_vote;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String last_time;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer last_time_int;
    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<Media> media;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Media_Num> media_num;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer other_types;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer reply_num;
    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String title_link;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer view_num;
    @ProtoField(tag = 25)
    public final Voice_Info voice_info;
    @ProtoField(tag = 26)
    public final Zan zan;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Integer DEFAULT_VIEW_NUM = 0;
    public static final Integer DEFAULT_LAST_TIME_INT = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Thread_Info> {
        public String _abstract;
        public Integer comment_num;
        public Integer hotcount;
        public Long id;
        public Boolean is_bakan;
        public Boolean is_good;
        public Boolean is_hastitle;
        public Integer is_notice;
        public Boolean is_notitle;
        public Boolean is_pic;
        public Boolean is_protal;
        public Boolean is_top;
        public Boolean is_voice_thread;
        public Boolean is_vote;
        public String last_time;
        public Integer last_time_int;
        public List<Media> media;
        public List<Media_Num> media_num;
        public Integer other_types;
        public Integer reply_num;
        public Integer thread_type;
        public String title;
        public String title_link;
        public Integer view_num;
        public Voice_Info voice_info;
        public Zan zan;

        public Builder() {
        }

        public Builder(Thread_Info thread_Info) {
            super(thread_Info);
            if (thread_Info == null) {
                return;
            }
            this.id = thread_Info.id;
            this.title = thread_Info.title;
            this.reply_num = thread_Info.reply_num;
            this.view_num = thread_Info.view_num;
            this.last_time = thread_Info.last_time;
            this.last_time_int = thread_Info.last_time_int;
            this.is_top = thread_Info.is_top;
            this.is_good = thread_Info.is_good;
            this.is_vote = thread_Info.is_vote;
            this.is_bakan = thread_Info.is_bakan;
            this.is_protal = thread_Info.is_protal;
            this.is_pic = thread_Info.is_pic;
            this.is_notitle = thread_Info.is_notitle;
            this.is_hastitle = thread_Info.is_hastitle;
            this.is_voice_thread = thread_Info.is_voice_thread;
            this.is_notice = thread_Info.is_notice;
            this.title_link = thread_Info.title_link;
            this.other_types = thread_Info.other_types;
            this.comment_num = thread_Info.comment_num;
            this.hotcount = thread_Info.hotcount;
            this._abstract = thread_Info._abstract;
            this.media = Message.copyOf(thread_Info.media);
            this.media_num = Message.copyOf(thread_Info.media_num);
            this.thread_type = thread_Info.thread_type;
            this.voice_info = thread_Info.voice_info;
            this.zan = thread_Info.zan;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Thread_Info build(boolean z) {
            return new Thread_Info(this, z);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_TOP = bool;
        DEFAULT_IS_GOOD = bool;
        DEFAULT_IS_VOTE = bool;
        DEFAULT_IS_BAKAN = bool;
        DEFAULT_IS_PROTAL = bool;
        DEFAULT_IS_PIC = bool;
        DEFAULT_IS_NOTITLE = bool;
        DEFAULT_IS_HASTITLE = bool;
        DEFAULT_IS_VOICE_THREAD = bool;
        DEFAULT_IS_NOTICE = 0;
        DEFAULT_OTHER_TYPES = 0;
        DEFAULT_COMMENT_NUM = 0;
        DEFAULT_HOTCOUNT = 0;
        DEFAULT_MEDIA = Collections.emptyList();
        DEFAULT_MEDIA_NUM = Collections.emptyList();
        DEFAULT_THREAD_TYPE = 0;
    }

    public Thread_Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.reply_num;
            if (num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num;
            }
            Integer num2 = builder.view_num;
            if (num2 == null) {
                this.view_num = DEFAULT_VIEW_NUM;
            } else {
                this.view_num = num2;
            }
            String str2 = builder.last_time;
            if (str2 == null) {
                this.last_time = "";
            } else {
                this.last_time = str2;
            }
            Integer num3 = builder.last_time_int;
            if (num3 == null) {
                this.last_time_int = DEFAULT_LAST_TIME_INT;
            } else {
                this.last_time_int = num3;
            }
            Boolean bool = builder.is_top;
            if (bool == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = bool;
            }
            Boolean bool2 = builder.is_good;
            if (bool2 == null) {
                this.is_good = DEFAULT_IS_GOOD;
            } else {
                this.is_good = bool2;
            }
            Boolean bool3 = builder.is_vote;
            if (bool3 == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = bool3;
            }
            Boolean bool4 = builder.is_bakan;
            if (bool4 == null) {
                this.is_bakan = DEFAULT_IS_BAKAN;
            } else {
                this.is_bakan = bool4;
            }
            Boolean bool5 = builder.is_protal;
            if (bool5 == null) {
                this.is_protal = DEFAULT_IS_PROTAL;
            } else {
                this.is_protal = bool5;
            }
            Boolean bool6 = builder.is_pic;
            if (bool6 == null) {
                this.is_pic = DEFAULT_IS_PIC;
            } else {
                this.is_pic = bool6;
            }
            Boolean bool7 = builder.is_notitle;
            if (bool7 == null) {
                this.is_notitle = DEFAULT_IS_NOTITLE;
            } else {
                this.is_notitle = bool7;
            }
            Boolean bool8 = builder.is_hastitle;
            if (bool8 == null) {
                this.is_hastitle = DEFAULT_IS_HASTITLE;
            } else {
                this.is_hastitle = bool8;
            }
            Boolean bool9 = builder.is_voice_thread;
            if (bool9 == null) {
                this.is_voice_thread = DEFAULT_IS_VOICE_THREAD;
            } else {
                this.is_voice_thread = bool9;
            }
            Integer num4 = builder.is_notice;
            if (num4 == null) {
                this.is_notice = DEFAULT_IS_NOTICE;
            } else {
                this.is_notice = num4;
            }
            String str3 = builder.title_link;
            if (str3 == null) {
                this.title_link = "";
            } else {
                this.title_link = str3;
            }
            Integer num5 = builder.other_types;
            if (num5 == null) {
                this.other_types = DEFAULT_OTHER_TYPES;
            } else {
                this.other_types = num5;
            }
            Integer num6 = builder.comment_num;
            if (num6 == null) {
                this.comment_num = DEFAULT_COMMENT_NUM;
            } else {
                this.comment_num = num6;
            }
            Integer num7 = builder.hotcount;
            if (num7 == null) {
                this.hotcount = DEFAULT_HOTCOUNT;
            } else {
                this.hotcount = num7;
            }
            String str4 = builder._abstract;
            if (str4 == null) {
                this._abstract = "";
            } else {
                this._abstract = str4;
            }
            List<Media> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list);
            }
            List<Media_Num> list2 = builder.media_num;
            if (list2 == null) {
                this.media_num = DEFAULT_MEDIA_NUM;
            } else {
                this.media_num = Message.immutableCopyOf(list2);
            }
            Integer num8 = builder.thread_type;
            if (num8 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num8;
            }
            this.voice_info = builder.voice_info;
            this.zan = builder.zan;
            return;
        }
        this.id = builder.id;
        this.title = builder.title;
        this.reply_num = builder.reply_num;
        this.view_num = builder.view_num;
        this.last_time = builder.last_time;
        this.last_time_int = builder.last_time_int;
        this.is_top = builder.is_top;
        this.is_good = builder.is_good;
        this.is_vote = builder.is_vote;
        this.is_bakan = builder.is_bakan;
        this.is_protal = builder.is_protal;
        this.is_pic = builder.is_pic;
        this.is_notitle = builder.is_notitle;
        this.is_hastitle = builder.is_hastitle;
        this.is_voice_thread = builder.is_voice_thread;
        this.is_notice = builder.is_notice;
        this.title_link = builder.title_link;
        this.other_types = builder.other_types;
        this.comment_num = builder.comment_num;
        this.hotcount = builder.hotcount;
        this._abstract = builder._abstract;
        this.media = Message.immutableCopyOf(builder.media);
        this.media_num = Message.immutableCopyOf(builder.media_num);
        this.thread_type = builder.thread_type;
        this.voice_info = builder.voice_info;
        this.zan = builder.zan;
    }
}
