package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class OriginThreadInfo extends Message {
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_TID = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 6)
    public final AlaLiveInfo ala_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<PbContent> content;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_deleted;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_new_style;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_ugc;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Media> media;
    @ProtoField(tag = 11)
    public final Baijiahao ori_ugc_info;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
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

    private OriginThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.media == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = immutableCopyOf(builder.media);
            }
            if (builder._abstract == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = immutableCopyOf(builder._abstract);
            }
            if (builder.fname == null) {
                this.fname = "";
            } else {
                this.fname = builder.fname;
            }
            if (builder.tid == null) {
                this.tid = "";
            } else {
                this.tid = builder.tid;
            }
            this.ala_info = builder.ala_info;
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = builder.fid;
            }
            if (builder.thread_type == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = builder.thread_type;
            }
            if (builder.is_deleted == null) {
                this.is_deleted = DEFAULT_IS_DELETED;
            } else {
                this.is_deleted = builder.is_deleted;
            }
            if (builder.is_ugc == null) {
                this.is_ugc = DEFAULT_IS_UGC;
            } else {
                this.is_ugc = builder.is_ugc;
            }
            this.ori_ugc_info = builder.ori_ugc_info;
            if (builder.voice_info == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = immutableCopyOf(builder.voice_info);
            }
            this.video_info = builder.video_info;
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            if (builder.is_new_style == null) {
                this.is_new_style = DEFAULT_IS_NEW_STYLE;
                return;
            } else {
                this.is_new_style = builder.is_new_style;
                return;
            }
        }
        this.title = builder.title;
        this.media = immutableCopyOf(builder.media);
        this._abstract = immutableCopyOf(builder._abstract);
        this.fname = builder.fname;
        this.tid = builder.tid;
        this.ala_info = builder.ala_info;
        this.fid = builder.fid;
        this.thread_type = builder.thread_type;
        this.is_deleted = builder.is_deleted;
        this.is_ugc = builder.is_ugc;
        this.ori_ugc_info = builder.ori_ugc_info;
        this.voice_info = immutableCopyOf(builder.voice_info);
        this.video_info = builder.video_info;
        this.content = immutableCopyOf(builder.content);
        this.is_new_style = builder.is_new_style;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<OriginThreadInfo> {
        public List<Abstract> _abstract;
        public AlaLiveInfo ala_info;
        public List<PbContent> content;
        public Long fid;
        public String fname;
        public Integer is_deleted;
        public Integer is_new_style;
        public Integer is_ugc;
        public List<Media> media;
        public Baijiahao ori_ugc_info;
        public Integer thread_type;
        public String tid;
        public String title;
        public VideoInfo video_info;
        public List<Voice> voice_info;

        public Builder() {
        }

        public Builder(OriginThreadInfo originThreadInfo) {
            super(originThreadInfo);
            if (originThreadInfo != null) {
                this.title = originThreadInfo.title;
                this.media = OriginThreadInfo.copyOf(originThreadInfo.media);
                this._abstract = OriginThreadInfo.copyOf(originThreadInfo._abstract);
                this.fname = originThreadInfo.fname;
                this.tid = originThreadInfo.tid;
                this.ala_info = originThreadInfo.ala_info;
                this.fid = originThreadInfo.fid;
                this.thread_type = originThreadInfo.thread_type;
                this.is_deleted = originThreadInfo.is_deleted;
                this.is_ugc = originThreadInfo.is_ugc;
                this.ori_ugc_info = originThreadInfo.ori_ugc_info;
                this.voice_info = OriginThreadInfo.copyOf(originThreadInfo.voice_info);
                this.video_info = originThreadInfo.video_info;
                this.content = OriginThreadInfo.copyOf(originThreadInfo.content);
                this.is_new_style = originThreadInfo.is_new_style;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OriginThreadInfo build(boolean z) {
            return new OriginThreadInfo(this, z);
        }
    }
}
