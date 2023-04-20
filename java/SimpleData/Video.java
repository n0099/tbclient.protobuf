package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Video extends Message {
    public static final Integer DEFAULT_DURATION = 0;
    public static final String DEFAULT_POSTER = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_VIDEO_TYPE = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer duration;
    @ProtoField(tag = 5)
    public final EncourageInfo encourage_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String poster;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String video_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Video> {
        public Integer duration;
        public EncourageInfo encourage_info;
        public String poster;
        public String url;
        public String video_type;

        public Builder() {
        }

        public Builder(Video video) {
            super(video);
            if (video == null) {
                return;
            }
            this.url = video.url;
            this.poster = video.poster;
            this.duration = video.duration;
            this.video_type = video.video_type;
            this.encourage_info = video.encourage_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Video build(boolean z) {
            return new Video(this, z);
        }
    }

    public Video(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.poster;
            if (str2 == null) {
                this.poster = "";
            } else {
                this.poster = str2;
            }
            Integer num = builder.duration;
            if (num == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = num;
            }
            String str3 = builder.video_type;
            if (str3 == null) {
                this.video_type = "";
            } else {
                this.video_type = str3;
            }
            this.encourage_info = builder.encourage_info;
            return;
        }
        this.url = builder.url;
        this.poster = builder.poster;
        this.duration = builder.duration;
        this.video_type = builder.video_type;
        this.encourage_info = builder.encourage_info;
    }
}
