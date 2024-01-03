package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UniversityInfo extends Message {
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TO_URL = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long agree_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long browse_num;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String to_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long video_time;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_AGREE_NUM = 0L;
    public static final Long DEFAULT_BROWSE_NUM = 0L;
    public static final Long DEFAULT_VIDEO_TIME = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UniversityInfo> {
        public Long agree_num;
        public Long browse_num;
        public String pic_url;
        public String title;
        public String to_url;
        public Integer type;
        public Long video_time;

        public Builder() {
        }

        public Builder(UniversityInfo universityInfo) {
            super(universityInfo);
            if (universityInfo == null) {
                return;
            }
            this.title = universityInfo.title;
            this.pic_url = universityInfo.pic_url;
            this.to_url = universityInfo.to_url;
            this.type = universityInfo.type;
            this.agree_num = universityInfo.agree_num;
            this.browse_num = universityInfo.browse_num;
            this.video_time = universityInfo.video_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UniversityInfo build(boolean z) {
            return new UniversityInfo(this, z);
        }
    }

    public UniversityInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.pic_url;
            if (str2 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str2;
            }
            String str3 = builder.to_url;
            if (str3 == null) {
                this.to_url = "";
            } else {
                this.to_url = str3;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l = builder.agree_num;
            if (l == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = l;
            }
            Long l2 = builder.browse_num;
            if (l2 == null) {
                this.browse_num = DEFAULT_BROWSE_NUM;
            } else {
                this.browse_num = l2;
            }
            Long l3 = builder.video_time;
            if (l3 == null) {
                this.video_time = DEFAULT_VIDEO_TIME;
                return;
            } else {
                this.video_time = l3;
                return;
            }
        }
        this.title = builder.title;
        this.pic_url = builder.pic_url;
        this.to_url = builder.to_url;
        this.type = builder.type;
        this.agree_num = builder.agree_num;
        this.browse_num = builder.browse_num;
        this.video_time = builder.video_time;
    }
}
