package tbclient.GetThreadListByUid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Media;
/* loaded from: classes2.dex */
public final class FineThreadInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ftid;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<Media> media;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_FTID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final Integer DEFAULT_PUBLISH_TIME = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FineThreadInfo> {
        public String _abstract;
        public Long ftid;
        public List<Media> media;
        public Integer publish_time;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(FineThreadInfo fineThreadInfo) {
            super(fineThreadInfo);
            if (fineThreadInfo == null) {
                return;
            }
            this.ftid = fineThreadInfo.ftid;
            this.title = fineThreadInfo.title;
            this.type = fineThreadInfo.type;
            this._abstract = fineThreadInfo._abstract;
            this.media = Message.copyOf(fineThreadInfo.media);
            this.publish_time = fineThreadInfo.publish_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineThreadInfo build(boolean z) {
            return new FineThreadInfo(this, z);
        }
    }

    public FineThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.ftid;
            if (l == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            List<Media> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.publish_time;
            if (num2 == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
                return;
            } else {
                this.publish_time = num2;
                return;
            }
        }
        this.ftid = builder.ftid;
        this.title = builder.title;
        this.type = builder.type;
        this._abstract = builder._abstract;
        this.media = Message.immutableCopyOf(builder.media);
        this.publish_time = builder.publish_time;
    }
}
