package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Video extends Message {
    public static final Integer DEFAULT_NUM = 0;
    public static final String DEFAULT_PIC = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Video> {
        public Integer num;
        public String pic;

        public Builder() {
        }

        public Builder(Video video) {
            super(video);
            if (video == null) {
                return;
            }
            this.pic = video.pic;
            this.num = video.num;
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
            String str = builder.pic;
            if (str == null) {
                this.pic = "";
            } else {
                this.pic = str;
            }
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = num;
                return;
            }
        }
        this.pic = builder.pic;
        this.num = builder.num;
    }
}
