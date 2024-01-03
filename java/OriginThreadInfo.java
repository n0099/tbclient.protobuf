package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class OriginThreadInfo extends Message {
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_TID = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 19)
    public final Agree agree;
    @ProtoField(tag = 6)
    public final AlaLiveInfo ala_info;
    @ProtoField(tag = 18)
    public final User author;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<PbContent> content;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer good_types;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_deleted;
    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer is_frs_mask;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_new_style;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_ugc;
    @ProtoField(tag = 22)
    public final Item item;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<HeadItem> item_star;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Media> media;
    @ProtoField(tag = 11)
    public final Baijiahao ori_ugc_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 24)
    public final List<PbLinkInfo> pb_link_info;
    @ProtoField(tag = 25, type = Message.Datatype.INT64)
    public final Long pid;
    @ProtoField(tag = 21)
    public final PollInfo poll_info;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer reply_num;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer shared_num;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer top_types;
    @ProtoField(tag = 13)
    public final VideoInfo video_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<Voice> voice_info;
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final List<Abstract> DEFAULT_ABSTRACT = Collections.emptyList();
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Integer DEFAULT_IS_DELETED = 0;
    public static final Integer DEFAULT_IS_UGC = 0;
    public static final List<Voice> DEFAULT_VOICE_INFO = Collections.emptyList();
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_IS_NEW_STYLE = 0;
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Integer DEFAULT_SHARED_NUM = 0;
    public static final List<HeadItem> DEFAULT_ITEM_STAR = Collections.emptyList();
    public static final List<PbLinkInfo> DEFAULT_PB_LINK_INFO = Collections.emptyList();
    public static final Long DEFAULT_PID = 0L;
    public static final Integer DEFAULT_GOOD_TYPES = 0;
    public static final Integer DEFAULT_TOP_TYPES = 0;
    public static final Integer DEFAULT_IS_FRS_MASK = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<OriginThreadInfo> {
        public List<Abstract> _abstract;
        public Agree agree;
        public AlaLiveInfo ala_info;
        public User author;
        public List<PbContent> content;
        public Long fid;
        public String fname;
        public Integer good_types;
        public Integer is_deleted;
        public Integer is_frs_mask;
        public Integer is_new_style;
        public Integer is_ugc;
        public Item item;
        public List<HeadItem> item_star;
        public List<Media> media;
        public Baijiahao ori_ugc_info;
        public List<PbLinkInfo> pb_link_info;
        public Long pid;
        public PollInfo poll_info;
        public Integer reply_num;
        public Integer shared_num;
        public Integer thread_type;
        public String tid;
        public String title;
        public Integer top_types;
        public VideoInfo video_info;
        public List<Voice> voice_info;

        public Builder() {
        }

        public Builder(OriginThreadInfo originThreadInfo) {
            super(originThreadInfo);
            if (originThreadInfo == null) {
                return;
            }
            this.title = originThreadInfo.title;
            this.media = Message.copyOf(originThreadInfo.media);
            this._abstract = Message.copyOf(originThreadInfo._abstract);
            this.fname = originThreadInfo.fname;
            this.tid = originThreadInfo.tid;
            this.ala_info = originThreadInfo.ala_info;
            this.fid = originThreadInfo.fid;
            this.thread_type = originThreadInfo.thread_type;
            this.is_deleted = originThreadInfo.is_deleted;
            this.is_ugc = originThreadInfo.is_ugc;
            this.ori_ugc_info = originThreadInfo.ori_ugc_info;
            this.voice_info = Message.copyOf(originThreadInfo.voice_info);
            this.video_info = originThreadInfo.video_info;
            this.content = Message.copyOf(originThreadInfo.content);
            this.is_new_style = originThreadInfo.is_new_style;
            this.reply_num = originThreadInfo.reply_num;
            this.author = originThreadInfo.author;
            this.agree = originThreadInfo.agree;
            this.shared_num = originThreadInfo.shared_num;
            this.poll_info = originThreadInfo.poll_info;
            this.item = originThreadInfo.item;
            this.item_star = Message.copyOf(originThreadInfo.item_star);
            this.pb_link_info = Message.copyOf(originThreadInfo.pb_link_info);
            this.pid = originThreadInfo.pid;
            this.good_types = originThreadInfo.good_types;
            this.top_types = originThreadInfo.top_types;
            this.is_frs_mask = originThreadInfo.is_frs_mask;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OriginThreadInfo build(boolean z) {
            return new OriginThreadInfo(this, z);
        }
    }

    public OriginThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<Media> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list);
            }
            List<Abstract> list2 = builder._abstract;
            if (list2 == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = Message.immutableCopyOf(list2);
            }
            String str2 = builder.fname;
            if (str2 == null) {
                this.fname = "";
            } else {
                this.fname = str2;
            }
            String str3 = builder.tid;
            if (str3 == null) {
                this.tid = "";
            } else {
                this.tid = str3;
            }
            this.ala_info = builder.ala_info;
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l;
            }
            Integer num = builder.thread_type;
            if (num == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num;
            }
            Integer num2 = builder.is_deleted;
            if (num2 == null) {
                this.is_deleted = DEFAULT_IS_DELETED;
            } else {
                this.is_deleted = num2;
            }
            Integer num3 = builder.is_ugc;
            if (num3 == null) {
                this.is_ugc = DEFAULT_IS_UGC;
            } else {
                this.is_ugc = num3;
            }
            this.ori_ugc_info = builder.ori_ugc_info;
            List<Voice> list3 = builder.voice_info;
            if (list3 == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = Message.immutableCopyOf(list3);
            }
            this.video_info = builder.video_info;
            List<PbContent> list4 = builder.content;
            if (list4 == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list4);
            }
            Integer num4 = builder.is_new_style;
            if (num4 == null) {
                this.is_new_style = DEFAULT_IS_NEW_STYLE;
            } else {
                this.is_new_style = num4;
            }
            Integer num5 = builder.reply_num;
            if (num5 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num5;
            }
            this.author = builder.author;
            this.agree = builder.agree;
            Integer num6 = builder.shared_num;
            if (num6 == null) {
                this.shared_num = DEFAULT_SHARED_NUM;
            } else {
                this.shared_num = num6;
            }
            this.poll_info = builder.poll_info;
            this.item = builder.item;
            List<HeadItem> list5 = builder.item_star;
            if (list5 == null) {
                this.item_star = DEFAULT_ITEM_STAR;
            } else {
                this.item_star = Message.immutableCopyOf(list5);
            }
            List<PbLinkInfo> list6 = builder.pb_link_info;
            if (list6 == null) {
                this.pb_link_info = DEFAULT_PB_LINK_INFO;
            } else {
                this.pb_link_info = Message.immutableCopyOf(list6);
            }
            Long l2 = builder.pid;
            if (l2 == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = l2;
            }
            Integer num7 = builder.good_types;
            if (num7 == null) {
                this.good_types = DEFAULT_GOOD_TYPES;
            } else {
                this.good_types = num7;
            }
            Integer num8 = builder.top_types;
            if (num8 == null) {
                this.top_types = DEFAULT_TOP_TYPES;
            } else {
                this.top_types = num8;
            }
            Integer num9 = builder.is_frs_mask;
            if (num9 == null) {
                this.is_frs_mask = DEFAULT_IS_FRS_MASK;
                return;
            } else {
                this.is_frs_mask = num9;
                return;
            }
        }
        this.title = builder.title;
        this.media = Message.immutableCopyOf(builder.media);
        this._abstract = Message.immutableCopyOf(builder._abstract);
        this.fname = builder.fname;
        this.tid = builder.tid;
        this.ala_info = builder.ala_info;
        this.fid = builder.fid;
        this.thread_type = builder.thread_type;
        this.is_deleted = builder.is_deleted;
        this.is_ugc = builder.is_ugc;
        this.ori_ugc_info = builder.ori_ugc_info;
        this.voice_info = Message.immutableCopyOf(builder.voice_info);
        this.video_info = builder.video_info;
        this.content = Message.immutableCopyOf(builder.content);
        this.is_new_style = builder.is_new_style;
        this.reply_num = builder.reply_num;
        this.author = builder.author;
        this.agree = builder.agree;
        this.shared_num = builder.shared_num;
        this.poll_info = builder.poll_info;
        this.item = builder.item;
        this.item_star = Message.immutableCopyOf(builder.item_star);
        this.pb_link_info = Message.immutableCopyOf(builder.pb_link_info);
        this.pid = builder.pid;
        this.good_types = builder.good_types;
        this.top_types = builder.top_types;
        this.is_frs_mask = builder.is_frs_mask;
    }
}
