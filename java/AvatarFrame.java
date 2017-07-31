package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AvatarFrame extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_END_TIME = 0;

    private AvatarFrame(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
                return;
            } else {
                this.end_time = builder.end_time;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.end_time = builder.end_time;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AvatarFrame> {
        public Integer end_time;
        public Integer props_id;

        public Builder() {
        }

        public Builder(AvatarFrame avatarFrame) {
            super(avatarFrame);
            if (avatarFrame != null) {
                this.props_id = avatarFrame.props_id;
                this.end_time = avatarFrame.end_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AvatarFrame build(boolean z) {
            return new AvatarFrame(this, z);
        }
    }
}
