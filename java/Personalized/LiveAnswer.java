package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class LiveAnswer extends Message {
    public static final String DEFAULT_BANNER_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer banner_high;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String banner_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer banner_width;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    public static final Integer DEFAULT_BANNER_WIDTH = 0;
    public static final Integer DEFAULT_BANNER_HIGH = 0;

    private LiveAnswer(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.banner_url == null) {
                this.banner_url = "";
            } else {
                this.banner_url = builder.banner_url;
            }
            if (builder.banner_width == null) {
                this.banner_width = DEFAULT_BANNER_WIDTH;
            } else {
                this.banner_width = builder.banner_width;
            }
            if (builder.banner_high == null) {
                this.banner_high = DEFAULT_BANNER_HIGH;
            } else {
                this.banner_high = builder.banner_high;
            }
            if (builder.jump_url == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = builder.jump_url;
                return;
            }
        }
        this.banner_url = builder.banner_url;
        this.banner_width = builder.banner_width;
        this.banner_high = builder.banner_high;
        this.jump_url = builder.jump_url;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveAnswer> {
        public Integer banner_high;
        public String banner_url;
        public Integer banner_width;
        public String jump_url;

        public Builder() {
        }

        public Builder(LiveAnswer liveAnswer) {
            super(liveAnswer);
            if (liveAnswer != null) {
                this.banner_url = liveAnswer.banner_url;
                this.banner_width = liveAnswer.banner_width;
                this.banner_high = liveAnswer.banner_high;
                this.jump_url = liveAnswer.jump_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveAnswer build(boolean z) {
            return new LiveAnswer(this, z);
        }
    }
}
