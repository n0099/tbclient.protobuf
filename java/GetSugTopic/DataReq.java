package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FIRST_DIR = "";
    public static final String DEFAULT_PREFIX = "";
    public static final String DEFAULT_SECOND_DIR = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1378common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String first_dir;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_video_topic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String prefix;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String second_dir;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_IS_VIDEO_TOPIC = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1379common;
        public Long fid;
        public String first_dir;
        public Integer is_video_topic;
        public String prefix;
        public String second_dir;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1379common = dataReq.f1378common;
            this.prefix = dataReq.prefix;
            this.fid = dataReq.fid;
            this.first_dir = dataReq.first_dir;
            this.second_dir = dataReq.second_dir;
            this.is_video_topic = dataReq.is_video_topic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1378common = builder.f1379common;
            String str = builder.prefix;
            if (str == null) {
                this.prefix = "";
            } else {
                this.prefix = str;
            }
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l;
            }
            String str2 = builder.first_dir;
            if (str2 == null) {
                this.first_dir = "";
            } else {
                this.first_dir = str2;
            }
            String str3 = builder.second_dir;
            if (str3 == null) {
                this.second_dir = "";
            } else {
                this.second_dir = str3;
            }
            Integer num = builder.is_video_topic;
            if (num == null) {
                this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
                return;
            } else {
                this.is_video_topic = num;
                return;
            }
        }
        this.f1378common = builder.f1379common;
        this.prefix = builder.prefix;
        this.fid = builder.fid;
        this.first_dir = builder.first_dir;
        this.second_dir = builder.second_dir;
        this.is_video_topic = builder.is_video_topic;
    }
}
