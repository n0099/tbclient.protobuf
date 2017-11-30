package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class OriginThreadInfo extends Message {
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_TID = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 6)
    public final AlaLiveInfo ala_info;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Media> media;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final List<Abstract> DEFAULT_ABSTRACT = Collections.emptyList();
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_THREAD_TYPE = 0;

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
                return;
            } else {
                this.thread_type = builder.thread_type;
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
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<OriginThreadInfo> {
        public List<Abstract> _abstract;
        public AlaLiveInfo ala_info;
        public Long fid;
        public String fname;
        public List<Media> media;
        public Integer thread_type;
        public String tid;
        public String title;

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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OriginThreadInfo build(boolean z) {
            return new OriginThreadInfo(this, z);
        }
    }
}
