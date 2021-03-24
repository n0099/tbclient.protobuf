package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class UserVideoChannelInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer follow_channel;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer man_channel;
    public static final Integer DEFAULT_MAN_CHANNEL = 0;
    public static final Integer DEFAULT_FOLLOW_CHANNEL = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<UserVideoChannelInfo> {
        public Integer follow_channel;
        public Integer man_channel;

        public Builder() {
        }

        public Builder(UserVideoChannelInfo userVideoChannelInfo) {
            super(userVideoChannelInfo);
            if (userVideoChannelInfo == null) {
                return;
            }
            this.man_channel = userVideoChannelInfo.man_channel;
            this.follow_channel = userVideoChannelInfo.follow_channel;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserVideoChannelInfo build(boolean z) {
            return new UserVideoChannelInfo(this, z);
        }
    }

    public UserVideoChannelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.man_channel;
            if (num == null) {
                this.man_channel = DEFAULT_MAN_CHANNEL;
            } else {
                this.man_channel = num;
            }
            Integer num2 = builder.follow_channel;
            if (num2 == null) {
                this.follow_channel = DEFAULT_FOLLOW_CHANNEL;
                return;
            } else {
                this.follow_channel = num2;
                return;
            }
        }
        this.man_channel = builder.man_channel;
        this.follow_channel = builder.follow_channel;
    }
}
