package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class PkLiveInfo extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer continue_number;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer continue_status;
    @ProtoField(tag = 3)
    public final LiveInfo live_info;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer side;
    @ProtoField(tag = 1)
    public final LiveUserInfo user_info;
    public static final Integer DEFAULT_CONTINUE_STATUS = 0;
    public static final Integer DEFAULT_CONTINUE_NUMBER = 0;
    public static final Integer DEFAULT_SIDE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PkLiveInfo> {
        public Integer continue_number;
        public Integer continue_status;
        public LiveInfo live_info;
        public Integer side;
        public LiveUserInfo user_info;

        public Builder() {
        }

        public Builder(PkLiveInfo pkLiveInfo) {
            super(pkLiveInfo);
            if (pkLiveInfo == null) {
                return;
            }
            this.user_info = pkLiveInfo.user_info;
            this.live_info = pkLiveInfo.live_info;
            this.continue_status = pkLiveInfo.continue_status;
            this.continue_number = pkLiveInfo.continue_number;
            this.side = pkLiveInfo.side;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkLiveInfo build(boolean z) {
            return new PkLiveInfo(this, z);
        }
    }

    public PkLiveInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            this.live_info = builder.live_info;
            Integer num = builder.continue_status;
            if (num == null) {
                this.continue_status = DEFAULT_CONTINUE_STATUS;
            } else {
                this.continue_status = num;
            }
            Integer num2 = builder.continue_number;
            if (num2 == null) {
                this.continue_number = DEFAULT_CONTINUE_NUMBER;
            } else {
                this.continue_number = num2;
            }
            Integer num3 = builder.side;
            if (num3 == null) {
                this.side = DEFAULT_SIDE;
                return;
            } else {
                this.side = num3;
                return;
            }
        }
        this.user_info = builder.user_info;
        this.live_info = builder.live_info;
        this.continue_status = builder.continue_status;
        this.continue_number = builder.continue_number;
        this.side = builder.side;
    }
}
