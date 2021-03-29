package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class NicknameInfo extends Message {
    public static final Integer DEFAULT_LEFT_DAYS = 0;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer left_days;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NicknameInfo> {
        public Integer left_days;

        public Builder() {
        }

        public Builder(NicknameInfo nicknameInfo) {
            super(nicknameInfo);
            if (nicknameInfo == null) {
                return;
            }
            this.left_days = nicknameInfo.left_days;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NicknameInfo build(boolean z) {
            return new NicknameInfo(this, z);
        }
    }

    public NicknameInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.left_days;
            if (num == null) {
                this.left_days = DEFAULT_LEFT_DAYS;
                return;
            } else {
                this.left_days = num;
                return;
            }
        }
        this.left_days = builder.left_days;
    }
}
