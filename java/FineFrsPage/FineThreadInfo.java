package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class FineThreadInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_TAG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ftid;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> thumbnail;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_FTID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<String> DEFAULT_THUMBNAIL = Collections.emptyList();
    public static final Integer DEFAULT_PUBLISH_TIME = 0;

    /* synthetic */ FineThreadInfo(Builder builder, boolean z, FineThreadInfo fineThreadInfo) {
        this(builder, z);
    }

    private FineThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ftid == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = builder.ftid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder._abstract == null) {
                this._abstract = "";
            } else {
                this._abstract = builder._abstract;
            }
            if (builder.thumbnail == null) {
                this.thumbnail = DEFAULT_THUMBNAIL;
            } else {
                this.thumbnail = immutableCopyOf(builder.thumbnail);
            }
            if (builder.publish_time == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = builder.publish_time;
            }
            if (builder.tag == null) {
                this.tag = "";
                return;
            } else {
                this.tag = builder.tag;
                return;
            }
        }
        this.ftid = builder.ftid;
        this.title = builder.title;
        this.type = builder.type;
        this._abstract = builder._abstract;
        this.thumbnail = immutableCopyOf(builder.thumbnail);
        this.publish_time = builder.publish_time;
        this.tag = builder.tag;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<FineThreadInfo> {
        public String _abstract;
        public Long ftid;
        public Integer publish_time;
        public String tag;
        public List<String> thumbnail;
        public String title;
        public Integer type;

        public Builder(FineThreadInfo fineThreadInfo) {
            super(fineThreadInfo);
            if (fineThreadInfo != null) {
                this.ftid = fineThreadInfo.ftid;
                this.title = fineThreadInfo.title;
                this.type = fineThreadInfo.type;
                this._abstract = fineThreadInfo._abstract;
                this.thumbnail = FineThreadInfo.copyOf(fineThreadInfo.thumbnail);
                this.publish_time = fineThreadInfo.publish_time;
                this.tag = fineThreadInfo.tag;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineThreadInfo build(boolean z) {
            return new FineThreadInfo(this, z, null);
        }
    }
}
